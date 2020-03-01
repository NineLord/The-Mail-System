package game.objects;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * The branch class going to be the place where a person comes to send/receive
 * packages.
 */
public class Branch implements Serializable {
	private static final long serialVersionUID = 8499589311237753696L;
	private int iID; // The ID of this branch
	private String strName; // The location of this branch.
	private Queue<Person> qPersonSend = new ArrayBlockingQueue<>(5); /*
				 * This queue will be limited to 5 people who will wait to send items until the
				 * player accept them.
				 */
	private Queue<Person> qPersonReceive = new ArrayBlockingQueue<>(5); /*
				 * This queue will be limited to 5 people that can "come in the branch" and get
				 * their packages.
				 */
	private List<Package> lPickUp = new LinkedList<>(); /*
														 * This is a list of packages that has been received and waiting
														 * for a Person to come and pick them up.
														 */
	private List<Package> lWaitingToSend = new LinkedList<>(); /*
																 * This is a list of packages that has been accepted by
																 * a Person and now waiting for the player to send them
																 * to their next Branch.
																 */
	private List<Package> lBranchSend = new LinkedList<>(); /*
															 * This is the list of packages the player ALREADY sending
															 * to other branch and on their way.
															 */
	private List<Package> lBranchReceive = new LinkedList<>(); /*
																 * This is the list of the packages that this branch
																 * going to receive from other branches.
																 */

	// Constructor methods
	public Branch(String strName) {
		this.strName = strName;
		switch (strName) {
		case "Haifa":
			this.iID = 0;
			break;
		case "Tel-Aviv":
			this.iID = 1;
			break;
		case "Eilat":
			this.iID = 2;
			break;
		case "Jerusalem":
			this.iID = 3;
			break;
		case "Metula":
			this.iID = 4;
			break;
		case "Tiberias":
			this.iID = 5;
			break;
		case "Beer-Sheba":
			this.iID = 6;
			break;
		}
	}

	// Get methods
	public int getID() {
		return iID;
	}

	public String getName() {
		return strName;
	}

	public Queue<Person> getPersonSend() {
		return qPersonSend;
	}

	public Queue<Person> getPersonReceive() {
		return qPersonReceive;
	}

	public List<Package> getPickUp() {
		return lPickUp;
	}

	public List<Package> getWaitingToSend() {
		return lWaitingToSend;
	}

	public List<Package> getBranchSend() {
		return lBranchSend;
	}

	public List<Package> getBranchReceive() {
		return lBranchReceive;
	}

	// Set methods
	public void setName(String strName) {
		this.strName = strName;
	}

	public void setPersonSend(Queue<Person> qPersonSend) {
		this.qPersonSend = qPersonSend;
	}

	public void setPersonReceive(Queue<Person> qPersonReceive) {
		this.qPersonReceive = qPersonReceive;
	}

	public void setPickUp(List<Package> lPickUp) {
		this.lPickUp = lPickUp;
	}

	public void setWaitingToSend(List<Package> lWaitingToSend) {
		this.lWaitingToSend = lWaitingToSend;
	}

	public void setBranchSend(List<Package> lBranchSend) {
		this.lBranchSend = lBranchSend;
	}

	public void setBranchReceive(List<Package> lBranchReceive) {
		this.lBranchReceive = lBranchReceive;
	}

	// toStrings methods
	@Override
	public String toString() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("[");
		strbTemp.append(iID);
		strbTemp.append("|");
		strbTemp.append(strName);
		strbTemp.append("]");
		return strbTemp.toString();
	}

	public String toStringFull() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("Branch { ID=");
		strbTemp.append(iID);
		strbTemp.append(",\tName=");
		strbTemp.append(strName);
		strbTemp.append(",\tQueue Person Send=");
		strbTemp.append(qPersonSend);
		strbTemp.append(",\tQueue Person Receive=");
		strbTemp.append(qPersonReceive);
		strbTemp.append(",\tList Picking Up packages=");
		strbTemp.append(lPickUp);
		strbTemp.append(",\tList Waiting to be Send=");
		strbTemp.append(lWaitingToSend);
		strbTemp.append(",\tList Sending=");
		strbTemp.append(lBranchSend);
		strbTemp.append(",\tList Receiving=");
		strbTemp.append(lBranchReceive);
		strbTemp.append(" }");
		return strbTemp.toString();
	}

	// hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iID;
		result = prime * result + ((strName == null) ? 0 : strName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		if (iID != other.iID)
			return false;
		if (strName == null) {
			if (other.strName != null)
				return false;
		} else if (!strName.equals(other.strName))
			return false;
		return true;
	}

	// Specific methods
	//THE NEW ORDER
	public boolean takePackageFromPersonInQueuePersonSendPutInListWaitingToSend() {
		/*
		 * input: null
		 * action: remove head person from qPersonSend
		 * put his package on lWaitingToSend
		 * return: false if the queue is empty, true if the package was taken.
		 */
		boolean bPackageMoved;
		if (this.qPersonSend.isEmpty()) 
			bPackageMoved = false;
		else {
			Package paTemp = this.qPersonSend.poll().getPackage();
			this.lWaitingToSend.add(paTemp);
			bPackageMoved = true;
		}
		return bPackageMoved;
	}
	
	public int movePackageFromWaitingToSendToSending(int iIndex, int[] iTimeOfArriving) {
		/*
		 * input: Index of the package in lWaitingToSend, The time of arriving.
		 * action: Updates the package iTime.
		 * Move the package from lWaitingToSend to lBranchSend.
		 * return: ID of the package in lBranchSend.
		 */
		List<Package> lTempWaiting = this.lWaitingToSend;
		List<Package> lTempSending = this.lBranchSend;
		Package paTemp = lTempWaiting.remove(iIndex);
		paTemp.setTime(iTimeOfArriving);
		lTempSending.add(paTemp);
		this.lWaitingToSend = lTempWaiting;
		this.lBranchSend = lTempSending;
		return paTemp.getID();
	}
	
	public void updatePackageTimeLeftDELETED(int iIndex,int iGroup, int iSubtractHours) { //////////////////////////////////////////////// delete
		/*
		 * input: Index of package in lBranchSend, Amount of hours to be subtract from dTimeLeft of the package.
		 * action: Updates the package dTimeLeft by subtracting the amount of hours needed from the package.
		 * return: null.
		 */
		List<Package> lTemp = null;
		switch (iGroup) {
		case 0:
			lTemp = this.lBranchSend;
			break;
		case 2:
			lTemp = this.lPickUp;
			break;
		}
		Package paTemp = lTemp.get(iIndex);
		//paTemp.setTimeLeft(paTemp.getTimeLeft()-iSubtractHours);
		lTemp.set(iIndex, paTemp);
		this.lBranchSend = lTemp;
	}
	
	public void updatePackageLocation(int iIndexReceiving) {
		/*
		 * input: Index of the package in lBranchReceive.
		 * action: Update the package in lBranchReceive to have the same iLocation as the current branch.
		 * return: null.
		 */
		List<Package> lTemp = this.lBranchReceive;
		Package paTemp = lTemp.get(iIndexReceiving);
		paTemp.setLocation(this.iID);
		lTemp.set(iIndexReceiving, paTemp);
		this.lBranchReceive = lTemp;
	}
	
	public void movePackageFromReceivedToWaitingToSend(int iIndex) {
		/*
		 * input: Index of the package in lBranchRecive.
		 * action: Move the package from lBranchReceive to lWaitingToSend.
		 * return: null.
		 */
		List<Package> lTempRec = this.lBranchReceive;
		List<Package> lTempWait = this.lWaitingToSend;
		Package paTemp = lTempRec.remove(iIndex);
		lTempWait.add(paTemp);
		this.lBranchReceive = lTempRec;
		this.lWaitingToSend = lTempWait;
	}
	
	public int movePackageFromReceivedToPickUp(int iIndex) {
		/*
		 * input: Index of the package in lBranchReceive. 
		 * action: Move the package from lBranchReceive to lPickUp.
		 * return: The package index in lPickUp.
		 */
		List<Package> lTempRec = this.lBranchReceive;
		List<Package> lTempPick = this.lPickUp;
		Package paTemp = lTempRec.remove(iIndex);
		lTempPick.add(paTemp);
		this.lPickUp = lTempPick;
		this.lBranchReceive = lTempRec;
		return paTemp.getID();
	}
	
	public void updatePackageRewardSize(int iIndex, double dPackageDelay, int iRewardSize) {
		/*
		 * input: Index of the package in lPickUp, The amount of hours as delay the player can do without losing cash.
		 * action: Calculate the reward size for the delivery time and update the package iRewardSize.
		 * return: null.
		 */
		List<Package> lTemp = this.lPickUp;
		Package paTemp = lTemp.get(iIndex);
//		double dTimeLeft = paTemp.getTimeLeft();
//		double dTime;
//		if (dTimeLeft > 0)
//			dTime = ( paTemp.getBestTime() - dTimeLeft );
//		else
//			dTime = dTimeLeft;
//		double dGain100Persent = dPackageDelay * 0.8;
//		int iMaxReward = 0;
//		switch (paTemp.getSize()) {
//		case "Small":
//			iMaxReward = 100;
//			break;
//		case "Medium":
//			iMaxReward = 200;
//			break;
//		case "Large":
//			iMaxReward = 500;
//			break;
//		}
//		if (dTime > dPackageDelay) {
//			System.err.println("Error: Branch.updatePackageRewardSize(int iIndex, double dPackageDelay): Player found path that is faster than BestPathFinder()");
//			System.err.println("dTime=" + dTime + "; dPackageDelay=" + dPackageDelay);
//			paTemp.setRewardSize(iMaxReward);
//		} else if (dTime <= dPackageDelay && dTimeLeft >= dGain100Persent) {
//			paTemp.setRewardSize(iMaxReward);
//		} else if (dTimeLeft < dGain100Persent && dTimeLeft >= 0) {
//			paTemp.setRewardSize((int) Math.round(iMaxReward * ( ((dGain100Persent - dTime) / dGain100Persent) /**100*/)));
//		} else if (dTimeLeft > -dPackageDelay) {
//			paTemp.setRewardSize((int) ((-iMaxReward / 2) * ((dTime / (-dPackageDelay)) /** 100*/)));
//		} else {
//			paTemp.setRewardSize(-iMaxReward / 2);
//		}
		
		paTemp.setRewardSize(iRewardSize);
		
		lTemp.set(iIndex, paTemp);
		this.lPickUp = lTemp;
	}
	
	public void updatePackageTime(int iIndex, int[] iTime) {
		/*
		 * input: Index of the package in lPickUp, The Time needed to be put into the package.
		 * action: Update the iTime of the package in lPickUp.
		 * return: null.
		 */
		List<Package> lTemp = this.lPickUp;
		Package paTemp = lTemp.get(iIndex);
		paTemp.setTime(iTime);
		lTemp.set(iIndex, paTemp);
		this.lPickUp = lTemp;
	}
	
	public boolean addPersonToWantToReceive(Person pNew) {
		/*
		 * input: A Person object.
		 * action: Try to add a person to the qPersonReceive queue.
		 * return: true if the person entered the queue, false if he didn't.
		 */
		return this.qPersonReceive.offer(pNew);
	}
	
	public String movePackageFromPickUpToPersonReceive(int iIndex) {
		/*
		 * input: Index of the package in lPickUp.
		 * action: Check if the package from lPickUp belong to the head person in qPersonReceive,
		 * if so, give the person his package and return the person name, else return null.
		 * return: the package's owner name (receiver), if the package doesn't belong to him return nullWrongPerson, if the queue empty return nullEmpty. 
		 */
		List<Package> lTemp = this.lPickUp;
		Queue<Person> qTemp = this.qPersonReceive;
		String strIsThisTheRightPerson;
		if (qTemp.isEmpty()) {
			return "nullEmpty";
		} else {
			if (Objects.equals(lTemp.get(iIndex).getReceive(), qTemp.peek().getName())) {
				strIsThisTheRightPerson = qTemp.peek().getName();
				lTemp.remove(iIndex);
				qTemp.poll();
			} else
				strIsThisTheRightPerson = "nullWrongPerson";
			this.lPickUp = lTemp;
			this.qPersonReceive = qTemp;
			return strIsThisTheRightPerson;
		}
	}
	
	public boolean addPersonToWantToSend(Person perNew) {
		/*
		 * input: A Person object.
		 * action: Try to add a person to the qPersonSend queue.
		 * return: rue if the person entered the queue, false if he didn't.
		 */
		return this.qPersonSend.offer(perNew);
	}
}
