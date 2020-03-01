package game.objects;

import java.io.Serializable;

public class Score implements Comparable<Score>, Serializable {
	private static final long serialVersionUID = -5019497370363203632L;
	private int iScore;
	private String strName;

	// Constructor methods
	public Score(int iScore, String strName) {
		this.iScore = iScore;
		this.strName = strName;
	}

	// Get methods
	public int getScore() {
		return iScore;
	}

	public String getName() {
		return strName;
	}

	// Set methods
	public void setScore(int iScore) {
		this.iScore = iScore;
	}
	
	public void setName(String strName) {
		this.strName = strName;
	}

	// toStrings methods
	@Override
	public String toString() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("[");
		strbTemp.append(this.iScore);
		strbTemp.append("|");
		strbTemp.append(this.strName);
		strbTemp.append("]");
		return strbTemp.toString();
	}
	
	public String toStringTable() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append(this.iScore);
		strbTemp.append(" : ");
		strbTemp.append(this.strName);
		return strbTemp.toString();
	}
	
	// Comparable methods
	@Override
	public int compareTo(Score scObject) {
		return Integer.compare(this.iScore, scObject.getScore());
	}
}
