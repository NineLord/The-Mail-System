package viewer.objects;

import javax.swing.JButton;

public class JButtonGame extends JButton {
	private static final long serialVersionUID = 871167977209739228L;
	private int iBranch;
	private int iGroup;
//						Group IDs
//						[0|Sending]
//						[1|Receiving]
//						[2|PickUp]
//						[3|WaitingToSend]
//						[4|QSenders]
//						[5|QReceivers]
//						[6|SendingTab]
//						[7|ReceivingTab]
//						[8|PickUpTab]
//						[9|WaitToSendTab]
	private int iIndex;
	
	public JButtonGame(String strText, int iBranch, int iIndex, int iGroup) {
		super(strText);
		this.iBranch = iBranch;
		this.iGroup = iGroup;
		this.iIndex = iIndex;
	}

	public int getBranch() {
		return iBranch;
	}
	
	public int getGroup() {
		return iGroup;
	}

	public int getIndex() {
		return iIndex;
	}

	@Override
	public String toString() {
		StringBuilder strbTemp = new StringBuilder();
		strbTemp.append("JButtonGame[Branch=");
		strbTemp.append(iBranch);
		strbTemp.append(", Index=");
		strbTemp.append(iIndex);
		try {
		strbTemp.append(", X Postion=");
		strbTemp.append(getMousePosition().getX());
		strbTemp.append(", Y Postion=");
		strbTemp.append(getMousePosition().getY());
		} catch (Exception ex) {
			//System.err.println("null pointer!");
			strbTemp.append(", X Postion=");
			strbTemp.append(0);
			strbTemp.append(", Y Postion=");
			strbTemp.append(0);
		}
		strbTemp.append(", Group=");
		strbTemp.append(iGroup);
		strbTemp.append(", Text=");
		strbTemp.append(getText());
		strbTemp.append("]");
		return strbTemp.toString();
	}
}
