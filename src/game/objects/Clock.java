package game.objects;

import java.io.Serializable;

/*
 * This is the clock object that will count the time till the end of the day.
 */
public class Clock implements Runnable, Serializable {
	private static final long serialVersionUID = 7218460603524732844L;
	private volatile int iHour = 8; // The day starts at 8:00am
	private volatile int iMinute = 0; // Each second in the real world will be 1 minute in game.
	private volatile int iDay = 0; // The amount of days that the player has played.
	private volatile int iEndDay; // this is how many hour till the day ends. Max value is 16 (8+16=24).
	private final Locker objLock = new Locker();
	private volatile boolean bPauseThreadFlag = false;
	private volatile boolean bRunThreadFlag = true;

	// Constructor methods
	public Clock(int iEndDay) {
		this.iEndDay = iEndDay + this.iHour;
	}

	public Clock(int iHour, int iEndDay) { // Start the day at different hour. Although it shouldn't be used.
		this.iHour = iHour;
		this.iEndDay = iEndDay + this.iHour;
	}

	// Get methods
	public int getHour() {
		return iHour;
	}

	public int getMinute() {
		return iMinute;
	}

	public int getDay() {
		return this.iDay;
	}

	public int getEndDay() {
		return this.iEndDay;
	}

	public boolean getRunThreadFlag() {
		return this.bRunThreadFlag;
	}
	
	// Set methods
	public void setHour(int iHour) {
		this.iHour = iHour;
	}

	public void setMinute(int iMinute) {
		this.iMinute = iMinute;
	}

	// toString methods
	@Override
	public String toString() {
		StringBuilder strbTemp = new StringBuilder();
		if (this.iHour < 10 && this.iMinute < 10) {
			strbTemp.append("0");
			strbTemp.append(this.iHour);
			strbTemp.append(":0");
			strbTemp.append(this.iMinute);
			return strbTemp.toString();
		} else if (this.iHour < 10 && this.iMinute >= 10) {
			strbTemp.append("0");
			strbTemp.append(this.iHour);
			strbTemp.append(":");
			strbTemp.append(this.iMinute);
			return strbTemp.toString();
		} else if (this.iHour >= 10 && this.iMinute < 10) {
			strbTemp.append(this.iHour);
			strbTemp.append(":0");
			strbTemp.append(this.iMinute);
			return strbTemp.toString();
		} else {
			strbTemp.append(this.iHour);
			strbTemp.append(":");
			strbTemp.append(this.iMinute);
			return strbTemp.toString();
		}
	}
	
	public String toStringFull() {
		StringBuilder strbTemp = new StringBuilder();
		if (this.iDay < 10) {
			strbTemp.append("00");
			strbTemp.append(this.iDay);
			strbTemp.append(" ");
		} else if (this.iDay < 100) {
			strbTemp.append("0");
			strbTemp.append(this.iDay);
			strbTemp.append(" ");
		} else {
			strbTemp.append(this.iDay);
			strbTemp.append(" ");
		}
		if (this.iHour < 10 && this.iMinute < 10) {
			strbTemp.append("0");
			strbTemp.append(this.iHour);
			strbTemp.append(":0");
			strbTemp.append(this.iMinute);
			return strbTemp.toString();
		} else if (this.iHour < 10 && this.iMinute >= 10) {
			strbTemp.append("0");
			strbTemp.append(this.iHour);
			strbTemp.append(":");
			strbTemp.append(this.iMinute);
			return strbTemp.toString();
		} else if (this.iHour >= 10 && this.iMinute < 10) {
			strbTemp.append(this.iHour);
			strbTemp.append(":0");
			strbTemp.append(this.iMinute);
			return strbTemp.toString();
		} else {
			strbTemp.append(this.iHour);
			strbTemp.append(":");
			strbTemp.append(this.iMinute);
			return strbTemp.toString();
		}
	}

	public String toString(int[] iTime) {
		StringBuilder strbTemp = new StringBuilder();
		if (iTime[0] < 10) {
			strbTemp.append("00");
			strbTemp.append(iTime[0]);
			strbTemp.append("-");
		} else if (iTime[0] < 100) {
			strbTemp.append("0");
			strbTemp.append(iTime[0]);
			strbTemp.append("-");
		} else {
			strbTemp.append(iTime[0]);
			strbTemp.append("-");
		}
		if (iTime[1] < 10 && iTime[2] < 10) {
			strbTemp.append("0");
			strbTemp.append(iTime[1]);
			strbTemp.append(":0");
			strbTemp.append(iTime[2]);
			return strbTemp.toString();
		} else if (iTime[1] < 10 && iTime[2] >= 10) {
			strbTemp.append("0");
			strbTemp.append(iTime[1]);
			strbTemp.append(":");
			strbTemp.append(iTime[2]);
			return strbTemp.toString();
		} else if (iTime[1] >= 10 && iTime[2] < 10) {
			strbTemp.append(iTime[1]);
			strbTemp.append(":0");
			strbTemp.append(iTime[2]);
			return strbTemp.toString();
		} else {
			strbTemp.append(iTime[1]);
			strbTemp.append(":");
			strbTemp.append(iTime[2]);
			return strbTemp.toString();
		}
	}
	
	// Thread methods
	@Override
	public void run() {
		while (bRunThreadFlag) {
			//System.out.println(toString());
			clockTick();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("Erorr: ClockObject.run(): Thread.sleep throw InterruptedException");
			}
			checkForPaused();
		}
		//System.out.println(toString());
	}

	public void checkForPaused() {
		synchronized (objLock) {
			while (bPauseThreadFlag) {
				try {
					objLock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void pauseThread() {
		this.bPauseThreadFlag = true;
	}

	public void resumeThread() {
		synchronized (objLock) {
			this.bPauseThreadFlag = false;
			objLock.notify();
		}
	}

	public void stopThread() {
		this.bRunThreadFlag = false;
	}

	// Specific methods
	public boolean clockTick() {
		if (this.iHour != this.iEndDay) {
			if (this.iMinute == 59) {
				this.iMinute = 0;
				this.iHour++;
			} else if (this.iMinute >= 0 && this.iMinute < 59)
				this.iMinute++;
			else
				System.err.println("Erorr: ClockObject.clockTick(): iMinute is not between 0 - 59");
			return false;
		} else {
			this.iDay++;
			this.iHour = 8;
			return true;
		}
	}

	public int[] getTimeInXHours(double dHours) {
		int iHour = this.iHour + (int) dHours;
		int iDay = 0;
		boolean bAddStartingHours = false;
		while (iHour >= this.iEndDay) {
			iDay++;
			iHour -= this.iEndDay;
			bAddStartingHours = true;
		}
		if (bAddStartingHours)
			iHour += 8;
		dHours -= (int) dHours;
		int iMinute = this.iMinute + (int) Math.round(dHours * 60);
		if (iMinute > 59) {
			iHour += iMinute / 60;
			iMinute = iMinute % 60;
		}
		if (iHour >= this.iEndDay) {
			iDay++;
			iHour -= this.iEndDay;
			bAddStartingHours = true;
		} else
			bAddStartingHours = false;
		if (bAddStartingHours)
			iHour += 8;
		int[] iTime = { iDay, iHour, iMinute };
		return iTime;
	}

	public int[] getTime() {
		int[] iTime = { this.iDay, this.iHour, this.iMinute };
		return iTime;
	}

	public boolean didTheDayAlreadyEnded(int[] iTime) {
		if (this.iDay < iTime[0])
			return true;
		else if (this.iEndDay <= iTime[1])
				return true;
			else
				return false;
	}
	
	public int getTimeTillEndDay() {
		return (((this.iEndDay - this.iHour) * 60) - this.iMinute);
	}
	
	public double HowManyHoursSinces(int[] iTime) {
		return ((this.iDay - iTime[0]) * 24) + (this.iHour - iTime[1] ) + ( ((double) ( this.iMinute - iTime[2] ) ) / 60);
	}
}
