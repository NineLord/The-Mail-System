package game.objects;

import java.io.Serializable;

/**
 * This is the Package object, which will be needed to be delivered between the
 * company branches. Each package has a limited amount of time to be delivered.
 * The earlier delivery will result with bigger amount of cash rewarded.
 */
public class Package implements Serializable {
	private static final long serialVersionUID = -5153915537846287103L;
	private static int iCount = 0; /*
									 * Will count how many packages classes has been created and will set the ID of
									 * the classes.
									 */
	private int iID; // Each package has unique ID.
	private int[] iTimeStart; /*
									 * The amount of HOURS the package has until it HAS to be delivered. This number
									 * can go below zero which will result in losing cash.
									 */
	private double dBestTime = 0; // This is the amount of hours expected from the package to get delivered.
	private int[] iTime = {0, 0, 0}; // This is the time the package going to arrive in the next Branch.
	private int iRewardSize = 0; /*
									 * This is how much the player deserve for delivering this package. this number
									 * is depending on how fast he did so + the size of the package.
									 */
	public static final String[] strSizeOptions = { "Small", "Medium",
			"Large" }; /*
						 * Contain the options for the size of the package. the bigger the size, the
						 * bigger the reward and the time of the delivery.
						 */
	private String strSize; // Contain the size of the package.
	private String strSend; // This is the person's name who sending this package
	private String strReceive; // This is the person's name who receiving this package
	private int iLocation; // This is the branch's ID this package is at the moment.

	// Constructor methods
	public Package(int iSize, String strSend, String strReceive, int iLocation) {
		this.iID = iCount;
		iCount++;
		this.strSize = strSizeOptions[iSize]; // values: 0-Small; 1-Medium; 2-Large
		this.strSend = strSend;
		this.strReceive = strReceive;
		this.iLocation = iLocation; // will be the starting Branch - "from".
	}

	// Get methods
	public int getID() {
		return this.iID;
	}

	public int[] getTimeStart() {
		return this.iTimeStart;
	}

	public double getBestTime() {
		return this.dBestTime;
	}

	public int[] getTime() {
		return this.iTime;
	}

	public int getRewardSize() {
		return this.iRewardSize;
	}

	public String getSize() {
		return this.strSize;
	}

	public String getSend() {
		return this.strSend;
	}

	public String getReceive() {
		return this.strReceive;
	}

	public int getLocation() {
		return this.iLocation;
	}

	// Set methods
	public void setTimeStart(int[] iTimeStart) {
		this.iTimeStart = iTimeStart;
	}

	public void setBestTime(double dBestTime) {
		this.dBestTime = dBestTime;
	}

	public void setTime(int[] iTime) {
		this.iTime = iTime;
	}

	public void setRewardSize(int iRewardSize) {
		this.iRewardSize = iRewardSize;
	}

	public void setLocation(int iLocation) {
		this.iLocation = iLocation;
	}

	// hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iID;
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
		Package other = (Package) obj;
		if (iID != other.iID)
			return false;
		return true;
	}

	// toStrings methods
	@Override
	public String toString() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("[");
		strbTemp.append(iID);
		strbTemp.append("|");
		strbTemp.append(iTimeStart[0]);
		strbTemp.append(":");
		strbTemp.append(iTimeStart[1]);
		strbTemp.append(":");
		strbTemp.append(iTimeStart[2]);
		strbTemp.append("|");
		strbTemp.append(strSize);
		strbTemp.append("]");
		return strbTemp.toString();
	}

	public String toStringFull() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("Package { ID=");
		strbTemp.append(iID);
		strbTemp.append(",\tTime Start=");
		strbTemp.append(iTimeStart[0]);
		strbTemp.append(":");
		strbTemp.append(iTimeStart[1]);
		strbTemp.append(":");
		strbTemp.append(iTimeStart[2]);
		strbTemp.append(",\tSize=");
		strbTemp.append(strSize);
		strbTemp.append(",\tReward Size=");
		strbTemp.append(iRewardSize);
		strbTemp.append(",\tSender=");
		strbTemp.append(strSend);
		strbTemp.append(",\tReceiver=");
		strbTemp.append(strReceive);
		strbTemp.append(",\tCurrent Branch ID=");
		strbTemp.append(iLocation);
		strbTemp.append(" }");
		return strbTemp.toString();
	}

}
