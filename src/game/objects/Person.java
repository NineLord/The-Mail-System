package game.objects;

import java.io.Serializable;

/**
 * The Person class is responsible of sending/receiving packages.
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -4206307653669585546L;
	private String strName; // Name of the person, there aren't duplicate names.
	private int iIdReceiveBranch; // This is the ID of the Branch this person going to receive his packages.
	private int iIdSendBranch; // This is the ID of the Branch this person going to send his package from.
	private Package paSend = null; // This is the package this person going to send.
	private int[] iTime = { 0, 0, 0 }; // This is the time the person has entered the qPersonReceive to take his package.
	private int iIndex = -1; // This is the person location in the queue he stand at (Queue Senders OR Queue Receivers).
	
	// Constructor methods
	public Person(String strName, int iIdReceiveBranch) {
		/*
		 * Create a person without package. His receiving/sending branch going to be the
		 * same.
		 */
		this.strName = strName;
		this.iIdReceiveBranch = iIdReceiveBranch;
		this.iIdSendBranch = iIdReceiveBranch;
	}

	public Person(String strName, int iIdSendBranch, int iIdReceiveBranch) {
		// Create a person without package.
		this.strName = strName;
		this.iIdReceiveBranch = iIdReceiveBranch;
		this.iIdSendBranch = iIdSendBranch;
	}

	// Get methods
	public String getName() {
		return strName;
	}

	public int getReceiveLocation() {
		return iIdReceiveBranch;
	}

	public int getSendLocation() {
		return iIdSendBranch;
	}

	public Package getPackage() {
		return paSend;
	}
	
	public int[] getTime() {
		return this.iTime;
	}

	public int getIndex() {
		return this.iIndex;
	}
	
	// Set methods
	public void setSendLocation(int iIdSendBranch) {
		this.iIdSendBranch = iIdSendBranch;
	}

	public void setPackage(Package paSend) {
		this.paSend = paSend;
	}
	
	public void setTime(int[] iTime) {
		this.iTime = iTime;
	}

	public void setIndex(int iIndex) {
		this.iIndex = iIndex;
	}
	
	// hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Person other = (Person) obj;
		if (strName == null) {
			if (other.strName != null)
				return false;
		} else if (!strName.equals(other.strName))
			return false;
		return true;
	}

	// toStrings methods
	@Override
	public String toString() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("[");
		strbTemp.append(strName);
		strbTemp.append("]");
		return strbTemp.toString();
	}

	public String toStringFull() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("Person { Name=");
		strbTemp.append(strName);
		strbTemp.append(",\tReceiving Location ID=");
		strbTemp.append(iIdReceiveBranch);
		strbTemp.append(",\tSend Location ID=");
		strbTemp.append(iIdSendBranch);
		if (paSend == null)
			strbTemp.append(",\tPackage=null");
		else {
			strbTemp.append(",\tPackage=");
			strbTemp.append(paSend.toString());
		}
		strbTemp.append(" }");
		return strbTemp.toString();
	}

}
