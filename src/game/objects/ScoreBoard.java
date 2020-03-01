package game.objects;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ScoreBoard implements Serializable {
	private static final long serialVersionUID = -4908222828632234995L;
	private List<Score> lEasy = new LinkedList<>();
	private List<Score> lNormal = new LinkedList<>();
	private List<Score> lHard = new LinkedList<>();
	
	// Constructor methods
	public ScoreBoard () {
		for (int iCount = 0; iCount<10; iCount++) {
			this.lEasy.add(new Score(-1,""));
			this.lNormal.add(new Score(-1,""));
			this.lHard.add(new Score(-1,""));
		}
	}

	// Get methods
	public List<Score> getEasy() {
		return lEasy;
	}

	public List<Score> getNormal() {
		return lNormal;
	}

	public List<Score> getHard() {
		return lHard;
	}

	// toStrings methods
	@Override
	public String toString() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append(this.lEasy);
		strbTemp.append(this.lNormal);
		strbTemp.append(this.lHard);
		return strbTemp.toString();
	}
	
	// Specific methods
	public void addScore(Score scNew, int iDifficulty) {
		switch (iDifficulty) {
		case 0: // Easy
			this.lEasy.add(scNew);
			Collections.sort(this.lEasy);
			Collections.reverse(this.lEasy);
			while (this.lEasy.size() > 10) {
				this.lEasy.remove(this.lEasy.size() - 1);
			}
			break;
		case 1: // Normal
			this.lNormal.add(scNew);
			Collections.sort(this.lNormal);
			Collections.reverse(this.lNormal);
			while (this.lNormal.size() > 10) {
				this.lNormal.remove(this.lNormal.size() - 1);
			}
			break;
		case 2: // Hard
			this.lHard.add(scNew);
			Collections.sort(this.lHard);
			Collections.reverse(this.lHard);
			while (this.lHard.size() > 10) {
				this.lHard.remove(this.lHard.size() - 1);
			}
			break;
		}
	}

}
