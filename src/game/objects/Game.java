package game.objects;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

public class Game implements Runnable, Serializable {
	private static final long serialVersionUID = -326442219163394476L;
	private Clock cTime; // need to add iDay to clock so he will counts the days as well.
	private BankAccount baPlayer = new BankAccount();
	private PostalCompany pcMain;
	private final transient Object objLock = new Object();
	private volatile boolean bIsGamePaused = false;
	private volatile boolean bDidTheGameEnd = false;

	// Constructor methods
	public Game(int iDifficulty) {
		pcMain = new PostalCompany(iDifficulty);
		switch (iDifficulty) {
		case 0:
			cTime = new Clock(11);
			break;
		case 1:
			cTime = new Clock(10);
			break;
		case 2:
			cTime = new Clock(9);
			break;
		default:
			break;
		}
	}
	
	// Thread methods
	@Override
	public void run() {
		Thread thTime = new Thread(cTime);
		Thread thPostal = new Thread(pcMain);
		thTime.start();
		thPostal.start();
		while (!(this.bDidTheGameEnd)) {
			checkForPaused();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.cTime.stopThread();
		this.pcMain.stopThread();
	}
	
	public void callPersonToTakeHisPackage(int iIndexBranch, int iIndex) {
		/*
		 * input: ID of the branch, Index of the package in lPickUp.
		 * action: Check if the day ends in 1 hour and 30 minutes, if so will wait till tomorrow, else will call the person right away.
		 * The program will call a person to come in 5-30 minutes (random).
		 * After the person has entered the qPersonReceive his iTime will be updated.
		 * return: null.
		 */
		if (cTime.didTheDayAlreadyEnded(cTime.getTimeInXHours(1.5))) {
			for (int iCount = cTime.getTimeTillEndDay(); iCount>=0; iCount--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				checkForPaused();
			}
		}
		int iRandom = ThreadLocalRandom.current().nextInt(5, 31);
		for (int iCount = iRandom; iCount>=0; iCount--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			checkForPaused();
		}
		while(pcMain.getBranch(iIndexBranch).getPersonReceive().size() == 5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			checkForPaused();
		}
		pcMain.callPersonToTakeHisPackage(iIndexBranch, iIndex, cTime.getTime());
	}
	
	private void checkForPaused() {
		synchronized (objLock) {
			while(bIsGamePaused) {
				try {
					objLock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void pauseGame() {
		this.bIsGamePaused = true;
	}
	
	public void resumeGame() {
		synchronized (objLock) {
			this.bIsGamePaused = false;
			objLock.notify();
		}
	}
	
	public void endGame() {
		this.bDidTheGameEnd = true;
	}
	
	// Method for each button press
	public boolean acceptPackage(int iIndex) {
		/*
		 * input: ID of the selected branch
		 * action: remove head person from qPersonSend
		 * put his package on lWaitingToSend.
		 * Decrease iBusyBranches.
		 * return: false if the queue is empty [no package was accepted], true if the package was taken.
		 */
		boolean bTemp = this.pcMain.takePackageFromPerson(iIndex);
		if (bTemp) {
			pcMain.decreaseBusyBranches(iIndex);
			return true;
		} else
			return false;
	}
	
	public boolean sendPackage(int iIndexFrom, int iIndexTo, int iIndex) {
		/*
		 * input: ID of the select branch, ID of the next brach, Index of the select package from lWaitingToSend
		 * action: Check if the package will arrive today, else will not send it.
		 * Decrease the actions the player can do.
		 * Find at what time the package will be arriving (iTime).
		 * Update the package iTime to the time it will be arriving.
		 * Move Package from lWaitingToSend to lBranchSend.
		 * Create thread and wait until the package arrive.
		 * While the thread is waiting, each second the loop check if the game was pause, and if so, pauses the thread as well.
		 * Update the package dTimeLeft.
		 * Move the package from lBranchSend to the other branch's lBranchReceive.
		 * Update the package location.
		 * Increment the actions the player can do.
		 * return: true if sending package, false if the package won't make there today so not sending it.
		 */
		int iHoursTillDeliveried = pcMain.howHoursBetweenBranches(iIndexFrom, iIndexTo);
		if (cTime.didTheDayAlreadyEnded(cTime.getTimeInXHours(iHoursTillDeliveried))) {
			return false;
		} else {
			pcMain.decreaseActions();
			int[] iTimeOfArriving = this.cTime.getTimeInXHours(iHoursTillDeliveried);
			int iIndexSending = pcMain.movePackageFromWaitSendToSending(iIndexFrom, iIndex, iTimeOfArriving);
			for (int iCount = (iHoursTillDeliveried * 60); iCount>0; iCount-- ) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				checkForPaused();
			}
			//pcMain.updatePackageTimeLeft(iIndexFrom, 0, iIndex, iHoursTillDeliveried);
			int iIndexReceiving = pcMain.movePackageBetweenBranches(iIndexFrom, iIndexTo, iIndexSending);
			pcMain.updatePackageLocation(iIndexFrom, iIndexReceiving);
			pcMain.incrementActions();
			return true;
		}
	}
	
	public void moveReceivedToWaitingToSend(int iIndexBranch, int iIndex) {
		/*
		 * input: ID of the selected branch, Index of the selected package from lBranchReceive.
		 * action: remove package from lBranchReceive and put it in lWaitingToSend
		 * return: null
		 */
		pcMain.movePackageFromReceivedToWaitingToSend(iIndexBranch, iIndex);
	}
	
	public boolean moveReceivedToPickUp(int iIndexBranch, int iIndex) {
		/*
		 * input: ID of the selected branch, Index of the selected package from lBranchReceive.
		 * action: remove package from lBranchReceive and put it in lPickUp.
		 * Calculate the reward size.
		 * Update the time of arriavel to the branch in the package.
		 * Update the package iRewardSize.
		 * return: false if the package doesn't belong in this branch, true if the package moved.
		 */
		int iIndexlPickUp = pcMain.movePackageFromReceivedToPickUp(iIndexBranch, iIndex);
		if (iIndexlPickUp < 0) {
			return false;
		} else {
			//pcMain.updatePackageRewardSize(iIndexBranch, iIndexlPickUp);
			pcMain.updatePackageTime(iIndexBranch, iIndexlPickUp, cTime.getTime());
			callPersonToTakeHisPackage(iIndexBranch, iIndexlPickUp);
			return true;
		}
	}
	
	public int GivePackage(int iIndexBranch, int iIndex) {
		/*
		 * input: ID of the selected branch, Index of the selected package from lPickUp.
		 * action: Remove the package from lPickUp and give it to the head person on qPersonReceive.
		 * Update iRewardSize according to the amount of time the person had to wait in queue, first hour is free of charge,
		 * any time longer than that will reduce the reward or increase the fee.
		 * Reward player bank account.
		 * return: 0 if the package doesn't belong to the head person, 1 if the package was given.
		 * 2 if the game has ended (the game ends when the player bank account goes below 0 cash).
		 */
		int iRewardSize = pcMain.getRewardSize(iIndexBranch, iIndex);
		int[] iTimeEnteredToBranch = pcMain.getEnterTimeToBranch(iIndexBranch);
		int bIsThisTheRightPerson = pcMain.movePackageFromPickUpToPersonReceive(iIndexBranch, iIndex);
		if (bIsThisTheRightPerson == 0) { // Complete version is in GameEasy.
			boolean bDidTheGameEnded;
			double dTimePassed = cTime.HowManyHoursSinces(iTimeEnteredToBranch);
			if (dTimePassed > 1 && dTimePassed <= 2) {
				if (iRewardSize >= 0) {
					iRewardSize = (int) Math.round((((double) iRewardSize) * (dTimePassed - 1)));
				} else {
					iRewardSize = (int) Math.round(((((dTimePassed - 1) * 100) + 100) / 100) * ((double) iRewardSize));
				}
			} else if (dTimePassed > 2) {
				if (iRewardSize >= 0) {
					iRewardSize = 0;
				} else {
					iRewardSize = iRewardSize * 2;
				}
			}
			bDidTheGameEnded = baPlayer.addOrRemoveCash(iRewardSize);
			if (bDidTheGameEnded)
				return 2;
			else
				return 1;
		} else
			return 0;
	}
	
	// Specific methods
	public int getScore() {
		return ( (this.baPlayer.getMostCash()/10) + (this.cTime.getDay()*100) );
	}
}
