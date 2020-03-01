package game.objects;

import java.io.Serializable;

public class BankAccount implements Serializable {
	private static final long serialVersionUID = -8793707698877908641L;
	private int iCash;
	private int iMostCash;
	private boolean bYouLose = false; // if the player goes BELOW zero cash in his account he lose the game.

	// Constructor methods
	public BankAccount(int iCash) {
		this.iCash = iCash;
		this.iMostCash = iCash;
	}

	public BankAccount() {
		this.iCash = 0;
		this.iMostCash = 0;
	}

	// Get/Set methods
	public int getCash() {
		return iCash;
	}
	
	public int getMostCash() {
		return this.iMostCash;
	}

	public boolean DidYouLose() {
		return bYouLose;
	}

	// Set methods
	public void setCash(int iCash) {
		this.iCash = iCash;
	}
	
	public void setMostCash(int iMostCash) {
		this.iMostCash = iMostCash;
	}
	
	public void setbYouLose(boolean bYouLose) {
		this.bYouLose = bYouLose;
	}
	
	// toString methods
	@Override
	public String toString() {
		if (this.iCash >= 100000)
			return "99999";
		else if (this.iCash >= 10000)
			return String.valueOf(this.iCash);
		else if (this.iCash >= 1000)
			return "0" + this.iCash;
		else if (this.iCash >= 100)
			return "00" + this.iCash;
		else if (this.iCash >= 10)
			return "000" + this.iCash;
		else if (this.iCash >= 0)
			return "0000" + this.iCash;
		else
			return "00000";
	}
	
	public String toStringFull() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("BankAccount { Cash=");
		strbTemp.append(this.iCash);
		strbTemp.append(" You Lose=");
		strbTemp.append(this.bYouLose);
		strbTemp.append(" }");
		return  strbTemp.toString();
	}
	
	public String toString(int iCash) {
		if (iCash >= 100000)
			return "99999";
		else if (iCash >= 10000)
			return String.valueOf(iCash);
		else if (iCash >= 1000)
			return "0" + iCash;
		else if (iCash >= 100)
			return "00" + iCash;
		else if (iCash >= 10)
			return "000" + iCash;
		else if (this.iCash >= 0)
			return "0000" + iCash;
		else
			return "00000";
	}
	
	// Specific methods
	public synchronized boolean addOrRemoveCash(int iAmount) {
		this.iCash += iAmount;
		if (this.iCash > this.iMostCash) {
			this.iMostCash = this.iCash;
		}
		if (this.iCash < 0)
			this.bYouLose = true;
		else
			this.bYouLose = false;
		return this.bYouLose;
	}
}
