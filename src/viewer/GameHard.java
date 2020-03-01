package viewer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

public class GameHard extends JFrame {

	private JPanel contentPane;
	private JLabel lblDayCounter;
	private JProgressBar pbTimeTillEndDay;
	private JLabel lblGoldCounter;
	private JButton btnOptions;
	// Metula panel
	private JTabbedPane tbpMet;
	private JPanel pMetOverall;
	private JPanel pMetSending;
	private JPanel pMetReceiving;
	private JPanel pMetPickUp;
	private JPanel pMetWaitToSend;
	private JButton btnMetSendingBack;
	private JButton btnMetSendingNext;
	private JButton btnMetSending0;
	private JButton btnMetSending1;
	private JButton btnMetSending2;
	private JButton btnMetSending3;
	private JButton btnMetSending4;
	private JButton btnMetSending5;
	private JButton btnMetReceivingBack;
	private JButton btnMetReceivingNext;
	private JButton btnMetReceiving0;
	private JButton btnMetReceiving1;
	private JButton btnMetReceiving2;
	private JButton btnMetReceiving3;
	private JButton btnMetReceiving4;
	private JButton btnMetReceiving5;
	private JButton btnMetPickUpBack;
	private JButton btnMetPickUpNext;
	private JButton btnMetPickUp0;
	private JButton btnMetPickUp1;
	private JButton btnMetPickUp2;
	private JButton btnMetPickUp3;
	private JButton btnMetPickUp4;
	private JButton btnMetPickUp5;
	private JButton btnMetWaitingToSendBack;
	private JButton btnMetWaitingToSendNext;
	private JButton btnMetWaitingToSend0;
	private JButton btnMetWaitingToSend1;
	private JButton btnMetWaitingToSend2;
	private JButton btnMetWaitingToSend3;
	private JButton btnMetWaitingToSend4;
	private JButton btnMetWaitingToSend5;
	private JButton btnMetQSendersBack;
	private JButton btnMetQSendersNext;
	private JButton btnMetQSenders0;
	private JButton btnMetQSenders1;
	private JButton btnMetQSenders2;
	private JButton btnMetQSenders3;
	private JButton btnMetQSenders4;
	private JButton btnMetQReceiversBack;
	private JButton btnMetQReceiversNext;
	private JButton btnMetQReceivers0;
	private JButton btnMetQReceivers1;
	private JButton btnMetQReceivers2;
	private JButton btnMetQReceivers3;
	private JButton btnMetQReceivers4;
	private JButton btnMetSendingTabBack;
	private JButton btnMetSendingTab0;
	private JButton btnMetSendingTab1;
	private JButton btnMetSendingTab2;
	private JButton btnMetSendingTab3;
	private JButton btnMetSendingTabNext;
	private JButton btnMetSendingTab4;
	private JButton btnMetSendingTab8;
	private JButton btnMetSendingTab5;
	private JButton btnMetSendingTab6;
	private JButton btnMetSendingTab7;
	private JButton btnMetSendingTab9;
	private JButton btnMetSendingTab10;
	private JButton btnMetSendingTab11;
	private JButton btnMetSendingTab12;
	private JButton btnMetSendingTab13;
	private JButton btnMetSendingTab14;
	private JButton btnMetSendingTab15;
	private JButton btnMetSendingTab16;
	private JButton btnMetSendingTab20;
	private JButton btnMetSendingTab24;
	private JButton btnMetSendingTab28;
	private JButton btnMetSendingTab32;
	private JButton btnMetSendingTab36;
	private JButton btnMetSendingTab40;
	private JButton btnMetSendingTab44;
	private JButton btnMetSendingTab17;
	private JButton btnMetSendingTab18;
	private JButton btnMetSendingTab19;
	private JButton btnMetSendingTab21;
	private JButton btnMetSendingTab22;
	private JButton btnMetSendingTab23;
	private JButton btnMetSendingTab25;
	private JButton btnMetSendingTab26;
	private JButton btnMetSendingTab27;
	private JButton btnMetSendingTab29;
	private JButton btnMetSendingTab30;
	private JButton btnMetSendingTab31;
	private JButton btnMetSendingTab33;
	private JButton btnMetSendingTab34;
	private JButton btnMetSendingTab35;
	private JButton btnMetSendingTab37;
	private JButton btnMetSendingTab38;
	private JButton btnMetSendingTab39;
	private JButton btnMetSendingTab41;
	private JButton btnMetSendingTab42;
	private JButton btnMetSendingTab43;
	private JButton btnMetSendingTab45;
	private JButton btnMetSendingTab46;
	private JButton btnMetSendingTab47;
	private JButton btnMetReceivingTabBack;
	private JButton btnMetReceivingTab0;
	private JButton btnMetReceivingTab1;
	private JButton btnMetReceivingTab2;
	private JButton btnMetReceivingTab3;
	private JButton btnMetReceivingTabNext;
	private JButton btnMetReceivingTab4;
	private JButton btnMetReceivingTab8;
	private JButton btnMetReceivingTab5;
	private JButton btnMetReceivingTab6;
	private JButton btnMetReceivingTab7;
	private JButton btnMetReceivingTab9;
	private JButton btnMetReceivingTab10;
	private JButton btnMetReceivingTab11;
	private JButton btnMetReceivingTab12;
	private JButton btnMetReceivingTab13;
	private JButton btnMetReceivingTab14;
	private JButton btnMetReceivingTab15;
	private JButton btnMetReceivingTab16;
	private JButton btnMetReceivingTab20;
	private JButton btnMetReceivingTab24;
	private JButton btnMetReceivingTab28;
	private JButton btnMetReceivingTab32;
	private JButton btnMetReceivingTab36;
	private JButton btnMetReceivingTab40;
	private JButton btnMetReceivingTab44;
	private JButton btnMetReceivingTab17;
	private JButton btnMetReceivingTab18;
	private JButton btnMetReceivingTab19;
	private JButton btnMetReceivingTab21;
	private JButton btnMetReceivingTab22;
	private JButton btnMetReceivingTab23;
	private JButton btnMetReceivingTab25;
	private JButton btnMetReceivingTab26;
	private JButton btnMetReceivingTab27;
	private JButton btnMetReceivingTab29;
	private JButton btnMetReceivingTab30;
	private JButton btnMetReceivingTab31;
	private JButton btnMetReceivingTab33;
	private JButton btnMetReceivingTab34;
	private JButton btnMetReceivingTab35;
	private JButton btnMetReceivingTab37;
	private JButton btnMetReceivingTab38;
	private JButton btnMetReceivingTab39;
	private JButton btnMetReceivingTab41;
	private JButton btnMetReceivingTab42;
	private JButton btnMetReceivingTab43;
	private JButton btnMetReceivingTab45;
	private JButton btnMetReceivingTab46;
	private JButton btnMetReceivingTab47;
	private JButton btnMetPickUpTabBack;
	private JButton btnMetPickUpTab0;
	private JButton btnMetPickUpTab1;
	private JButton btnMetPickUpTab2;
	private JButton btnMetPickUpTab3;
	private JButton btnMetPickUpTabNext;
	private JButton btnMetPickUpTab4;
	private JButton btnMetPickUpTab8;
	private JButton btnMetPickUpTab5;
	private JButton btnMetPickUpTab6;
	private JButton btnMetPickUpTab7;
	private JButton btnMetPickUpTab9;
	private JButton btnMetPickUpTab10;
	private JButton btnMetPickUpTab11;
	private JButton btnMetPickUpTab12;
	private JButton btnMetPickUpTab13;
	private JButton btnMetPickUpTab14;
	private JButton btnMetPickUpTab15;
	private JButton btnMetPickUpTab16;
	private JButton btnMetPickUpTab20;
	private JButton btnMetPickUpTab24;
	private JButton btnMetPickUpTab28;
	private JButton btnMetPickUpTab32;
	private JButton btnMetPickUpTab36;
	private JButton btnMetPickUpTab40;
	private JButton btnMetPickUpTab44;
	private JButton btnMetPickUpTab17;
	private JButton btnMetPickUpTab18;
	private JButton btnMetPickUpTab19;
	private JButton btnMetPickUpTab21;
	private JButton btnMetPickUpTab22;
	private JButton btnMetPickUpTab23;
	private JButton btnMetPickUpTab25;
	private JButton btnMetPickUpTab26;
	private JButton btnMetPickUpTab27;
	private JButton btnMetPickUpTab29;
	private JButton btnMetPickUpTab30;
	private JButton btnMetPickUpTab31;
	private JButton btnMetPickUpTab33;
	private JButton btnMetPickUpTab34;
	private JButton btnMetPickUpTab35;
	private JButton btnMetPickUpTab37;
	private JButton btnMetPickUpTab38;
	private JButton btnMetPickUpTab39;
	private JButton btnMetPickUpTab41;
	private JButton btnMetPickUpTab42;
	private JButton btnMetPickUpTab43;
	private JButton btnMetPickUpTab45;
	private JButton btnMetPickUpTab46;
	private JButton btnMetPickUpTab47;
	private JButton btnMetWaitToSendTabBack;
	private JButton btnMetWaitToSendTab0;
	private JButton btnMetWaitToSendTab1;
	private JButton btnMetWaitToSendTab2;
	private JButton btnMetWaitToSendTab3;
	private JButton btnMetWaitToSendTabNext;
	private JButton btnMetWaitToSendTab4;
	private JButton btnMetWaitToSendTab8;
	private JButton btnMetWaitToSendTab5;
	private JButton btnMetWaitToSendTab6;
	private JButton btnMetWaitToSendTab7;
	private JButton btnMetWaitToSendTab9;
	private JButton btnMetWaitToSendTab10;
	private JButton btnMetWaitToSendTab11;
	private JButton btnMetWaitToSendTab12;
	private JButton btnMetWaitToSendTab13;
	private JButton btnMetWaitToSendTab14;
	private JButton btnMetWaitToSendTab15;
	private JButton btnMetWaitToSendTab16;
	private JButton btnMetWaitToSendTab20;
	private JButton btnMetWaitToSendTab24;
	private JButton btnMetWaitToSendTab28;
	private JButton btnMetWaitToSendTab32;
	private JButton btnMetWaitToSendTab36;
	private JButton btnMetWaitToSendTab40;
	private JButton btnMetWaitToSendTab44;
	private JButton btnMetWaitToSendTab17;
	private JButton btnMetWaitToSendTab18;
	private JButton btnMetWaitToSendTab19;
	private JButton btnMetWaitToSendTab21;
	private JButton btnMetWaitToSendTab22;
	private JButton btnMetWaitToSendTab23;
	private JButton btnMetWaitToSendTab25;
	private JButton btnMetWaitToSendTab26;
	private JButton btnMetWaitToSendTab27;
	private JButton btnMetWaitToSendTab29;
	private JButton btnMetWaitToSendTab30;
	private JButton btnMetWaitToSendTab31;
	private JButton btnMetWaitToSendTab33;
	private JButton btnMetWaitToSendTab34;
	private JButton btnMetWaitToSendTab35;
	private JButton btnMetWaitToSendTab37;
	private JButton btnMetWaitToSendTab38;
	private JButton btnMetWaitToSendTab39;
	private JButton btnMetWaitToSendTab41;
	private JButton btnMetWaitToSendTab42;
	private JButton btnMetWaitToSendTab43;
	private JButton btnMetWaitToSendTab45;
	private JButton btnMetWaitToSendTab46;
	private JButton btnMetWaitToSendTab47;
	// Haifa panel
	private JTabbedPane tbpHai;
	private JPanel pHaiOverall;
	private JPanel pHaiSending;
	private JPanel pHaiReceiving;
	private JPanel pHaiPickUp;
	private JPanel pHaiWaitToSend;
	private JButton btnHaiSendingBack;
	private JButton btnHaiSendingNext;
	private JButton btnHaiSending0;
	private JButton btnHaiSending1;
	private JButton btnHaiSending2;
	private JButton btnHaiSending3;
	private JButton btnHaiSending4;
	private JButton btnHaiSending5;
	private JButton btnHaiReceivingBack;
	private JButton btnHaiReceivingNext;
	private JButton btnHaiReceiving0;
	private JButton btnHaiReceiving1;
	private JButton btnHaiReceiving2;
	private JButton btnHaiReceiving3;
	private JButton btnHaiReceiving4;
	private JButton btnHaiReceiving5;
	private JButton btnHaiPickUpBack;
	private JButton btnHaiPickUpNext;
	private JButton btnHaiPickUp0;
	private JButton btnHaiPickUp1;
	private JButton btnHaiPickUp2;
	private JButton btnHaiPickUp3;
	private JButton btnHaiPickUp4;
	private JButton btnHaiPickUp5;
	private JButton btnHaiWaitingToSendBack;
	private JButton btnHaiWaitingToSendNext;
	private JButton btnHaiWaitingToSend0;
	private JButton btnHaiWaitingToSend1;
	private JButton btnHaiWaitingToSend2;
	private JButton btnHaiWaitingToSend3;
	private JButton btnHaiWaitingToSend4;
	private JButton btnHaiWaitingToSend5;
	private JButton btnHaiQSendersBack;
	private JButton btnHaiQSendersNext;
	private JButton btnHaiQSenders0;
	private JButton btnHaiQSenders1;
	private JButton btnHaiQSenders2;
	private JButton btnHaiQSenders3;
	private JButton btnHaiQSenders4;
	private JButton btnHaiQReceiversBack;
	private JButton btnHaiQReceiversNext;
	private JButton btnHaiQReceivers0;
	private JButton btnHaiQReceivers1;
	private JButton btnHaiQReceivers2;
	private JButton btnHaiQReceivers3;
	private JButton btnHaiQReceivers4;
	private JButton btnHaiSendingTabBack;
	private JButton btnHaiSendingTab0;
	private JButton btnHaiSendingTab1;
	private JButton btnHaiSendingTab2;
	private JButton btnHaiSendingTab3;
	private JButton btnHaiSendingTabNext;
	private JButton btnHaiSendingTab4;
	private JButton btnHaiSendingTab8;
	private JButton btnHaiSendingTab5;
	private JButton btnHaiSendingTab6;
	private JButton btnHaiSendingTab7;
	private JButton btnHaiSendingTab9;
	private JButton btnHaiSendingTab10;
	private JButton btnHaiSendingTab11;
	private JButton btnHaiSendingTab12;
	private JButton btnHaiSendingTab13;
	private JButton btnHaiSendingTab14;
	private JButton btnHaiSendingTab15;
	private JButton btnHaiSendingTab16;
	private JButton btnHaiSendingTab20;
	private JButton btnHaiSendingTab24;
	private JButton btnHaiSendingTab28;
	private JButton btnHaiSendingTab32;
	private JButton btnHaiSendingTab36;
	private JButton btnHaiSendingTab40;
	private JButton btnHaiSendingTab44;
	private JButton btnHaiSendingTab17;
	private JButton btnHaiSendingTab18;
	private JButton btnHaiSendingTab19;
	private JButton btnHaiSendingTab21;
	private JButton btnHaiSendingTab22;
	private JButton btnHaiSendingTab23;
	private JButton btnHaiSendingTab25;
	private JButton btnHaiSendingTab26;
	private JButton btnHaiSendingTab27;
	private JButton btnHaiSendingTab29;
	private JButton btnHaiSendingTab30;
	private JButton btnHaiSendingTab31;
	private JButton btnHaiSendingTab33;
	private JButton btnHaiSendingTab34;
	private JButton btnHaiSendingTab35;
	private JButton btnHaiSendingTab37;
	private JButton btnHaiSendingTab38;
	private JButton btnHaiSendingTab39;
	private JButton btnHaiSendingTab41;
	private JButton btnHaiSendingTab42;
	private JButton btnHaiSendingTab43;
	private JButton btnHaiSendingTab45;
	private JButton btnHaiSendingTab46;
	private JButton btnHaiSendingTab47;
	private JButton btnHaiReceivingTabBack;
	private JButton btnHaiReceivingTab0;
	private JButton btnHaiReceivingTab1;
	private JButton btnHaiReceivingTab2;
	private JButton btnHaiReceivingTab3;
	private JButton btnHaiReceivingTabNext;
	private JButton btnHaiReceivingTab4;
	private JButton btnHaiReceivingTab8;
	private JButton btnHaiReceivingTab5;
	private JButton btnHaiReceivingTab6;
	private JButton btnHaiReceivingTab7;
	private JButton btnHaiReceivingTab9;
	private JButton btnHaiReceivingTab10;
	private JButton btnHaiReceivingTab11;
	private JButton btnHaiReceivingTab12;
	private JButton btnHaiReceivingTab13;
	private JButton btnHaiReceivingTab14;
	private JButton btnHaiReceivingTab15;
	private JButton btnHaiReceivingTab16;
	private JButton btnHaiReceivingTab20;
	private JButton btnHaiReceivingTab24;
	private JButton btnHaiReceivingTab28;
	private JButton btnHaiReceivingTab32;
	private JButton btnHaiReceivingTab36;
	private JButton btnHaiReceivingTab40;
	private JButton btnHaiReceivingTab44;
	private JButton btnHaiReceivingTab17;
	private JButton btnHaiReceivingTab18;
	private JButton btnHaiReceivingTab19;
	private JButton btnHaiReceivingTab21;
	private JButton btnHaiReceivingTab22;
	private JButton btnHaiReceivingTab23;
	private JButton btnHaiReceivingTab25;
	private JButton btnHaiReceivingTab26;
	private JButton btnHaiReceivingTab27;
	private JButton btnHaiReceivingTab29;
	private JButton btnHaiReceivingTab30;
	private JButton btnHaiReceivingTab31;
	private JButton btnHaiReceivingTab33;
	private JButton btnHaiReceivingTab34;
	private JButton btnHaiReceivingTab35;
	private JButton btnHaiReceivingTab37;
	private JButton btnHaiReceivingTab38;
	private JButton btnHaiReceivingTab39;
	private JButton btnHaiReceivingTab41;
	private JButton btnHaiReceivingTab42;
	private JButton btnHaiReceivingTab43;
	private JButton btnHaiReceivingTab45;
	private JButton btnHaiReceivingTab46;
	private JButton btnHaiReceivingTab47;
	private JButton btnHaiPickUpTabBack;
	private JButton btnHaiPickUpTab0;
	private JButton btnHaiPickUpTab1;
	private JButton btnHaiPickUpTab2;
	private JButton btnHaiPickUpTab3;
	private JButton btnHaiPickUpTabNext;
	private JButton btnHaiPickUpTab4;
	private JButton btnHaiPickUpTab8;
	private JButton btnHaiPickUpTab5;
	private JButton btnHaiPickUpTab6;
	private JButton btnHaiPickUpTab7;
	private JButton btnHaiPickUpTab9;
	private JButton btnHaiPickUpTab10;
	private JButton btnHaiPickUpTab11;
	private JButton btnHaiPickUpTab12;
	private JButton btnHaiPickUpTab13;
	private JButton btnHaiPickUpTab14;
	private JButton btnHaiPickUpTab15;
	private JButton btnHaiPickUpTab16;
	private JButton btnHaiPickUpTab20;
	private JButton btnHaiPickUpTab24;
	private JButton btnHaiPickUpTab28;
	private JButton btnHaiPickUpTab32;
	private JButton btnHaiPickUpTab36;
	private JButton btnHaiPickUpTab40;
	private JButton btnHaiPickUpTab44;
	private JButton btnHaiPickUpTab17;
	private JButton btnHaiPickUpTab18;
	private JButton btnHaiPickUpTab19;
	private JButton btnHaiPickUpTab21;
	private JButton btnHaiPickUpTab22;
	private JButton btnHaiPickUpTab23;
	private JButton btnHaiPickUpTab25;
	private JButton btnHaiPickUpTab26;
	private JButton btnHaiPickUpTab27;
	private JButton btnHaiPickUpTab29;
	private JButton btnHaiPickUpTab30;
	private JButton btnHaiPickUpTab31;
	private JButton btnHaiPickUpTab33;
	private JButton btnHaiPickUpTab34;
	private JButton btnHaiPickUpTab35;
	private JButton btnHaiPickUpTab37;
	private JButton btnHaiPickUpTab38;
	private JButton btnHaiPickUpTab39;
	private JButton btnHaiPickUpTab41;
	private JButton btnHaiPickUpTab42;
	private JButton btnHaiPickUpTab43;
	private JButton btnHaiPickUpTab45;
	private JButton btnHaiPickUpTab46;
	private JButton btnHaiPickUpTab47;
	private JButton btnHaiWaitToSendTabBack;
	private JButton btnHaiWaitToSendTab0;
	private JButton btnHaiWaitToSendTab1;
	private JButton btnHaiWaitToSendTab2;
	private JButton btnHaiWaitToSendTab3;
	private JButton btnHaiWaitToSendTabNext;
	private JButton btnHaiWaitToSendTab4;
	private JButton btnHaiWaitToSendTab8;
	private JButton btnHaiWaitToSendTab5;
	private JButton btnHaiWaitToSendTab6;
	private JButton btnHaiWaitToSendTab7;
	private JButton btnHaiWaitToSendTab9;
	private JButton btnHaiWaitToSendTab10;
	private JButton btnHaiWaitToSendTab11;
	private JButton btnHaiWaitToSendTab12;
	private JButton btnHaiWaitToSendTab13;
	private JButton btnHaiWaitToSendTab14;
	private JButton btnHaiWaitToSendTab15;
	private JButton btnHaiWaitToSendTab16;
	private JButton btnHaiWaitToSendTab20;
	private JButton btnHaiWaitToSendTab24;
	private JButton btnHaiWaitToSendTab28;
	private JButton btnHaiWaitToSendTab32;
	private JButton btnHaiWaitToSendTab36;
	private JButton btnHaiWaitToSendTab40;
	private JButton btnHaiWaitToSendTab44;
	private JButton btnHaiWaitToSendTab17;
	private JButton btnHaiWaitToSendTab18;
	private JButton btnHaiWaitToSendTab19;
	private JButton btnHaiWaitToSendTab21;
	private JButton btnHaiWaitToSendTab22;
	private JButton btnHaiWaitToSendTab23;
	private JButton btnHaiWaitToSendTab25;
	private JButton btnHaiWaitToSendTab26;
	private JButton btnHaiWaitToSendTab27;
	private JButton btnHaiWaitToSendTab29;
	private JButton btnHaiWaitToSendTab30;
	private JButton btnHaiWaitToSendTab31;
	private JButton btnHaiWaitToSendTab33;
	private JButton btnHaiWaitToSendTab34;
	private JButton btnHaiWaitToSendTab35;
	private JButton btnHaiWaitToSendTab37;
	private JButton btnHaiWaitToSendTab38;
	private JButton btnHaiWaitToSendTab39;
	private JButton btnHaiWaitToSendTab41;
	private JButton btnHaiWaitToSendTab42;
	private JButton btnHaiWaitToSendTab43;
	private JButton btnHaiWaitToSendTab45;
	private JButton btnHaiWaitToSendTab46;
	private JButton btnHaiWaitToSendTab47;
	// Tiberias panel
	private JTabbedPane tbpTib;
	private JPanel pTibOverall;
	private JPanel pTibSending;
	private JPanel pTibReceiving;
	private JPanel pTibPickUp;
	private JPanel pTibWaitToSend;
	private JButton btnTibSendingBack;
	private JButton btnTibSendingNext;
	private JButton btnTibSending0;
	private JButton btnTibSending1;
	private JButton btnTibSending2;
	private JButton btnTibSending3;
	private JButton btnTibSending4;
	private JButton btnTibSending5;
	private JButton btnTibReceivingBack;
	private JButton btnTibReceivingNext;
	private JButton btnTibReceiving0;
	private JButton btnTibReceiving1;
	private JButton btnTibReceiving2;
	private JButton btnTibReceiving3;
	private JButton btnTibReceiving4;
	private JButton btnTibReceiving5;
	private JButton btnTibPickUpBack;
	private JButton btnTibPickUpNext;
	private JButton btnTibPickUp0;
	private JButton btnTibPickUp1;
	private JButton btnTibPickUp2;
	private JButton btnTibPickUp3;
	private JButton btnTibPickUp4;
	private JButton btnTibPickUp5;
	private JButton btnTibWaitingToSendBack;
	private JButton btnTibWaitingToSendNext;
	private JButton btnTibWaitingToSend0;
	private JButton btnTibWaitingToSend1;
	private JButton btnTibWaitingToSend2;
	private JButton btnTibWaitingToSend3;
	private JButton btnTibWaitingToSend4;
	private JButton btnTibWaitingToSend5;
	private JButton btnTibQSendersBack;
	private JButton btnTibQSendersNext;
	private JButton btnTibQSenders0;
	private JButton btnTibQSenders1;
	private JButton btnTibQSenders2;
	private JButton btnTibQSenders3;
	private JButton btnTibQSenders4;
	private JButton btnTibQReceiversBack;
	private JButton btnTibQReceiversNext;
	private JButton btnTibQReceivers0;
	private JButton btnTibQReceivers1;
	private JButton btnTibQReceivers2;
	private JButton btnTibQReceivers3;
	private JButton btnTibQReceivers4;
	private JButton btnTibSendingTabBack;
	private JButton btnTibSendingTab0;
	private JButton btnTibSendingTab1;
	private JButton btnTibSendingTab2;
	private JButton btnTibSendingTab3;
	private JButton btnTibSendingTabNext;
	private JButton btnTibSendingTab4;
	private JButton btnTibSendingTab8;
	private JButton btnTibSendingTab5;
	private JButton btnTibSendingTab6;
	private JButton btnTibSendingTab7;
	private JButton btnTibSendingTab9;
	private JButton btnTibSendingTab10;
	private JButton btnTibSendingTab11;
	private JButton btnTibSendingTab12;
	private JButton btnTibSendingTab13;
	private JButton btnTibSendingTab14;
	private JButton btnTibSendingTab15;
	private JButton btnTibSendingTab16;
	private JButton btnTibSendingTab20;
	private JButton btnTibSendingTab24;
	private JButton btnTibSendingTab28;
	private JButton btnTibSendingTab32;
	private JButton btnTibSendingTab36;
	private JButton btnTibSendingTab40;
	private JButton btnTibSendingTab44;
	private JButton btnTibSendingTab17;
	private JButton btnTibSendingTab18;
	private JButton btnTibSendingTab19;
	private JButton btnTibSendingTab21;
	private JButton btnTibSendingTab22;
	private JButton btnTibSendingTab23;
	private JButton btnTibSendingTab25;
	private JButton btnTibSendingTab26;
	private JButton btnTibSendingTab27;
	private JButton btnTibSendingTab29;
	private JButton btnTibSendingTab30;
	private JButton btnTibSendingTab31;
	private JButton btnTibSendingTab33;
	private JButton btnTibSendingTab34;
	private JButton btnTibSendingTab35;
	private JButton btnTibSendingTab37;
	private JButton btnTibSendingTab38;
	private JButton btnTibSendingTab39;
	private JButton btnTibSendingTab41;
	private JButton btnTibSendingTab42;
	private JButton btnTibSendingTab43;
	private JButton btnTibSendingTab45;
	private JButton btnTibSendingTab46;
	private JButton btnTibSendingTab47;
	private JButton btnTibReceivingTabBack;
	private JButton btnTibReceivingTab0;
	private JButton btnTibReceivingTab1;
	private JButton btnTibReceivingTab2;
	private JButton btnTibReceivingTab3;
	private JButton btnTibReceivingTabNext;
	private JButton btnTibReceivingTab4;
	private JButton btnTibReceivingTab8;
	private JButton btnTibReceivingTab5;
	private JButton btnTibReceivingTab6;
	private JButton btnTibReceivingTab7;
	private JButton btnTibReceivingTab9;
	private JButton btnTibReceivingTab10;
	private JButton btnTibReceivingTab11;
	private JButton btnTibReceivingTab12;
	private JButton btnTibReceivingTab13;
	private JButton btnTibReceivingTab14;
	private JButton btnTibReceivingTab15;
	private JButton btnTibReceivingTab16;
	private JButton btnTibReceivingTab20;
	private JButton btnTibReceivingTab24;
	private JButton btnTibReceivingTab28;
	private JButton btnTibReceivingTab32;
	private JButton btnTibReceivingTab36;
	private JButton btnTibReceivingTab40;
	private JButton btnTibReceivingTab44;
	private JButton btnTibReceivingTab17;
	private JButton btnTibReceivingTab18;
	private JButton btnTibReceivingTab19;
	private JButton btnTibReceivingTab21;
	private JButton btnTibReceivingTab22;
	private JButton btnTibReceivingTab23;
	private JButton btnTibReceivingTab25;
	private JButton btnTibReceivingTab26;
	private JButton btnTibReceivingTab27;
	private JButton btnTibReceivingTab29;
	private JButton btnTibReceivingTab30;
	private JButton btnTibReceivingTab31;
	private JButton btnTibReceivingTab33;
	private JButton btnTibReceivingTab34;
	private JButton btnTibReceivingTab35;
	private JButton btnTibReceivingTab37;
	private JButton btnTibReceivingTab38;
	private JButton btnTibReceivingTab39;
	private JButton btnTibReceivingTab41;
	private JButton btnTibReceivingTab42;
	private JButton btnTibReceivingTab43;
	private JButton btnTibReceivingTab45;
	private JButton btnTibReceivingTab46;
	private JButton btnTibReceivingTab47;
	private JButton btnTibPickUpTabBack;
	private JButton btnTibPickUpTab0;
	private JButton btnTibPickUpTab1;
	private JButton btnTibPickUpTab2;
	private JButton btnTibPickUpTab3;
	private JButton btnTibPickUpTabNext;
	private JButton btnTibPickUpTab4;
	private JButton btnTibPickUpTab8;
	private JButton btnTibPickUpTab5;
	private JButton btnTibPickUpTab6;
	private JButton btnTibPickUpTab7;
	private JButton btnTibPickUpTab9;
	private JButton btnTibPickUpTab10;
	private JButton btnTibPickUpTab11;
	private JButton btnTibPickUpTab12;
	private JButton btnTibPickUpTab13;
	private JButton btnTibPickUpTab14;
	private JButton btnTibPickUpTab15;
	private JButton btnTibPickUpTab16;
	private JButton btnTibPickUpTab20;
	private JButton btnTibPickUpTab24;
	private JButton btnTibPickUpTab28;
	private JButton btnTibPickUpTab32;
	private JButton btnTibPickUpTab36;
	private JButton btnTibPickUpTab40;
	private JButton btnTibPickUpTab44;
	private JButton btnTibPickUpTab17;
	private JButton btnTibPickUpTab18;
	private JButton btnTibPickUpTab19;
	private JButton btnTibPickUpTab21;
	private JButton btnTibPickUpTab22;
	private JButton btnTibPickUpTab23;
	private JButton btnTibPickUpTab25;
	private JButton btnTibPickUpTab26;
	private JButton btnTibPickUpTab27;
	private JButton btnTibPickUpTab29;
	private JButton btnTibPickUpTab30;
	private JButton btnTibPickUpTab31;
	private JButton btnTibPickUpTab33;
	private JButton btnTibPickUpTab34;
	private JButton btnTibPickUpTab35;
	private JButton btnTibPickUpTab37;
	private JButton btnTibPickUpTab38;
	private JButton btnTibPickUpTab39;
	private JButton btnTibPickUpTab41;
	private JButton btnTibPickUpTab42;
	private JButton btnTibPickUpTab43;
	private JButton btnTibPickUpTab45;
	private JButton btnTibPickUpTab46;
	private JButton btnTibPickUpTab47;
	private JButton btnTibWaitToSendTabBack;
	private JButton btnTibWaitToSendTab0;
	private JButton btnTibWaitToSendTab1;
	private JButton btnTibWaitToSendTab2;
	private JButton btnTibWaitToSendTab3;
	private JButton btnTibWaitToSendTabNext;
	private JButton btnTibWaitToSendTab4;
	private JButton btnTibWaitToSendTab8;
	private JButton btnTibWaitToSendTab5;
	private JButton btnTibWaitToSendTab6;
	private JButton btnTibWaitToSendTab7;
	private JButton btnTibWaitToSendTab9;
	private JButton btnTibWaitToSendTab10;
	private JButton btnTibWaitToSendTab11;
	private JButton btnTibWaitToSendTab12;
	private JButton btnTibWaitToSendTab13;
	private JButton btnTibWaitToSendTab14;
	private JButton btnTibWaitToSendTab15;
	private JButton btnTibWaitToSendTab16;
	private JButton btnTibWaitToSendTab20;
	private JButton btnTibWaitToSendTab24;
	private JButton btnTibWaitToSendTab28;
	private JButton btnTibWaitToSendTab32;
	private JButton btnTibWaitToSendTab36;
	private JButton btnTibWaitToSendTab40;
	private JButton btnTibWaitToSendTab44;
	private JButton btnTibWaitToSendTab17;
	private JButton btnTibWaitToSendTab18;
	private JButton btnTibWaitToSendTab19;
	private JButton btnTibWaitToSendTab21;
	private JButton btnTibWaitToSendTab22;
	private JButton btnTibWaitToSendTab23;
	private JButton btnTibWaitToSendTab25;
	private JButton btnTibWaitToSendTab26;
	private JButton btnTibWaitToSendTab27;
	private JButton btnTibWaitToSendTab29;
	private JButton btnTibWaitToSendTab30;
	private JButton btnTibWaitToSendTab31;
	private JButton btnTibWaitToSendTab33;
	private JButton btnTibWaitToSendTab34;
	private JButton btnTibWaitToSendTab35;
	private JButton btnTibWaitToSendTab37;
	private JButton btnTibWaitToSendTab38;
	private JButton btnTibWaitToSendTab39;
	private JButton btnTibWaitToSendTab41;
	private JButton btnTibWaitToSendTab42;
	private JButton btnTibWaitToSendTab43;
	private JButton btnTibWaitToSendTab45;
	private JButton btnTibWaitToSendTab46;
	private JButton btnTibWaitToSendTab47;
	// Jerusalem panel
	private JTabbedPane tbpJer;
	private JPanel pJerOverall;
	private JPanel pJerSending;
	private JPanel pJerReceiving;
	private JPanel pJerPickUp;
	private JPanel pJerWaitToSend;
	private JButton btnJerSendingBack;
	private JButton btnJerSendingNext;
	private JButton btnJerSending0;
	private JButton btnJerSending1;
	private JButton btnJerSending2;
	private JButton btnJerSending3;
	private JButton btnJerSending4;
	private JButton btnJerSending5;
	private JButton btnJerReceivingBack;
	private JButton btnJerReceivingNext;
	private JButton btnJerReceiving0;
	private JButton btnJerReceiving1;
	private JButton btnJerReceiving2;
	private JButton btnJerReceiving3;
	private JButton btnJerReceiving4;
	private JButton btnJerReceiving5;
	private JButton btnJerPickUpBack;
	private JButton btnJerPickUpNext;
	private JButton btnJerPickUp0;
	private JButton btnJerPickUp1;
	private JButton btnJerPickUp2;
	private JButton btnJerPickUp3;
	private JButton btnJerPickUp4;
	private JButton btnJerPickUp5;
	private JButton btnJerWaitingToSendBack;
	private JButton btnJerWaitingToSendNext;
	private JButton btnJerWaitingToSend0;
	private JButton btnJerWaitingToSend1;
	private JButton btnJerWaitingToSend2;
	private JButton btnJerWaitingToSend3;
	private JButton btnJerWaitingToSend4;
	private JButton btnJerWaitingToSend5;
	private JButton btnJerQSendersBack;
	private JButton btnJerQSendersNext;
	private JButton btnJerQSenders0;
	private JButton btnJerQSenders1;
	private JButton btnJerQSenders2;
	private JButton btnJerQSenders3;
	private JButton btnJerQSenders4;
	private JButton btnJerQReceiversBack;
	private JButton btnJerQReceiversNext;
	private JButton btnJerQReceivers0;
	private JButton btnJerQReceivers1;
	private JButton btnJerQReceivers2;
	private JButton btnJerQReceivers3;
	private JButton btnJerQReceivers4;
	private JButton btnJerSendingTabBack;
	private JButton btnJerSendingTab0;
	private JButton btnJerSendingTab1;
	private JButton btnJerSendingTab2;
	private JButton btnJerSendingTab3;
	private JButton btnJerSendingTabNext;
	private JButton btnJerSendingTab4;
	private JButton btnJerSendingTab8;
	private JButton btnJerSendingTab5;
	private JButton btnJerSendingTab6;
	private JButton btnJerSendingTab7;
	private JButton btnJerSendingTab9;
	private JButton btnJerSendingTab10;
	private JButton btnJerSendingTab11;
	private JButton btnJerSendingTab12;
	private JButton btnJerSendingTab13;
	private JButton btnJerSendingTab14;
	private JButton btnJerSendingTab15;
	private JButton btnJerSendingTab16;
	private JButton btnJerSendingTab20;
	private JButton btnJerSendingTab24;
	private JButton btnJerSendingTab28;
	private JButton btnJerSendingTab32;
	private JButton btnJerSendingTab36;
	private JButton btnJerSendingTab40;
	private JButton btnJerSendingTab44;
	private JButton btnJerSendingTab17;
	private JButton btnJerSendingTab18;
	private JButton btnJerSendingTab19;
	private JButton btnJerSendingTab21;
	private JButton btnJerSendingTab22;
	private JButton btnJerSendingTab23;
	private JButton btnJerSendingTab25;
	private JButton btnJerSendingTab26;
	private JButton btnJerSendingTab27;
	private JButton btnJerSendingTab29;
	private JButton btnJerSendingTab30;
	private JButton btnJerSendingTab31;
	private JButton btnJerSendingTab33;
	private JButton btnJerSendingTab34;
	private JButton btnJerSendingTab35;
	private JButton btnJerSendingTab37;
	private JButton btnJerSendingTab38;
	private JButton btnJerSendingTab39;
	private JButton btnJerSendingTab41;
	private JButton btnJerSendingTab42;
	private JButton btnJerSendingTab43;
	private JButton btnJerSendingTab45;
	private JButton btnJerSendingTab46;
	private JButton btnJerSendingTab47;
	private JButton btnJerReceivingTabBack;
	private JButton btnJerReceivingTab0;
	private JButton btnJerReceivingTab1;
	private JButton btnJerReceivingTab2;
	private JButton btnJerReceivingTab3;
	private JButton btnJerReceivingTabNext;
	private JButton btnJerReceivingTab4;
	private JButton btnJerReceivingTab8;
	private JButton btnJerReceivingTab5;
	private JButton btnJerReceivingTab6;
	private JButton btnJerReceivingTab7;
	private JButton btnJerReceivingTab9;
	private JButton btnJerReceivingTab10;
	private JButton btnJerReceivingTab11;
	private JButton btnJerReceivingTab12;
	private JButton btnJerReceivingTab13;
	private JButton btnJerReceivingTab14;
	private JButton btnJerReceivingTab15;
	private JButton btnJerReceivingTab16;
	private JButton btnJerReceivingTab20;
	private JButton btnJerReceivingTab24;
	private JButton btnJerReceivingTab28;
	private JButton btnJerReceivingTab32;
	private JButton btnJerReceivingTab36;
	private JButton btnJerReceivingTab40;
	private JButton btnJerReceivingTab44;
	private JButton btnJerReceivingTab17;
	private JButton btnJerReceivingTab18;
	private JButton btnJerReceivingTab19;
	private JButton btnJerReceivingTab21;
	private JButton btnJerReceivingTab22;
	private JButton btnJerReceivingTab23;
	private JButton btnJerReceivingTab25;
	private JButton btnJerReceivingTab26;
	private JButton btnJerReceivingTab27;
	private JButton btnJerReceivingTab29;
	private JButton btnJerReceivingTab30;
	private JButton btnJerReceivingTab31;
	private JButton btnJerReceivingTab33;
	private JButton btnJerReceivingTab34;
	private JButton btnJerReceivingTab35;
	private JButton btnJerReceivingTab37;
	private JButton btnJerReceivingTab38;
	private JButton btnJerReceivingTab39;
	private JButton btnJerReceivingTab41;
	private JButton btnJerReceivingTab42;
	private JButton btnJerReceivingTab43;
	private JButton btnJerReceivingTab45;
	private JButton btnJerReceivingTab46;
	private JButton btnJerReceivingTab47;
	private JButton btnJerPickUpTabBack;
	private JButton btnJerPickUpTab0;
	private JButton btnJerPickUpTab1;
	private JButton btnJerPickUpTab2;
	private JButton btnJerPickUpTab3;
	private JButton btnJerPickUpTabNext;
	private JButton btnJerPickUpTab4;
	private JButton btnJerPickUpTab8;
	private JButton btnJerPickUpTab5;
	private JButton btnJerPickUpTab6;
	private JButton btnJerPickUpTab7;
	private JButton btnJerPickUpTab9;
	private JButton btnJerPickUpTab10;
	private JButton btnJerPickUpTab11;
	private JButton btnJerPickUpTab12;
	private JButton btnJerPickUpTab13;
	private JButton btnJerPickUpTab14;
	private JButton btnJerPickUpTab15;
	private JButton btnJerPickUpTab16;
	private JButton btnJerPickUpTab20;
	private JButton btnJerPickUpTab24;
	private JButton btnJerPickUpTab28;
	private JButton btnJerPickUpTab32;
	private JButton btnJerPickUpTab36;
	private JButton btnJerPickUpTab40;
	private JButton btnJerPickUpTab44;
	private JButton btnJerPickUpTab17;
	private JButton btnJerPickUpTab18;
	private JButton btnJerPickUpTab19;
	private JButton btnJerPickUpTab21;
	private JButton btnJerPickUpTab22;
	private JButton btnJerPickUpTab23;
	private JButton btnJerPickUpTab25;
	private JButton btnJerPickUpTab26;
	private JButton btnJerPickUpTab27;
	private JButton btnJerPickUpTab29;
	private JButton btnJerPickUpTab30;
	private JButton btnJerPickUpTab31;
	private JButton btnJerPickUpTab33;
	private JButton btnJerPickUpTab34;
	private JButton btnJerPickUpTab35;
	private JButton btnJerPickUpTab37;
	private JButton btnJerPickUpTab38;
	private JButton btnJerPickUpTab39;
	private JButton btnJerPickUpTab41;
	private JButton btnJerPickUpTab42;
	private JButton btnJerPickUpTab43;
	private JButton btnJerPickUpTab45;
	private JButton btnJerPickUpTab46;
	private JButton btnJerPickUpTab47;
	private JButton btnJerWaitToSendTabBack;
	private JButton btnJerWaitToSendTab0;
	private JButton btnJerWaitToSendTab1;
	private JButton btnJerWaitToSendTab2;
	private JButton btnJerWaitToSendTab3;
	private JButton btnJerWaitToSendTabNext;
	private JButton btnJerWaitToSendTab4;
	private JButton btnJerWaitToSendTab8;
	private JButton btnJerWaitToSendTab5;
	private JButton btnJerWaitToSendTab6;
	private JButton btnJerWaitToSendTab7;
	private JButton btnJerWaitToSendTab9;
	private JButton btnJerWaitToSendTab10;
	private JButton btnJerWaitToSendTab11;
	private JButton btnJerWaitToSendTab12;
	private JButton btnJerWaitToSendTab13;
	private JButton btnJerWaitToSendTab14;
	private JButton btnJerWaitToSendTab15;
	private JButton btnJerWaitToSendTab16;
	private JButton btnJerWaitToSendTab20;
	private JButton btnJerWaitToSendTab24;
	private JButton btnJerWaitToSendTab28;
	private JButton btnJerWaitToSendTab32;
	private JButton btnJerWaitToSendTab36;
	private JButton btnJerWaitToSendTab40;
	private JButton btnJerWaitToSendTab44;
	private JButton btnJerWaitToSendTab17;
	private JButton btnJerWaitToSendTab18;
	private JButton btnJerWaitToSendTab19;
	private JButton btnJerWaitToSendTab21;
	private JButton btnJerWaitToSendTab22;
	private JButton btnJerWaitToSendTab23;
	private JButton btnJerWaitToSendTab25;
	private JButton btnJerWaitToSendTab26;
	private JButton btnJerWaitToSendTab27;
	private JButton btnJerWaitToSendTab29;
	private JButton btnJerWaitToSendTab30;
	private JButton btnJerWaitToSendTab31;
	private JButton btnJerWaitToSendTab33;
	private JButton btnJerWaitToSendTab34;
	private JButton btnJerWaitToSendTab35;
	private JButton btnJerWaitToSendTab37;
	private JButton btnJerWaitToSendTab38;
	private JButton btnJerWaitToSendTab39;
	private JButton btnJerWaitToSendTab41;
	private JButton btnJerWaitToSendTab42;
	private JButton btnJerWaitToSendTab43;
	private JButton btnJerWaitToSendTab45;
	private JButton btnJerWaitToSendTab46;
	private JButton btnJerWaitToSendTab47;
	// Tel Aviv panel
	private JTabbedPane tbpTel;
	private JPanel pTelOverall;
	private JPanel pTelSending;
	private JPanel pTelReceiving;
	private JPanel pTelPickUp;
	private JPanel pTelWaitToSend;
	private JButton btnTelSendingBack;
	private JButton btnTelSendingNext;
	private JButton btnTelSending0;
	private JButton btnTelSending1;
	private JButton btnTelSending2;
	private JButton btnTelSending3;
	private JButton btnTelSending4;
	private JButton btnTelSending5;
	private JButton btnTelReceivingBack;
	private JButton btnTelReceivingNext;
	private JButton btnTelReceiving0;
	private JButton btnTelReceiving1;
	private JButton btnTelReceiving2;
	private JButton btnTelReceiving3;
	private JButton btnTelReceiving4;
	private JButton btnTelReceiving5;
	private JButton btnTelPickUpBack;
	private JButton btnTelPickUpNext;
	private JButton btnTelPickUp0;
	private JButton btnTelPickUp1;
	private JButton btnTelPickUp2;
	private JButton btnTelPickUp3;
	private JButton btnTelPickUp4;
	private JButton btnTelPickUp5;
	private JButton btnTelWaitingToSendBack;
	private JButton btnTelWaitingToSendNext;
	private JButton btnTelWaitingToSend0;
	private JButton btnTelWaitingToSend1;
	private JButton btnTelWaitingToSend2;
	private JButton btnTelWaitingToSend3;
	private JButton btnTelWaitingToSend4;
	private JButton btnTelWaitingToSend5;
	private JButton btnTelQSendersBack;
	private JButton btnTelQSendersNext;
	private JButton btnTelQSenders0;
	private JButton btnTelQSenders1;
	private JButton btnTelQSenders2;
	private JButton btnTelQSenders3;
	private JButton btnTelQSenders4;
	private JButton btnTelQReceiversBack;
	private JButton btnTelQReceiversNext;
	private JButton btnTelQReceivers0;
	private JButton btnTelQReceivers1;
	private JButton btnTelQReceivers2;
	private JButton btnTelQReceivers3;
	private JButton btnTelQReceivers4;
	private JButton btnTelSendingTabBack;
	private JButton btnTelSendingTab0;
	private JButton btnTelSendingTab1;
	private JButton btnTelSendingTab2;
	private JButton btnTelSendingTab3;
	private JButton btnTelSendingTabNext;
	private JButton btnTelSendingTab4;
	private JButton btnTelSendingTab8;
	private JButton btnTelSendingTab5;
	private JButton btnTelSendingTab6;
	private JButton btnTelSendingTab7;
	private JButton btnTelSendingTab9;
	private JButton btnTelSendingTab10;
	private JButton btnTelSendingTab11;
	private JButton btnTelSendingTab12;
	private JButton btnTelSendingTab13;
	private JButton btnTelSendingTab14;
	private JButton btnTelSendingTab15;
	private JButton btnTelSendingTab16;
	private JButton btnTelSendingTab20;
	private JButton btnTelSendingTab24;
	private JButton btnTelSendingTab28;
	private JButton btnTelSendingTab32;
	private JButton btnTelSendingTab36;
	private JButton btnTelSendingTab40;
	private JButton btnTelSendingTab44;
	private JButton btnTelSendingTab17;
	private JButton btnTelSendingTab18;
	private JButton btnTelSendingTab19;
	private JButton btnTelSendingTab21;
	private JButton btnTelSendingTab22;
	private JButton btnTelSendingTab23;
	private JButton btnTelSendingTab25;
	private JButton btnTelSendingTab26;
	private JButton btnTelSendingTab27;
	private JButton btnTelSendingTab29;
	private JButton btnTelSendingTab30;
	private JButton btnTelSendingTab31;
	private JButton btnTelSendingTab33;
	private JButton btnTelSendingTab34;
	private JButton btnTelSendingTab35;
	private JButton btnTelSendingTab37;
	private JButton btnTelSendingTab38;
	private JButton btnTelSendingTab39;
	private JButton btnTelSendingTab41;
	private JButton btnTelSendingTab42;
	private JButton btnTelSendingTab43;
	private JButton btnTelSendingTab45;
	private JButton btnTelSendingTab46;
	private JButton btnTelSendingTab47;
	private JButton btnTelReceivingTabBack;
	private JButton btnTelReceivingTab0;
	private JButton btnTelReceivingTab1;
	private JButton btnTelReceivingTab2;
	private JButton btnTelReceivingTab3;
	private JButton btnTelReceivingTabNext;
	private JButton btnTelReceivingTab4;
	private JButton btnTelReceivingTab8;
	private JButton btnTelReceivingTab5;
	private JButton btnTelReceivingTab6;
	private JButton btnTelReceivingTab7;
	private JButton btnTelReceivingTab9;
	private JButton btnTelReceivingTab10;
	private JButton btnTelReceivingTab11;
	private JButton btnTelReceivingTab12;
	private JButton btnTelReceivingTab13;
	private JButton btnTelReceivingTab14;
	private JButton btnTelReceivingTab15;
	private JButton btnTelReceivingTab16;
	private JButton btnTelReceivingTab20;
	private JButton btnTelReceivingTab24;
	private JButton btnTelReceivingTab28;
	private JButton btnTelReceivingTab32;
	private JButton btnTelReceivingTab36;
	private JButton btnTelReceivingTab40;
	private JButton btnTelReceivingTab44;
	private JButton btnTelReceivingTab17;
	private JButton btnTelReceivingTab18;
	private JButton btnTelReceivingTab19;
	private JButton btnTelReceivingTab21;
	private JButton btnTelReceivingTab22;
	private JButton btnTelReceivingTab23;
	private JButton btnTelReceivingTab25;
	private JButton btnTelReceivingTab26;
	private JButton btnTelReceivingTab27;
	private JButton btnTelReceivingTab29;
	private JButton btnTelReceivingTab30;
	private JButton btnTelReceivingTab31;
	private JButton btnTelReceivingTab33;
	private JButton btnTelReceivingTab34;
	private JButton btnTelReceivingTab35;
	private JButton btnTelReceivingTab37;
	private JButton btnTelReceivingTab38;
	private JButton btnTelReceivingTab39;
	private JButton btnTelReceivingTab41;
	private JButton btnTelReceivingTab42;
	private JButton btnTelReceivingTab43;
	private JButton btnTelReceivingTab45;
	private JButton btnTelReceivingTab46;
	private JButton btnTelReceivingTab47;
	private JButton btnTelPickUpTabBack;
	private JButton btnTelPickUpTab0;
	private JButton btnTelPickUpTab1;
	private JButton btnTelPickUpTab2;
	private JButton btnTelPickUpTab3;
	private JButton btnTelPickUpTabNext;
	private JButton btnTelPickUpTab4;
	private JButton btnTelPickUpTab8;
	private JButton btnTelPickUpTab5;
	private JButton btnTelPickUpTab6;
	private JButton btnTelPickUpTab7;
	private JButton btnTelPickUpTab9;
	private JButton btnTelPickUpTab10;
	private JButton btnTelPickUpTab11;
	private JButton btnTelPickUpTab12;
	private JButton btnTelPickUpTab13;
	private JButton btnTelPickUpTab14;
	private JButton btnTelPickUpTab15;
	private JButton btnTelPickUpTab16;
	private JButton btnTelPickUpTab20;
	private JButton btnTelPickUpTab24;
	private JButton btnTelPickUpTab28;
	private JButton btnTelPickUpTab32;
	private JButton btnTelPickUpTab36;
	private JButton btnTelPickUpTab40;
	private JButton btnTelPickUpTab44;
	private JButton btnTelPickUpTab17;
	private JButton btnTelPickUpTab18;
	private JButton btnTelPickUpTab19;
	private JButton btnTelPickUpTab21;
	private JButton btnTelPickUpTab22;
	private JButton btnTelPickUpTab23;
	private JButton btnTelPickUpTab25;
	private JButton btnTelPickUpTab26;
	private JButton btnTelPickUpTab27;
	private JButton btnTelPickUpTab29;
	private JButton btnTelPickUpTab30;
	private JButton btnTelPickUpTab31;
	private JButton btnTelPickUpTab33;
	private JButton btnTelPickUpTab34;
	private JButton btnTelPickUpTab35;
	private JButton btnTelPickUpTab37;
	private JButton btnTelPickUpTab38;
	private JButton btnTelPickUpTab39;
	private JButton btnTelPickUpTab41;
	private JButton btnTelPickUpTab42;
	private JButton btnTelPickUpTab43;
	private JButton btnTelPickUpTab45;
	private JButton btnTelPickUpTab46;
	private JButton btnTelPickUpTab47;
	private JButton btnTelWaitToSendTabBack;
	private JButton btnTelWaitToSendTab0;
	private JButton btnTelWaitToSendTab1;
	private JButton btnTelWaitToSendTab2;
	private JButton btnTelWaitToSendTab3;
	private JButton btnTelWaitToSendTabNext;
	private JButton btnTelWaitToSendTab4;
	private JButton btnTelWaitToSendTab8;
	private JButton btnTelWaitToSendTab5;
	private JButton btnTelWaitToSendTab6;
	private JButton btnTelWaitToSendTab7;
	private JButton btnTelWaitToSendTab9;
	private JButton btnTelWaitToSendTab10;
	private JButton btnTelWaitToSendTab11;
	private JButton btnTelWaitToSendTab12;
	private JButton btnTelWaitToSendTab13;
	private JButton btnTelWaitToSendTab14;
	private JButton btnTelWaitToSendTab15;
	private JButton btnTelWaitToSendTab16;
	private JButton btnTelWaitToSendTab20;
	private JButton btnTelWaitToSendTab24;
	private JButton btnTelWaitToSendTab28;
	private JButton btnTelWaitToSendTab32;
	private JButton btnTelWaitToSendTab36;
	private JButton btnTelWaitToSendTab40;
	private JButton btnTelWaitToSendTab44;
	private JButton btnTelWaitToSendTab17;
	private JButton btnTelWaitToSendTab18;
	private JButton btnTelWaitToSendTab19;
	private JButton btnTelWaitToSendTab21;
	private JButton btnTelWaitToSendTab22;
	private JButton btnTelWaitToSendTab23;
	private JButton btnTelWaitToSendTab25;
	private JButton btnTelWaitToSendTab26;
	private JButton btnTelWaitToSendTab27;
	private JButton btnTelWaitToSendTab29;
	private JButton btnTelWaitToSendTab30;
	private JButton btnTelWaitToSendTab31;
	private JButton btnTelWaitToSendTab33;
	private JButton btnTelWaitToSendTab34;
	private JButton btnTelWaitToSendTab35;
	private JButton btnTelWaitToSendTab37;
	private JButton btnTelWaitToSendTab38;
	private JButton btnTelWaitToSendTab39;
	private JButton btnTelWaitToSendTab41;
	private JButton btnTelWaitToSendTab42;
	private JButton btnTelWaitToSendTab43;
	private JButton btnTelWaitToSendTab45;
	private JButton btnTelWaitToSendTab46;
	private JButton btnTelWaitToSendTab47;
	// Beer Sheba panel
	private JTabbedPane tbpBee;
	private JPanel pBeeOverall;
	private JPanel pBeeSending;
	private JPanel pBeeReceiving;
	private JPanel pBeePickUp;
	private JPanel pBeeWaitToSend;
	private JButton btnBeeSendingBack;
	private JButton btnBeeSendingNext;
	private JButton btnBeeSending0;
	private JButton btnBeeSending1;
	private JButton btnBeeSending2;
	private JButton btnBeeSending3;
	private JButton btnBeeSending4;
	private JButton btnBeeSending5;
	private JButton btnBeeReceivingBack;
	private JButton btnBeeReceivingNext;
	private JButton btnBeeReceiving0;
	private JButton btnBeeReceiving1;
	private JButton btnBeeReceiving2;
	private JButton btnBeeReceiving3;
	private JButton btnBeeReceiving4;
	private JButton btnBeeReceiving5;
	private JButton btnBeePickUpBack;
	private JButton btnBeePickUpNext;
	private JButton btnBeePickUp0;
	private JButton btnBeePickUp1;
	private JButton btnBeePickUp2;
	private JButton btnBeePickUp3;
	private JButton btnBeePickUp4;
	private JButton btnBeePickUp5;
	private JButton btnBeeWaitingToSendBack;
	private JButton btnBeeWaitingToSendNext;
	private JButton btnBeeWaitingToSend0;
	private JButton btnBeeWaitingToSend1;
	private JButton btnBeeWaitingToSend2;
	private JButton btnBeeWaitingToSend3;
	private JButton btnBeeWaitingToSend4;
	private JButton btnBeeWaitingToSend5;
	private JButton btnBeeQSendersBack;
	private JButton btnBeeQSendersNext;
	private JButton btnBeeQSenders0;
	private JButton btnBeeQSenders1;
	private JButton btnBeeQSenders2;
	private JButton btnBeeQSenders3;
	private JButton btnBeeQSenders4;
	private JButton btnBeeQReceiversBack;
	private JButton btnBeeQReceiversNext;
	private JButton btnBeeQReceivers0;
	private JButton btnBeeQReceivers1;
	private JButton btnBeeQReceivers2;
	private JButton btnBeeQReceivers3;
	private JButton btnBeeQReceivers4;
	private JButton btnBeeSendingTabBack;
	private JButton btnBeeSendingTab0;
	private JButton btnBeeSendingTab1;
	private JButton btnBeeSendingTab2;
	private JButton btnBeeSendingTab3;
	private JButton btnBeeSendingTabNext;
	private JButton btnBeeSendingTab4;
	private JButton btnBeeSendingTab8;
	private JButton btnBeeSendingTab5;
	private JButton btnBeeSendingTab6;
	private JButton btnBeeSendingTab7;
	private JButton btnBeeSendingTab9;
	private JButton btnBeeSendingTab10;
	private JButton btnBeeSendingTab11;
	private JButton btnBeeSendingTab12;
	private JButton btnBeeSendingTab13;
	private JButton btnBeeSendingTab14;
	private JButton btnBeeSendingTab15;
	private JButton btnBeeSendingTab16;
	private JButton btnBeeSendingTab20;
	private JButton btnBeeSendingTab24;
	private JButton btnBeeSendingTab28;
	private JButton btnBeeSendingTab32;
	private JButton btnBeeSendingTab36;
	private JButton btnBeeSendingTab40;
	private JButton btnBeeSendingTab44;
	private JButton btnBeeSendingTab17;
	private JButton btnBeeSendingTab18;
	private JButton btnBeeSendingTab19;
	private JButton btnBeeSendingTab21;
	private JButton btnBeeSendingTab22;
	private JButton btnBeeSendingTab23;
	private JButton btnBeeSendingTab25;
	private JButton btnBeeSendingTab26;
	private JButton btnBeeSendingTab27;
	private JButton btnBeeSendingTab29;
	private JButton btnBeeSendingTab30;
	private JButton btnBeeSendingTab31;
	private JButton btnBeeSendingTab33;
	private JButton btnBeeSendingTab34;
	private JButton btnBeeSendingTab35;
	private JButton btnBeeSendingTab37;
	private JButton btnBeeSendingTab38;
	private JButton btnBeeSendingTab39;
	private JButton btnBeeSendingTab41;
	private JButton btnBeeSendingTab42;
	private JButton btnBeeSendingTab43;
	private JButton btnBeeSendingTab45;
	private JButton btnBeeSendingTab46;
	private JButton btnBeeSendingTab47;
	private JButton btnBeeReceivingTabBack;
	private JButton btnBeeReceivingTab0;
	private JButton btnBeeReceivingTab1;
	private JButton btnBeeReceivingTab2;
	private JButton btnBeeReceivingTab3;
	private JButton btnBeeReceivingTabNext;
	private JButton btnBeeReceivingTab4;
	private JButton btnBeeReceivingTab8;
	private JButton btnBeeReceivingTab5;
	private JButton btnBeeReceivingTab6;
	private JButton btnBeeReceivingTab7;
	private JButton btnBeeReceivingTab9;
	private JButton btnBeeReceivingTab10;
	private JButton btnBeeReceivingTab11;
	private JButton btnBeeReceivingTab12;
	private JButton btnBeeReceivingTab13;
	private JButton btnBeeReceivingTab14;
	private JButton btnBeeReceivingTab15;
	private JButton btnBeeReceivingTab16;
	private JButton btnBeeReceivingTab20;
	private JButton btnBeeReceivingTab24;
	private JButton btnBeeReceivingTab28;
	private JButton btnBeeReceivingTab32;
	private JButton btnBeeReceivingTab36;
	private JButton btnBeeReceivingTab40;
	private JButton btnBeeReceivingTab44;
	private JButton btnBeeReceivingTab17;
	private JButton btnBeeReceivingTab18;
	private JButton btnBeeReceivingTab19;
	private JButton btnBeeReceivingTab21;
	private JButton btnBeeReceivingTab22;
	private JButton btnBeeReceivingTab23;
	private JButton btnBeeReceivingTab25;
	private JButton btnBeeReceivingTab26;
	private JButton btnBeeReceivingTab27;
	private JButton btnBeeReceivingTab29;
	private JButton btnBeeReceivingTab30;
	private JButton btnBeeReceivingTab31;
	private JButton btnBeeReceivingTab33;
	private JButton btnBeeReceivingTab34;
	private JButton btnBeeReceivingTab35;
	private JButton btnBeeReceivingTab37;
	private JButton btnBeeReceivingTab38;
	private JButton btnBeeReceivingTab39;
	private JButton btnBeeReceivingTab41;
	private JButton btnBeeReceivingTab42;
	private JButton btnBeeReceivingTab43;
	private JButton btnBeeReceivingTab45;
	private JButton btnBeeReceivingTab46;
	private JButton btnBeeReceivingTab47;
	private JButton btnBeePickUpTabBack;
	private JButton btnBeePickUpTab0;
	private JButton btnBeePickUpTab1;
	private JButton btnBeePickUpTab2;
	private JButton btnBeePickUpTab3;
	private JButton btnBeePickUpTabNext;
	private JButton btnBeePickUpTab4;
	private JButton btnBeePickUpTab8;
	private JButton btnBeePickUpTab5;
	private JButton btnBeePickUpTab6;
	private JButton btnBeePickUpTab7;
	private JButton btnBeePickUpTab9;
	private JButton btnBeePickUpTab10;
	private JButton btnBeePickUpTab11;
	private JButton btnBeePickUpTab12;
	private JButton btnBeePickUpTab13;
	private JButton btnBeePickUpTab14;
	private JButton btnBeePickUpTab15;
	private JButton btnBeePickUpTab16;
	private JButton btnBeePickUpTab20;
	private JButton btnBeePickUpTab24;
	private JButton btnBeePickUpTab28;
	private JButton btnBeePickUpTab32;
	private JButton btnBeePickUpTab36;
	private JButton btnBeePickUpTab40;
	private JButton btnBeePickUpTab44;
	private JButton btnBeePickUpTab17;
	private JButton btnBeePickUpTab18;
	private JButton btnBeePickUpTab19;
	private JButton btnBeePickUpTab21;
	private JButton btnBeePickUpTab22;
	private JButton btnBeePickUpTab23;
	private JButton btnBeePickUpTab25;
	private JButton btnBeePickUpTab26;
	private JButton btnBeePickUpTab27;
	private JButton btnBeePickUpTab29;
	private JButton btnBeePickUpTab30;
	private JButton btnBeePickUpTab31;
	private JButton btnBeePickUpTab33;
	private JButton btnBeePickUpTab34;
	private JButton btnBeePickUpTab35;
	private JButton btnBeePickUpTab37;
	private JButton btnBeePickUpTab38;
	private JButton btnBeePickUpTab39;
	private JButton btnBeePickUpTab41;
	private JButton btnBeePickUpTab42;
	private JButton btnBeePickUpTab43;
	private JButton btnBeePickUpTab45;
	private JButton btnBeePickUpTab46;
	private JButton btnBeePickUpTab47;
	private JButton btnBeeWaitToSendTabBack;
	private JButton btnBeeWaitToSendTab0;
	private JButton btnBeeWaitToSendTab1;
	private JButton btnBeeWaitToSendTab2;
	private JButton btnBeeWaitToSendTab3;
	private JButton btnBeeWaitToSendTabNext;
	private JButton btnBeeWaitToSendTab4;
	private JButton btnBeeWaitToSendTab8;
	private JButton btnBeeWaitToSendTab5;
	private JButton btnBeeWaitToSendTab6;
	private JButton btnBeeWaitToSendTab7;
	private JButton btnBeeWaitToSendTab9;
	private JButton btnBeeWaitToSendTab10;
	private JButton btnBeeWaitToSendTab11;
	private JButton btnBeeWaitToSendTab12;
	private JButton btnBeeWaitToSendTab13;
	private JButton btnBeeWaitToSendTab14;
	private JButton btnBeeWaitToSendTab15;
	private JButton btnBeeWaitToSendTab16;
	private JButton btnBeeWaitToSendTab20;
	private JButton btnBeeWaitToSendTab24;
	private JButton btnBeeWaitToSendTab28;
	private JButton btnBeeWaitToSendTab32;
	private JButton btnBeeWaitToSendTab36;
	private JButton btnBeeWaitToSendTab40;
	private JButton btnBeeWaitToSendTab44;
	private JButton btnBeeWaitToSendTab17;
	private JButton btnBeeWaitToSendTab18;
	private JButton btnBeeWaitToSendTab19;
	private JButton btnBeeWaitToSendTab21;
	private JButton btnBeeWaitToSendTab22;
	private JButton btnBeeWaitToSendTab23;
	private JButton btnBeeWaitToSendTab25;
	private JButton btnBeeWaitToSendTab26;
	private JButton btnBeeWaitToSendTab27;
	private JButton btnBeeWaitToSendTab29;
	private JButton btnBeeWaitToSendTab30;
	private JButton btnBeeWaitToSendTab31;
	private JButton btnBeeWaitToSendTab33;
	private JButton btnBeeWaitToSendTab34;
	private JButton btnBeeWaitToSendTab35;
	private JButton btnBeeWaitToSendTab37;
	private JButton btnBeeWaitToSendTab38;
	private JButton btnBeeWaitToSendTab39;
	private JButton btnBeeWaitToSendTab41;
	private JButton btnBeeWaitToSendTab42;
	private JButton btnBeeWaitToSendTab43;
	private JButton btnBeeWaitToSendTab45;
	private JButton btnBeeWaitToSendTab46;
	private JButton btnBeeWaitToSendTab47;
	// Eilat panel
	private JTabbedPane tbpEil;
	private JPanel pEilOverall;
	private JPanel pEilSending;
	private JPanel pEilReceiving;
	private JPanel pEilPickUp;
	private JPanel pEilWaitToSend;
	private JButton btnEilSendingBack;
	private JButton btnEilSendingNext;
	private JButton btnEilSending0;
	private JButton btnEilSending1;
	private JButton btnEilSending2;
	private JButton btnEilSending3;
	private JButton btnEilSending4;
	private JButton btnEilSending5;
	private JButton btnEilReceivingBack;
	private JButton btnEilReceivingNext;
	private JButton btnEilReceiving0;
	private JButton btnEilReceiving1;
	private JButton btnEilReceiving2;
	private JButton btnEilReceiving3;
	private JButton btnEilReceiving4;
	private JButton btnEilReceiving5;
	private JButton btnEilPickUpBack;
	private JButton btnEilPickUpNext;
	private JButton btnEilPickUp0;
	private JButton btnEilPickUp1;
	private JButton btnEilPickUp2;
	private JButton btnEilPickUp3;
	private JButton btnEilPickUp4;
	private JButton btnEilPickUp5;
	private JButton btnEilWaitingToSendBack;
	private JButton btnEilWaitingToSendNext;
	private JButton btnEilWaitingToSend0;
	private JButton btnEilWaitingToSend1;
	private JButton btnEilWaitingToSend2;
	private JButton btnEilWaitingToSend3;
	private JButton btnEilWaitingToSend4;
	private JButton btnEilWaitingToSend5;
	private JButton btnEilQSendersBack;
	private JButton btnEilQSendersNext;
	private JButton btnEilQSenders0;
	private JButton btnEilQSenders1;
	private JButton btnEilQSenders2;
	private JButton btnEilQSenders3;
	private JButton btnEilQSenders4;
	private JButton btnEilQReceiversBack;
	private JButton btnEilQReceiversNext;
	private JButton btnEilQReceivers0;
	private JButton btnEilQReceivers1;
	private JButton btnEilQReceivers2;
	private JButton btnEilQReceivers3;
	private JButton btnEilQReceivers4;
	private JButton btnEilSendingTabBack;
	private JButton btnEilSendingTab0;
	private JButton btnEilSendingTab1;
	private JButton btnEilSendingTab2;
	private JButton btnEilSendingTab3;
	private JButton btnEilSendingTabNext;
	private JButton btnEilSendingTab4;
	private JButton btnEilSendingTab8;
	private JButton btnEilSendingTab5;
	private JButton btnEilSendingTab6;
	private JButton btnEilSendingTab7;
	private JButton btnEilSendingTab9;
	private JButton btnEilSendingTab10;
	private JButton btnEilSendingTab11;
	private JButton btnEilSendingTab12;
	private JButton btnEilSendingTab13;
	private JButton btnEilSendingTab14;
	private JButton btnEilSendingTab15;
	private JButton btnEilSendingTab16;
	private JButton btnEilSendingTab20;
	private JButton btnEilSendingTab24;
	private JButton btnEilSendingTab28;
	private JButton btnEilSendingTab32;
	private JButton btnEilSendingTab36;
	private JButton btnEilSendingTab40;
	private JButton btnEilSendingTab44;
	private JButton btnEilSendingTab17;
	private JButton btnEilSendingTab18;
	private JButton btnEilSendingTab19;
	private JButton btnEilSendingTab21;
	private JButton btnEilSendingTab22;
	private JButton btnEilSendingTab23;
	private JButton btnEilSendingTab25;
	private JButton btnEilSendingTab26;
	private JButton btnEilSendingTab27;
	private JButton btnEilSendingTab29;
	private JButton btnEilSendingTab30;
	private JButton btnEilSendingTab31;
	private JButton btnEilSendingTab33;
	private JButton btnEilSendingTab34;
	private JButton btnEilSendingTab35;
	private JButton btnEilSendingTab37;
	private JButton btnEilSendingTab38;
	private JButton btnEilSendingTab39;
	private JButton btnEilSendingTab41;
	private JButton btnEilSendingTab42;
	private JButton btnEilSendingTab43;
	private JButton btnEilSendingTab45;
	private JButton btnEilSendingTab46;
	private JButton btnEilSendingTab47;
	private JButton btnEilReceivingTabBack;
	private JButton btnEilReceivingTab0;
	private JButton btnEilReceivingTab1;
	private JButton btnEilReceivingTab2;
	private JButton btnEilReceivingTab3;
	private JButton btnEilReceivingTabNext;
	private JButton btnEilReceivingTab4;
	private JButton btnEilReceivingTab8;
	private JButton btnEilReceivingTab5;
	private JButton btnEilReceivingTab6;
	private JButton btnEilReceivingTab7;
	private JButton btnEilReceivingTab9;
	private JButton btnEilReceivingTab10;
	private JButton btnEilReceivingTab11;
	private JButton btnEilReceivingTab12;
	private JButton btnEilReceivingTab13;
	private JButton btnEilReceivingTab14;
	private JButton btnEilReceivingTab15;
	private JButton btnEilReceivingTab16;
	private JButton btnEilReceivingTab20;
	private JButton btnEilReceivingTab24;
	private JButton btnEilReceivingTab28;
	private JButton btnEilReceivingTab32;
	private JButton btnEilReceivingTab36;
	private JButton btnEilReceivingTab40;
	private JButton btnEilReceivingTab44;
	private JButton btnEilReceivingTab17;
	private JButton btnEilReceivingTab18;
	private JButton btnEilReceivingTab19;
	private JButton btnEilReceivingTab21;
	private JButton btnEilReceivingTab22;
	private JButton btnEilReceivingTab23;
	private JButton btnEilReceivingTab25;
	private JButton btnEilReceivingTab26;
	private JButton btnEilReceivingTab27;
	private JButton btnEilReceivingTab29;
	private JButton btnEilReceivingTab30;
	private JButton btnEilReceivingTab31;
	private JButton btnEilReceivingTab33;
	private JButton btnEilReceivingTab34;
	private JButton btnEilReceivingTab35;
	private JButton btnEilReceivingTab37;
	private JButton btnEilReceivingTab38;
	private JButton btnEilReceivingTab39;
	private JButton btnEilReceivingTab41;
	private JButton btnEilReceivingTab42;
	private JButton btnEilReceivingTab43;
	private JButton btnEilReceivingTab45;
	private JButton btnEilReceivingTab46;
	private JButton btnEilReceivingTab47;
	private JButton btnEilPickUpTabBack;
	private JButton btnEilPickUpTab0;
	private JButton btnEilPickUpTab1;
	private JButton btnEilPickUpTab2;
	private JButton btnEilPickUpTab3;
	private JButton btnEilPickUpTabNext;
	private JButton btnEilPickUpTab4;
	private JButton btnEilPickUpTab8;
	private JButton btnEilPickUpTab5;
	private JButton btnEilPickUpTab6;
	private JButton btnEilPickUpTab7;
	private JButton btnEilPickUpTab9;
	private JButton btnEilPickUpTab10;
	private JButton btnEilPickUpTab11;
	private JButton btnEilPickUpTab12;
	private JButton btnEilPickUpTab13;
	private JButton btnEilPickUpTab14;
	private JButton btnEilPickUpTab15;
	private JButton btnEilPickUpTab16;
	private JButton btnEilPickUpTab20;
	private JButton btnEilPickUpTab24;
	private JButton btnEilPickUpTab28;
	private JButton btnEilPickUpTab32;
	private JButton btnEilPickUpTab36;
	private JButton btnEilPickUpTab40;
	private JButton btnEilPickUpTab44;
	private JButton btnEilPickUpTab17;
	private JButton btnEilPickUpTab18;
	private JButton btnEilPickUpTab19;
	private JButton btnEilPickUpTab21;
	private JButton btnEilPickUpTab22;
	private JButton btnEilPickUpTab23;
	private JButton btnEilPickUpTab25;
	private JButton btnEilPickUpTab26;
	private JButton btnEilPickUpTab27;
	private JButton btnEilPickUpTab29;
	private JButton btnEilPickUpTab30;
	private JButton btnEilPickUpTab31;
	private JButton btnEilPickUpTab33;
	private JButton btnEilPickUpTab34;
	private JButton btnEilPickUpTab35;
	private JButton btnEilPickUpTab37;
	private JButton btnEilPickUpTab38;
	private JButton btnEilPickUpTab39;
	private JButton btnEilPickUpTab41;
	private JButton btnEilPickUpTab42;
	private JButton btnEilPickUpTab43;
	private JButton btnEilPickUpTab45;
	private JButton btnEilPickUpTab46;
	private JButton btnEilPickUpTab47;
	private JButton btnEilWaitToSendTabBack;
	private JButton btnEilWaitToSendTab0;
	private JButton btnEilWaitToSendTab1;
	private JButton btnEilWaitToSendTab2;
	private JButton btnEilWaitToSendTab3;
	private JButton btnEilWaitToSendTabNext;
	private JButton btnEilWaitToSendTab4;
	private JButton btnEilWaitToSendTab8;
	private JButton btnEilWaitToSendTab5;
	private JButton btnEilWaitToSendTab6;
	private JButton btnEilWaitToSendTab7;
	private JButton btnEilWaitToSendTab9;
	private JButton btnEilWaitToSendTab10;
	private JButton btnEilWaitToSendTab11;
	private JButton btnEilWaitToSendTab12;
	private JButton btnEilWaitToSendTab13;
	private JButton btnEilWaitToSendTab14;
	private JButton btnEilWaitToSendTab15;
	private JButton btnEilWaitToSendTab16;
	private JButton btnEilWaitToSendTab20;
	private JButton btnEilWaitToSendTab24;
	private JButton btnEilWaitToSendTab28;
	private JButton btnEilWaitToSendTab32;
	private JButton btnEilWaitToSendTab36;
	private JButton btnEilWaitToSendTab40;
	private JButton btnEilWaitToSendTab44;
	private JButton btnEilWaitToSendTab17;
	private JButton btnEilWaitToSendTab18;
	private JButton btnEilWaitToSendTab19;
	private JButton btnEilWaitToSendTab21;
	private JButton btnEilWaitToSendTab22;
	private JButton btnEilWaitToSendTab23;
	private JButton btnEilWaitToSendTab25;
	private JButton btnEilWaitToSendTab26;
	private JButton btnEilWaitToSendTab27;
	private JButton btnEilWaitToSendTab29;
	private JButton btnEilWaitToSendTab30;
	private JButton btnEilWaitToSendTab31;
	private JButton btnEilWaitToSendTab33;
	private JButton btnEilWaitToSendTab34;
	private JButton btnEilWaitToSendTab35;
	private JButton btnEilWaitToSendTab37;
	private JButton btnEilWaitToSendTab38;
	private JButton btnEilWaitToSendTab39;
	private JButton btnEilWaitToSendTab41;
	private JButton btnEilWaitToSendTab42;
	private JButton btnEilWaitToSendTab43;
	private JButton btnEilWaitToSendTab45;
	private JButton btnEilWaitToSendTab46;
	private JButton btnEilWaitToSendTab47;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHard frame = new GameHard();
					//////////////////////////////////////////////////////////////////////////////////////////
					GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
					GraphicsDevice[] gs = ge.getScreenDevices();
					frame.setLocation(gs[1].getDefaultConfiguration().getBounds().x-1, gs[1].getDefaultConfiguration().getBounds().y);
					frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
					//////////////////////////////////////////////////////////////////////////////////////////
					//System.out.println("Width: " + frame.getContentPane().getPreferredSize().getWidth());
					//System.out.println("Height: " + frame.getContentPane().getPreferredSize().getHeight());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameHard() {
		initiateComponents();
		initiateEvents();
	}
	
	// Initiate items
	private void initiateComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameHard.class.getResource("/resources/mail_256.png")));
		setTitle("The Mail System");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1040);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tbpMet = new JTabbedPane(JTabbedPane.TOP);
		tbpMet.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Metula", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		tbpHai = new JTabbedPane(JTabbedPane.TOP);
		tbpHai.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Haifa", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		tbpTib = new JTabbedPane(JTabbedPane.TOP);
		tbpTib.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tiberias", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		tbpJer = new JTabbedPane(JTabbedPane.TOP);
		tbpJer.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Jerusalem", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		tbpTel = new JTabbedPane(JTabbedPane.TOP);
		tbpTel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tel Aviv", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		tbpBee = new JTabbedPane(JTabbedPane.TOP);
		tbpBee.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Beer Sheba", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		tbpEil = new JTabbedPane(JTabbedPane.TOP);
		tbpEil.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Eilat", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		JLabel lblDays = new JLabel("Days:");
		lblDays.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDays.setToolTipText("The number of days you have worked");
		
		lblDayCounter = new JLabel("000");
		lblDayCounter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTimeCounter = new JLabel("08:00");
		lblTimeCounter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTimeTillEnd = new JLabel("Time till end day:");
		lblTimeTillEnd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		pbTimeTillEndDay = new JProgressBar();
		
		JLabel lblGold = new JLabel("Gold:");
		lblGold.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblGoldCounter = new JLabel("00000");
		lblGoldCounter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnOptions = new JButton("");
		btnOptions.setIcon(new ImageIcon(GameHard.class.getResource("/resources/options_32.png")));
		
		JTable tblTravelTimes = new JTable();
		tblTravelTimes.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		tblTravelTimes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tblTravelTimes.setRowSelectionAllowed(false);
		tblTravelTimes.setModel(new DefaultTableModel(
			new Object[][] {
				{" FROM/TO", "Haifa", "Tel-Aviv", "Eilat", "Jerusalem", "Metula", "Tiberias", "Beer-Sheba"},
				{" Haifa", "0", "1", "5", "3", "1", "1", "2"},
				{" Tel-Aviv", "1", "0", "4", "1", "2", "2", "1"},
				{" Eilat", "5", "4", "0", "4", "6", "5", "3"},
				{" Jerusalem", "3", "1", "4", "0", "3", "2", "1"},
				{" Metula", "1", "2", "6", "3", "0", "1", "3"},
				{" Tiberias", "1", "2", "5", "2", "1", "0", "2"},
				{" Beer-Sheba", "2", "1", "3", "1", "3", "2", "0"},
			},
			new String[] {
				"From", "Haifa", "Tel Aviv", "Eilat", "Jerusalem", "Metula", "Tiberias", "Beer Sheba"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblTravelTimes.getColumnModel().getColumn(0).setResizable(false);
		tblTravelTimes.getColumnModel().getColumn(0).setPreferredWidth(77);
		tblTravelTimes.getColumnModel().getColumn(0).setMaxWidth(77);
		tblTravelTimes.getColumnModel().getColumn(1).setResizable(false);
		tblTravelTimes.getColumnModel().getColumn(1).setMaxWidth(75);
		tblTravelTimes.getColumnModel().getColumn(2).setResizable(false);
		tblTravelTimes.getColumnModel().getColumn(2).setMaxWidth(75);
		tblTravelTimes.getColumnModel().getColumn(3).setResizable(false);
		tblTravelTimes.getColumnModel().getColumn(3).setMaxWidth(75);
		tblTravelTimes.getColumnModel().getColumn(4).setResizable(false);
		tblTravelTimes.getColumnModel().getColumn(4).setMaxWidth(75);
		tblTravelTimes.getColumnModel().getColumn(5).setResizable(false);
		tblTravelTimes.getColumnModel().getColumn(5).setMaxWidth(75);
		tblTravelTimes.getColumnModel().getColumn(6).setResizable(false);
		tblTravelTimes.getColumnModel().getColumn(6).setMaxWidth(75);
		tblTravelTimes.getColumnModel().getColumn(7).setResizable(false);
		tblTravelTimes.getColumnModel().getColumn(7).setMaxWidth(75);
		
		JLabel lblTravelTimes = new JLabel("Travel Times:");
		lblTravelTimes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(tbpMet, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(tbpHai, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(tbpTib, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(tbpJer, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDays)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblDayCounter)
									.addGap(36)
									.addComponent(lblTime)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblTimeCounter)
									.addGap(30)
									.addComponent(lblTimeTillEnd)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pbTimeTillEndDay, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
									.addGap(214)
									.addComponent(lblGold)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblGoldCounter)
									.addGap(800)
									.addComponent(btnOptions, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(133)
							.addComponent(tbpTel, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
							.addGap(133)
							.addComponent(tbpBee, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
							.addGap(133)
							.addComponent(tbpEil, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(550)
							.addComponent(lblTravelTimes)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tblTravelTimes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnOptions, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(pbTimeTillEndDay, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDays)
										.addComponent(lblDayCounter))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblTime)
										.addComponent(lblTimeCounter)
										.addComponent(lblTimeTillEnd))
									.addComponent(lblGold)
									.addComponent(lblGoldCounter)))
							.addGap(16)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tbpTib, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbpHai, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbpMet, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbpJer, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tbpTel, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbpBee, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbpEil, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addComponent(tblTravelTimes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(23, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(470)
							.addComponent(lblTravelTimes)
							.addGap(74))))
		);
		contentPane.setLayout(gl_contentPane);
		initiateMetPanel();
		initiateHaiPanel();
		initiateTibPanel();
		initiateJerPanel();
		initiateTelPanel();
		initiateBeePanel();
		initiateEilPanel();
	}
	
	private void initiateMetPanel() {
		pMetOverall = new JPanel();
		tbpMet.addTab("Overall", null, pMetOverall, null);
		pMetOverall.setLayout(new MigLayout("", "[right][][][][][]", "[][][][][][][][][][][][]"));
		
		JLabel lblMetSending = new JLabel("Sending:");
		lblMetSending.setHorizontalAlignment(SwingConstants.LEFT);
		lblMetSending.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pMetOverall.add(lblMetSending, "cell 0 0 1 2");
		
		btnMetSendingBack = new JButton("");
		btnMetSendingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMetSendingBack.setMinimumSize(new Dimension(20, 48));
		btnMetSendingBack.setMaximumSize(new Dimension(20, 48));
		btnMetSendingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetOverall.add(btnMetSendingBack, "cell 1 0 1 2");
		
		btnMetSending0 = new JButton("0");
		btnMetSending0.setMinimumSize(new Dimension(90, 23));
		btnMetSending0.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetSending0, "cell 2 0");
		
		btnMetSending1 = new JButton("1");
		btnMetSending1.setMinimumSize(new Dimension(90, 23));
		btnMetSending1.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetSending1, "cell 3 0");
		
		btnMetSending2 = new JButton("2");
		btnMetSending2.setMinimumSize(new Dimension(90, 23));
		btnMetSending2.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetSending2, "cell 4 0");
		
		btnMetSendingNext = new JButton("");
		btnMetSendingNext.setMinimumSize(new Dimension(20, 48));
		btnMetSendingNext.setMaximumSize(new Dimension(20, 48));
		btnMetSendingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetOverall.add(btnMetSendingNext, "cell 5 0 1 2");
		
		btnMetSending3 = new JButton("3");
		btnMetSending3.setMinimumSize(new Dimension(90, 23));
		btnMetSending3.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetSending3, "cell 2 1");
		
		btnMetSending4 = new JButton("4");
		btnMetSending4.setMinimumSize(new Dimension(90, 23));
		btnMetSending4.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetSending4, "cell 3 1");
		
		btnMetSending5 = new JButton("5");
		btnMetSending5.setMinimumSize(new Dimension(90, 23));
		btnMetSending5.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetSending5, "cell 4 1");
		
		JLabel lblMetReceiving = new JLabel("Receiving:");
		lblMetReceiving.setHorizontalAlignment(SwingConstants.LEFT);
		lblMetReceiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pMetOverall.add(lblMetReceiving, "cell 0 2 1 2");
		
		btnMetReceivingBack = new JButton("");
		btnMetReceivingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMetReceivingBack.setMinimumSize(new Dimension(20, 48));
		btnMetReceivingBack.setMaximumSize(new Dimension(20, 48));
		btnMetReceivingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetOverall.add(btnMetReceivingBack, "cell 1 2 1 2");
		
		btnMetReceiving0 = new JButton("0");
		btnMetReceiving0.setMinimumSize(new Dimension(90, 23));
		btnMetReceiving0.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetReceiving0, "cell 2 2");
		
		btnMetReceiving1 = new JButton("1");
		btnMetReceiving1.setMinimumSize(new Dimension(90, 23));
		btnMetReceiving1.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetReceiving1, "cell 3 2");
		
		btnMetReceiving2 = new JButton("2");
		btnMetReceiving2.setMinimumSize(new Dimension(90, 23));
		btnMetReceiving2.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetReceiving2, "cell 4 2");
		
		btnMetReceivingNext = new JButton("");
		btnMetReceivingNext.setMinimumSize(new Dimension(20, 48));
		btnMetReceivingNext.setMaximumSize(new Dimension(20, 48));
		btnMetReceivingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetOverall.add(btnMetReceivingNext, "cell 5 2 1 2");
		
		btnMetReceiving3 = new JButton("3");
		btnMetReceiving3.setMinimumSize(new Dimension(90, 23));
		btnMetReceiving3.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetReceiving3, "cell 2 3");
		
		btnMetReceiving4 = new JButton("4");
		btnMetReceiving4.setMinimumSize(new Dimension(90, 23));
		btnMetReceiving4.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetReceiving4, "cell 3 3");
		
		btnMetReceiving5 = new JButton("5");
		btnMetReceiving5.setMinimumSize(new Dimension(90, 23));
		btnMetReceiving5.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetReceiving5, "cell 4 3");
		
		JLabel lblMetPickUp = new JLabel("Pick Up:");
		lblMetPickUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblMetPickUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMetPickUp.setToolTipText("Pick Up Line");
		pMetOverall.add(lblMetPickUp, "cell 0 4 1 2");
		
		btnMetPickUpBack = new JButton("");
		btnMetPickUpBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMetPickUpBack.setMinimumSize(new Dimension(20, 48));
		btnMetPickUpBack.setMaximumSize(new Dimension(20, 48));
		btnMetPickUpBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetOverall.add(btnMetPickUpBack, "cell 1 4 1 2");
		
		btnMetPickUp0 = new JButton("0");
		btnMetPickUp0.setMinimumSize(new Dimension(90, 23));
		btnMetPickUp0.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetPickUp0, "cell 2 4");
		
		btnMetPickUp1 = new JButton("1");
		btnMetPickUp1.setMinimumSize(new Dimension(90, 23));
		btnMetPickUp1.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetPickUp1, "cell 3 4");
		
		btnMetPickUp2 = new JButton("2");
		btnMetPickUp2.setMinimumSize(new Dimension(90, 23));
		btnMetPickUp2.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetPickUp2, "cell 4 4");
		
		btnMetPickUpNext = new JButton("");
		btnMetPickUpNext.setMinimumSize(new Dimension(20, 48));
		btnMetPickUpNext.setMaximumSize(new Dimension(20, 48));
		btnMetPickUpNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetOverall.add(btnMetPickUpNext, "cell 5 4 1 2");
		
		btnMetPickUp3 = new JButton("3");
		btnMetPickUp3.setMinimumSize(new Dimension(90, 23));
		btnMetPickUp3.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetPickUp3, "cell 2 5");
		
		btnMetPickUp4 = new JButton("4");
		btnMetPickUp4.setMinimumSize(new Dimension(90, 23));
		btnMetPickUp4.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetPickUp4, "cell 3 5");
		
		btnMetPickUp5 = new JButton("5");
		btnMetPickUp5.setMinimumSize(new Dimension(90, 23));
		btnMetPickUp5.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetPickUp5, "cell 4 5");
		
		JLabel lblMetWaitingToSend = new JLabel("Waiting To Send:");
		lblMetWaitingToSend.setHorizontalAlignment(SwingConstants.LEFT);
		lblMetWaitingToSend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pMetOverall.add(lblMetWaitingToSend, "cell 0 6 1 2");
		
		btnMetWaitingToSendBack = new JButton("");
		btnMetWaitingToSendBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMetWaitingToSendBack.setMinimumSize(new Dimension(20, 48));
		btnMetWaitingToSendBack.setMaximumSize(new Dimension(20, 48));
		btnMetWaitingToSendBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetOverall.add(btnMetWaitingToSendBack, "cell 1 6 1 2");
		
		btnMetWaitingToSend0 = new JButton("0");
		btnMetWaitingToSend0.setMinimumSize(new Dimension(90, 23));
		btnMetWaitingToSend0.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetWaitingToSend0, "cell 2 6");
		
		btnMetWaitingToSend1 = new JButton("1");
		btnMetWaitingToSend1.setMinimumSize(new Dimension(90, 23));
		btnMetWaitingToSend1.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetWaitingToSend1, "cell 3 6");
		
		btnMetWaitingToSend2 = new JButton("2");
		btnMetWaitingToSend2.setMinimumSize(new Dimension(90, 23));
		btnMetWaitingToSend2.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetWaitingToSend2, "cell 4 6");
		
		btnMetWaitingToSendNext = new JButton("");
		btnMetWaitingToSendNext.setMinimumSize(new Dimension(20, 48));
		btnMetWaitingToSendNext.setMaximumSize(new Dimension(20, 48));
		btnMetWaitingToSendNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetOverall.add(btnMetWaitingToSendNext, "cell 5 6 1 2");
		
		btnMetWaitingToSend3 = new JButton("3");
		btnMetWaitingToSend3.setMinimumSize(new Dimension(90, 23));
		btnMetWaitingToSend3.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetWaitingToSend3, "cell 2 7");
		
		btnMetWaitingToSend4 = new JButton("4");
		btnMetWaitingToSend4.setMinimumSize(new Dimension(90, 23));
		btnMetWaitingToSend4.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetWaitingToSend4, "cell 3 7");
		
		btnMetWaitingToSend5 = new JButton("5");
		btnMetWaitingToSend5.setMinimumSize(new Dimension(90, 23));
		btnMetWaitingToSend5.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetWaitingToSend5, "cell 4 7");
		
		JLabel lblMetQSenders = new JLabel("Q. Senders:");
		lblMetQSenders.setToolTipText("Queue Senders");
		lblMetQSenders.setHorizontalAlignment(SwingConstants.LEFT);
		lblMetQSenders.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pMetOverall.add(lblMetQSenders, "cell 0 8 1 2");
		
		btnMetQSendersBack = new JButton("");
		btnMetQSendersBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMetQSendersBack.setMinimumSize(new Dimension(20, 48));
		btnMetQSendersBack.setMaximumSize(new Dimension(20, 48));
		btnMetQSendersBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetOverall.add(btnMetQSendersBack, "cell 1 8 1 2");
		
		btnMetQSenders0 = new JButton("0");
		btnMetQSenders0.setMinimumSize(new Dimension(90, 23));
		btnMetQSenders0.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQSenders0, "cell 2 8");
		
		btnMetQSenders1 = new JButton("1");
		btnMetQSenders1.setMinimumSize(new Dimension(90, 23));
		btnMetQSenders1.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQSenders1, "cell 3 8");
		
		btnMetQSenders2 = new JButton("2");
		btnMetQSenders2.setMinimumSize(new Dimension(90, 23));
		btnMetQSenders2.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQSenders2, "cell 4 8");
		
		btnMetQSendersNext = new JButton("");
		btnMetQSendersNext.setMinimumSize(new Dimension(20, 48));
		btnMetQSendersNext.setMaximumSize(new Dimension(20, 48));
		btnMetQSendersNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetOverall.add(btnMetQSendersNext, "cell 5 8 1 2");
		
		btnMetQSenders3 = new JButton("3");
		btnMetQSenders3.setMinimumSize(new Dimension(90, 23));
		btnMetQSenders3.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQSenders3, "cell 2 9 2 1,alignx center");
		
		btnMetQSenders4 = new JButton("4");
		btnMetQSenders4.setMinimumSize(new Dimension(90, 23));
		btnMetQSenders4.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQSenders4, "cell 3 9 2 1,alignx center");
		
		JLabel lblMetQReceivers = new JLabel("Q. Receivers:");
		lblMetQReceivers.setToolTipText("Queue Receivers");
		lblMetQReceivers.setHorizontalAlignment(SwingConstants.LEFT);
		lblMetQReceivers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pMetOverall.add(lblMetQReceivers, "cell 0 10 1 2");
		
		btnMetQReceiversBack = new JButton("");
		btnMetQReceiversBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMetQReceiversBack.setMinimumSize(new Dimension(20, 48));
		btnMetQReceiversBack.setMaximumSize(new Dimension(20, 48));
		btnMetQReceiversBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetOverall.add(btnMetQReceiversBack, "cell 1 10 1 2");
		
		btnMetQReceivers0 = new JButton("0");
		btnMetQReceivers0.setMinimumSize(new Dimension(90, 23));
		btnMetQReceivers0.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQReceivers0, "cell 2 10");
		
		btnMetQReceivers1 = new JButton("1");
		btnMetQReceivers1.setMinimumSize(new Dimension(90, 23));
		btnMetQReceivers1.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQReceivers1, "cell 3 10");
		
		btnMetQReceivers2 = new JButton("2");
		btnMetQReceivers2.setMinimumSize(new Dimension(90, 23));
		btnMetQReceivers2.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQReceivers2, "cell 4 10");
		
		btnMetQReceiversNext = new JButton("");
		btnMetQReceiversNext.setMinimumSize(new Dimension(20, 48));
		btnMetQReceiversNext.setMaximumSize(new Dimension(20, 48));
		btnMetQReceiversNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetOverall.add(btnMetQReceiversNext, "cell 5 10 1 2");
		
		btnMetQReceivers3 = new JButton("3");
		btnMetQReceivers3.setMinimumSize(new Dimension(90, 23));
		btnMetQReceivers3.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQReceivers3, "cell 2 11 2 1,alignx center");
		
		btnMetQReceivers4 = new JButton("4");
		btnMetQReceivers4.setMinimumSize(new Dimension(90, 23));
		btnMetQReceivers4.setMaximumSize(new Dimension(90, 23));
		pMetOverall.add(btnMetQReceivers4, "cell 3 11 2 1,alignx center");
		
		pMetSending = new JPanel();
		tbpMet.addTab("Sending", null, pMetSending, null);
		pMetSending.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnMetSendingTabBack = new JButton("");
		btnMetSendingTabBack.setMinimumSize(new Dimension(20, 300));
		btnMetSendingTabBack.setMaximumSize(new Dimension(20, 300));
		btnMetSendingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetSending.add(btnMetSendingTabBack, "cell 0 0 1 12");
		
		btnMetSendingTab0 = new JButton("0");
		btnMetSendingTab0.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab0.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab0, "cell 1 0");
		
		btnMetSendingTab1 = new JButton("1");
		btnMetSendingTab1.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab1.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab1, "cell 2 0");
		
		btnMetSendingTab2 = new JButton("2");
		btnMetSendingTab2.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab2.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab2, "cell 3 0");
		
		btnMetSendingTab3 = new JButton("3");
		btnMetSendingTab3.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab3.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab3, "cell 4 0");
		
		btnMetSendingTabNext = new JButton("");
		btnMetSendingTabNext.setMinimumSize(new Dimension(20, 300));
		btnMetSendingTabNext.setMaximumSize(new Dimension(20, 300));
		btnMetSendingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetSending.add(btnMetSendingTabNext, "cell 5 0 1 12");
		
		btnMetSendingTab4 = new JButton("4");
		btnMetSendingTab4.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab4.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab4, "cell 1 1");
		
		btnMetSendingTab5 = new JButton("5");
		btnMetSendingTab5.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab5.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab5, "cell 2 1");
		
		btnMetSendingTab6 = new JButton("6");
		btnMetSendingTab6.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab6.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab6, "cell 3 1");
		
		btnMetSendingTab7 = new JButton("7");
		btnMetSendingTab7.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab7.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab7, "cell 4 1");
		
		btnMetSendingTab8 = new JButton("8");
		btnMetSendingTab8.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab8.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab8, "cell 1 2");
		
		btnMetSendingTab9 = new JButton("9");
		btnMetSendingTab9.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab9.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab9, "cell 2 2");
		
		btnMetSendingTab10 = new JButton("10");
		btnMetSendingTab10.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab10.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab10, "cell 3 2");
		
		btnMetSendingTab11 = new JButton("11");
		btnMetSendingTab11.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab11.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab11, "cell 4 2");
		
		btnMetSendingTab12 = new JButton("12");
		btnMetSendingTab12.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab12.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab12, "cell 1 3");
		
		btnMetSendingTab13 = new JButton("13");
		btnMetSendingTab13.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab13.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab13, "cell 2 3");
		
		btnMetSendingTab14 = new JButton("14");
		btnMetSendingTab14.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab14.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab14, "cell 3 3");
		
		btnMetSendingTab15 = new JButton("15");
		btnMetSendingTab15.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab15.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab15, "cell 4 3");
		
		btnMetSendingTab16 = new JButton("16");
		btnMetSendingTab16.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab16.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab16, "cell 1 4");
		
		btnMetSendingTab17 = new JButton("17");
		btnMetSendingTab17.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab17.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab17, "cell 2 4");
		
		btnMetSendingTab18 = new JButton("18");
		btnMetSendingTab18.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab18.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab18, "cell 3 4");
		
		btnMetSendingTab19 = new JButton("19");
		btnMetSendingTab19.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab19.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab19, "cell 4 4");
		
		btnMetSendingTab20 = new JButton("20");
		btnMetSendingTab20.setMaximumSize(new Dimension(90, 23));
		btnMetSendingTab20.setMinimumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab20, "cell 1 5");
		
		btnMetSendingTab21 = new JButton("21");
		btnMetSendingTab21.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab21.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab21, "cell 2 5");
		
		btnMetSendingTab22 = new JButton("22");
		btnMetSendingTab22.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab22.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab22, "cell 3 5");
		
		btnMetSendingTab23 = new JButton("23");
		btnMetSendingTab23.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab23.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab23, "cell 4 5");
		
		btnMetSendingTab24 = new JButton("24");
		btnMetSendingTab24.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab24.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab24, "cell 1 6");
		
		btnMetSendingTab25 = new JButton("25");
		btnMetSendingTab25.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab25.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab25, "cell 2 6");
		
		btnMetSendingTab26 = new JButton("26");
		btnMetSendingTab26.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab26.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab26, "cell 3 6");
		
		btnMetSendingTab27 = new JButton("27");
		btnMetSendingTab27.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab27.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab27, "cell 4 6");
		
		btnMetSendingTab28 = new JButton("28");
		btnMetSendingTab28.setMaximumSize(new Dimension(90, 23));
		btnMetSendingTab28.setMinimumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab28, "cell 1 7");
		
		btnMetSendingTab29 = new JButton("29");
		btnMetSendingTab29.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab29.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab29, "cell 2 7");
		
		btnMetSendingTab30 = new JButton("30");
		btnMetSendingTab30.setMaximumSize(new Dimension(90, 23));
		btnMetSendingTab30.setMinimumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab30, "cell 3 7");
		
		btnMetSendingTab31 = new JButton("31");
		btnMetSendingTab31.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab31.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab31, "cell 4 7");
		
		btnMetSendingTab32 = new JButton("32");
		btnMetSendingTab32.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab32.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab32, "cell 1 8");
		
		btnMetSendingTab33 = new JButton("33");
		btnMetSendingTab33.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab33.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab33, "cell 2 8");
		
		btnMetSendingTab34 = new JButton("34");
		btnMetSendingTab34.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab34.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab34, "cell 3 8");
		
		btnMetSendingTab35 = new JButton("35");
		btnMetSendingTab35.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab35.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab35, "cell 4 8");
		
		btnMetSendingTab36 = new JButton("36");
		btnMetSendingTab36.setMaximumSize(new Dimension(90, 23));
		btnMetSendingTab36.setMinimumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab36, "cell 1 9");
		
		btnMetSendingTab37 = new JButton("37");
		btnMetSendingTab37.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab37.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab37, "cell 2 9");
		
		btnMetSendingTab38 = new JButton("38");
		btnMetSendingTab38.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab38.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab38, "cell 3 9");
		
		btnMetSendingTab39 = new JButton("39");
		btnMetSendingTab39.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab39.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab39, "cell 4 9");
		
		btnMetSendingTab40 = new JButton("40");
		btnMetSendingTab40.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab40.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab40, "cell 1 10");
		
		btnMetSendingTab41 = new JButton("41");
		btnMetSendingTab41.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab41.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab41, "cell 2 10");
		
		btnMetSendingTab42 = new JButton("42");
		btnMetSendingTab42.setMaximumSize(new Dimension(90, 23));
		btnMetSendingTab42.setMinimumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab42, "cell 3 10");
		
		btnMetSendingTab43 = new JButton("43");
		btnMetSendingTab43.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab43.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab43, "cell 4 10");
		
		btnMetSendingTab44 = new JButton("44");
		btnMetSendingTab44.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab44.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab44, "cell 1 11");
		
		btnMetSendingTab45 = new JButton("45");
		btnMetSendingTab45.setMaximumSize(new Dimension(90, 23));
		btnMetSendingTab45.setMinimumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab45, "cell 2 11");
		
		btnMetSendingTab46 = new JButton("46");
		btnMetSendingTab46.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab46.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab46, "cell 3 11");
		
		btnMetSendingTab47 = new JButton("47");
		btnMetSendingTab47.setMinimumSize(new Dimension(90, 23));
		btnMetSendingTab47.setMaximumSize(new Dimension(90, 23));
		pMetSending.add(btnMetSendingTab47, "cell 4 11");
		
		pMetReceiving = new JPanel();
		tbpMet.addTab("Receiving", null, pMetReceiving, null);
		pMetReceiving.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnMetReceivingTabBack = new JButton("");
		btnMetReceivingTabBack.setMinimumSize(new Dimension(20, 300));
		btnMetReceivingTabBack.setMaximumSize(new Dimension(20, 300));
		btnMetReceivingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetReceiving.add(btnMetReceivingTabBack, "cell 0 0 1 12");
		
		btnMetReceivingTab0 = new JButton("0");
		btnMetReceivingTab0.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab0.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab0, "cell 1 0");
		
		btnMetReceivingTab1 = new JButton("1");
		btnMetReceivingTab1.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab1.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab1, "cell 2 0");
		
		btnMetReceivingTab2 = new JButton("2");
		btnMetReceivingTab2.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab2.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab2, "cell 3 0");
		
		btnMetReceivingTab3 = new JButton("3");
		btnMetReceivingTab3.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab3.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab3, "cell 4 0");
		
		btnMetReceivingTabNext = new JButton("");
		btnMetReceivingTabNext.setMinimumSize(new Dimension(20, 300));
		btnMetReceivingTabNext.setMaximumSize(new Dimension(20, 300));
		btnMetReceivingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetReceiving.add(btnMetReceivingTabNext, "cell 5 0 1 12");
		
		btnMetReceivingTab4 = new JButton("4");
		btnMetReceivingTab4.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab4.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab4, "cell 1 1");
		
		btnMetReceivingTab5 = new JButton("5");
		btnMetReceivingTab5.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab5.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab5, "cell 2 1");
		
		btnMetReceivingTab6 = new JButton("6");
		btnMetReceivingTab6.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab6.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab6, "cell 3 1");
		
		btnMetReceivingTab7 = new JButton("7");
		btnMetReceivingTab7.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab7.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab7, "cell 4 1");
		
		btnMetReceivingTab8 = new JButton("8");
		btnMetReceivingTab8.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab8.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab8, "cell 1 2");
		
		btnMetReceivingTab9 = new JButton("9");
		btnMetReceivingTab9.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab9.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab9, "cell 2 2");
		
		btnMetReceivingTab10 = new JButton("10");
		btnMetReceivingTab10.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab10.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab10, "cell 3 2");
		
		btnMetReceivingTab11 = new JButton("11");
		btnMetReceivingTab11.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab11.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab11, "cell 4 2");
		
		btnMetReceivingTab12 = new JButton("12");
		btnMetReceivingTab12.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab12.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab12, "cell 1 3");
		
		btnMetReceivingTab13 = new JButton("13");
		btnMetReceivingTab13.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab13.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab13, "cell 2 3");
		
		btnMetReceivingTab14 = new JButton("14");
		btnMetReceivingTab14.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab14.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab14, "cell 3 3");
		
		btnMetReceivingTab15 = new JButton("15");
		btnMetReceivingTab15.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab15.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab15, "cell 4 3");
		
		btnMetReceivingTab16 = new JButton("16");
		btnMetReceivingTab16.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab16.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab16, "cell 1 4");
		
		btnMetReceivingTab17 = new JButton("17");
		btnMetReceivingTab17.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab17.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab17, "cell 2 4");
		
		btnMetReceivingTab18 = new JButton("18");
		btnMetReceivingTab18.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab18.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab18, "cell 3 4");
		
		btnMetReceivingTab19 = new JButton("19");
		btnMetReceivingTab19.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab19.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab19, "cell 4 4");
		
		btnMetReceivingTab20 = new JButton("20");
		btnMetReceivingTab20.setMaximumSize(new Dimension(90, 23));
		btnMetReceivingTab20.setMinimumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab20, "cell 1 5");
		
		btnMetReceivingTab21 = new JButton("21");
		btnMetReceivingTab21.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab21.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab21, "cell 2 5");
		
		btnMetReceivingTab22 = new JButton("22");
		btnMetReceivingTab22.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab22.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab22, "cell 3 5");
		
		btnMetReceivingTab23 = new JButton("23");
		btnMetReceivingTab23.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab23.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab23, "cell 4 5");
		
		btnMetReceivingTab24 = new JButton("24");
		btnMetReceivingTab24.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab24.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab24, "cell 1 6");
		
		btnMetReceivingTab25 = new JButton("25");
		btnMetReceivingTab25.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab25.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab25, "cell 2 6");
		
		btnMetReceivingTab26 = new JButton("26");
		btnMetReceivingTab26.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab26.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab26, "cell 3 6");
		
		btnMetReceivingTab27 = new JButton("27");
		btnMetReceivingTab27.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab27.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab27, "cell 4 6");
		
		btnMetReceivingTab28 = new JButton("28");
		btnMetReceivingTab28.setMaximumSize(new Dimension(90, 23));
		btnMetReceivingTab28.setMinimumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab28, "cell 1 7");
		
		btnMetReceivingTab29 = new JButton("29");
		btnMetReceivingTab29.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab29.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab29, "cell 2 7");
		
		btnMetReceivingTab30 = new JButton("30");
		btnMetReceivingTab30.setMaximumSize(new Dimension(90, 23));
		btnMetReceivingTab30.setMinimumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab30, "cell 3 7");
		
		btnMetReceivingTab31 = new JButton("31");
		btnMetReceivingTab31.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab31.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab31, "cell 4 7");
		
		btnMetReceivingTab32 = new JButton("32");
		btnMetReceivingTab32.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab32.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab32, "cell 1 8");
		
		btnMetReceivingTab33 = new JButton("33");
		btnMetReceivingTab33.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab33.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab33, "cell 2 8");
		
		btnMetReceivingTab34 = new JButton("34");
		btnMetReceivingTab34.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab34.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab34, "cell 3 8");
		
		btnMetReceivingTab35 = new JButton("35");
		btnMetReceivingTab35.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab35.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab35, "cell 4 8");
		
		btnMetReceivingTab36 = new JButton("36");
		btnMetReceivingTab36.setMaximumSize(new Dimension(90, 23));
		btnMetReceivingTab36.setMinimumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab36, "cell 1 9");
		
		btnMetReceivingTab37 = new JButton("37");
		btnMetReceivingTab37.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab37.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab37, "cell 2 9");
		
		btnMetReceivingTab38 = new JButton("38");
		btnMetReceivingTab38.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab38.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab38, "cell 3 9");
		
		btnMetReceivingTab39 = new JButton("39");
		btnMetReceivingTab39.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab39.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab39, "cell 4 9");
		
		btnMetReceivingTab40 = new JButton("40");
		btnMetReceivingTab40.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab40.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab40, "cell 1 10");
		
		btnMetReceivingTab41 = new JButton("41");
		btnMetReceivingTab41.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab41.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab41, "cell 2 10");
		
		btnMetReceivingTab42 = new JButton("42");
		btnMetReceivingTab42.setMaximumSize(new Dimension(90, 23));
		btnMetReceivingTab42.setMinimumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab42, "cell 3 10");
		
		btnMetReceivingTab43 = new JButton("43");
		btnMetReceivingTab43.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab43.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab43, "cell 4 10");
		
		btnMetReceivingTab44 = new JButton("44");
		btnMetReceivingTab44.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab44.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab44, "cell 1 11");
		
		btnMetReceivingTab45 = new JButton("45");
		btnMetReceivingTab45.setMaximumSize(new Dimension(90, 23));
		btnMetReceivingTab45.setMinimumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab45, "cell 2 11");
		
		btnMetReceivingTab46 = new JButton("46");
		btnMetReceivingTab46.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab46.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab46, "cell 3 11");
		
		btnMetReceivingTab47 = new JButton("47");
		btnMetReceivingTab47.setMinimumSize(new Dimension(90, 23));
		btnMetReceivingTab47.setMaximumSize(new Dimension(90, 23));
		pMetReceiving.add(btnMetReceivingTab47, "cell 4 11");
		
		pMetPickUp = new JPanel();
		tbpMet.addTab("Pick up line", null, pMetPickUp, "");
		pMetPickUp.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnMetPickUpTabBack = new JButton("");
		btnMetPickUpTabBack.setMinimumSize(new Dimension(20, 300));
		btnMetPickUpTabBack.setMaximumSize(new Dimension(20, 300));
		btnMetPickUpTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetPickUp.add(btnMetPickUpTabBack, "cell 0 0 1 12");
		
		btnMetPickUpTab0 = new JButton("0");
		btnMetPickUpTab0.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab0.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab0, "cell 1 0");
		
		btnMetPickUpTab1 = new JButton("1");
		btnMetPickUpTab1.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab1.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab1, "cell 2 0");
		
		btnMetPickUpTab2 = new JButton("2");
		btnMetPickUpTab2.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab2.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab2, "cell 3 0");
		
		btnMetPickUpTab3 = new JButton("3");
		btnMetPickUpTab3.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab3.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab3, "cell 4 0");
		
		btnMetPickUpTabNext = new JButton("");
		btnMetPickUpTabNext.setMinimumSize(new Dimension(20, 300));
		btnMetPickUpTabNext.setMaximumSize(new Dimension(20, 300));
		btnMetPickUpTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetPickUp.add(btnMetPickUpTabNext, "cell 5 0 1 12");
		
		btnMetPickUpTab4 = new JButton("4");
		btnMetPickUpTab4.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab4.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab4, "cell 1 1");
		
		btnMetPickUpTab5 = new JButton("5");
		btnMetPickUpTab5.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab5.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab5, "cell 2 1");
		
		btnMetPickUpTab6 = new JButton("6");
		btnMetPickUpTab6.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab6.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab6, "cell 3 1");
		
		btnMetPickUpTab7 = new JButton("7");
		btnMetPickUpTab7.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab7.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab7, "cell 4 1");
		
		btnMetPickUpTab8 = new JButton("8");
		btnMetPickUpTab8.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab8.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab8, "cell 1 2");
		
		btnMetPickUpTab9 = new JButton("9");
		btnMetPickUpTab9.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab9.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab9, "cell 2 2");
		
		btnMetPickUpTab10 = new JButton("10");
		btnMetPickUpTab10.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab10.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab10, "cell 3 2");
		
		btnMetPickUpTab11 = new JButton("11");
		btnMetPickUpTab11.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab11.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab11, "cell 4 2");
		
		btnMetPickUpTab12 = new JButton("12");
		btnMetPickUpTab12.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab12.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab12, "cell 1 3");
		
		btnMetPickUpTab13 = new JButton("13");
		btnMetPickUpTab13.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab13.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab13, "cell 2 3");
		
		btnMetPickUpTab14 = new JButton("14");
		btnMetPickUpTab14.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab14.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab14, "cell 3 3");
		
		btnMetPickUpTab15 = new JButton("15");
		btnMetPickUpTab15.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab15.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab15, "cell 4 3");
		
		btnMetPickUpTab16 = new JButton("16");
		btnMetPickUpTab16.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab16.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab16, "cell 1 4");
		
		btnMetPickUpTab17 = new JButton("17");
		btnMetPickUpTab17.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab17.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab17, "cell 2 4");
		
		btnMetPickUpTab18 = new JButton("18");
		btnMetPickUpTab18.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab18.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab18, "cell 3 4");
		
		btnMetPickUpTab19 = new JButton("19");
		btnMetPickUpTab19.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab19.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab19, "cell 4 4");
		
		btnMetPickUpTab20 = new JButton("20");
		btnMetPickUpTab20.setMaximumSize(new Dimension(90, 23));
		btnMetPickUpTab20.setMinimumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab20, "cell 1 5");
		
		btnMetPickUpTab21 = new JButton("21");
		btnMetPickUpTab21.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab21.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab21, "cell 2 5");
		
		btnMetPickUpTab22 = new JButton("22");
		btnMetPickUpTab22.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab22.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab22, "cell 3 5");
		
		btnMetPickUpTab23 = new JButton("23");
		btnMetPickUpTab23.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab23.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab23, "cell 4 5");
		
		btnMetPickUpTab24 = new JButton("24");
		btnMetPickUpTab24.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab24.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab24, "cell 1 6");
		
		btnMetPickUpTab25 = new JButton("25");
		btnMetPickUpTab25.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab25.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab25, "cell 2 6");
		
		btnMetPickUpTab26 = new JButton("26");
		btnMetPickUpTab26.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab26.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab26, "cell 3 6");
		
		btnMetPickUpTab27 = new JButton("27");
		btnMetPickUpTab27.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab27.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab27, "cell 4 6");
		
		btnMetPickUpTab28 = new JButton("28");
		btnMetPickUpTab28.setMaximumSize(new Dimension(90, 23));
		btnMetPickUpTab28.setMinimumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab28, "cell 1 7");
		
		btnMetPickUpTab29 = new JButton("29");
		btnMetPickUpTab29.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab29.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab29, "cell 2 7");
		
		btnMetPickUpTab30 = new JButton("30");
		btnMetPickUpTab30.setMaximumSize(new Dimension(90, 23));
		btnMetPickUpTab30.setMinimumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab30, "cell 3 7");
		
		btnMetPickUpTab31 = new JButton("31");
		btnMetPickUpTab31.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab31.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab31, "cell 4 7");
		
		btnMetPickUpTab32 = new JButton("32");
		btnMetPickUpTab32.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab32.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab32, "cell 1 8");
		
		btnMetPickUpTab33 = new JButton("33");
		btnMetPickUpTab33.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab33.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab33, "cell 2 8");
		
		btnMetPickUpTab34 = new JButton("34");
		btnMetPickUpTab34.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab34.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab34, "cell 3 8");
		
		btnMetPickUpTab35 = new JButton("35");
		btnMetPickUpTab35.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab35.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab35, "cell 4 8");
		
		btnMetPickUpTab36 = new JButton("36");
		btnMetPickUpTab36.setMaximumSize(new Dimension(90, 23));
		btnMetPickUpTab36.setMinimumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab36, "cell 1 9");
		
		btnMetPickUpTab37 = new JButton("37");
		btnMetPickUpTab37.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab37.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab37, "cell 2 9");
		
		btnMetPickUpTab38 = new JButton("38");
		btnMetPickUpTab38.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab38.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab38, "cell 3 9");
		
		btnMetPickUpTab39 = new JButton("39");
		btnMetPickUpTab39.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab39.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab39, "cell 4 9");
		
		btnMetPickUpTab40 = new JButton("40");
		btnMetPickUpTab40.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab40.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab40, "cell 1 10");
		
		btnMetPickUpTab41 = new JButton("41");
		btnMetPickUpTab41.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab41.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab41, "cell 2 10");
		
		btnMetPickUpTab42 = new JButton("42");
		btnMetPickUpTab42.setMaximumSize(new Dimension(90, 23));
		btnMetPickUpTab42.setMinimumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab42, "cell 3 10");
		
		btnMetPickUpTab43 = new JButton("43");
		btnMetPickUpTab43.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab43.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab43, "cell 4 10");
		
		btnMetPickUpTab44 = new JButton("44");
		btnMetPickUpTab44.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab44.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab44, "cell 1 11");
		
		btnMetPickUpTab45 = new JButton("45");
		btnMetPickUpTab45.setMaximumSize(new Dimension(90, 23));
		btnMetPickUpTab45.setMinimumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab45, "cell 2 11");
		
		btnMetPickUpTab46 = new JButton("46");
		btnMetPickUpTab46.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab46.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab46, "cell 3 11");
		
		btnMetPickUpTab47 = new JButton("47");
		btnMetPickUpTab47.setMinimumSize(new Dimension(90, 23));
		btnMetPickUpTab47.setMaximumSize(new Dimension(90, 23));
		pMetPickUp.add(btnMetPickUpTab47, "cell 4 11");
		
		pMetWaitToSend = new JPanel();
		tbpMet.addTab("Wait To Send", null, pMetWaitToSend, null);
		pMetWaitToSend.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnMetWaitToSendTabBack = new JButton("");
		btnMetWaitToSendTabBack.setMinimumSize(new Dimension(20, 300));
		btnMetWaitToSendTabBack.setMaximumSize(new Dimension(20, 300));
		btnMetWaitToSendTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pMetWaitToSend.add(btnMetWaitToSendTabBack, "cell 0 0 1 12");
		
		btnMetWaitToSendTab0 = new JButton("0");
		btnMetWaitToSendTab0.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab0.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab0, "cell 1 0");
		
		btnMetWaitToSendTab1 = new JButton("1");
		btnMetWaitToSendTab1.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab1.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab1, "cell 2 0");
		
		btnMetWaitToSendTab2 = new JButton("2");
		btnMetWaitToSendTab2.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab2.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab2, "cell 3 0");
		
		btnMetWaitToSendTab3 = new JButton("3");
		btnMetWaitToSendTab3.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab3.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab3, "cell 4 0");
		
		btnMetWaitToSendTabNext = new JButton("");
		btnMetWaitToSendTabNext.setMinimumSize(new Dimension(20, 300));
		btnMetWaitToSendTabNext.setMaximumSize(new Dimension(20, 300));
		btnMetWaitToSendTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pMetWaitToSend.add(btnMetWaitToSendTabNext, "cell 5 0 1 12");
		
		btnMetWaitToSendTab4 = new JButton("4");
		btnMetWaitToSendTab4.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab4.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab4, "cell 1 1");
		
		btnMetWaitToSendTab5 = new JButton("5");
		btnMetWaitToSendTab5.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab5.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab5, "cell 2 1");
		
		btnMetWaitToSendTab6 = new JButton("6");
		btnMetWaitToSendTab6.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab6.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab6, "cell 3 1");
		
		btnMetWaitToSendTab7 = new JButton("7");
		btnMetWaitToSendTab7.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab7.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab7, "cell 4 1");
		
		btnMetWaitToSendTab8 = new JButton("8");
		btnMetWaitToSendTab8.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab8.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab8, "cell 1 2");
		
		btnMetWaitToSendTab9 = new JButton("9");
		btnMetWaitToSendTab9.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab9.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab9, "cell 2 2");
		
		btnMetWaitToSendTab10 = new JButton("10");
		btnMetWaitToSendTab10.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab10.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab10, "cell 3 2");
		
		btnMetWaitToSendTab11 = new JButton("11");
		btnMetWaitToSendTab11.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab11.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab11, "cell 4 2");
		
		btnMetWaitToSendTab12 = new JButton("12");
		btnMetWaitToSendTab12.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab12.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab12, "cell 1 3");
		
		btnMetWaitToSendTab13 = new JButton("13");
		btnMetWaitToSendTab13.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab13.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab13, "cell 2 3");
		
		btnMetWaitToSendTab14 = new JButton("14");
		btnMetWaitToSendTab14.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab14.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab14, "cell 3 3");
		
		btnMetWaitToSendTab15 = new JButton("15");
		btnMetWaitToSendTab15.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab15.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab15, "cell 4 3");
		
		btnMetWaitToSendTab16 = new JButton("16");
		btnMetWaitToSendTab16.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab16.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab16, "cell 1 4");
		
		btnMetWaitToSendTab17 = new JButton("17");
		btnMetWaitToSendTab17.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab17.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab17, "cell 2 4");
		
		btnMetWaitToSendTab18 = new JButton("18");
		btnMetWaitToSendTab18.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab18.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab18, "cell 3 4");
		
		btnMetWaitToSendTab19 = new JButton("19");
		btnMetWaitToSendTab19.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab19.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab19, "cell 4 4");
		
		btnMetWaitToSendTab20 = new JButton("20");
		btnMetWaitToSendTab20.setMaximumSize(new Dimension(90, 23));
		btnMetWaitToSendTab20.setMinimumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab20, "cell 1 5");
		
		btnMetWaitToSendTab21 = new JButton("21");
		btnMetWaitToSendTab21.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab21.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab21, "cell 2 5");
		
		btnMetWaitToSendTab22 = new JButton("22");
		btnMetWaitToSendTab22.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab22.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab22, "cell 3 5");
		
		btnMetWaitToSendTab23 = new JButton("23");
		btnMetWaitToSendTab23.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab23.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab23, "cell 4 5");
		
		btnMetWaitToSendTab24 = new JButton("24");
		btnMetWaitToSendTab24.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab24.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab24, "cell 1 6");
		
		btnMetWaitToSendTab25 = new JButton("25");
		btnMetWaitToSendTab25.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab25.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab25, "cell 2 6");
		
		btnMetWaitToSendTab26 = new JButton("26");
		btnMetWaitToSendTab26.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab26.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab26, "cell 3 6");
		
		btnMetWaitToSendTab27 = new JButton("27");
		btnMetWaitToSendTab27.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab27.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab27, "cell 4 6");
		
		btnMetWaitToSendTab28 = new JButton("28");
		btnMetWaitToSendTab28.setMaximumSize(new Dimension(90, 23));
		btnMetWaitToSendTab28.setMinimumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab28, "cell 1 7");
		
		btnMetWaitToSendTab29 = new JButton("29");
		btnMetWaitToSendTab29.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab29.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab29, "cell 2 7");
		
		btnMetWaitToSendTab30 = new JButton("30");
		btnMetWaitToSendTab30.setMaximumSize(new Dimension(90, 23));
		btnMetWaitToSendTab30.setMinimumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab30, "cell 3 7");
		
		btnMetWaitToSendTab31 = new JButton("31");
		btnMetWaitToSendTab31.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab31.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab31, "cell 4 7");
		
		btnMetWaitToSendTab32 = new JButton("32");
		btnMetWaitToSendTab32.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab32.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab32, "cell 1 8");
		
		btnMetWaitToSendTab33 = new JButton("33");
		btnMetWaitToSendTab33.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab33.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab33, "cell 2 8");
		
		btnMetWaitToSendTab34 = new JButton("34");
		btnMetWaitToSendTab34.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab34.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab34, "cell 3 8");
		
		btnMetWaitToSendTab35 = new JButton("35");
		btnMetWaitToSendTab35.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab35.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab35, "cell 4 8");
		
		btnMetWaitToSendTab36 = new JButton("36");
		btnMetWaitToSendTab36.setMaximumSize(new Dimension(90, 23));
		btnMetWaitToSendTab36.setMinimumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab36, "cell 1 9");
		
		btnMetWaitToSendTab37 = new JButton("37");
		btnMetWaitToSendTab37.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab37.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab37, "cell 2 9");
		
		btnMetWaitToSendTab38 = new JButton("38");
		btnMetWaitToSendTab38.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab38.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab38, "cell 3 9");
		
		btnMetWaitToSendTab39 = new JButton("39");
		btnMetWaitToSendTab39.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab39.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab39, "cell 4 9");
		
		btnMetWaitToSendTab40 = new JButton("40");
		btnMetWaitToSendTab40.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab40.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab40, "cell 1 10");
		
		btnMetWaitToSendTab41 = new JButton("41");
		btnMetWaitToSendTab41.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab41.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab41, "cell 2 10");
		
		btnMetWaitToSendTab42 = new JButton("42");
		btnMetWaitToSendTab42.setMaximumSize(new Dimension(90, 23));
		btnMetWaitToSendTab42.setMinimumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab42, "cell 3 10");
		
		btnMetWaitToSendTab43 = new JButton("43");
		btnMetWaitToSendTab43.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab43.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab43, "cell 4 10");
		
		btnMetWaitToSendTab44 = new JButton("44");
		btnMetWaitToSendTab44.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab44.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab44, "cell 1 11");
		
		btnMetWaitToSendTab45 = new JButton("45");
		btnMetWaitToSendTab45.setMaximumSize(new Dimension(90, 23));
		btnMetWaitToSendTab45.setMinimumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab45, "cell 2 11");
		
		btnMetWaitToSendTab46 = new JButton("46");
		btnMetWaitToSendTab46.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab46.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab46, "cell 3 11");
		
		btnMetWaitToSendTab47 = new JButton("47");
		btnMetWaitToSendTab47.setMinimumSize(new Dimension(90, 23));
		btnMetWaitToSendTab47.setMaximumSize(new Dimension(90, 23));
		pMetWaitToSend.add(btnMetWaitToSendTab47, "cell 4 11");
	}
	
	private void initiateHaiPanel() {
		pHaiOverall = new JPanel();
		tbpHai.addTab("Overall", null, pHaiOverall, null);
		pHaiOverall.setLayout(new MigLayout("", "[right][][][][][]", "[][][][][][][][][][][][]"));
		
		JLabel lblHaiSending = new JLabel("Sending:");
		lblHaiSending.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiSending.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pHaiOverall.add(lblHaiSending, "cell 0 0 1 2");
		
		btnHaiSendingBack = new JButton("");
		btnHaiSendingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHaiSendingBack.setMinimumSize(new Dimension(20, 48));
		btnHaiSendingBack.setMaximumSize(new Dimension(20, 48));
		btnHaiSendingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiOverall.add(btnHaiSendingBack, "cell 1 0 1 2");
		
		btnHaiSending0 = new JButton("0");
		btnHaiSending0.setMinimumSize(new Dimension(90, 23));
		btnHaiSending0.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiSending0, "cell 2 0");
		
		btnHaiSending1 = new JButton("1");
		btnHaiSending1.setMinimumSize(new Dimension(90, 23));
		btnHaiSending1.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiSending1, "cell 3 0");
		
		btnHaiSending2 = new JButton("2");
		btnHaiSending2.setMinimumSize(new Dimension(90, 23));
		btnHaiSending2.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiSending2, "cell 4 0");
		
		btnHaiSendingNext = new JButton("");
		btnHaiSendingNext.setMinimumSize(new Dimension(20, 48));
		btnHaiSendingNext.setMaximumSize(new Dimension(20, 48));
		btnHaiSendingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiOverall.add(btnHaiSendingNext, "cell 5 0 1 2");
		
		btnHaiSending3 = new JButton("3");
		btnHaiSending3.setMinimumSize(new Dimension(90, 23));
		btnHaiSending3.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiSending3, "cell 2 1");
		
		btnHaiSending4 = new JButton("4");
		btnHaiSending4.setMinimumSize(new Dimension(90, 23));
		btnHaiSending4.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiSending4, "cell 3 1");
		
		btnHaiSending5 = new JButton("5");
		btnHaiSending5.setMinimumSize(new Dimension(90, 23));
		btnHaiSending5.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiSending5, "cell 4 1");
		
		JLabel lblHaiReceiving = new JLabel("Receiving:");
		lblHaiReceiving.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiReceiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pHaiOverall.add(lblHaiReceiving, "cell 0 2 1 2");
		
		btnHaiReceivingBack = new JButton("");
		btnHaiReceivingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHaiReceivingBack.setMinimumSize(new Dimension(20, 48));
		btnHaiReceivingBack.setMaximumSize(new Dimension(20, 48));
		btnHaiReceivingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiOverall.add(btnHaiReceivingBack, "cell 1 2 1 2");
		
		btnHaiReceiving0 = new JButton("0");
		btnHaiReceiving0.setMinimumSize(new Dimension(90, 23));
		btnHaiReceiving0.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiReceiving0, "cell 2 2");
		
		btnHaiReceiving1 = new JButton("1");
		btnHaiReceiving1.setMinimumSize(new Dimension(90, 23));
		btnHaiReceiving1.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiReceiving1, "cell 3 2");
		
		btnHaiReceiving2 = new JButton("2");
		btnHaiReceiving2.setMinimumSize(new Dimension(90, 23));
		btnHaiReceiving2.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiReceiving2, "cell 4 2");
		
		btnHaiReceivingNext = new JButton("");
		btnHaiReceivingNext.setMinimumSize(new Dimension(20, 48));
		btnHaiReceivingNext.setMaximumSize(new Dimension(20, 48));
		btnHaiReceivingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiOverall.add(btnHaiReceivingNext, "cell 5 2 1 2");
		
		btnHaiReceiving3 = new JButton("3");
		btnHaiReceiving3.setMinimumSize(new Dimension(90, 23));
		btnHaiReceiving3.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiReceiving3, "cell 2 3");
		
		btnHaiReceiving4 = new JButton("4");
		btnHaiReceiving4.setMinimumSize(new Dimension(90, 23));
		btnHaiReceiving4.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiReceiving4, "cell 3 3");
		
		btnHaiReceiving5 = new JButton("5");
		btnHaiReceiving5.setMinimumSize(new Dimension(90, 23));
		btnHaiReceiving5.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiReceiving5, "cell 4 3");
		
		JLabel lblHaiPickUp = new JLabel("Pick Up:");
		lblHaiPickUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiPickUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHaiPickUp.setToolTipText("Pick Up Line");
		pHaiOverall.add(lblHaiPickUp, "cell 0 4 1 2");
		
		btnHaiPickUpBack = new JButton("");
		btnHaiPickUpBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHaiPickUpBack.setMinimumSize(new Dimension(20, 48));
		btnHaiPickUpBack.setMaximumSize(new Dimension(20, 48));
		btnHaiPickUpBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiOverall.add(btnHaiPickUpBack, "cell 1 4 1 2");
		
		btnHaiPickUp0 = new JButton("0");
		btnHaiPickUp0.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUp0.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiPickUp0, "cell 2 4");
		
		btnHaiPickUp1 = new JButton("1");
		btnHaiPickUp1.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUp1.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiPickUp1, "cell 3 4");
		
		btnHaiPickUp2 = new JButton("2");
		btnHaiPickUp2.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUp2.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiPickUp2, "cell 4 4");
		
		btnHaiPickUpNext = new JButton("");
		btnHaiPickUpNext.setMinimumSize(new Dimension(20, 48));
		btnHaiPickUpNext.setMaximumSize(new Dimension(20, 48));
		btnHaiPickUpNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiOverall.add(btnHaiPickUpNext, "cell 5 4 1 2");
		
		btnHaiPickUp3 = new JButton("3");
		btnHaiPickUp3.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUp3.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiPickUp3, "cell 2 5");
		
		btnHaiPickUp4 = new JButton("4");
		btnHaiPickUp4.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUp4.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiPickUp4, "cell 3 5");
		
		btnHaiPickUp5 = new JButton("5");
		btnHaiPickUp5.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUp5.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiPickUp5, "cell 4 5");
		
		JLabel lblHaiWaitingToSend = new JLabel("Waiting To Send:");
		lblHaiWaitingToSend.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiWaitingToSend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pHaiOverall.add(lblHaiWaitingToSend, "cell 0 6 1 2");
		
		btnHaiWaitingToSendBack = new JButton("");
		btnHaiWaitingToSendBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHaiWaitingToSendBack.setMinimumSize(new Dimension(20, 48));
		btnHaiWaitingToSendBack.setMaximumSize(new Dimension(20, 48));
		btnHaiWaitingToSendBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiOverall.add(btnHaiWaitingToSendBack, "cell 1 6 1 2");
		
		btnHaiWaitingToSend0 = new JButton("0");
		btnHaiWaitingToSend0.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitingToSend0.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiWaitingToSend0, "cell 2 6");
		
		btnHaiWaitingToSend1 = new JButton("1");
		btnHaiWaitingToSend1.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitingToSend1.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiWaitingToSend1, "cell 3 6");
		
		btnHaiWaitingToSend2 = new JButton("2");
		btnHaiWaitingToSend2.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitingToSend2.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiWaitingToSend2, "cell 4 6");
		
		btnHaiWaitingToSendNext = new JButton("");
		btnHaiWaitingToSendNext.setMinimumSize(new Dimension(20, 48));
		btnHaiWaitingToSendNext.setMaximumSize(new Dimension(20, 48));
		btnHaiWaitingToSendNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiOverall.add(btnHaiWaitingToSendNext, "cell 5 6 1 2");
		
		btnHaiWaitingToSend3 = new JButton("3");
		btnHaiWaitingToSend3.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitingToSend3.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiWaitingToSend3, "cell 2 7");
		
		btnHaiWaitingToSend4 = new JButton("4");
		btnHaiWaitingToSend4.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitingToSend4.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiWaitingToSend4, "cell 3 7");
		
		btnHaiWaitingToSend5 = new JButton("5");
		btnHaiWaitingToSend5.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitingToSend5.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiWaitingToSend5, "cell 4 7");
		
		JLabel lblHaiQSenders = new JLabel("Q. Senders:");
		lblHaiQSenders.setToolTipText("Queue Senders");
		lblHaiQSenders.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiQSenders.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pHaiOverall.add(lblHaiQSenders, "cell 0 8 1 2");
		
		btnHaiQSendersBack = new JButton("");
		btnHaiQSendersBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHaiQSendersBack.setMinimumSize(new Dimension(20, 48));
		btnHaiQSendersBack.setMaximumSize(new Dimension(20, 48));
		btnHaiQSendersBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiOverall.add(btnHaiQSendersBack, "cell 1 8 1 2");
		
		btnHaiQSenders0 = new JButton("0");
		btnHaiQSenders0.setMinimumSize(new Dimension(90, 23));
		btnHaiQSenders0.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQSenders0, "cell 2 8");
		
		btnHaiQSenders1 = new JButton("1");
		btnHaiQSenders1.setMinimumSize(new Dimension(90, 23));
		btnHaiQSenders1.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQSenders1, "cell 3 8");
		
		btnHaiQSenders2 = new JButton("2");
		btnHaiQSenders2.setMinimumSize(new Dimension(90, 23));
		btnHaiQSenders2.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQSenders2, "cell 4 8");
		
		btnHaiQSendersNext = new JButton("");
		btnHaiQSendersNext.setMinimumSize(new Dimension(20, 48));
		btnHaiQSendersNext.setMaximumSize(new Dimension(20, 48));
		btnHaiQSendersNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiOverall.add(btnHaiQSendersNext, "cell 5 8 1 2");
		
		btnHaiQSenders3 = new JButton("3");
		btnHaiQSenders3.setMinimumSize(new Dimension(90, 23));
		btnHaiQSenders3.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQSenders3, "cell 2 9 2 1,alignx center");
		
		btnHaiQSenders4 = new JButton("4");
		btnHaiQSenders4.setMinimumSize(new Dimension(90, 23));
		btnHaiQSenders4.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQSenders4, "cell 3 9 2 1,alignx center");
		
		JLabel lblHaiQReceivers = new JLabel("Q. Receivers:");
		lblHaiQReceivers.setToolTipText("Queue Receivers");
		lblHaiQReceivers.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiQReceivers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pHaiOverall.add(lblHaiQReceivers, "cell 0 10 1 2");
		
		btnHaiQReceiversBack = new JButton("");
		btnHaiQReceiversBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHaiQReceiversBack.setMinimumSize(new Dimension(20, 48));
		btnHaiQReceiversBack.setMaximumSize(new Dimension(20, 48));
		btnHaiQReceiversBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiOverall.add(btnHaiQReceiversBack, "cell 1 10 1 2");
		
		btnHaiQReceivers0 = new JButton("0");
		btnHaiQReceivers0.setMinimumSize(new Dimension(90, 23));
		btnHaiQReceivers0.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQReceivers0, "cell 2 10");
		
		btnHaiQReceivers1 = new JButton("1");
		btnHaiQReceivers1.setMinimumSize(new Dimension(90, 23));
		btnHaiQReceivers1.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQReceivers1, "cell 3 10");
		
		btnHaiQReceivers2 = new JButton("2");
		btnHaiQReceivers2.setMinimumSize(new Dimension(90, 23));
		btnHaiQReceivers2.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQReceivers2, "cell 4 10");
		
		btnHaiQReceiversNext = new JButton("");
		btnHaiQReceiversNext.setMinimumSize(new Dimension(20, 48));
		btnHaiQReceiversNext.setMaximumSize(new Dimension(20, 48));
		btnHaiQReceiversNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiOverall.add(btnHaiQReceiversNext, "cell 5 10 1 2");
		
		btnHaiQReceivers3 = new JButton("3");
		btnHaiQReceivers3.setMinimumSize(new Dimension(90, 23));
		btnHaiQReceivers3.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQReceivers3, "cell 2 11 2 1,alignx center");
		
		btnHaiQReceivers4 = new JButton("4");
		btnHaiQReceivers4.setMinimumSize(new Dimension(90, 23));
		btnHaiQReceivers4.setMaximumSize(new Dimension(90, 23));
		pHaiOverall.add(btnHaiQReceivers4, "cell 3 11 2 1,alignx center");
		
		pHaiSending = new JPanel();
		tbpHai.addTab("Sending", null, pHaiSending, null);
		pHaiSending.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnHaiSendingTabBack = new JButton("");
		btnHaiSendingTabBack.setMinimumSize(new Dimension(20, 300));
		btnHaiSendingTabBack.setMaximumSize(new Dimension(20, 300));
		btnHaiSendingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiSending.add(btnHaiSendingTabBack, "cell 0 0 1 12");
		
		btnHaiSendingTab0 = new JButton("0");
		btnHaiSendingTab0.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab0.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab0, "cell 1 0");
		
		btnHaiSendingTab1 = new JButton("1");
		btnHaiSendingTab1.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab1.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab1, "cell 2 0");
		
		btnHaiSendingTab2 = new JButton("2");
		btnHaiSendingTab2.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab2.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab2, "cell 3 0");
		
		btnHaiSendingTab3 = new JButton("3");
		btnHaiSendingTab3.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab3.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab3, "cell 4 0");
		
		btnHaiSendingTabNext = new JButton("");
		btnHaiSendingTabNext.setMinimumSize(new Dimension(20, 300));
		btnHaiSendingTabNext.setMaximumSize(new Dimension(20, 300));
		btnHaiSendingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiSending.add(btnHaiSendingTabNext, "cell 5 0 1 12");
		
		btnHaiSendingTab4 = new JButton("4");
		btnHaiSendingTab4.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab4.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab4, "cell 1 1");
		
		btnHaiSendingTab5 = new JButton("5");
		btnHaiSendingTab5.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab5.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab5, "cell 2 1");
		
		btnHaiSendingTab6 = new JButton("6");
		btnHaiSendingTab6.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab6.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab6, "cell 3 1");
		
		btnHaiSendingTab7 = new JButton("7");
		btnHaiSendingTab7.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab7.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab7, "cell 4 1");
		
		btnHaiSendingTab8 = new JButton("8");
		btnHaiSendingTab8.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab8.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab8, "cell 1 2");
		
		btnHaiSendingTab9 = new JButton("9");
		btnHaiSendingTab9.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab9.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab9, "cell 2 2");
		
		btnHaiSendingTab10 = new JButton("10");
		btnHaiSendingTab10.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab10.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab10, "cell 3 2");
		
		btnHaiSendingTab11 = new JButton("11");
		btnHaiSendingTab11.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab11.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab11, "cell 4 2");
		
		btnHaiSendingTab12 = new JButton("12");
		btnHaiSendingTab12.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab12.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab12, "cell 1 3");
		
		btnHaiSendingTab13 = new JButton("13");
		btnHaiSendingTab13.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab13.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab13, "cell 2 3");
		
		btnHaiSendingTab14 = new JButton("14");
		btnHaiSendingTab14.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab14.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab14, "cell 3 3");
		
		btnHaiSendingTab15 = new JButton("15");
		btnHaiSendingTab15.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab15.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab15, "cell 4 3");
		
		btnHaiSendingTab16 = new JButton("16");
		btnHaiSendingTab16.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab16.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab16, "cell 1 4");
		
		btnHaiSendingTab17 = new JButton("17");
		btnHaiSendingTab17.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab17.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab17, "cell 2 4");
		
		btnHaiSendingTab18 = new JButton("18");
		btnHaiSendingTab18.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab18.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab18, "cell 3 4");
		
		btnHaiSendingTab19 = new JButton("19");
		btnHaiSendingTab19.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab19.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab19, "cell 4 4");
		
		btnHaiSendingTab20 = new JButton("20");
		btnHaiSendingTab20.setMaximumSize(new Dimension(90, 23));
		btnHaiSendingTab20.setMinimumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab20, "cell 1 5");
		
		btnHaiSendingTab21 = new JButton("21");
		btnHaiSendingTab21.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab21.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab21, "cell 2 5");
		
		btnHaiSendingTab22 = new JButton("22");
		btnHaiSendingTab22.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab22.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab22, "cell 3 5");
		
		btnHaiSendingTab23 = new JButton("23");
		btnHaiSendingTab23.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab23.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab23, "cell 4 5");
		
		btnHaiSendingTab24 = new JButton("24");
		btnHaiSendingTab24.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab24.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab24, "cell 1 6");
		
		btnHaiSendingTab25 = new JButton("25");
		btnHaiSendingTab25.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab25.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab25, "cell 2 6");
		
		btnHaiSendingTab26 = new JButton("26");
		btnHaiSendingTab26.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab26.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab26, "cell 3 6");
		
		btnHaiSendingTab27 = new JButton("27");
		btnHaiSendingTab27.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab27.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab27, "cell 4 6");
		
		btnHaiSendingTab28 = new JButton("28");
		btnHaiSendingTab28.setMaximumSize(new Dimension(90, 23));
		btnHaiSendingTab28.setMinimumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab28, "cell 1 7");
		
		btnHaiSendingTab29 = new JButton("29");
		btnHaiSendingTab29.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab29.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab29, "cell 2 7");
		
		btnHaiSendingTab30 = new JButton("30");
		btnHaiSendingTab30.setMaximumSize(new Dimension(90, 23));
		btnHaiSendingTab30.setMinimumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab30, "cell 3 7");
		
		btnHaiSendingTab31 = new JButton("31");
		btnHaiSendingTab31.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab31.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab31, "cell 4 7");
		
		btnHaiSendingTab32 = new JButton("32");
		btnHaiSendingTab32.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab32.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab32, "cell 1 8");
		
		btnHaiSendingTab33 = new JButton("33");
		btnHaiSendingTab33.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab33.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab33, "cell 2 8");
		
		btnHaiSendingTab34 = new JButton("34");
		btnHaiSendingTab34.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab34.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab34, "cell 3 8");
		
		btnHaiSendingTab35 = new JButton("35");
		btnHaiSendingTab35.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab35.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab35, "cell 4 8");
		
		btnHaiSendingTab36 = new JButton("36");
		btnHaiSendingTab36.setMaximumSize(new Dimension(90, 23));
		btnHaiSendingTab36.setMinimumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab36, "cell 1 9");
		
		btnHaiSendingTab37 = new JButton("37");
		btnHaiSendingTab37.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab37.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab37, "cell 2 9");
		
		btnHaiSendingTab38 = new JButton("38");
		btnHaiSendingTab38.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab38.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab38, "cell 3 9");
		
		btnHaiSendingTab39 = new JButton("39");
		btnHaiSendingTab39.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab39.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab39, "cell 4 9");
		
		btnHaiSendingTab40 = new JButton("40");
		btnHaiSendingTab40.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab40.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab40, "cell 1 10");
		
		btnHaiSendingTab41 = new JButton("41");
		btnHaiSendingTab41.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab41.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab41, "cell 2 10");
		
		btnHaiSendingTab42 = new JButton("42");
		btnHaiSendingTab42.setMaximumSize(new Dimension(90, 23));
		btnHaiSendingTab42.setMinimumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab42, "cell 3 10");
		
		btnHaiSendingTab43 = new JButton("43");
		btnHaiSendingTab43.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab43.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab43, "cell 4 10");
		
		btnHaiSendingTab44 = new JButton("44");
		btnHaiSendingTab44.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab44.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab44, "cell 1 11");
		
		btnHaiSendingTab45 = new JButton("45");
		btnHaiSendingTab45.setMaximumSize(new Dimension(90, 23));
		btnHaiSendingTab45.setMinimumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab45, "cell 2 11");
		
		btnHaiSendingTab46 = new JButton("46");
		btnHaiSendingTab46.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab46.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab46, "cell 3 11");
		
		btnHaiSendingTab47 = new JButton("47");
		btnHaiSendingTab47.setMinimumSize(new Dimension(90, 23));
		btnHaiSendingTab47.setMaximumSize(new Dimension(90, 23));
		pHaiSending.add(btnHaiSendingTab47, "cell 4 11");
		
		pHaiReceiving = new JPanel();
		tbpHai.addTab("Receiving", null, pHaiReceiving, null);
		pHaiReceiving.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnHaiReceivingTabBack = new JButton("");
		btnHaiReceivingTabBack.setMinimumSize(new Dimension(20, 300));
		btnHaiReceivingTabBack.setMaximumSize(new Dimension(20, 300));
		btnHaiReceivingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiReceiving.add(btnHaiReceivingTabBack, "cell 0 0 1 12");
		
		btnHaiReceivingTab0 = new JButton("0");
		btnHaiReceivingTab0.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab0.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab0, "cell 1 0");
		
		btnHaiReceivingTab1 = new JButton("1");
		btnHaiReceivingTab1.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab1.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab1, "cell 2 0");
		
		btnHaiReceivingTab2 = new JButton("2");
		btnHaiReceivingTab2.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab2.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab2, "cell 3 0");
		
		btnHaiReceivingTab3 = new JButton("3");
		btnHaiReceivingTab3.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab3.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab3, "cell 4 0");
		
		btnHaiReceivingTabNext = new JButton("");
		btnHaiReceivingTabNext.setMinimumSize(new Dimension(20, 300));
		btnHaiReceivingTabNext.setMaximumSize(new Dimension(20, 300));
		btnHaiReceivingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiReceiving.add(btnHaiReceivingTabNext, "cell 5 0 1 12");
		
		btnHaiReceivingTab4 = new JButton("4");
		btnHaiReceivingTab4.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab4.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab4, "cell 1 1");
		
		btnHaiReceivingTab5 = new JButton("5");
		btnHaiReceivingTab5.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab5.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab5, "cell 2 1");
		
		btnHaiReceivingTab6 = new JButton("6");
		btnHaiReceivingTab6.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab6.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab6, "cell 3 1");
		
		btnHaiReceivingTab7 = new JButton("7");
		btnHaiReceivingTab7.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab7.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab7, "cell 4 1");
		
		btnHaiReceivingTab8 = new JButton("8");
		btnHaiReceivingTab8.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab8.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab8, "cell 1 2");
		
		btnHaiReceivingTab9 = new JButton("9");
		btnHaiReceivingTab9.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab9.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab9, "cell 2 2");
		
		btnHaiReceivingTab10 = new JButton("10");
		btnHaiReceivingTab10.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab10.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab10, "cell 3 2");
		
		btnHaiReceivingTab11 = new JButton("11");
		btnHaiReceivingTab11.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab11.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab11, "cell 4 2");
		
		btnHaiReceivingTab12 = new JButton("12");
		btnHaiReceivingTab12.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab12.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab12, "cell 1 3");
		
		btnHaiReceivingTab13 = new JButton("13");
		btnHaiReceivingTab13.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab13.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab13, "cell 2 3");
		
		btnHaiReceivingTab14 = new JButton("14");
		btnHaiReceivingTab14.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab14.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab14, "cell 3 3");
		
		btnHaiReceivingTab15 = new JButton("15");
		btnHaiReceivingTab15.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab15.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab15, "cell 4 3");
		
		btnHaiReceivingTab16 = new JButton("16");
		btnHaiReceivingTab16.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab16.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab16, "cell 1 4");
		
		btnHaiReceivingTab17 = new JButton("17");
		btnHaiReceivingTab17.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab17.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab17, "cell 2 4");
		
		btnHaiReceivingTab18 = new JButton("18");
		btnHaiReceivingTab18.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab18.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab18, "cell 3 4");
		
		btnHaiReceivingTab19 = new JButton("19");
		btnHaiReceivingTab19.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab19.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab19, "cell 4 4");
		
		btnHaiReceivingTab20 = new JButton("20");
		btnHaiReceivingTab20.setMaximumSize(new Dimension(90, 23));
		btnHaiReceivingTab20.setMinimumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab20, "cell 1 5");
		
		btnHaiReceivingTab21 = new JButton("21");
		btnHaiReceivingTab21.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab21.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab21, "cell 2 5");
		
		btnHaiReceivingTab22 = new JButton("22");
		btnHaiReceivingTab22.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab22.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab22, "cell 3 5");
		
		btnHaiReceivingTab23 = new JButton("23");
		btnHaiReceivingTab23.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab23.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab23, "cell 4 5");
		
		btnHaiReceivingTab24 = new JButton("24");
		btnHaiReceivingTab24.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab24.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab24, "cell 1 6");
		
		btnHaiReceivingTab25 = new JButton("25");
		btnHaiReceivingTab25.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab25.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab25, "cell 2 6");
		
		btnHaiReceivingTab26 = new JButton("26");
		btnHaiReceivingTab26.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab26.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab26, "cell 3 6");
		
		btnHaiReceivingTab27 = new JButton("27");
		btnHaiReceivingTab27.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab27.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab27, "cell 4 6");
		
		btnHaiReceivingTab28 = new JButton("28");
		btnHaiReceivingTab28.setMaximumSize(new Dimension(90, 23));
		btnHaiReceivingTab28.setMinimumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab28, "cell 1 7");
		
		btnHaiReceivingTab29 = new JButton("29");
		btnHaiReceivingTab29.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab29.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab29, "cell 2 7");
		
		btnHaiReceivingTab30 = new JButton("30");
		btnHaiReceivingTab30.setMaximumSize(new Dimension(90, 23));
		btnHaiReceivingTab30.setMinimumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab30, "cell 3 7");
		
		btnHaiReceivingTab31 = new JButton("31");
		btnHaiReceivingTab31.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab31.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab31, "cell 4 7");
		
		btnHaiReceivingTab32 = new JButton("32");
		btnHaiReceivingTab32.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab32.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab32, "cell 1 8");
		
		btnHaiReceivingTab33 = new JButton("33");
		btnHaiReceivingTab33.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab33.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab33, "cell 2 8");
		
		btnHaiReceivingTab34 = new JButton("34");
		btnHaiReceivingTab34.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab34.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab34, "cell 3 8");
		
		btnHaiReceivingTab35 = new JButton("35");
		btnHaiReceivingTab35.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab35.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab35, "cell 4 8");
		
		btnHaiReceivingTab36 = new JButton("36");
		btnHaiReceivingTab36.setMaximumSize(new Dimension(90, 23));
		btnHaiReceivingTab36.setMinimumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab36, "cell 1 9");
		
		btnHaiReceivingTab37 = new JButton("37");
		btnHaiReceivingTab37.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab37.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab37, "cell 2 9");
		
		btnHaiReceivingTab38 = new JButton("38");
		btnHaiReceivingTab38.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab38.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab38, "cell 3 9");
		
		btnHaiReceivingTab39 = new JButton("39");
		btnHaiReceivingTab39.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab39.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab39, "cell 4 9");
		
		btnHaiReceivingTab40 = new JButton("40");
		btnHaiReceivingTab40.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab40.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab40, "cell 1 10");
		
		btnHaiReceivingTab41 = new JButton("41");
		btnHaiReceivingTab41.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab41.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab41, "cell 2 10");
		
		btnHaiReceivingTab42 = new JButton("42");
		btnHaiReceivingTab42.setMaximumSize(new Dimension(90, 23));
		btnHaiReceivingTab42.setMinimumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab42, "cell 3 10");
		
		btnHaiReceivingTab43 = new JButton("43");
		btnHaiReceivingTab43.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab43.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab43, "cell 4 10");
		
		btnHaiReceivingTab44 = new JButton("44");
		btnHaiReceivingTab44.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab44.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab44, "cell 1 11");
		
		btnHaiReceivingTab45 = new JButton("45");
		btnHaiReceivingTab45.setMaximumSize(new Dimension(90, 23));
		btnHaiReceivingTab45.setMinimumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab45, "cell 2 11");
		
		btnHaiReceivingTab46 = new JButton("46");
		btnHaiReceivingTab46.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab46.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab46, "cell 3 11");
		
		btnHaiReceivingTab47 = new JButton("47");
		btnHaiReceivingTab47.setMinimumSize(new Dimension(90, 23));
		btnHaiReceivingTab47.setMaximumSize(new Dimension(90, 23));
		pHaiReceiving.add(btnHaiReceivingTab47, "cell 4 11");
		
		pHaiPickUp = new JPanel();
		tbpHai.addTab("Pick up line", null, pHaiPickUp, "");
		pHaiPickUp.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnHaiPickUpTabBack = new JButton("");
		btnHaiPickUpTabBack.setMinimumSize(new Dimension(20, 300));
		btnHaiPickUpTabBack.setMaximumSize(new Dimension(20, 300));
		btnHaiPickUpTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiPickUp.add(btnHaiPickUpTabBack, "cell 0 0 1 12");
		
		btnHaiPickUpTab0 = new JButton("0");
		btnHaiPickUpTab0.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab0.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab0, "cell 1 0");
		
		btnHaiPickUpTab1 = new JButton("1");
		btnHaiPickUpTab1.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab1.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab1, "cell 2 0");
		
		btnHaiPickUpTab2 = new JButton("2");
		btnHaiPickUpTab2.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab2.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab2, "cell 3 0");
		
		btnHaiPickUpTab3 = new JButton("3");
		btnHaiPickUpTab3.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab3.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab3, "cell 4 0");
		
		btnHaiPickUpTabNext = new JButton("");
		btnHaiPickUpTabNext.setMinimumSize(new Dimension(20, 300));
		btnHaiPickUpTabNext.setMaximumSize(new Dimension(20, 300));
		btnHaiPickUpTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiPickUp.add(btnHaiPickUpTabNext, "cell 5 0 1 12");
		
		btnHaiPickUpTab4 = new JButton("4");
		btnHaiPickUpTab4.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab4.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab4, "cell 1 1");
		
		btnHaiPickUpTab5 = new JButton("5");
		btnHaiPickUpTab5.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab5.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab5, "cell 2 1");
		
		btnHaiPickUpTab6 = new JButton("6");
		btnHaiPickUpTab6.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab6.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab6, "cell 3 1");
		
		btnHaiPickUpTab7 = new JButton("7");
		btnHaiPickUpTab7.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab7.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab7, "cell 4 1");
		
		btnHaiPickUpTab8 = new JButton("8");
		btnHaiPickUpTab8.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab8.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab8, "cell 1 2");
		
		btnHaiPickUpTab9 = new JButton("9");
		btnHaiPickUpTab9.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab9.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab9, "cell 2 2");
		
		btnHaiPickUpTab10 = new JButton("10");
		btnHaiPickUpTab10.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab10.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab10, "cell 3 2");
		
		btnHaiPickUpTab11 = new JButton("11");
		btnHaiPickUpTab11.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab11.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab11, "cell 4 2");
		
		btnHaiPickUpTab12 = new JButton("12");
		btnHaiPickUpTab12.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab12.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab12, "cell 1 3");
		
		btnHaiPickUpTab13 = new JButton("13");
		btnHaiPickUpTab13.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab13.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab13, "cell 2 3");
		
		btnHaiPickUpTab14 = new JButton("14");
		btnHaiPickUpTab14.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab14.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab14, "cell 3 3");
		
		btnHaiPickUpTab15 = new JButton("15");
		btnHaiPickUpTab15.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab15.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab15, "cell 4 3");
		
		btnHaiPickUpTab16 = new JButton("16");
		btnHaiPickUpTab16.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab16.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab16, "cell 1 4");
		
		btnHaiPickUpTab17 = new JButton("17");
		btnHaiPickUpTab17.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab17.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab17, "cell 2 4");
		
		btnHaiPickUpTab18 = new JButton("18");
		btnHaiPickUpTab18.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab18.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab18, "cell 3 4");
		
		btnHaiPickUpTab19 = new JButton("19");
		btnHaiPickUpTab19.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab19.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab19, "cell 4 4");
		
		btnHaiPickUpTab20 = new JButton("20");
		btnHaiPickUpTab20.setMaximumSize(new Dimension(90, 23));
		btnHaiPickUpTab20.setMinimumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab20, "cell 1 5");
		
		btnHaiPickUpTab21 = new JButton("21");
		btnHaiPickUpTab21.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab21.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab21, "cell 2 5");
		
		btnHaiPickUpTab22 = new JButton("22");
		btnHaiPickUpTab22.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab22.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab22, "cell 3 5");
		
		btnHaiPickUpTab23 = new JButton("23");
		btnHaiPickUpTab23.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab23.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab23, "cell 4 5");
		
		btnHaiPickUpTab24 = new JButton("24");
		btnHaiPickUpTab24.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab24.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab24, "cell 1 6");
		
		btnHaiPickUpTab25 = new JButton("25");
		btnHaiPickUpTab25.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab25.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab25, "cell 2 6");
		
		btnHaiPickUpTab26 = new JButton("26");
		btnHaiPickUpTab26.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab26.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab26, "cell 3 6");
		
		btnHaiPickUpTab27 = new JButton("27");
		btnHaiPickUpTab27.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab27.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab27, "cell 4 6");
		
		btnHaiPickUpTab28 = new JButton("28");
		btnHaiPickUpTab28.setMaximumSize(new Dimension(90, 23));
		btnHaiPickUpTab28.setMinimumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab28, "cell 1 7");
		
		btnHaiPickUpTab29 = new JButton("29");
		btnHaiPickUpTab29.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab29.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab29, "cell 2 7");
		
		btnHaiPickUpTab30 = new JButton("30");
		btnHaiPickUpTab30.setMaximumSize(new Dimension(90, 23));
		btnHaiPickUpTab30.setMinimumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab30, "cell 3 7");
		
		btnHaiPickUpTab31 = new JButton("31");
		btnHaiPickUpTab31.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab31.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab31, "cell 4 7");
		
		btnHaiPickUpTab32 = new JButton("32");
		btnHaiPickUpTab32.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab32.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab32, "cell 1 8");
		
		btnHaiPickUpTab33 = new JButton("33");
		btnHaiPickUpTab33.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab33.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab33, "cell 2 8");
		
		btnHaiPickUpTab34 = new JButton("34");
		btnHaiPickUpTab34.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab34.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab34, "cell 3 8");
		
		btnHaiPickUpTab35 = new JButton("35");
		btnHaiPickUpTab35.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab35.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab35, "cell 4 8");
		
		btnHaiPickUpTab36 = new JButton("36");
		btnHaiPickUpTab36.setMaximumSize(new Dimension(90, 23));
		btnHaiPickUpTab36.setMinimumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab36, "cell 1 9");
		
		btnHaiPickUpTab37 = new JButton("37");
		btnHaiPickUpTab37.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab37.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab37, "cell 2 9");
		
		btnHaiPickUpTab38 = new JButton("38");
		btnHaiPickUpTab38.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab38.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab38, "cell 3 9");
		
		btnHaiPickUpTab39 = new JButton("39");
		btnHaiPickUpTab39.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab39.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab39, "cell 4 9");
		
		btnHaiPickUpTab40 = new JButton("40");
		btnHaiPickUpTab40.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab40.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab40, "cell 1 10");
		
		btnHaiPickUpTab41 = new JButton("41");
		btnHaiPickUpTab41.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab41.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab41, "cell 2 10");
		
		btnHaiPickUpTab42 = new JButton("42");
		btnHaiPickUpTab42.setMaximumSize(new Dimension(90, 23));
		btnHaiPickUpTab42.setMinimumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab42, "cell 3 10");
		
		btnHaiPickUpTab43 = new JButton("43");
		btnHaiPickUpTab43.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab43.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab43, "cell 4 10");
		
		btnHaiPickUpTab44 = new JButton("44");
		btnHaiPickUpTab44.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab44.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab44, "cell 1 11");
		
		btnHaiPickUpTab45 = new JButton("45");
		btnHaiPickUpTab45.setMaximumSize(new Dimension(90, 23));
		btnHaiPickUpTab45.setMinimumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab45, "cell 2 11");
		
		btnHaiPickUpTab46 = new JButton("46");
		btnHaiPickUpTab46.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab46.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab46, "cell 3 11");
		
		btnHaiPickUpTab47 = new JButton("47");
		btnHaiPickUpTab47.setMinimumSize(new Dimension(90, 23));
		btnHaiPickUpTab47.setMaximumSize(new Dimension(90, 23));
		pHaiPickUp.add(btnHaiPickUpTab47, "cell 4 11");
		
		pHaiWaitToSend = new JPanel();
		tbpHai.addTab("Wait To Send", null, pHaiWaitToSend, null);
		pHaiWaitToSend.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnHaiWaitToSendTabBack = new JButton("");
		btnHaiWaitToSendTabBack.setMinimumSize(new Dimension(20, 300));
		btnHaiWaitToSendTabBack.setMaximumSize(new Dimension(20, 300));
		btnHaiWaitToSendTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pHaiWaitToSend.add(btnHaiWaitToSendTabBack, "cell 0 0 1 12");
		
		btnHaiWaitToSendTab0 = new JButton("0");
		btnHaiWaitToSendTab0.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab0.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab0, "cell 1 0");
		
		btnHaiWaitToSendTab1 = new JButton("1");
		btnHaiWaitToSendTab1.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab1.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab1, "cell 2 0");
		
		btnHaiWaitToSendTab2 = new JButton("2");
		btnHaiWaitToSendTab2.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab2.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab2, "cell 3 0");
		
		btnHaiWaitToSendTab3 = new JButton("3");
		btnHaiWaitToSendTab3.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab3.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab3, "cell 4 0");
		
		btnHaiWaitToSendTabNext = new JButton("");
		btnHaiWaitToSendTabNext.setMinimumSize(new Dimension(20, 300));
		btnHaiWaitToSendTabNext.setMaximumSize(new Dimension(20, 300));
		btnHaiWaitToSendTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pHaiWaitToSend.add(btnHaiWaitToSendTabNext, "cell 5 0 1 12");
		
		btnHaiWaitToSendTab4 = new JButton("4");
		btnHaiWaitToSendTab4.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab4.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab4, "cell 1 1");
		
		btnHaiWaitToSendTab5 = new JButton("5");
		btnHaiWaitToSendTab5.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab5.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab5, "cell 2 1");
		
		btnHaiWaitToSendTab6 = new JButton("6");
		btnHaiWaitToSendTab6.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab6.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab6, "cell 3 1");
		
		btnHaiWaitToSendTab7 = new JButton("7");
		btnHaiWaitToSendTab7.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab7.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab7, "cell 4 1");
		
		btnHaiWaitToSendTab8 = new JButton("8");
		btnHaiWaitToSendTab8.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab8.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab8, "cell 1 2");
		
		btnHaiWaitToSendTab9 = new JButton("9");
		btnHaiWaitToSendTab9.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab9.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab9, "cell 2 2");
		
		btnHaiWaitToSendTab10 = new JButton("10");
		btnHaiWaitToSendTab10.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab10.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab10, "cell 3 2");
		
		btnHaiWaitToSendTab11 = new JButton("11");
		btnHaiWaitToSendTab11.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab11.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab11, "cell 4 2");
		
		btnHaiWaitToSendTab12 = new JButton("12");
		btnHaiWaitToSendTab12.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab12.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab12, "cell 1 3");
		
		btnHaiWaitToSendTab13 = new JButton("13");
		btnHaiWaitToSendTab13.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab13.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab13, "cell 2 3");
		
		btnHaiWaitToSendTab14 = new JButton("14");
		btnHaiWaitToSendTab14.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab14.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab14, "cell 3 3");
		
		btnHaiWaitToSendTab15 = new JButton("15");
		btnHaiWaitToSendTab15.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab15.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab15, "cell 4 3");
		
		btnHaiWaitToSendTab16 = new JButton("16");
		btnHaiWaitToSendTab16.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab16.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab16, "cell 1 4");
		
		btnHaiWaitToSendTab17 = new JButton("17");
		btnHaiWaitToSendTab17.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab17.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab17, "cell 2 4");
		
		btnHaiWaitToSendTab18 = new JButton("18");
		btnHaiWaitToSendTab18.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab18.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab18, "cell 3 4");
		
		btnHaiWaitToSendTab19 = new JButton("19");
		btnHaiWaitToSendTab19.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab19.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab19, "cell 4 4");
		
		btnHaiWaitToSendTab20 = new JButton("20");
		btnHaiWaitToSendTab20.setMaximumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab20.setMinimumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab20, "cell 1 5");
		
		btnHaiWaitToSendTab21 = new JButton("21");
		btnHaiWaitToSendTab21.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab21.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab21, "cell 2 5");
		
		btnHaiWaitToSendTab22 = new JButton("22");
		btnHaiWaitToSendTab22.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab22.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab22, "cell 3 5");
		
		btnHaiWaitToSendTab23 = new JButton("23");
		btnHaiWaitToSendTab23.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab23.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab23, "cell 4 5");
		
		btnHaiWaitToSendTab24 = new JButton("24");
		btnHaiWaitToSendTab24.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab24.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab24, "cell 1 6");
		
		btnHaiWaitToSendTab25 = new JButton("25");
		btnHaiWaitToSendTab25.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab25.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab25, "cell 2 6");
		
		btnHaiWaitToSendTab26 = new JButton("26");
		btnHaiWaitToSendTab26.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab26.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab26, "cell 3 6");
		
		btnHaiWaitToSendTab27 = new JButton("27");
		btnHaiWaitToSendTab27.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab27.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab27, "cell 4 6");
		
		btnHaiWaitToSendTab28 = new JButton("28");
		btnHaiWaitToSendTab28.setMaximumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab28.setMinimumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab28, "cell 1 7");
		
		btnHaiWaitToSendTab29 = new JButton("29");
		btnHaiWaitToSendTab29.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab29.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab29, "cell 2 7");
		
		btnHaiWaitToSendTab30 = new JButton("30");
		btnHaiWaitToSendTab30.setMaximumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab30.setMinimumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab30, "cell 3 7");
		
		btnHaiWaitToSendTab31 = new JButton("31");
		btnHaiWaitToSendTab31.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab31.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab31, "cell 4 7");
		
		btnHaiWaitToSendTab32 = new JButton("32");
		btnHaiWaitToSendTab32.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab32.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab32, "cell 1 8");
		
		btnHaiWaitToSendTab33 = new JButton("33");
		btnHaiWaitToSendTab33.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab33.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab33, "cell 2 8");
		
		btnHaiWaitToSendTab34 = new JButton("34");
		btnHaiWaitToSendTab34.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab34.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab34, "cell 3 8");
		
		btnHaiWaitToSendTab35 = new JButton("35");
		btnHaiWaitToSendTab35.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab35.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab35, "cell 4 8");
		
		btnHaiWaitToSendTab36 = new JButton("36");
		btnHaiWaitToSendTab36.setMaximumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab36.setMinimumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab36, "cell 1 9");
		
		btnHaiWaitToSendTab37 = new JButton("37");
		btnHaiWaitToSendTab37.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab37.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab37, "cell 2 9");
		
		btnHaiWaitToSendTab38 = new JButton("38");
		btnHaiWaitToSendTab38.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab38.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab38, "cell 3 9");
		
		btnHaiWaitToSendTab39 = new JButton("39");
		btnHaiWaitToSendTab39.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab39.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab39, "cell 4 9");
		
		btnHaiWaitToSendTab40 = new JButton("40");
		btnHaiWaitToSendTab40.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab40.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab40, "cell 1 10");
		
		btnHaiWaitToSendTab41 = new JButton("41");
		btnHaiWaitToSendTab41.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab41.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab41, "cell 2 10");
		
		btnHaiWaitToSendTab42 = new JButton("42");
		btnHaiWaitToSendTab42.setMaximumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab42.setMinimumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab42, "cell 3 10");
		
		btnHaiWaitToSendTab43 = new JButton("43");
		btnHaiWaitToSendTab43.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab43.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab43, "cell 4 10");
		
		btnHaiWaitToSendTab44 = new JButton("44");
		btnHaiWaitToSendTab44.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab44.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab44, "cell 1 11");
		
		btnHaiWaitToSendTab45 = new JButton("45");
		btnHaiWaitToSendTab45.setMaximumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab45.setMinimumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab45, "cell 2 11");
		
		btnHaiWaitToSendTab46 = new JButton("46");
		btnHaiWaitToSendTab46.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab46.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab46, "cell 3 11");
		
		btnHaiWaitToSendTab47 = new JButton("47");
		btnHaiWaitToSendTab47.setMinimumSize(new Dimension(90, 23));
		btnHaiWaitToSendTab47.setMaximumSize(new Dimension(90, 23));
		pHaiWaitToSend.add(btnHaiWaitToSendTab47, "cell 4 11");
	}
	
	private void initiateTibPanel() {
		pTibOverall = new JPanel();
		tbpTib.addTab("Overall", null, pTibOverall, null);
		pTibOverall.setLayout(new MigLayout("", "[right][][][][][]", "[][][][][][][][][][][][]"));
		
		JLabel lblTibSending = new JLabel("Sending:");
		lblTibSending.setHorizontalAlignment(SwingConstants.LEFT);
		lblTibSending.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTibOverall.add(lblTibSending, "cell 0 0 1 2");
		
		btnTibSendingBack = new JButton("");
		btnTibSendingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTibSendingBack.setMinimumSize(new Dimension(20, 48));
		btnTibSendingBack.setMaximumSize(new Dimension(20, 48));
		btnTibSendingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibOverall.add(btnTibSendingBack, "cell 1 0 1 2");
		
		btnTibSending0 = new JButton("0");
		btnTibSending0.setMinimumSize(new Dimension(90, 23));
		btnTibSending0.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibSending0, "cell 2 0");
		
		btnTibSending1 = new JButton("1");
		btnTibSending1.setMinimumSize(new Dimension(90, 23));
		btnTibSending1.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibSending1, "cell 3 0");
		
		btnTibSending2 = new JButton("2");
		btnTibSending2.setMinimumSize(new Dimension(90, 23));
		btnTibSending2.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibSending2, "cell 4 0");
		
		btnTibSendingNext = new JButton("");
		btnTibSendingNext.setMinimumSize(new Dimension(20, 48));
		btnTibSendingNext.setMaximumSize(new Dimension(20, 48));
		btnTibSendingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibOverall.add(btnTibSendingNext, "cell 5 0 1 2");
		
		btnTibSending3 = new JButton("3");
		btnTibSending3.setMinimumSize(new Dimension(90, 23));
		btnTibSending3.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibSending3, "cell 2 1");
		
		btnTibSending4 = new JButton("4");
		btnTibSending4.setMinimumSize(new Dimension(90, 23));
		btnTibSending4.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibSending4, "cell 3 1");
		
		btnTibSending5 = new JButton("5");
		btnTibSending5.setMinimumSize(new Dimension(90, 23));
		btnTibSending5.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibSending5, "cell 4 1");
		
		JLabel lblTibReceiving = new JLabel("Receiving:");
		lblTibReceiving.setHorizontalAlignment(SwingConstants.LEFT);
		lblTibReceiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTibOverall.add(lblTibReceiving, "cell 0 2 1 2");
		
		btnTibReceivingBack = new JButton("");
		btnTibReceivingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTibReceivingBack.setMinimumSize(new Dimension(20, 48));
		btnTibReceivingBack.setMaximumSize(new Dimension(20, 48));
		btnTibReceivingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibOverall.add(btnTibReceivingBack, "cell 1 2 1 2");
		
		btnTibReceiving0 = new JButton("0");
		btnTibReceiving0.setMinimumSize(new Dimension(90, 23));
		btnTibReceiving0.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibReceiving0, "cell 2 2");
		
		btnTibReceiving1 = new JButton("1");
		btnTibReceiving1.setMinimumSize(new Dimension(90, 23));
		btnTibReceiving1.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibReceiving1, "cell 3 2");
		
		btnTibReceiving2 = new JButton("2");
		btnTibReceiving2.setMinimumSize(new Dimension(90, 23));
		btnTibReceiving2.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibReceiving2, "cell 4 2");
		
		btnTibReceivingNext = new JButton("");
		btnTibReceivingNext.setMinimumSize(new Dimension(20, 48));
		btnTibReceivingNext.setMaximumSize(new Dimension(20, 48));
		btnTibReceivingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibOverall.add(btnTibReceivingNext, "cell 5 2 1 2");
		
		btnTibReceiving3 = new JButton("3");
		btnTibReceiving3.setMinimumSize(new Dimension(90, 23));
		btnTibReceiving3.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibReceiving3, "cell 2 3");
		
		btnTibReceiving4 = new JButton("4");
		btnTibReceiving4.setMinimumSize(new Dimension(90, 23));
		btnTibReceiving4.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibReceiving4, "cell 3 3");
		
		btnTibReceiving5 = new JButton("5");
		btnTibReceiving5.setMinimumSize(new Dimension(90, 23));
		btnTibReceiving5.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibReceiving5, "cell 4 3");
		
		JLabel lblTibPickUp = new JLabel("Pick Up:");
		lblTibPickUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblTibPickUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTibPickUp.setToolTipText("Pick Up Line");
		pTibOverall.add(lblTibPickUp, "cell 0 4 1 2");
		
		btnTibPickUpBack = new JButton("");
		btnTibPickUpBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTibPickUpBack.setMinimumSize(new Dimension(20, 48));
		btnTibPickUpBack.setMaximumSize(new Dimension(20, 48));
		btnTibPickUpBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibOverall.add(btnTibPickUpBack, "cell 1 4 1 2");
		
		btnTibPickUp0 = new JButton("0");
		btnTibPickUp0.setMinimumSize(new Dimension(90, 23));
		btnTibPickUp0.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibPickUp0, "cell 2 4");
		
		btnTibPickUp1 = new JButton("1");
		btnTibPickUp1.setMinimumSize(new Dimension(90, 23));
		btnTibPickUp1.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibPickUp1, "cell 3 4");
		
		btnTibPickUp2 = new JButton("2");
		btnTibPickUp2.setMinimumSize(new Dimension(90, 23));
		btnTibPickUp2.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibPickUp2, "cell 4 4");
		
		btnTibPickUpNext = new JButton("");
		btnTibPickUpNext.setMinimumSize(new Dimension(20, 48));
		btnTibPickUpNext.setMaximumSize(new Dimension(20, 48));
		btnTibPickUpNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibOverall.add(btnTibPickUpNext, "cell 5 4 1 2");
		
		btnTibPickUp3 = new JButton("3");
		btnTibPickUp3.setMinimumSize(new Dimension(90, 23));
		btnTibPickUp3.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibPickUp3, "cell 2 5");
		
		btnTibPickUp4 = new JButton("4");
		btnTibPickUp4.setMinimumSize(new Dimension(90, 23));
		btnTibPickUp4.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibPickUp4, "cell 3 5");
		
		btnTibPickUp5 = new JButton("5");
		btnTibPickUp5.setMinimumSize(new Dimension(90, 23));
		btnTibPickUp5.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibPickUp5, "cell 4 5");
		
		JLabel lblTibWaitingToSend = new JLabel("Waiting To Send:");
		lblTibWaitingToSend.setHorizontalAlignment(SwingConstants.LEFT);
		lblTibWaitingToSend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTibOverall.add(lblTibWaitingToSend, "cell 0 6 1 2");
		
		btnTibWaitingToSendBack = new JButton("");
		btnTibWaitingToSendBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTibWaitingToSendBack.setMinimumSize(new Dimension(20, 48));
		btnTibWaitingToSendBack.setMaximumSize(new Dimension(20, 48));
		btnTibWaitingToSendBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibOverall.add(btnTibWaitingToSendBack, "cell 1 6 1 2");
		
		btnTibWaitingToSend0 = new JButton("0");
		btnTibWaitingToSend0.setMinimumSize(new Dimension(90, 23));
		btnTibWaitingToSend0.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibWaitingToSend0, "cell 2 6");
		
		btnTibWaitingToSend1 = new JButton("1");
		btnTibWaitingToSend1.setMinimumSize(new Dimension(90, 23));
		btnTibWaitingToSend1.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibWaitingToSend1, "cell 3 6");
		
		btnTibWaitingToSend2 = new JButton("2");
		btnTibWaitingToSend2.setMinimumSize(new Dimension(90, 23));
		btnTibWaitingToSend2.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibWaitingToSend2, "cell 4 6");
		
		btnTibWaitingToSendNext = new JButton("");
		btnTibWaitingToSendNext.setMinimumSize(new Dimension(20, 48));
		btnTibWaitingToSendNext.setMaximumSize(new Dimension(20, 48));
		btnTibWaitingToSendNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibOverall.add(btnTibWaitingToSendNext, "cell 5 6 1 2");
		
		btnTibWaitingToSend3 = new JButton("3");
		btnTibWaitingToSend3.setMinimumSize(new Dimension(90, 23));
		btnTibWaitingToSend3.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibWaitingToSend3, "cell 2 7");
		
		btnTibWaitingToSend4 = new JButton("4");
		btnTibWaitingToSend4.setMinimumSize(new Dimension(90, 23));
		btnTibWaitingToSend4.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibWaitingToSend4, "cell 3 7");
		
		btnTibWaitingToSend5 = new JButton("5");
		btnTibWaitingToSend5.setMinimumSize(new Dimension(90, 23));
		btnTibWaitingToSend5.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibWaitingToSend5, "cell 4 7");
		
		JLabel lblTibQSenders = new JLabel("Q. Senders:");
		lblTibQSenders.setToolTipText("Queue Senders");
		lblTibQSenders.setHorizontalAlignment(SwingConstants.LEFT);
		lblTibQSenders.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTibOverall.add(lblTibQSenders, "cell 0 8 1 2");
		
		btnTibQSendersBack = new JButton("");
		btnTibQSendersBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTibQSendersBack.setMinimumSize(new Dimension(20, 48));
		btnTibQSendersBack.setMaximumSize(new Dimension(20, 48));
		btnTibQSendersBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibOverall.add(btnTibQSendersBack, "cell 1 8 1 2");
		
		btnTibQSenders0 = new JButton("0");
		btnTibQSenders0.setMinimumSize(new Dimension(90, 23));
		btnTibQSenders0.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQSenders0, "cell 2 8");
		
		btnTibQSenders1 = new JButton("1");
		btnTibQSenders1.setMinimumSize(new Dimension(90, 23));
		btnTibQSenders1.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQSenders1, "cell 3 8");
		
		btnTibQSenders2 = new JButton("2");
		btnTibQSenders2.setMinimumSize(new Dimension(90, 23));
		btnTibQSenders2.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQSenders2, "cell 4 8");
		
		btnTibQSendersNext = new JButton("");
		btnTibQSendersNext.setMinimumSize(new Dimension(20, 48));
		btnTibQSendersNext.setMaximumSize(new Dimension(20, 48));
		btnTibQSendersNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibOverall.add(btnTibQSendersNext, "cell 5 8 1 2");
		
		btnTibQSenders3 = new JButton("3");
		btnTibQSenders3.setMinimumSize(new Dimension(90, 23));
		btnTibQSenders3.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQSenders3, "cell 2 9 2 1,alignx center");
		
		btnTibQSenders4 = new JButton("4");
		btnTibQSenders4.setMinimumSize(new Dimension(90, 23));
		btnTibQSenders4.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQSenders4, "cell 3 9 2 1,alignx center");
		
		JLabel lblTibQReceivers = new JLabel("Q. Receivers:");
		lblTibQReceivers.setToolTipText("Queue Receivers");
		lblTibQReceivers.setHorizontalAlignment(SwingConstants.LEFT);
		lblTibQReceivers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTibOverall.add(lblTibQReceivers, "cell 0 10 1 2");
		
		btnTibQReceiversBack = new JButton("");
		btnTibQReceiversBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTibQReceiversBack.setMinimumSize(new Dimension(20, 48));
		btnTibQReceiversBack.setMaximumSize(new Dimension(20, 48));
		btnTibQReceiversBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibOverall.add(btnTibQReceiversBack, "cell 1 10 1 2");
		
		btnTibQReceivers0 = new JButton("0");
		btnTibQReceivers0.setMinimumSize(new Dimension(90, 23));
		btnTibQReceivers0.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQReceivers0, "cell 2 10");
		
		btnTibQReceivers1 = new JButton("1");
		btnTibQReceivers1.setMinimumSize(new Dimension(90, 23));
		btnTibQReceivers1.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQReceivers1, "cell 3 10");
		
		btnTibQReceivers2 = new JButton("2");
		btnTibQReceivers2.setMinimumSize(new Dimension(90, 23));
		btnTibQReceivers2.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQReceivers2, "cell 4 10");
		
		btnTibQReceiversNext = new JButton("");
		btnTibQReceiversNext.setMinimumSize(new Dimension(20, 48));
		btnTibQReceiversNext.setMaximumSize(new Dimension(20, 48));
		btnTibQReceiversNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibOverall.add(btnTibQReceiversNext, "cell 5 10 1 2");
		
		btnTibQReceivers3 = new JButton("3");
		btnTibQReceivers3.setMinimumSize(new Dimension(90, 23));
		btnTibQReceivers3.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQReceivers3, "cell 2 11 2 1,alignx center");
		
		btnTibQReceivers4 = new JButton("4");
		btnTibQReceivers4.setMinimumSize(new Dimension(90, 23));
		btnTibQReceivers4.setMaximumSize(new Dimension(90, 23));
		pTibOverall.add(btnTibQReceivers4, "cell 3 11 2 1,alignx center");
		
		pTibSending = new JPanel();
		tbpTib.addTab("Sending", null, pTibSending, null);
		pTibSending.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnTibSendingTabBack = new JButton("");
		btnTibSendingTabBack.setMinimumSize(new Dimension(20, 300));
		btnTibSendingTabBack.setMaximumSize(new Dimension(20, 300));
		btnTibSendingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibSending.add(btnTibSendingTabBack, "cell 0 0 1 12");
		
		btnTibSendingTab0 = new JButton("0");
		btnTibSendingTab0.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab0.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab0, "cell 1 0");
		
		btnTibSendingTab1 = new JButton("1");
		btnTibSendingTab1.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab1.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab1, "cell 2 0");
		
		btnTibSendingTab2 = new JButton("2");
		btnTibSendingTab2.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab2.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab2, "cell 3 0");
		
		btnTibSendingTab3 = new JButton("3");
		btnTibSendingTab3.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab3.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab3, "cell 4 0");
		
		btnTibSendingTabNext = new JButton("");
		btnTibSendingTabNext.setMinimumSize(new Dimension(20, 300));
		btnTibSendingTabNext.setMaximumSize(new Dimension(20, 300));
		btnTibSendingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibSending.add(btnTibSendingTabNext, "cell 5 0 1 12");
		
		btnTibSendingTab4 = new JButton("4");
		btnTibSendingTab4.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab4.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab4, "cell 1 1");
		
		btnTibSendingTab5 = new JButton("5");
		btnTibSendingTab5.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab5.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab5, "cell 2 1");
		
		btnTibSendingTab6 = new JButton("6");
		btnTibSendingTab6.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab6.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab6, "cell 3 1");
		
		btnTibSendingTab7 = new JButton("7");
		btnTibSendingTab7.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab7.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab7, "cell 4 1");
		
		btnTibSendingTab8 = new JButton("8");
		btnTibSendingTab8.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab8.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab8, "cell 1 2");
		
		btnTibSendingTab9 = new JButton("9");
		btnTibSendingTab9.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab9.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab9, "cell 2 2");
		
		btnTibSendingTab10 = new JButton("10");
		btnTibSendingTab10.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab10.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab10, "cell 3 2");
		
		btnTibSendingTab11 = new JButton("11");
		btnTibSendingTab11.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab11.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab11, "cell 4 2");
		
		btnTibSendingTab12 = new JButton("12");
		btnTibSendingTab12.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab12.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab12, "cell 1 3");
		
		btnTibSendingTab13 = new JButton("13");
		btnTibSendingTab13.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab13.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab13, "cell 2 3");
		
		btnTibSendingTab14 = new JButton("14");
		btnTibSendingTab14.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab14.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab14, "cell 3 3");
		
		btnTibSendingTab15 = new JButton("15");
		btnTibSendingTab15.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab15.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab15, "cell 4 3");
		
		btnTibSendingTab16 = new JButton("16");
		btnTibSendingTab16.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab16.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab16, "cell 1 4");
		
		btnTibSendingTab17 = new JButton("17");
		btnTibSendingTab17.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab17.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab17, "cell 2 4");
		
		btnTibSendingTab18 = new JButton("18");
		btnTibSendingTab18.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab18.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab18, "cell 3 4");
		
		btnTibSendingTab19 = new JButton("19");
		btnTibSendingTab19.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab19.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab19, "cell 4 4");
		
		btnTibSendingTab20 = new JButton("20");
		btnTibSendingTab20.setMaximumSize(new Dimension(90, 23));
		btnTibSendingTab20.setMinimumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab20, "cell 1 5");
		
		btnTibSendingTab21 = new JButton("21");
		btnTibSendingTab21.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab21.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab21, "cell 2 5");
		
		btnTibSendingTab22 = new JButton("22");
		btnTibSendingTab22.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab22.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab22, "cell 3 5");
		
		btnTibSendingTab23 = new JButton("23");
		btnTibSendingTab23.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab23.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab23, "cell 4 5");
		
		btnTibSendingTab24 = new JButton("24");
		btnTibSendingTab24.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab24.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab24, "cell 1 6");
		
		btnTibSendingTab25 = new JButton("25");
		btnTibSendingTab25.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab25.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab25, "cell 2 6");
		
		btnTibSendingTab26 = new JButton("26");
		btnTibSendingTab26.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab26.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab26, "cell 3 6");
		
		btnTibSendingTab27 = new JButton("27");
		btnTibSendingTab27.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab27.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab27, "cell 4 6");
		
		btnTibSendingTab28 = new JButton("28");
		btnTibSendingTab28.setMaximumSize(new Dimension(90, 23));
		btnTibSendingTab28.setMinimumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab28, "cell 1 7");
		
		btnTibSendingTab29 = new JButton("29");
		btnTibSendingTab29.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab29.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab29, "cell 2 7");
		
		btnTibSendingTab30 = new JButton("30");
		btnTibSendingTab30.setMaximumSize(new Dimension(90, 23));
		btnTibSendingTab30.setMinimumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab30, "cell 3 7");
		
		btnTibSendingTab31 = new JButton("31");
		btnTibSendingTab31.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab31.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab31, "cell 4 7");
		
		btnTibSendingTab32 = new JButton("32");
		btnTibSendingTab32.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab32.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab32, "cell 1 8");
		
		btnTibSendingTab33 = new JButton("33");
		btnTibSendingTab33.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab33.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab33, "cell 2 8");
		
		btnTibSendingTab34 = new JButton("34");
		btnTibSendingTab34.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab34.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab34, "cell 3 8");
		
		btnTibSendingTab35 = new JButton("35");
		btnTibSendingTab35.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab35.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab35, "cell 4 8");
		
		btnTibSendingTab36 = new JButton("36");
		btnTibSendingTab36.setMaximumSize(new Dimension(90, 23));
		btnTibSendingTab36.setMinimumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab36, "cell 1 9");
		
		btnTibSendingTab37 = new JButton("37");
		btnTibSendingTab37.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab37.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab37, "cell 2 9");
		
		btnTibSendingTab38 = new JButton("38");
		btnTibSendingTab38.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab38.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab38, "cell 3 9");
		
		btnTibSendingTab39 = new JButton("39");
		btnTibSendingTab39.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab39.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab39, "cell 4 9");
		
		btnTibSendingTab40 = new JButton("40");
		btnTibSendingTab40.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab40.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab40, "cell 1 10");
		
		btnTibSendingTab41 = new JButton("41");
		btnTibSendingTab41.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab41.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab41, "cell 2 10");
		
		btnTibSendingTab42 = new JButton("42");
		btnTibSendingTab42.setMaximumSize(new Dimension(90, 23));
		btnTibSendingTab42.setMinimumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab42, "cell 3 10");
		
		btnTibSendingTab43 = new JButton("43");
		btnTibSendingTab43.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab43.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab43, "cell 4 10");
		
		btnTibSendingTab44 = new JButton("44");
		btnTibSendingTab44.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab44.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab44, "cell 1 11");
		
		btnTibSendingTab45 = new JButton("45");
		btnTibSendingTab45.setMaximumSize(new Dimension(90, 23));
		btnTibSendingTab45.setMinimumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab45, "cell 2 11");
		
		btnTibSendingTab46 = new JButton("46");
		btnTibSendingTab46.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab46.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab46, "cell 3 11");
		
		btnTibSendingTab47 = new JButton("47");
		btnTibSendingTab47.setMinimumSize(new Dimension(90, 23));
		btnTibSendingTab47.setMaximumSize(new Dimension(90, 23));
		pTibSending.add(btnTibSendingTab47, "cell 4 11");
		
		pTibReceiving = new JPanel();
		tbpTib.addTab("Receiving", null, pTibReceiving, null);
		pTibReceiving.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnTibReceivingTabBack = new JButton("");
		btnTibReceivingTabBack.setMinimumSize(new Dimension(20, 300));
		btnTibReceivingTabBack.setMaximumSize(new Dimension(20, 300));
		btnTibReceivingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibReceiving.add(btnTibReceivingTabBack, "cell 0 0 1 12");
		
		btnTibReceivingTab0 = new JButton("0");
		btnTibReceivingTab0.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab0.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab0, "cell 1 0");
		
		btnTibReceivingTab1 = new JButton("1");
		btnTibReceivingTab1.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab1.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab1, "cell 2 0");
		
		btnTibReceivingTab2 = new JButton("2");
		btnTibReceivingTab2.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab2.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab2, "cell 3 0");
		
		btnTibReceivingTab3 = new JButton("3");
		btnTibReceivingTab3.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab3.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab3, "cell 4 0");
		
		btnTibReceivingTabNext = new JButton("");
		btnTibReceivingTabNext.setMinimumSize(new Dimension(20, 300));
		btnTibReceivingTabNext.setMaximumSize(new Dimension(20, 300));
		btnTibReceivingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibReceiving.add(btnTibReceivingTabNext, "cell 5 0 1 12");
		
		btnTibReceivingTab4 = new JButton("4");
		btnTibReceivingTab4.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab4.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab4, "cell 1 1");
		
		btnTibReceivingTab5 = new JButton("5");
		btnTibReceivingTab5.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab5.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab5, "cell 2 1");
		
		btnTibReceivingTab6 = new JButton("6");
		btnTibReceivingTab6.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab6.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab6, "cell 3 1");
		
		btnTibReceivingTab7 = new JButton("7");
		btnTibReceivingTab7.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab7.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab7, "cell 4 1");
		
		btnTibReceivingTab8 = new JButton("8");
		btnTibReceivingTab8.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab8.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab8, "cell 1 2");
		
		btnTibReceivingTab9 = new JButton("9");
		btnTibReceivingTab9.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab9.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab9, "cell 2 2");
		
		btnTibReceivingTab10 = new JButton("10");
		btnTibReceivingTab10.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab10.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab10, "cell 3 2");
		
		btnTibReceivingTab11 = new JButton("11");
		btnTibReceivingTab11.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab11.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab11, "cell 4 2");
		
		btnTibReceivingTab12 = new JButton("12");
		btnTibReceivingTab12.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab12.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab12, "cell 1 3");
		
		btnTibReceivingTab13 = new JButton("13");
		btnTibReceivingTab13.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab13.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab13, "cell 2 3");
		
		btnTibReceivingTab14 = new JButton("14");
		btnTibReceivingTab14.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab14.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab14, "cell 3 3");
		
		btnTibReceivingTab15 = new JButton("15");
		btnTibReceivingTab15.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab15.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab15, "cell 4 3");
		
		btnTibReceivingTab16 = new JButton("16");
		btnTibReceivingTab16.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab16.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab16, "cell 1 4");
		
		btnTibReceivingTab17 = new JButton("17");
		btnTibReceivingTab17.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab17.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab17, "cell 2 4");
		
		btnTibReceivingTab18 = new JButton("18");
		btnTibReceivingTab18.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab18.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab18, "cell 3 4");
		
		btnTibReceivingTab19 = new JButton("19");
		btnTibReceivingTab19.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab19.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab19, "cell 4 4");
		
		btnTibReceivingTab20 = new JButton("20");
		btnTibReceivingTab20.setMaximumSize(new Dimension(90, 23));
		btnTibReceivingTab20.setMinimumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab20, "cell 1 5");
		
		btnTibReceivingTab21 = new JButton("21");
		btnTibReceivingTab21.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab21.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab21, "cell 2 5");
		
		btnTibReceivingTab22 = new JButton("22");
		btnTibReceivingTab22.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab22.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab22, "cell 3 5");
		
		btnTibReceivingTab23 = new JButton("23");
		btnTibReceivingTab23.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab23.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab23, "cell 4 5");
		
		btnTibReceivingTab24 = new JButton("24");
		btnTibReceivingTab24.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab24.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab24, "cell 1 6");
		
		btnTibReceivingTab25 = new JButton("25");
		btnTibReceivingTab25.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab25.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab25, "cell 2 6");
		
		btnTibReceivingTab26 = new JButton("26");
		btnTibReceivingTab26.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab26.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab26, "cell 3 6");
		
		btnTibReceivingTab27 = new JButton("27");
		btnTibReceivingTab27.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab27.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab27, "cell 4 6");
		
		btnTibReceivingTab28 = new JButton("28");
		btnTibReceivingTab28.setMaximumSize(new Dimension(90, 23));
		btnTibReceivingTab28.setMinimumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab28, "cell 1 7");
		
		btnTibReceivingTab29 = new JButton("29");
		btnTibReceivingTab29.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab29.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab29, "cell 2 7");
		
		btnTibReceivingTab30 = new JButton("30");
		btnTibReceivingTab30.setMaximumSize(new Dimension(90, 23));
		btnTibReceivingTab30.setMinimumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab30, "cell 3 7");
		
		btnTibReceivingTab31 = new JButton("31");
		btnTibReceivingTab31.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab31.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab31, "cell 4 7");
		
		btnTibReceivingTab32 = new JButton("32");
		btnTibReceivingTab32.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab32.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab32, "cell 1 8");
		
		btnTibReceivingTab33 = new JButton("33");
		btnTibReceivingTab33.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab33.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab33, "cell 2 8");
		
		btnTibReceivingTab34 = new JButton("34");
		btnTibReceivingTab34.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab34.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab34, "cell 3 8");
		
		btnTibReceivingTab35 = new JButton("35");
		btnTibReceivingTab35.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab35.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab35, "cell 4 8");
		
		btnTibReceivingTab36 = new JButton("36");
		btnTibReceivingTab36.setMaximumSize(new Dimension(90, 23));
		btnTibReceivingTab36.setMinimumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab36, "cell 1 9");
		
		btnTibReceivingTab37 = new JButton("37");
		btnTibReceivingTab37.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab37.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab37, "cell 2 9");
		
		btnTibReceivingTab38 = new JButton("38");
		btnTibReceivingTab38.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab38.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab38, "cell 3 9");
		
		btnTibReceivingTab39 = new JButton("39");
		btnTibReceivingTab39.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab39.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab39, "cell 4 9");
		
		btnTibReceivingTab40 = new JButton("40");
		btnTibReceivingTab40.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab40.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab40, "cell 1 10");
		
		btnTibReceivingTab41 = new JButton("41");
		btnTibReceivingTab41.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab41.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab41, "cell 2 10");
		
		btnTibReceivingTab42 = new JButton("42");
		btnTibReceivingTab42.setMaximumSize(new Dimension(90, 23));
		btnTibReceivingTab42.setMinimumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab42, "cell 3 10");
		
		btnTibReceivingTab43 = new JButton("43");
		btnTibReceivingTab43.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab43.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab43, "cell 4 10");
		
		btnTibReceivingTab44 = new JButton("44");
		btnTibReceivingTab44.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab44.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab44, "cell 1 11");
		
		btnTibReceivingTab45 = new JButton("45");
		btnTibReceivingTab45.setMaximumSize(new Dimension(90, 23));
		btnTibReceivingTab45.setMinimumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab45, "cell 2 11");
		
		btnTibReceivingTab46 = new JButton("46");
		btnTibReceivingTab46.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab46.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab46, "cell 3 11");
		
		btnTibReceivingTab47 = new JButton("47");
		btnTibReceivingTab47.setMinimumSize(new Dimension(90, 23));
		btnTibReceivingTab47.setMaximumSize(new Dimension(90, 23));
		pTibReceiving.add(btnTibReceivingTab47, "cell 4 11");
		
		pTibPickUp = new JPanel();
		tbpTib.addTab("Pick up line", null, pTibPickUp, "");
		pTibPickUp.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnTibPickUpTabBack = new JButton("");
		btnTibPickUpTabBack.setMinimumSize(new Dimension(20, 300));
		btnTibPickUpTabBack.setMaximumSize(new Dimension(20, 300));
		btnTibPickUpTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibPickUp.add(btnTibPickUpTabBack, "cell 0 0 1 12");
		
		btnTibPickUpTab0 = new JButton("0");
		btnTibPickUpTab0.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab0.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab0, "cell 1 0");
		
		btnTibPickUpTab1 = new JButton("1");
		btnTibPickUpTab1.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab1.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab1, "cell 2 0");
		
		btnTibPickUpTab2 = new JButton("2");
		btnTibPickUpTab2.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab2.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab2, "cell 3 0");
		
		btnTibPickUpTab3 = new JButton("3");
		btnTibPickUpTab3.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab3.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab3, "cell 4 0");
		
		btnTibPickUpTabNext = new JButton("");
		btnTibPickUpTabNext.setMinimumSize(new Dimension(20, 300));
		btnTibPickUpTabNext.setMaximumSize(new Dimension(20, 300));
		btnTibPickUpTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibPickUp.add(btnTibPickUpTabNext, "cell 5 0 1 12");
		
		btnTibPickUpTab4 = new JButton("4");
		btnTibPickUpTab4.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab4.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab4, "cell 1 1");
		
		btnTibPickUpTab5 = new JButton("5");
		btnTibPickUpTab5.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab5.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab5, "cell 2 1");
		
		btnTibPickUpTab6 = new JButton("6");
		btnTibPickUpTab6.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab6.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab6, "cell 3 1");
		
		btnTibPickUpTab7 = new JButton("7");
		btnTibPickUpTab7.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab7.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab7, "cell 4 1");
		
		btnTibPickUpTab8 = new JButton("8");
		btnTibPickUpTab8.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab8.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab8, "cell 1 2");
		
		btnTibPickUpTab9 = new JButton("9");
		btnTibPickUpTab9.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab9.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab9, "cell 2 2");
		
		btnTibPickUpTab10 = new JButton("10");
		btnTibPickUpTab10.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab10.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab10, "cell 3 2");
		
		btnTibPickUpTab11 = new JButton("11");
		btnTibPickUpTab11.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab11.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab11, "cell 4 2");
		
		btnTibPickUpTab12 = new JButton("12");
		btnTibPickUpTab12.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab12.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab12, "cell 1 3");
		
		btnTibPickUpTab13 = new JButton("13");
		btnTibPickUpTab13.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab13.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab13, "cell 2 3");
		
		btnTibPickUpTab14 = new JButton("14");
		btnTibPickUpTab14.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab14.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab14, "cell 3 3");
		
		btnTibPickUpTab15 = new JButton("15");
		btnTibPickUpTab15.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab15.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab15, "cell 4 3");
		
		btnTibPickUpTab16 = new JButton("16");
		btnTibPickUpTab16.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab16.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab16, "cell 1 4");
		
		btnTibPickUpTab17 = new JButton("17");
		btnTibPickUpTab17.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab17.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab17, "cell 2 4");
		
		btnTibPickUpTab18 = new JButton("18");
		btnTibPickUpTab18.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab18.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab18, "cell 3 4");
		
		btnTibPickUpTab19 = new JButton("19");
		btnTibPickUpTab19.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab19.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab19, "cell 4 4");
		
		btnTibPickUpTab20 = new JButton("20");
		btnTibPickUpTab20.setMaximumSize(new Dimension(90, 23));
		btnTibPickUpTab20.setMinimumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab20, "cell 1 5");
		
		btnTibPickUpTab21 = new JButton("21");
		btnTibPickUpTab21.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab21.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab21, "cell 2 5");
		
		btnTibPickUpTab22 = new JButton("22");
		btnTibPickUpTab22.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab22.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab22, "cell 3 5");
		
		btnTibPickUpTab23 = new JButton("23");
		btnTibPickUpTab23.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab23.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab23, "cell 4 5");
		
		btnTibPickUpTab24 = new JButton("24");
		btnTibPickUpTab24.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab24.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab24, "cell 1 6");
		
		btnTibPickUpTab25 = new JButton("25");
		btnTibPickUpTab25.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab25.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab25, "cell 2 6");
		
		btnTibPickUpTab26 = new JButton("26");
		btnTibPickUpTab26.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab26.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab26, "cell 3 6");
		
		btnTibPickUpTab27 = new JButton("27");
		btnTibPickUpTab27.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab27.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab27, "cell 4 6");
		
		btnTibPickUpTab28 = new JButton("28");
		btnTibPickUpTab28.setMaximumSize(new Dimension(90, 23));
		btnTibPickUpTab28.setMinimumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab28, "cell 1 7");
		
		btnTibPickUpTab29 = new JButton("29");
		btnTibPickUpTab29.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab29.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab29, "cell 2 7");
		
		btnTibPickUpTab30 = new JButton("30");
		btnTibPickUpTab30.setMaximumSize(new Dimension(90, 23));
		btnTibPickUpTab30.setMinimumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab30, "cell 3 7");
		
		btnTibPickUpTab31 = new JButton("31");
		btnTibPickUpTab31.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab31.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab31, "cell 4 7");
		
		btnTibPickUpTab32 = new JButton("32");
		btnTibPickUpTab32.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab32.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab32, "cell 1 8");
		
		btnTibPickUpTab33 = new JButton("33");
		btnTibPickUpTab33.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab33.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab33, "cell 2 8");
		
		btnTibPickUpTab34 = new JButton("34");
		btnTibPickUpTab34.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab34.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab34, "cell 3 8");
		
		btnTibPickUpTab35 = new JButton("35");
		btnTibPickUpTab35.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab35.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab35, "cell 4 8");
		
		btnTibPickUpTab36 = new JButton("36");
		btnTibPickUpTab36.setMaximumSize(new Dimension(90, 23));
		btnTibPickUpTab36.setMinimumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab36, "cell 1 9");
		
		btnTibPickUpTab37 = new JButton("37");
		btnTibPickUpTab37.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab37.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab37, "cell 2 9");
		
		btnTibPickUpTab38 = new JButton("38");
		btnTibPickUpTab38.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab38.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab38, "cell 3 9");
		
		btnTibPickUpTab39 = new JButton("39");
		btnTibPickUpTab39.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab39.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab39, "cell 4 9");
		
		btnTibPickUpTab40 = new JButton("40");
		btnTibPickUpTab40.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab40.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab40, "cell 1 10");
		
		btnTibPickUpTab41 = new JButton("41");
		btnTibPickUpTab41.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab41.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab41, "cell 2 10");
		
		btnTibPickUpTab42 = new JButton("42");
		btnTibPickUpTab42.setMaximumSize(new Dimension(90, 23));
		btnTibPickUpTab42.setMinimumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab42, "cell 3 10");
		
		btnTibPickUpTab43 = new JButton("43");
		btnTibPickUpTab43.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab43.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab43, "cell 4 10");
		
		btnTibPickUpTab44 = new JButton("44");
		btnTibPickUpTab44.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab44.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab44, "cell 1 11");
		
		btnTibPickUpTab45 = new JButton("45");
		btnTibPickUpTab45.setMaximumSize(new Dimension(90, 23));
		btnTibPickUpTab45.setMinimumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab45, "cell 2 11");
		
		btnTibPickUpTab46 = new JButton("46");
		btnTibPickUpTab46.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab46.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab46, "cell 3 11");
		
		btnTibPickUpTab47 = new JButton("47");
		btnTibPickUpTab47.setMinimumSize(new Dimension(90, 23));
		btnTibPickUpTab47.setMaximumSize(new Dimension(90, 23));
		pTibPickUp.add(btnTibPickUpTab47, "cell 4 11");
		
		pTibWaitToSend = new JPanel();
		tbpTib.addTab("Wait To Send", null, pTibWaitToSend, null);
		pTibWaitToSend.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnTibWaitToSendTabBack = new JButton("");
		btnTibWaitToSendTabBack.setMinimumSize(new Dimension(20, 300));
		btnTibWaitToSendTabBack.setMaximumSize(new Dimension(20, 300));
		btnTibWaitToSendTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTibWaitToSend.add(btnTibWaitToSendTabBack, "cell 0 0 1 12");
		
		btnTibWaitToSendTab0 = new JButton("0");
		btnTibWaitToSendTab0.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab0.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab0, "cell 1 0");
		
		btnTibWaitToSendTab1 = new JButton("1");
		btnTibWaitToSendTab1.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab1.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab1, "cell 2 0");
		
		btnTibWaitToSendTab2 = new JButton("2");
		btnTibWaitToSendTab2.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab2.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab2, "cell 3 0");
		
		btnTibWaitToSendTab3 = new JButton("3");
		btnTibWaitToSendTab3.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab3.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab3, "cell 4 0");
		
		btnTibWaitToSendTabNext = new JButton("");
		btnTibWaitToSendTabNext.setMinimumSize(new Dimension(20, 300));
		btnTibWaitToSendTabNext.setMaximumSize(new Dimension(20, 300));
		btnTibWaitToSendTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTibWaitToSend.add(btnTibWaitToSendTabNext, "cell 5 0 1 12");
		
		btnTibWaitToSendTab4 = new JButton("4");
		btnTibWaitToSendTab4.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab4.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab4, "cell 1 1");
		
		btnTibWaitToSendTab5 = new JButton("5");
		btnTibWaitToSendTab5.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab5.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab5, "cell 2 1");
		
		btnTibWaitToSendTab6 = new JButton("6");
		btnTibWaitToSendTab6.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab6.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab6, "cell 3 1");
		
		btnTibWaitToSendTab7 = new JButton("7");
		btnTibWaitToSendTab7.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab7.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab7, "cell 4 1");
		
		btnTibWaitToSendTab8 = new JButton("8");
		btnTibWaitToSendTab8.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab8.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab8, "cell 1 2");
		
		btnTibWaitToSendTab9 = new JButton("9");
		btnTibWaitToSendTab9.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab9.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab9, "cell 2 2");
		
		btnTibWaitToSendTab10 = new JButton("10");
		btnTibWaitToSendTab10.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab10.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab10, "cell 3 2");
		
		btnTibWaitToSendTab11 = new JButton("11");
		btnTibWaitToSendTab11.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab11.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab11, "cell 4 2");
		
		btnTibWaitToSendTab12 = new JButton("12");
		btnTibWaitToSendTab12.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab12.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab12, "cell 1 3");
		
		btnTibWaitToSendTab13 = new JButton("13");
		btnTibWaitToSendTab13.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab13.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab13, "cell 2 3");
		
		btnTibWaitToSendTab14 = new JButton("14");
		btnTibWaitToSendTab14.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab14.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab14, "cell 3 3");
		
		btnTibWaitToSendTab15 = new JButton("15");
		btnTibWaitToSendTab15.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab15.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab15, "cell 4 3");
		
		btnTibWaitToSendTab16 = new JButton("16");
		btnTibWaitToSendTab16.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab16.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab16, "cell 1 4");
		
		btnTibWaitToSendTab17 = new JButton("17");
		btnTibWaitToSendTab17.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab17.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab17, "cell 2 4");
		
		btnTibWaitToSendTab18 = new JButton("18");
		btnTibWaitToSendTab18.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab18.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab18, "cell 3 4");
		
		btnTibWaitToSendTab19 = new JButton("19");
		btnTibWaitToSendTab19.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab19.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab19, "cell 4 4");
		
		btnTibWaitToSendTab20 = new JButton("20");
		btnTibWaitToSendTab20.setMaximumSize(new Dimension(90, 23));
		btnTibWaitToSendTab20.setMinimumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab20, "cell 1 5");
		
		btnTibWaitToSendTab21 = new JButton("21");
		btnTibWaitToSendTab21.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab21.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab21, "cell 2 5");
		
		btnTibWaitToSendTab22 = new JButton("22");
		btnTibWaitToSendTab22.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab22.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab22, "cell 3 5");
		
		btnTibWaitToSendTab23 = new JButton("23");
		btnTibWaitToSendTab23.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab23.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab23, "cell 4 5");
		
		btnTibWaitToSendTab24 = new JButton("24");
		btnTibWaitToSendTab24.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab24.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab24, "cell 1 6");
		
		btnTibWaitToSendTab25 = new JButton("25");
		btnTibWaitToSendTab25.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab25.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab25, "cell 2 6");
		
		btnTibWaitToSendTab26 = new JButton("26");
		btnTibWaitToSendTab26.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab26.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab26, "cell 3 6");
		
		btnTibWaitToSendTab27 = new JButton("27");
		btnTibWaitToSendTab27.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab27.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab27, "cell 4 6");
		
		btnTibWaitToSendTab28 = new JButton("28");
		btnTibWaitToSendTab28.setMaximumSize(new Dimension(90, 23));
		btnTibWaitToSendTab28.setMinimumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab28, "cell 1 7");
		
		btnTibWaitToSendTab29 = new JButton("29");
		btnTibWaitToSendTab29.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab29.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab29, "cell 2 7");
		
		btnTibWaitToSendTab30 = new JButton("30");
		btnTibWaitToSendTab30.setMaximumSize(new Dimension(90, 23));
		btnTibWaitToSendTab30.setMinimumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab30, "cell 3 7");
		
		btnTibWaitToSendTab31 = new JButton("31");
		btnTibWaitToSendTab31.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab31.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab31, "cell 4 7");
		
		btnTibWaitToSendTab32 = new JButton("32");
		btnTibWaitToSendTab32.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab32.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab32, "cell 1 8");
		
		btnTibWaitToSendTab33 = new JButton("33");
		btnTibWaitToSendTab33.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab33.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab33, "cell 2 8");
		
		btnTibWaitToSendTab34 = new JButton("34");
		btnTibWaitToSendTab34.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab34.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab34, "cell 3 8");
		
		btnTibWaitToSendTab35 = new JButton("35");
		btnTibWaitToSendTab35.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab35.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab35, "cell 4 8");
		
		btnTibWaitToSendTab36 = new JButton("36");
		btnTibWaitToSendTab36.setMaximumSize(new Dimension(90, 23));
		btnTibWaitToSendTab36.setMinimumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab36, "cell 1 9");
		
		btnTibWaitToSendTab37 = new JButton("37");
		btnTibWaitToSendTab37.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab37.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab37, "cell 2 9");
		
		btnTibWaitToSendTab38 = new JButton("38");
		btnTibWaitToSendTab38.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab38.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab38, "cell 3 9");
		
		btnTibWaitToSendTab39 = new JButton("39");
		btnTibWaitToSendTab39.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab39.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab39, "cell 4 9");
		
		btnTibWaitToSendTab40 = new JButton("40");
		btnTibWaitToSendTab40.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab40.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab40, "cell 1 10");
		
		btnTibWaitToSendTab41 = new JButton("41");
		btnTibWaitToSendTab41.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab41.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab41, "cell 2 10");
		
		btnTibWaitToSendTab42 = new JButton("42");
		btnTibWaitToSendTab42.setMaximumSize(new Dimension(90, 23));
		btnTibWaitToSendTab42.setMinimumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab42, "cell 3 10");
		
		btnTibWaitToSendTab43 = new JButton("43");
		btnTibWaitToSendTab43.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab43.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab43, "cell 4 10");
		
		btnTibWaitToSendTab44 = new JButton("44");
		btnTibWaitToSendTab44.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab44.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab44, "cell 1 11");
		
		btnTibWaitToSendTab45 = new JButton("45");
		btnTibWaitToSendTab45.setMaximumSize(new Dimension(90, 23));
		btnTibWaitToSendTab45.setMinimumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab45, "cell 2 11");
		
		btnTibWaitToSendTab46 = new JButton("46");
		btnTibWaitToSendTab46.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab46.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab46, "cell 3 11");
		
		btnTibWaitToSendTab47 = new JButton("47");
		btnTibWaitToSendTab47.setMinimumSize(new Dimension(90, 23));
		btnTibWaitToSendTab47.setMaximumSize(new Dimension(90, 23));
		pTibWaitToSend.add(btnTibWaitToSendTab47, "cell 4 11");
	}
	
	private void initiateJerPanel() {
		pJerOverall = new JPanel();
		tbpJer.addTab("Overall", null, pJerOverall, null);
		pJerOverall.setLayout(new MigLayout("", "[right][][][][][]", "[][][][][][][][][][][][]"));
		
		JLabel lblJerSending = new JLabel("Sending:");
		lblJerSending.setHorizontalAlignment(SwingConstants.LEFT);
		lblJerSending.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pJerOverall.add(lblJerSending, "cell 0 0 1 2");
		
		btnJerSendingBack = new JButton("");
		btnJerSendingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJerSendingBack.setMinimumSize(new Dimension(20, 48));
		btnJerSendingBack.setMaximumSize(new Dimension(20, 48));
		btnJerSendingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerOverall.add(btnJerSendingBack, "cell 1 0 1 2");
		
		btnJerSending0 = new JButton("0");
		btnJerSending0.setMinimumSize(new Dimension(90, 23));
		btnJerSending0.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerSending0, "cell 2 0");
		
		btnJerSending1 = new JButton("1");
		btnJerSending1.setMinimumSize(new Dimension(90, 23));
		btnJerSending1.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerSending1, "cell 3 0");
		
		btnJerSending2 = new JButton("2");
		btnJerSending2.setMinimumSize(new Dimension(90, 23));
		btnJerSending2.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerSending2, "cell 4 0");
		
		btnJerSendingNext = new JButton("");
		btnJerSendingNext.setMinimumSize(new Dimension(20, 48));
		btnJerSendingNext.setMaximumSize(new Dimension(20, 48));
		btnJerSendingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerOverall.add(btnJerSendingNext, "cell 5 0 1 2");
		
		btnJerSending3 = new JButton("3");
		btnJerSending3.setMinimumSize(new Dimension(90, 23));
		btnJerSending3.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerSending3, "cell 2 1");
		
		btnJerSending4 = new JButton("4");
		btnJerSending4.setMinimumSize(new Dimension(90, 23));
		btnJerSending4.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerSending4, "cell 3 1");
		
		btnJerSending5 = new JButton("5");
		btnJerSending5.setMinimumSize(new Dimension(90, 23));
		btnJerSending5.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerSending5, "cell 4 1");
		
		JLabel lblJerReceiving = new JLabel("Receiving:");
		lblJerReceiving.setHorizontalAlignment(SwingConstants.LEFT);
		lblJerReceiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pJerOverall.add(lblJerReceiving, "cell 0 2 1 2");
		
		btnJerReceivingBack = new JButton("");
		btnJerReceivingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJerReceivingBack.setMinimumSize(new Dimension(20, 48));
		btnJerReceivingBack.setMaximumSize(new Dimension(20, 48));
		btnJerReceivingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerOverall.add(btnJerReceivingBack, "cell 1 2 1 2");
		
		btnJerReceiving0 = new JButton("0");
		btnJerReceiving0.setMinimumSize(new Dimension(90, 23));
		btnJerReceiving0.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerReceiving0, "cell 2 2");
		
		btnJerReceiving1 = new JButton("1");
		btnJerReceiving1.setMinimumSize(new Dimension(90, 23));
		btnJerReceiving1.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerReceiving1, "cell 3 2");
		
		btnJerReceiving2 = new JButton("2");
		btnJerReceiving2.setMinimumSize(new Dimension(90, 23));
		btnJerReceiving2.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerReceiving2, "cell 4 2");
		
		btnJerReceivingNext = new JButton("");
		btnJerReceivingNext.setMinimumSize(new Dimension(20, 48));
		btnJerReceivingNext.setMaximumSize(new Dimension(20, 48));
		btnJerReceivingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerOverall.add(btnJerReceivingNext, "cell 5 2 1 2");
		
		btnJerReceiving3 = new JButton("3");
		btnJerReceiving3.setMinimumSize(new Dimension(90, 23));
		btnJerReceiving3.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerReceiving3, "cell 2 3");
		
		btnJerReceiving4 = new JButton("4");
		btnJerReceiving4.setMinimumSize(new Dimension(90, 23));
		btnJerReceiving4.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerReceiving4, "cell 3 3");
		
		btnJerReceiving5 = new JButton("5");
		btnJerReceiving5.setMinimumSize(new Dimension(90, 23));
		btnJerReceiving5.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerReceiving5, "cell 4 3");
		
		JLabel lblJerPickUp = new JLabel("Pick Up:");
		lblJerPickUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblJerPickUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJerPickUp.setToolTipText("Pick Up Line");
		pJerOverall.add(lblJerPickUp, "cell 0 4 1 2");
		
		btnJerPickUpBack = new JButton("");
		btnJerPickUpBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJerPickUpBack.setMinimumSize(new Dimension(20, 48));
		btnJerPickUpBack.setMaximumSize(new Dimension(20, 48));
		btnJerPickUpBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerOverall.add(btnJerPickUpBack, "cell 1 4 1 2");
		
		btnJerPickUp0 = new JButton("0");
		btnJerPickUp0.setMinimumSize(new Dimension(90, 23));
		btnJerPickUp0.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerPickUp0, "cell 2 4");
		
		btnJerPickUp1 = new JButton("1");
		btnJerPickUp1.setMinimumSize(new Dimension(90, 23));
		btnJerPickUp1.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerPickUp1, "cell 3 4");
		
		btnJerPickUp2 = new JButton("2");
		btnJerPickUp2.setMinimumSize(new Dimension(90, 23));
		btnJerPickUp2.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerPickUp2, "cell 4 4");
		
		btnJerPickUpNext = new JButton("");
		btnJerPickUpNext.setMinimumSize(new Dimension(20, 48));
		btnJerPickUpNext.setMaximumSize(new Dimension(20, 48));
		btnJerPickUpNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerOverall.add(btnJerPickUpNext, "cell 5 4 1 2");
		
		btnJerPickUp3 = new JButton("3");
		btnJerPickUp3.setMinimumSize(new Dimension(90, 23));
		btnJerPickUp3.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerPickUp3, "cell 2 5");
		
		btnJerPickUp4 = new JButton("4");
		btnJerPickUp4.setMinimumSize(new Dimension(90, 23));
		btnJerPickUp4.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerPickUp4, "cell 3 5");
		
		btnJerPickUp5 = new JButton("5");
		btnJerPickUp5.setMinimumSize(new Dimension(90, 23));
		btnJerPickUp5.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerPickUp5, "cell 4 5");
		
		JLabel lblJerWaitingToSend = new JLabel("Waiting To Send:");
		lblJerWaitingToSend.setHorizontalAlignment(SwingConstants.LEFT);
		lblJerWaitingToSend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pJerOverall.add(lblJerWaitingToSend, "cell 0 6 1 2");
		
		btnJerWaitingToSendBack = new JButton("");
		btnJerWaitingToSendBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJerWaitingToSendBack.setMinimumSize(new Dimension(20, 48));
		btnJerWaitingToSendBack.setMaximumSize(new Dimension(20, 48));
		btnJerWaitingToSendBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerOverall.add(btnJerWaitingToSendBack, "cell 1 6 1 2");
		
		btnJerWaitingToSend0 = new JButton("0");
		btnJerWaitingToSend0.setMinimumSize(new Dimension(90, 23));
		btnJerWaitingToSend0.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerWaitingToSend0, "cell 2 6");
		
		btnJerWaitingToSend1 = new JButton("1");
		btnJerWaitingToSend1.setMinimumSize(new Dimension(90, 23));
		btnJerWaitingToSend1.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerWaitingToSend1, "cell 3 6");
		
		btnJerWaitingToSend2 = new JButton("2");
		btnJerWaitingToSend2.setMinimumSize(new Dimension(90, 23));
		btnJerWaitingToSend2.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerWaitingToSend2, "cell 4 6");
		
		btnJerWaitingToSendNext = new JButton("");
		btnJerWaitingToSendNext.setMinimumSize(new Dimension(20, 48));
		btnJerWaitingToSendNext.setMaximumSize(new Dimension(20, 48));
		btnJerWaitingToSendNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerOverall.add(btnJerWaitingToSendNext, "cell 5 6 1 2");
		
		btnJerWaitingToSend3 = new JButton("3");
		btnJerWaitingToSend3.setMinimumSize(new Dimension(90, 23));
		btnJerWaitingToSend3.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerWaitingToSend3, "cell 2 7");
		
		btnJerWaitingToSend4 = new JButton("4");
		btnJerWaitingToSend4.setMinimumSize(new Dimension(90, 23));
		btnJerWaitingToSend4.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerWaitingToSend4, "cell 3 7");
		
		btnJerWaitingToSend5 = new JButton("5");
		btnJerWaitingToSend5.setMinimumSize(new Dimension(90, 23));
		btnJerWaitingToSend5.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerWaitingToSend5, "cell 4 7");
		
		JLabel lblJerQSenders = new JLabel("Q. Senders:");
		lblJerQSenders.setToolTipText("Queue Senders");
		lblJerQSenders.setHorizontalAlignment(SwingConstants.LEFT);
		lblJerQSenders.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pJerOverall.add(lblJerQSenders, "cell 0 8 1 2");
		
		btnJerQSendersBack = new JButton("");
		btnJerQSendersBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJerQSendersBack.setMinimumSize(new Dimension(20, 48));
		btnJerQSendersBack.setMaximumSize(new Dimension(20, 48));
		btnJerQSendersBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerOverall.add(btnJerQSendersBack, "cell 1 8 1 2");
		
		btnJerQSenders0 = new JButton("0");
		btnJerQSenders0.setMinimumSize(new Dimension(90, 23));
		btnJerQSenders0.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQSenders0, "cell 2 8");
		
		btnJerQSenders1 = new JButton("1");
		btnJerQSenders1.setMinimumSize(new Dimension(90, 23));
		btnJerQSenders1.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQSenders1, "cell 3 8");
		
		btnJerQSenders2 = new JButton("2");
		btnJerQSenders2.setMinimumSize(new Dimension(90, 23));
		btnJerQSenders2.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQSenders2, "cell 4 8");
		
		btnJerQSendersNext = new JButton("");
		btnJerQSendersNext.setMinimumSize(new Dimension(20, 48));
		btnJerQSendersNext.setMaximumSize(new Dimension(20, 48));
		btnJerQSendersNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerOverall.add(btnJerQSendersNext, "cell 5 8 1 2");
		
		btnJerQSenders3 = new JButton("3");
		btnJerQSenders3.setMinimumSize(new Dimension(90, 23));
		btnJerQSenders3.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQSenders3, "cell 2 9 2 1,alignx center");
		
		btnJerQSenders4 = new JButton("4");
		btnJerQSenders4.setMinimumSize(new Dimension(90, 23));
		btnJerQSenders4.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQSenders4, "cell 3 9 2 1,alignx center");
		
		JLabel lblJerQReceivers = new JLabel("Q. Receivers:");
		lblJerQReceivers.setToolTipText("Queue Receivers");
		lblJerQReceivers.setHorizontalAlignment(SwingConstants.LEFT);
		lblJerQReceivers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pJerOverall.add(lblJerQReceivers, "cell 0 10 1 2");
		
		btnJerQReceiversBack = new JButton("");
		btnJerQReceiversBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJerQReceiversBack.setMinimumSize(new Dimension(20, 48));
		btnJerQReceiversBack.setMaximumSize(new Dimension(20, 48));
		btnJerQReceiversBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerOverall.add(btnJerQReceiversBack, "cell 1 10 1 2");
		
		btnJerQReceivers0 = new JButton("0");
		btnJerQReceivers0.setMinimumSize(new Dimension(90, 23));
		btnJerQReceivers0.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQReceivers0, "cell 2 10");
		
		btnJerQReceivers1 = new JButton("1");
		btnJerQReceivers1.setMinimumSize(new Dimension(90, 23));
		btnJerQReceivers1.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQReceivers1, "cell 3 10");
		
		btnJerQReceivers2 = new JButton("2");
		btnJerQReceivers2.setMinimumSize(new Dimension(90, 23));
		btnJerQReceivers2.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQReceivers2, "cell 4 10");
		
		btnJerQReceiversNext = new JButton("");
		btnJerQReceiversNext.setMinimumSize(new Dimension(20, 48));
		btnJerQReceiversNext.setMaximumSize(new Dimension(20, 48));
		btnJerQReceiversNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerOverall.add(btnJerQReceiversNext, "cell 5 10 1 2");
		
		btnJerQReceivers3 = new JButton("3");
		btnJerQReceivers3.setMinimumSize(new Dimension(90, 23));
		btnJerQReceivers3.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQReceivers3, "cell 2 11 2 1,alignx center");
		
		btnJerQReceivers4 = new JButton("4");
		btnJerQReceivers4.setMinimumSize(new Dimension(90, 23));
		btnJerQReceivers4.setMaximumSize(new Dimension(90, 23));
		pJerOverall.add(btnJerQReceivers4, "cell 3 11 2 1,alignx center");
		
		pJerSending = new JPanel();
		tbpJer.addTab("Sending", null, pJerSending, null);
		pJerSending.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnJerSendingTabBack = new JButton("");
		btnJerSendingTabBack.setMinimumSize(new Dimension(20, 300));
		btnJerSendingTabBack.setMaximumSize(new Dimension(20, 300));
		btnJerSendingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerSending.add(btnJerSendingTabBack, "cell 0 0 1 12");
		
		btnJerSendingTab0 = new JButton("0");
		btnJerSendingTab0.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab0.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab0, "cell 1 0");
		
		btnJerSendingTab1 = new JButton("1");
		btnJerSendingTab1.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab1.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab1, "cell 2 0");
		
		btnJerSendingTab2 = new JButton("2");
		btnJerSendingTab2.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab2.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab2, "cell 3 0");
		
		btnJerSendingTab3 = new JButton("3");
		btnJerSendingTab3.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab3.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab3, "cell 4 0");
		
		btnJerSendingTabNext = new JButton("");
		btnJerSendingTabNext.setMinimumSize(new Dimension(20, 300));
		btnJerSendingTabNext.setMaximumSize(new Dimension(20, 300));
		btnJerSendingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerSending.add(btnJerSendingTabNext, "cell 5 0 1 12");
		
		btnJerSendingTab4 = new JButton("4");
		btnJerSendingTab4.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab4.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab4, "cell 1 1");
		
		btnJerSendingTab5 = new JButton("5");
		btnJerSendingTab5.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab5.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab5, "cell 2 1");
		
		btnJerSendingTab6 = new JButton("6");
		btnJerSendingTab6.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab6.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab6, "cell 3 1");
		
		btnJerSendingTab7 = new JButton("7");
		btnJerSendingTab7.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab7.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab7, "cell 4 1");
		
		btnJerSendingTab8 = new JButton("8");
		btnJerSendingTab8.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab8.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab8, "cell 1 2");
		
		btnJerSendingTab9 = new JButton("9");
		btnJerSendingTab9.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab9.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab9, "cell 2 2");
		
		btnJerSendingTab10 = new JButton("10");
		btnJerSendingTab10.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab10.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab10, "cell 3 2");
		
		btnJerSendingTab11 = new JButton("11");
		btnJerSendingTab11.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab11.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab11, "cell 4 2");
		
		btnJerSendingTab12 = new JButton("12");
		btnJerSendingTab12.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab12.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab12, "cell 1 3");
		
		btnJerSendingTab13 = new JButton("13");
		btnJerSendingTab13.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab13.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab13, "cell 2 3");
		
		btnJerSendingTab14 = new JButton("14");
		btnJerSendingTab14.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab14.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab14, "cell 3 3");
		
		btnJerSendingTab15 = new JButton("15");
		btnJerSendingTab15.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab15.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab15, "cell 4 3");
		
		btnJerSendingTab16 = new JButton("16");
		btnJerSendingTab16.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab16.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab16, "cell 1 4");
		
		btnJerSendingTab17 = new JButton("17");
		btnJerSendingTab17.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab17.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab17, "cell 2 4");
		
		btnJerSendingTab18 = new JButton("18");
		btnJerSendingTab18.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab18.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab18, "cell 3 4");
		
		btnJerSendingTab19 = new JButton("19");
		btnJerSendingTab19.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab19.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab19, "cell 4 4");
		
		btnJerSendingTab20 = new JButton("20");
		btnJerSendingTab20.setMaximumSize(new Dimension(90, 23));
		btnJerSendingTab20.setMinimumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab20, "cell 1 5");
		
		btnJerSendingTab21 = new JButton("21");
		btnJerSendingTab21.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab21.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab21, "cell 2 5");
		
		btnJerSendingTab22 = new JButton("22");
		btnJerSendingTab22.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab22.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab22, "cell 3 5");
		
		btnJerSendingTab23 = new JButton("23");
		btnJerSendingTab23.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab23.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab23, "cell 4 5");
		
		btnJerSendingTab24 = new JButton("24");
		btnJerSendingTab24.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab24.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab24, "cell 1 6");
		
		btnJerSendingTab25 = new JButton("25");
		btnJerSendingTab25.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab25.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab25, "cell 2 6");
		
		btnJerSendingTab26 = new JButton("26");
		btnJerSendingTab26.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab26.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab26, "cell 3 6");
		
		btnJerSendingTab27 = new JButton("27");
		btnJerSendingTab27.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab27.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab27, "cell 4 6");
		
		btnJerSendingTab28 = new JButton("28");
		btnJerSendingTab28.setMaximumSize(new Dimension(90, 23));
		btnJerSendingTab28.setMinimumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab28, "cell 1 7");
		
		btnJerSendingTab29 = new JButton("29");
		btnJerSendingTab29.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab29.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab29, "cell 2 7");
		
		btnJerSendingTab30 = new JButton("30");
		btnJerSendingTab30.setMaximumSize(new Dimension(90, 23));
		btnJerSendingTab30.setMinimumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab30, "cell 3 7");
		
		btnJerSendingTab31 = new JButton("31");
		btnJerSendingTab31.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab31.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab31, "cell 4 7");
		
		btnJerSendingTab32 = new JButton("32");
		btnJerSendingTab32.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab32.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab32, "cell 1 8");
		
		btnJerSendingTab33 = new JButton("33");
		btnJerSendingTab33.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab33.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab33, "cell 2 8");
		
		btnJerSendingTab34 = new JButton("34");
		btnJerSendingTab34.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab34.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab34, "cell 3 8");
		
		btnJerSendingTab35 = new JButton("35");
		btnJerSendingTab35.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab35.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab35, "cell 4 8");
		
		btnJerSendingTab36 = new JButton("36");
		btnJerSendingTab36.setMaximumSize(new Dimension(90, 23));
		btnJerSendingTab36.setMinimumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab36, "cell 1 9");
		
		btnJerSendingTab37 = new JButton("37");
		btnJerSendingTab37.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab37.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab37, "cell 2 9");
		
		btnJerSendingTab38 = new JButton("38");
		btnJerSendingTab38.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab38.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab38, "cell 3 9");
		
		btnJerSendingTab39 = new JButton("39");
		btnJerSendingTab39.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab39.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab39, "cell 4 9");
		
		btnJerSendingTab40 = new JButton("40");
		btnJerSendingTab40.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab40.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab40, "cell 1 10");
		
		btnJerSendingTab41 = new JButton("41");
		btnJerSendingTab41.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab41.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab41, "cell 2 10");
		
		btnJerSendingTab42 = new JButton("42");
		btnJerSendingTab42.setMaximumSize(new Dimension(90, 23));
		btnJerSendingTab42.setMinimumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab42, "cell 3 10");
		
		btnJerSendingTab43 = new JButton("43");
		btnJerSendingTab43.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab43.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab43, "cell 4 10");
		
		btnJerSendingTab44 = new JButton("44");
		btnJerSendingTab44.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab44.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab44, "cell 1 11");
		
		btnJerSendingTab45 = new JButton("45");
		btnJerSendingTab45.setMaximumSize(new Dimension(90, 23));
		btnJerSendingTab45.setMinimumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab45, "cell 2 11");
		
		btnJerSendingTab46 = new JButton("46");
		btnJerSendingTab46.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab46.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab46, "cell 3 11");
		
		btnJerSendingTab47 = new JButton("47");
		btnJerSendingTab47.setMinimumSize(new Dimension(90, 23));
		btnJerSendingTab47.setMaximumSize(new Dimension(90, 23));
		pJerSending.add(btnJerSendingTab47, "cell 4 11");
		
		pJerReceiving = new JPanel();
		tbpJer.addTab("Receiving", null, pJerReceiving, null);
		pJerReceiving.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnJerReceivingTabBack = new JButton("");
		btnJerReceivingTabBack.setMinimumSize(new Dimension(20, 300));
		btnJerReceivingTabBack.setMaximumSize(new Dimension(20, 300));
		btnJerReceivingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerReceiving.add(btnJerReceivingTabBack, "cell 0 0 1 12");
		
		btnJerReceivingTab0 = new JButton("0");
		btnJerReceivingTab0.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab0.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab0, "cell 1 0");
		
		btnJerReceivingTab1 = new JButton("1");
		btnJerReceivingTab1.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab1.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab1, "cell 2 0");
		
		btnJerReceivingTab2 = new JButton("2");
		btnJerReceivingTab2.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab2.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab2, "cell 3 0");
		
		btnJerReceivingTab3 = new JButton("3");
		btnJerReceivingTab3.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab3.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab3, "cell 4 0");
		
		btnJerReceivingTabNext = new JButton("");
		btnJerReceivingTabNext.setMinimumSize(new Dimension(20, 300));
		btnJerReceivingTabNext.setMaximumSize(new Dimension(20, 300));
		btnJerReceivingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerReceiving.add(btnJerReceivingTabNext, "cell 5 0 1 12");
		
		btnJerReceivingTab4 = new JButton("4");
		btnJerReceivingTab4.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab4.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab4, "cell 1 1");
		
		btnJerReceivingTab5 = new JButton("5");
		btnJerReceivingTab5.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab5.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab5, "cell 2 1");
		
		btnJerReceivingTab6 = new JButton("6");
		btnJerReceivingTab6.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab6.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab6, "cell 3 1");
		
		btnJerReceivingTab7 = new JButton("7");
		btnJerReceivingTab7.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab7.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab7, "cell 4 1");
		
		btnJerReceivingTab8 = new JButton("8");
		btnJerReceivingTab8.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab8.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab8, "cell 1 2");
		
		btnJerReceivingTab9 = new JButton("9");
		btnJerReceivingTab9.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab9.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab9, "cell 2 2");
		
		btnJerReceivingTab10 = new JButton("10");
		btnJerReceivingTab10.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab10.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab10, "cell 3 2");
		
		btnJerReceivingTab11 = new JButton("11");
		btnJerReceivingTab11.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab11.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab11, "cell 4 2");
		
		btnJerReceivingTab12 = new JButton("12");
		btnJerReceivingTab12.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab12.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab12, "cell 1 3");
		
		btnJerReceivingTab13 = new JButton("13");
		btnJerReceivingTab13.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab13.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab13, "cell 2 3");
		
		btnJerReceivingTab14 = new JButton("14");
		btnJerReceivingTab14.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab14.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab14, "cell 3 3");
		
		btnJerReceivingTab15 = new JButton("15");
		btnJerReceivingTab15.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab15.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab15, "cell 4 3");
		
		btnJerReceivingTab16 = new JButton("16");
		btnJerReceivingTab16.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab16.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab16, "cell 1 4");
		
		btnJerReceivingTab17 = new JButton("17");
		btnJerReceivingTab17.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab17.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab17, "cell 2 4");
		
		btnJerReceivingTab18 = new JButton("18");
		btnJerReceivingTab18.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab18.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab18, "cell 3 4");
		
		btnJerReceivingTab19 = new JButton("19");
		btnJerReceivingTab19.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab19.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab19, "cell 4 4");
		
		btnJerReceivingTab20 = new JButton("20");
		btnJerReceivingTab20.setMaximumSize(new Dimension(90, 23));
		btnJerReceivingTab20.setMinimumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab20, "cell 1 5");
		
		btnJerReceivingTab21 = new JButton("21");
		btnJerReceivingTab21.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab21.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab21, "cell 2 5");
		
		btnJerReceivingTab22 = new JButton("22");
		btnJerReceivingTab22.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab22.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab22, "cell 3 5");
		
		btnJerReceivingTab23 = new JButton("23");
		btnJerReceivingTab23.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab23.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab23, "cell 4 5");
		
		btnJerReceivingTab24 = new JButton("24");
		btnJerReceivingTab24.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab24.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab24, "cell 1 6");
		
		btnJerReceivingTab25 = new JButton("25");
		btnJerReceivingTab25.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab25.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab25, "cell 2 6");
		
		btnJerReceivingTab26 = new JButton("26");
		btnJerReceivingTab26.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab26.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab26, "cell 3 6");
		
		btnJerReceivingTab27 = new JButton("27");
		btnJerReceivingTab27.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab27.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab27, "cell 4 6");
		
		btnJerReceivingTab28 = new JButton("28");
		btnJerReceivingTab28.setMaximumSize(new Dimension(90, 23));
		btnJerReceivingTab28.setMinimumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab28, "cell 1 7");
		
		btnJerReceivingTab29 = new JButton("29");
		btnJerReceivingTab29.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab29.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab29, "cell 2 7");
		
		btnJerReceivingTab30 = new JButton("30");
		btnJerReceivingTab30.setMaximumSize(new Dimension(90, 23));
		btnJerReceivingTab30.setMinimumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab30, "cell 3 7");
		
		btnJerReceivingTab31 = new JButton("31");
		btnJerReceivingTab31.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab31.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab31, "cell 4 7");
		
		btnJerReceivingTab32 = new JButton("32");
		btnJerReceivingTab32.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab32.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab32, "cell 1 8");
		
		btnJerReceivingTab33 = new JButton("33");
		btnJerReceivingTab33.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab33.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab33, "cell 2 8");
		
		btnJerReceivingTab34 = new JButton("34");
		btnJerReceivingTab34.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab34.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab34, "cell 3 8");
		
		btnJerReceivingTab35 = new JButton("35");
		btnJerReceivingTab35.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab35.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab35, "cell 4 8");
		
		btnJerReceivingTab36 = new JButton("36");
		btnJerReceivingTab36.setMaximumSize(new Dimension(90, 23));
		btnJerReceivingTab36.setMinimumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab36, "cell 1 9");
		
		btnJerReceivingTab37 = new JButton("37");
		btnJerReceivingTab37.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab37.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab37, "cell 2 9");
		
		btnJerReceivingTab38 = new JButton("38");
		btnJerReceivingTab38.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab38.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab38, "cell 3 9");
		
		btnJerReceivingTab39 = new JButton("39");
		btnJerReceivingTab39.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab39.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab39, "cell 4 9");
		
		btnJerReceivingTab40 = new JButton("40");
		btnJerReceivingTab40.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab40.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab40, "cell 1 10");
		
		btnJerReceivingTab41 = new JButton("41");
		btnJerReceivingTab41.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab41.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab41, "cell 2 10");
		
		btnJerReceivingTab42 = new JButton("42");
		btnJerReceivingTab42.setMaximumSize(new Dimension(90, 23));
		btnJerReceivingTab42.setMinimumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab42, "cell 3 10");
		
		btnJerReceivingTab43 = new JButton("43");
		btnJerReceivingTab43.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab43.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab43, "cell 4 10");
		
		btnJerReceivingTab44 = new JButton("44");
		btnJerReceivingTab44.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab44.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab44, "cell 1 11");
		
		btnJerReceivingTab45 = new JButton("45");
		btnJerReceivingTab45.setMaximumSize(new Dimension(90, 23));
		btnJerReceivingTab45.setMinimumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab45, "cell 2 11");
		
		btnJerReceivingTab46 = new JButton("46");
		btnJerReceivingTab46.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab46.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab46, "cell 3 11");
		
		btnJerReceivingTab47 = new JButton("47");
		btnJerReceivingTab47.setMinimumSize(new Dimension(90, 23));
		btnJerReceivingTab47.setMaximumSize(new Dimension(90, 23));
		pJerReceiving.add(btnJerReceivingTab47, "cell 4 11");
		
		pJerPickUp = new JPanel();
		tbpJer.addTab("Pick up line", null, pJerPickUp, "");
		pJerPickUp.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnJerPickUpTabBack = new JButton("");
		btnJerPickUpTabBack.setMinimumSize(new Dimension(20, 300));
		btnJerPickUpTabBack.setMaximumSize(new Dimension(20, 300));
		btnJerPickUpTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerPickUp.add(btnJerPickUpTabBack, "cell 0 0 1 12");
		
		btnJerPickUpTab0 = new JButton("0");
		btnJerPickUpTab0.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab0.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab0, "cell 1 0");
		
		btnJerPickUpTab1 = new JButton("1");
		btnJerPickUpTab1.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab1.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab1, "cell 2 0");
		
		btnJerPickUpTab2 = new JButton("2");
		btnJerPickUpTab2.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab2.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab2, "cell 3 0");
		
		btnJerPickUpTab3 = new JButton("3");
		btnJerPickUpTab3.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab3.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab3, "cell 4 0");
		
		btnJerPickUpTabNext = new JButton("");
		btnJerPickUpTabNext.setMinimumSize(new Dimension(20, 300));
		btnJerPickUpTabNext.setMaximumSize(new Dimension(20, 300));
		btnJerPickUpTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerPickUp.add(btnJerPickUpTabNext, "cell 5 0 1 12");
		
		btnJerPickUpTab4 = new JButton("4");
		btnJerPickUpTab4.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab4.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab4, "cell 1 1");
		
		btnJerPickUpTab5 = new JButton("5");
		btnJerPickUpTab5.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab5.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab5, "cell 2 1");
		
		btnJerPickUpTab6 = new JButton("6");
		btnJerPickUpTab6.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab6.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab6, "cell 3 1");
		
		btnJerPickUpTab7 = new JButton("7");
		btnJerPickUpTab7.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab7.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab7, "cell 4 1");
		
		btnJerPickUpTab8 = new JButton("8");
		btnJerPickUpTab8.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab8.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab8, "cell 1 2");
		
		btnJerPickUpTab9 = new JButton("9");
		btnJerPickUpTab9.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab9.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab9, "cell 2 2");
		
		btnJerPickUpTab10 = new JButton("10");
		btnJerPickUpTab10.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab10.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab10, "cell 3 2");
		
		btnJerPickUpTab11 = new JButton("11");
		btnJerPickUpTab11.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab11.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab11, "cell 4 2");
		
		btnJerPickUpTab12 = new JButton("12");
		btnJerPickUpTab12.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab12.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab12, "cell 1 3");
		
		btnJerPickUpTab13 = new JButton("13");
		btnJerPickUpTab13.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab13.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab13, "cell 2 3");
		
		btnJerPickUpTab14 = new JButton("14");
		btnJerPickUpTab14.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab14.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab14, "cell 3 3");
		
		btnJerPickUpTab15 = new JButton("15");
		btnJerPickUpTab15.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab15.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab15, "cell 4 3");
		
		btnJerPickUpTab16 = new JButton("16");
		btnJerPickUpTab16.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab16.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab16, "cell 1 4");
		
		btnJerPickUpTab17 = new JButton("17");
		btnJerPickUpTab17.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab17.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab17, "cell 2 4");
		
		btnJerPickUpTab18 = new JButton("18");
		btnJerPickUpTab18.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab18.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab18, "cell 3 4");
		
		btnJerPickUpTab19 = new JButton("19");
		btnJerPickUpTab19.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab19.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab19, "cell 4 4");
		
		btnJerPickUpTab20 = new JButton("20");
		btnJerPickUpTab20.setMaximumSize(new Dimension(90, 23));
		btnJerPickUpTab20.setMinimumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab20, "cell 1 5");
		
		btnJerPickUpTab21 = new JButton("21");
		btnJerPickUpTab21.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab21.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab21, "cell 2 5");
		
		btnJerPickUpTab22 = new JButton("22");
		btnJerPickUpTab22.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab22.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab22, "cell 3 5");
		
		btnJerPickUpTab23 = new JButton("23");
		btnJerPickUpTab23.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab23.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab23, "cell 4 5");
		
		btnJerPickUpTab24 = new JButton("24");
		btnJerPickUpTab24.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab24.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab24, "cell 1 6");
		
		btnJerPickUpTab25 = new JButton("25");
		btnJerPickUpTab25.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab25.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab25, "cell 2 6");
		
		btnJerPickUpTab26 = new JButton("26");
		btnJerPickUpTab26.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab26.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab26, "cell 3 6");
		
		btnJerPickUpTab27 = new JButton("27");
		btnJerPickUpTab27.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab27.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab27, "cell 4 6");
		
		btnJerPickUpTab28 = new JButton("28");
		btnJerPickUpTab28.setMaximumSize(new Dimension(90, 23));
		btnJerPickUpTab28.setMinimumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab28, "cell 1 7");
		
		btnJerPickUpTab29 = new JButton("29");
		btnJerPickUpTab29.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab29.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab29, "cell 2 7");
		
		btnJerPickUpTab30 = new JButton("30");
		btnJerPickUpTab30.setMaximumSize(new Dimension(90, 23));
		btnJerPickUpTab30.setMinimumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab30, "cell 3 7");
		
		btnJerPickUpTab31 = new JButton("31");
		btnJerPickUpTab31.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab31.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab31, "cell 4 7");
		
		btnJerPickUpTab32 = new JButton("32");
		btnJerPickUpTab32.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab32.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab32, "cell 1 8");
		
		btnJerPickUpTab33 = new JButton("33");
		btnJerPickUpTab33.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab33.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab33, "cell 2 8");
		
		btnJerPickUpTab34 = new JButton("34");
		btnJerPickUpTab34.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab34.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab34, "cell 3 8");
		
		btnJerPickUpTab35 = new JButton("35");
		btnJerPickUpTab35.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab35.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab35, "cell 4 8");
		
		btnJerPickUpTab36 = new JButton("36");
		btnJerPickUpTab36.setMaximumSize(new Dimension(90, 23));
		btnJerPickUpTab36.setMinimumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab36, "cell 1 9");
		
		btnJerPickUpTab37 = new JButton("37");
		btnJerPickUpTab37.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab37.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab37, "cell 2 9");
		
		btnJerPickUpTab38 = new JButton("38");
		btnJerPickUpTab38.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab38.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab38, "cell 3 9");
		
		btnJerPickUpTab39 = new JButton("39");
		btnJerPickUpTab39.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab39.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab39, "cell 4 9");
		
		btnJerPickUpTab40 = new JButton("40");
		btnJerPickUpTab40.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab40.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab40, "cell 1 10");
		
		btnJerPickUpTab41 = new JButton("41");
		btnJerPickUpTab41.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab41.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab41, "cell 2 10");
		
		btnJerPickUpTab42 = new JButton("42");
		btnJerPickUpTab42.setMaximumSize(new Dimension(90, 23));
		btnJerPickUpTab42.setMinimumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab42, "cell 3 10");
		
		btnJerPickUpTab43 = new JButton("43");
		btnJerPickUpTab43.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab43.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab43, "cell 4 10");
		
		btnJerPickUpTab44 = new JButton("44");
		btnJerPickUpTab44.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab44.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab44, "cell 1 11");
		
		btnJerPickUpTab45 = new JButton("45");
		btnJerPickUpTab45.setMaximumSize(new Dimension(90, 23));
		btnJerPickUpTab45.setMinimumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab45, "cell 2 11");
		
		btnJerPickUpTab46 = new JButton("46");
		btnJerPickUpTab46.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab46.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab46, "cell 3 11");
		
		btnJerPickUpTab47 = new JButton("47");
		btnJerPickUpTab47.setMinimumSize(new Dimension(90, 23));
		btnJerPickUpTab47.setMaximumSize(new Dimension(90, 23));
		pJerPickUp.add(btnJerPickUpTab47, "cell 4 11");
		
		pJerWaitToSend = new JPanel();
		tbpJer.addTab("Wait To Send", null, pJerWaitToSend, null);
		pJerWaitToSend.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnJerWaitToSendTabBack = new JButton("");
		btnJerWaitToSendTabBack.setMinimumSize(new Dimension(20, 300));
		btnJerWaitToSendTabBack.setMaximumSize(new Dimension(20, 300));
		btnJerWaitToSendTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pJerWaitToSend.add(btnJerWaitToSendTabBack, "cell 0 0 1 12");
		
		btnJerWaitToSendTab0 = new JButton("0");
		btnJerWaitToSendTab0.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab0.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab0, "cell 1 0");
		
		btnJerWaitToSendTab1 = new JButton("1");
		btnJerWaitToSendTab1.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab1.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab1, "cell 2 0");
		
		btnJerWaitToSendTab2 = new JButton("2");
		btnJerWaitToSendTab2.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab2.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab2, "cell 3 0");
		
		btnJerWaitToSendTab3 = new JButton("3");
		btnJerWaitToSendTab3.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab3.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab3, "cell 4 0");
		
		btnJerWaitToSendTabNext = new JButton("");
		btnJerWaitToSendTabNext.setMinimumSize(new Dimension(20, 300));
		btnJerWaitToSendTabNext.setMaximumSize(new Dimension(20, 300));
		btnJerWaitToSendTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pJerWaitToSend.add(btnJerWaitToSendTabNext, "cell 5 0 1 12");
		
		btnJerWaitToSendTab4 = new JButton("4");
		btnJerWaitToSendTab4.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab4.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab4, "cell 1 1");
		
		btnJerWaitToSendTab5 = new JButton("5");
		btnJerWaitToSendTab5.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab5.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab5, "cell 2 1");
		
		btnJerWaitToSendTab6 = new JButton("6");
		btnJerWaitToSendTab6.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab6.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab6, "cell 3 1");
		
		btnJerWaitToSendTab7 = new JButton("7");
		btnJerWaitToSendTab7.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab7.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab7, "cell 4 1");
		
		btnJerWaitToSendTab8 = new JButton("8");
		btnJerWaitToSendTab8.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab8.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab8, "cell 1 2");
		
		btnJerWaitToSendTab9 = new JButton("9");
		btnJerWaitToSendTab9.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab9.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab9, "cell 2 2");
		
		btnJerWaitToSendTab10 = new JButton("10");
		btnJerWaitToSendTab10.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab10.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab10, "cell 3 2");
		
		btnJerWaitToSendTab11 = new JButton("11");
		btnJerWaitToSendTab11.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab11.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab11, "cell 4 2");
		
		btnJerWaitToSendTab12 = new JButton("12");
		btnJerWaitToSendTab12.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab12.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab12, "cell 1 3");
		
		btnJerWaitToSendTab13 = new JButton("13");
		btnJerWaitToSendTab13.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab13.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab13, "cell 2 3");
		
		btnJerWaitToSendTab14 = new JButton("14");
		btnJerWaitToSendTab14.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab14.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab14, "cell 3 3");
		
		btnJerWaitToSendTab15 = new JButton("15");
		btnJerWaitToSendTab15.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab15.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab15, "cell 4 3");
		
		btnJerWaitToSendTab16 = new JButton("16");
		btnJerWaitToSendTab16.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab16.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab16, "cell 1 4");
		
		btnJerWaitToSendTab17 = new JButton("17");
		btnJerWaitToSendTab17.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab17.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab17, "cell 2 4");
		
		btnJerWaitToSendTab18 = new JButton("18");
		btnJerWaitToSendTab18.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab18.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab18, "cell 3 4");
		
		btnJerWaitToSendTab19 = new JButton("19");
		btnJerWaitToSendTab19.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab19.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab19, "cell 4 4");
		
		btnJerWaitToSendTab20 = new JButton("20");
		btnJerWaitToSendTab20.setMaximumSize(new Dimension(90, 23));
		btnJerWaitToSendTab20.setMinimumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab20, "cell 1 5");
		
		btnJerWaitToSendTab21 = new JButton("21");
		btnJerWaitToSendTab21.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab21.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab21, "cell 2 5");
		
		btnJerWaitToSendTab22 = new JButton("22");
		btnJerWaitToSendTab22.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab22.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab22, "cell 3 5");
		
		btnJerWaitToSendTab23 = new JButton("23");
		btnJerWaitToSendTab23.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab23.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab23, "cell 4 5");
		
		btnJerWaitToSendTab24 = new JButton("24");
		btnJerWaitToSendTab24.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab24.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab24, "cell 1 6");
		
		btnJerWaitToSendTab25 = new JButton("25");
		btnJerWaitToSendTab25.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab25.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab25, "cell 2 6");
		
		btnJerWaitToSendTab26 = new JButton("26");
		btnJerWaitToSendTab26.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab26.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab26, "cell 3 6");
		
		btnJerWaitToSendTab27 = new JButton("27");
		btnJerWaitToSendTab27.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab27.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab27, "cell 4 6");
		
		btnJerWaitToSendTab28 = new JButton("28");
		btnJerWaitToSendTab28.setMaximumSize(new Dimension(90, 23));
		btnJerWaitToSendTab28.setMinimumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab28, "cell 1 7");
		
		btnJerWaitToSendTab29 = new JButton("29");
		btnJerWaitToSendTab29.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab29.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab29, "cell 2 7");
		
		btnJerWaitToSendTab30 = new JButton("30");
		btnJerWaitToSendTab30.setMaximumSize(new Dimension(90, 23));
		btnJerWaitToSendTab30.setMinimumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab30, "cell 3 7");
		
		btnJerWaitToSendTab31 = new JButton("31");
		btnJerWaitToSendTab31.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab31.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab31, "cell 4 7");
		
		btnJerWaitToSendTab32 = new JButton("32");
		btnJerWaitToSendTab32.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab32.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab32, "cell 1 8");
		
		btnJerWaitToSendTab33 = new JButton("33");
		btnJerWaitToSendTab33.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab33.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab33, "cell 2 8");
		
		btnJerWaitToSendTab34 = new JButton("34");
		btnJerWaitToSendTab34.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab34.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab34, "cell 3 8");
		
		btnJerWaitToSendTab35 = new JButton("35");
		btnJerWaitToSendTab35.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab35.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab35, "cell 4 8");
		
		btnJerWaitToSendTab36 = new JButton("36");
		btnJerWaitToSendTab36.setMaximumSize(new Dimension(90, 23));
		btnJerWaitToSendTab36.setMinimumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab36, "cell 1 9");
		
		btnJerWaitToSendTab37 = new JButton("37");
		btnJerWaitToSendTab37.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab37.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab37, "cell 2 9");
		
		btnJerWaitToSendTab38 = new JButton("38");
		btnJerWaitToSendTab38.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab38.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab38, "cell 3 9");
		
		btnJerWaitToSendTab39 = new JButton("39");
		btnJerWaitToSendTab39.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab39.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab39, "cell 4 9");
		
		btnJerWaitToSendTab40 = new JButton("40");
		btnJerWaitToSendTab40.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab40.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab40, "cell 1 10");
		
		btnJerWaitToSendTab41 = new JButton("41");
		btnJerWaitToSendTab41.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab41.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab41, "cell 2 10");
		
		btnJerWaitToSendTab42 = new JButton("42");
		btnJerWaitToSendTab42.setMaximumSize(new Dimension(90, 23));
		btnJerWaitToSendTab42.setMinimumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab42, "cell 3 10");
		
		btnJerWaitToSendTab43 = new JButton("43");
		btnJerWaitToSendTab43.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab43.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab43, "cell 4 10");
		
		btnJerWaitToSendTab44 = new JButton("44");
		btnJerWaitToSendTab44.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab44.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab44, "cell 1 11");
		
		btnJerWaitToSendTab45 = new JButton("45");
		btnJerWaitToSendTab45.setMaximumSize(new Dimension(90, 23));
		btnJerWaitToSendTab45.setMinimumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab45, "cell 2 11");
		
		btnJerWaitToSendTab46 = new JButton("46");
		btnJerWaitToSendTab46.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab46.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab46, "cell 3 11");
		
		btnJerWaitToSendTab47 = new JButton("47");
		btnJerWaitToSendTab47.setMinimumSize(new Dimension(90, 23));
		btnJerWaitToSendTab47.setMaximumSize(new Dimension(90, 23));
		pJerWaitToSend.add(btnJerWaitToSendTab47, "cell 4 11");
	}
	
	private void initiateTelPanel() {
		pTelOverall = new JPanel();
		tbpTel.addTab("Overall", null, pTelOverall, null);
		pTelOverall.setLayout(new MigLayout("", "[right][][][][][]", "[][][][][][][][][][][][]"));
		
		JLabel lblTelSending = new JLabel("Sending:");
		lblTelSending.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelSending.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTelOverall.add(lblTelSending, "cell 0 0 1 2");
		
		btnTelSendingBack = new JButton("");
		btnTelSendingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelSendingBack.setMinimumSize(new Dimension(20, 48));
		btnTelSendingBack.setMaximumSize(new Dimension(20, 48));
		btnTelSendingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelOverall.add(btnTelSendingBack, "cell 1 0 1 2");
		
		btnTelSending0 = new JButton("0");
		btnTelSending0.setMinimumSize(new Dimension(90, 23));
		btnTelSending0.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelSending0, "cell 2 0");
		
		btnTelSending1 = new JButton("1");
		btnTelSending1.setMinimumSize(new Dimension(90, 23));
		btnTelSending1.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelSending1, "cell 3 0");
		
		btnTelSending2 = new JButton("2");
		btnTelSending2.setMinimumSize(new Dimension(90, 23));
		btnTelSending2.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelSending2, "cell 4 0");
		
		btnTelSendingNext = new JButton("");
		btnTelSendingNext.setMinimumSize(new Dimension(20, 48));
		btnTelSendingNext.setMaximumSize(new Dimension(20, 48));
		btnTelSendingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelOverall.add(btnTelSendingNext, "cell 5 0 1 2");
		
		btnTelSending3 = new JButton("3");
		btnTelSending3.setMinimumSize(new Dimension(90, 23));
		btnTelSending3.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelSending3, "cell 2 1");
		
		btnTelSending4 = new JButton("4");
		btnTelSending4.setMinimumSize(new Dimension(90, 23));
		btnTelSending4.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelSending4, "cell 3 1");
		
		btnTelSending5 = new JButton("5");
		btnTelSending5.setMinimumSize(new Dimension(90, 23));
		btnTelSending5.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelSending5, "cell 4 1");
		
		JLabel lblTelReceiving = new JLabel("Receiving:");
		lblTelReceiving.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelReceiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTelOverall.add(lblTelReceiving, "cell 0 2 1 2");
		
		btnTelReceivingBack = new JButton("");
		btnTelReceivingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelReceivingBack.setMinimumSize(new Dimension(20, 48));
		btnTelReceivingBack.setMaximumSize(new Dimension(20, 48));
		btnTelReceivingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelOverall.add(btnTelReceivingBack, "cell 1 2 1 2");
		
		btnTelReceiving0 = new JButton("0");
		btnTelReceiving0.setMinimumSize(new Dimension(90, 23));
		btnTelReceiving0.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelReceiving0, "cell 2 2");
		
		btnTelReceiving1 = new JButton("1");
		btnTelReceiving1.setMinimumSize(new Dimension(90, 23));
		btnTelReceiving1.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelReceiving1, "cell 3 2");
		
		btnTelReceiving2 = new JButton("2");
		btnTelReceiving2.setMinimumSize(new Dimension(90, 23));
		btnTelReceiving2.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelReceiving2, "cell 4 2");
		
		btnTelReceivingNext = new JButton("");
		btnTelReceivingNext.setMinimumSize(new Dimension(20, 48));
		btnTelReceivingNext.setMaximumSize(new Dimension(20, 48));
		btnTelReceivingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelOverall.add(btnTelReceivingNext, "cell 5 2 1 2");
		
		btnTelReceiving3 = new JButton("3");
		btnTelReceiving3.setMinimumSize(new Dimension(90, 23));
		btnTelReceiving3.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelReceiving3, "cell 2 3");
		
		btnTelReceiving4 = new JButton("4");
		btnTelReceiving4.setMinimumSize(new Dimension(90, 23));
		btnTelReceiving4.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelReceiving4, "cell 3 3");
		
		btnTelReceiving5 = new JButton("5");
		btnTelReceiving5.setMinimumSize(new Dimension(90, 23));
		btnTelReceiving5.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelReceiving5, "cell 4 3");
		
		JLabel lblTelPickUp = new JLabel("Pick Up:");
		lblTelPickUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelPickUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelPickUp.setToolTipText("Pick Up Line");
		pTelOverall.add(lblTelPickUp, "cell 0 4 1 2");
		
		btnTelPickUpBack = new JButton("");
		btnTelPickUpBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelPickUpBack.setMinimumSize(new Dimension(20, 48));
		btnTelPickUpBack.setMaximumSize(new Dimension(20, 48));
		btnTelPickUpBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelOverall.add(btnTelPickUpBack, "cell 1 4 1 2");
		
		btnTelPickUp0 = new JButton("0");
		btnTelPickUp0.setMinimumSize(new Dimension(90, 23));
		btnTelPickUp0.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelPickUp0, "cell 2 4");
		
		btnTelPickUp1 = new JButton("1");
		btnTelPickUp1.setMinimumSize(new Dimension(90, 23));
		btnTelPickUp1.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelPickUp1, "cell 3 4");
		
		btnTelPickUp2 = new JButton("2");
		btnTelPickUp2.setMinimumSize(new Dimension(90, 23));
		btnTelPickUp2.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelPickUp2, "cell 4 4");
		
		btnTelPickUpNext = new JButton("");
		btnTelPickUpNext.setMinimumSize(new Dimension(20, 48));
		btnTelPickUpNext.setMaximumSize(new Dimension(20, 48));
		btnTelPickUpNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelOverall.add(btnTelPickUpNext, "cell 5 4 1 2");
		
		btnTelPickUp3 = new JButton("3");
		btnTelPickUp3.setMinimumSize(new Dimension(90, 23));
		btnTelPickUp3.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelPickUp3, "cell 2 5");
		
		btnTelPickUp4 = new JButton("4");
		btnTelPickUp4.setMinimumSize(new Dimension(90, 23));
		btnTelPickUp4.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelPickUp4, "cell 3 5");
		
		btnTelPickUp5 = new JButton("5");
		btnTelPickUp5.setMinimumSize(new Dimension(90, 23));
		btnTelPickUp5.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelPickUp5, "cell 4 5");
		
		JLabel lblTelWaitingToSend = new JLabel("Waiting To Send:");
		lblTelWaitingToSend.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelWaitingToSend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTelOverall.add(lblTelWaitingToSend, "cell 0 6 1 2");
		
		btnTelWaitingToSendBack = new JButton("");
		btnTelWaitingToSendBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelWaitingToSendBack.setMinimumSize(new Dimension(20, 48));
		btnTelWaitingToSendBack.setMaximumSize(new Dimension(20, 48));
		btnTelWaitingToSendBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelOverall.add(btnTelWaitingToSendBack, "cell 1 6 1 2");
		
		btnTelWaitingToSend0 = new JButton("0");
		btnTelWaitingToSend0.setMinimumSize(new Dimension(90, 23));
		btnTelWaitingToSend0.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelWaitingToSend0, "cell 2 6");
		
		btnTelWaitingToSend1 = new JButton("1");
		btnTelWaitingToSend1.setMinimumSize(new Dimension(90, 23));
		btnTelWaitingToSend1.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelWaitingToSend1, "cell 3 6");
		
		btnTelWaitingToSend2 = new JButton("2");
		btnTelWaitingToSend2.setMinimumSize(new Dimension(90, 23));
		btnTelWaitingToSend2.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelWaitingToSend2, "cell 4 6");
		
		btnTelWaitingToSendNext = new JButton("");
		btnTelWaitingToSendNext.setMinimumSize(new Dimension(20, 48));
		btnTelWaitingToSendNext.setMaximumSize(new Dimension(20, 48));
		btnTelWaitingToSendNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelOverall.add(btnTelWaitingToSendNext, "cell 5 6 1 2");
		
		btnTelWaitingToSend3 = new JButton("3");
		btnTelWaitingToSend3.setMinimumSize(new Dimension(90, 23));
		btnTelWaitingToSend3.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelWaitingToSend3, "cell 2 7");
		
		btnTelWaitingToSend4 = new JButton("4");
		btnTelWaitingToSend4.setMinimumSize(new Dimension(90, 23));
		btnTelWaitingToSend4.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelWaitingToSend4, "cell 3 7");
		
		btnTelWaitingToSend5 = new JButton("5");
		btnTelWaitingToSend5.setMinimumSize(new Dimension(90, 23));
		btnTelWaitingToSend5.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelWaitingToSend5, "cell 4 7");
		
		JLabel lblTelQSenders = new JLabel("Q. Senders:");
		lblTelQSenders.setToolTipText("Queue Senders");
		lblTelQSenders.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelQSenders.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTelOverall.add(lblTelQSenders, "cell 0 8 1 2");
		
		btnTelQSendersBack = new JButton("");
		btnTelQSendersBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelQSendersBack.setMinimumSize(new Dimension(20, 48));
		btnTelQSendersBack.setMaximumSize(new Dimension(20, 48));
		btnTelQSendersBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelOverall.add(btnTelQSendersBack, "cell 1 8 1 2");
		
		btnTelQSenders0 = new JButton("0");
		btnTelQSenders0.setMinimumSize(new Dimension(90, 23));
		btnTelQSenders0.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQSenders0, "cell 2 8");
		
		btnTelQSenders1 = new JButton("1");
		btnTelQSenders1.setMinimumSize(new Dimension(90, 23));
		btnTelQSenders1.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQSenders1, "cell 3 8");
		
		btnTelQSenders2 = new JButton("2");
		btnTelQSenders2.setMinimumSize(new Dimension(90, 23));
		btnTelQSenders2.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQSenders2, "cell 4 8");
		
		btnTelQSendersNext = new JButton("");
		btnTelQSendersNext.setMinimumSize(new Dimension(20, 48));
		btnTelQSendersNext.setMaximumSize(new Dimension(20, 48));
		btnTelQSendersNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelOverall.add(btnTelQSendersNext, "cell 5 8 1 2");
		
		btnTelQSenders3 = new JButton("3");
		btnTelQSenders3.setMinimumSize(new Dimension(90, 23));
		btnTelQSenders3.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQSenders3, "cell 2 9 2 1,alignx center");
		
		btnTelQSenders4 = new JButton("4");
		btnTelQSenders4.setMinimumSize(new Dimension(90, 23));
		btnTelQSenders4.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQSenders4, "cell 3 9 2 1,alignx center");
		
		JLabel lblTelQReceivers = new JLabel("Q. Receivers:");
		lblTelQReceivers.setToolTipText("Queue Receivers");
		lblTelQReceivers.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelQReceivers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pTelOverall.add(lblTelQReceivers, "cell 0 10 1 2");
		
		btnTelQReceiversBack = new JButton("");
		btnTelQReceiversBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTelQReceiversBack.setMinimumSize(new Dimension(20, 48));
		btnTelQReceiversBack.setMaximumSize(new Dimension(20, 48));
		btnTelQReceiversBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelOverall.add(btnTelQReceiversBack, "cell 1 10 1 2");
		
		btnTelQReceivers0 = new JButton("0");
		btnTelQReceivers0.setMinimumSize(new Dimension(90, 23));
		btnTelQReceivers0.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQReceivers0, "cell 2 10");
		
		btnTelQReceivers1 = new JButton("1");
		btnTelQReceivers1.setMinimumSize(new Dimension(90, 23));
		btnTelQReceivers1.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQReceivers1, "cell 3 10");
		
		btnTelQReceivers2 = new JButton("2");
		btnTelQReceivers2.setMinimumSize(new Dimension(90, 23));
		btnTelQReceivers2.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQReceivers2, "cell 4 10");
		
		btnTelQReceiversNext = new JButton("");
		btnTelQReceiversNext.setMinimumSize(new Dimension(20, 48));
		btnTelQReceiversNext.setMaximumSize(new Dimension(20, 48));
		btnTelQReceiversNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelOverall.add(btnTelQReceiversNext, "cell 5 10 1 2");
		
		btnTelQReceivers3 = new JButton("3");
		btnTelQReceivers3.setMinimumSize(new Dimension(90, 23));
		btnTelQReceivers3.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQReceivers3, "cell 2 11 2 1,alignx center");
		
		btnTelQReceivers4 = new JButton("4");
		btnTelQReceivers4.setMinimumSize(new Dimension(90, 23));
		btnTelQReceivers4.setMaximumSize(new Dimension(90, 23));
		pTelOverall.add(btnTelQReceivers4, "cell 3 11 2 1,alignx center");
		
		pTelSending = new JPanel();
		tbpTel.addTab("Sending", null, pTelSending, null);
		pTelSending.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnTelSendingTabBack = new JButton("");
		btnTelSendingTabBack.setMinimumSize(new Dimension(20, 300));
		btnTelSendingTabBack.setMaximumSize(new Dimension(20, 300));
		btnTelSendingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelSending.add(btnTelSendingTabBack, "cell 0 0 1 12");
		
		btnTelSendingTab0 = new JButton("0");
		btnTelSendingTab0.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab0.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab0, "cell 1 0");
		
		btnTelSendingTab1 = new JButton("1");
		btnTelSendingTab1.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab1.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab1, "cell 2 0");
		
		btnTelSendingTab2 = new JButton("2");
		btnTelSendingTab2.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab2.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab2, "cell 3 0");
		
		btnTelSendingTab3 = new JButton("3");
		btnTelSendingTab3.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab3.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab3, "cell 4 0");
		
		btnTelSendingTabNext = new JButton("");
		btnTelSendingTabNext.setMinimumSize(new Dimension(20, 300));
		btnTelSendingTabNext.setMaximumSize(new Dimension(20, 300));
		btnTelSendingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelSending.add(btnTelSendingTabNext, "cell 5 0 1 12");
		
		btnTelSendingTab4 = new JButton("4");
		btnTelSendingTab4.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab4.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab4, "cell 1 1");
		
		btnTelSendingTab5 = new JButton("5");
		btnTelSendingTab5.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab5.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab5, "cell 2 1");
		
		btnTelSendingTab6 = new JButton("6");
		btnTelSendingTab6.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab6.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab6, "cell 3 1");
		
		btnTelSendingTab7 = new JButton("7");
		btnTelSendingTab7.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab7.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab7, "cell 4 1");
		
		btnTelSendingTab8 = new JButton("8");
		btnTelSendingTab8.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab8.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab8, "cell 1 2");
		
		btnTelSendingTab9 = new JButton("9");
		btnTelSendingTab9.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab9.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab9, "cell 2 2");
		
		btnTelSendingTab10 = new JButton("10");
		btnTelSendingTab10.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab10.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab10, "cell 3 2");
		
		btnTelSendingTab11 = new JButton("11");
		btnTelSendingTab11.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab11.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab11, "cell 4 2");
		
		btnTelSendingTab12 = new JButton("12");
		btnTelSendingTab12.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab12.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab12, "cell 1 3");
		
		btnTelSendingTab13 = new JButton("13");
		btnTelSendingTab13.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab13.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab13, "cell 2 3");
		
		btnTelSendingTab14 = new JButton("14");
		btnTelSendingTab14.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab14.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab14, "cell 3 3");
		
		btnTelSendingTab15 = new JButton("15");
		btnTelSendingTab15.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab15.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab15, "cell 4 3");
		
		btnTelSendingTab16 = new JButton("16");
		btnTelSendingTab16.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab16.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab16, "cell 1 4");
		
		btnTelSendingTab17 = new JButton("17");
		btnTelSendingTab17.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab17.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab17, "cell 2 4");
		
		btnTelSendingTab18 = new JButton("18");
		btnTelSendingTab18.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab18.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab18, "cell 3 4");
		
		btnTelSendingTab19 = new JButton("19");
		btnTelSendingTab19.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab19.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab19, "cell 4 4");
		
		btnTelSendingTab20 = new JButton("20");
		btnTelSendingTab20.setMaximumSize(new Dimension(90, 23));
		btnTelSendingTab20.setMinimumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab20, "cell 1 5");
		
		btnTelSendingTab21 = new JButton("21");
		btnTelSendingTab21.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab21.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab21, "cell 2 5");
		
		btnTelSendingTab22 = new JButton("22");
		btnTelSendingTab22.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab22.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab22, "cell 3 5");
		
		btnTelSendingTab23 = new JButton("23");
		btnTelSendingTab23.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab23.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab23, "cell 4 5");
		
		btnTelSendingTab24 = new JButton("24");
		btnTelSendingTab24.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab24.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab24, "cell 1 6");
		
		btnTelSendingTab25 = new JButton("25");
		btnTelSendingTab25.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab25.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab25, "cell 2 6");
		
		btnTelSendingTab26 = new JButton("26");
		btnTelSendingTab26.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab26.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab26, "cell 3 6");
		
		btnTelSendingTab27 = new JButton("27");
		btnTelSendingTab27.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab27.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab27, "cell 4 6");
		
		btnTelSendingTab28 = new JButton("28");
		btnTelSendingTab28.setMaximumSize(new Dimension(90, 23));
		btnTelSendingTab28.setMinimumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab28, "cell 1 7");
		
		btnTelSendingTab29 = new JButton("29");
		btnTelSendingTab29.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab29.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab29, "cell 2 7");
		
		btnTelSendingTab30 = new JButton("30");
		btnTelSendingTab30.setMaximumSize(new Dimension(90, 23));
		btnTelSendingTab30.setMinimumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab30, "cell 3 7");
		
		btnTelSendingTab31 = new JButton("31");
		btnTelSendingTab31.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab31.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab31, "cell 4 7");
		
		btnTelSendingTab32 = new JButton("32");
		btnTelSendingTab32.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab32.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab32, "cell 1 8");
		
		btnTelSendingTab33 = new JButton("33");
		btnTelSendingTab33.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab33.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab33, "cell 2 8");
		
		btnTelSendingTab34 = new JButton("34");
		btnTelSendingTab34.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab34.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab34, "cell 3 8");
		
		btnTelSendingTab35 = new JButton("35");
		btnTelSendingTab35.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab35.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab35, "cell 4 8");
		
		btnTelSendingTab36 = new JButton("36");
		btnTelSendingTab36.setMaximumSize(new Dimension(90, 23));
		btnTelSendingTab36.setMinimumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab36, "cell 1 9");
		
		btnTelSendingTab37 = new JButton("37");
		btnTelSendingTab37.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab37.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab37, "cell 2 9");
		
		btnTelSendingTab38 = new JButton("38");
		btnTelSendingTab38.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab38.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab38, "cell 3 9");
		
		btnTelSendingTab39 = new JButton("39");
		btnTelSendingTab39.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab39.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab39, "cell 4 9");
		
		btnTelSendingTab40 = new JButton("40");
		btnTelSendingTab40.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab40.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab40, "cell 1 10");
		
		btnTelSendingTab41 = new JButton("41");
		btnTelSendingTab41.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab41.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab41, "cell 2 10");
		
		btnTelSendingTab42 = new JButton("42");
		btnTelSendingTab42.setMaximumSize(new Dimension(90, 23));
		btnTelSendingTab42.setMinimumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab42, "cell 3 10");
		
		btnTelSendingTab43 = new JButton("43");
		btnTelSendingTab43.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab43.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab43, "cell 4 10");
		
		btnTelSendingTab44 = new JButton("44");
		btnTelSendingTab44.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab44.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab44, "cell 1 11");
		
		btnTelSendingTab45 = new JButton("45");
		btnTelSendingTab45.setMaximumSize(new Dimension(90, 23));
		btnTelSendingTab45.setMinimumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab45, "cell 2 11");
		
		btnTelSendingTab46 = new JButton("46");
		btnTelSendingTab46.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab46.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab46, "cell 3 11");
		
		btnTelSendingTab47 = new JButton("47");
		btnTelSendingTab47.setMinimumSize(new Dimension(90, 23));
		btnTelSendingTab47.setMaximumSize(new Dimension(90, 23));
		pTelSending.add(btnTelSendingTab47, "cell 4 11");
		
		pTelReceiving = new JPanel();
		tbpTel.addTab("Receiving", null, pTelReceiving, null);
		pTelReceiving.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnTelReceivingTabBack = new JButton("");
		btnTelReceivingTabBack.setMinimumSize(new Dimension(20, 300));
		btnTelReceivingTabBack.setMaximumSize(new Dimension(20, 300));
		btnTelReceivingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelReceiving.add(btnTelReceivingTabBack, "cell 0 0 1 12");
		
		btnTelReceivingTab0 = new JButton("0");
		btnTelReceivingTab0.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab0.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab0, "cell 1 0");
		
		btnTelReceivingTab1 = new JButton("1");
		btnTelReceivingTab1.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab1.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab1, "cell 2 0");
		
		btnTelReceivingTab2 = new JButton("2");
		btnTelReceivingTab2.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab2.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab2, "cell 3 0");
		
		btnTelReceivingTab3 = new JButton("3");
		btnTelReceivingTab3.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab3.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab3, "cell 4 0");
		
		btnTelReceivingTabNext = new JButton("");
		btnTelReceivingTabNext.setMinimumSize(new Dimension(20, 300));
		btnTelReceivingTabNext.setMaximumSize(new Dimension(20, 300));
		btnTelReceivingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelReceiving.add(btnTelReceivingTabNext, "cell 5 0 1 12");
		
		btnTelReceivingTab4 = new JButton("4");
		btnTelReceivingTab4.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab4.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab4, "cell 1 1");
		
		btnTelReceivingTab5 = new JButton("5");
		btnTelReceivingTab5.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab5.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab5, "cell 2 1");
		
		btnTelReceivingTab6 = new JButton("6");
		btnTelReceivingTab6.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab6.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab6, "cell 3 1");
		
		btnTelReceivingTab7 = new JButton("7");
		btnTelReceivingTab7.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab7.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab7, "cell 4 1");
		
		btnTelReceivingTab8 = new JButton("8");
		btnTelReceivingTab8.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab8.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab8, "cell 1 2");
		
		btnTelReceivingTab9 = new JButton("9");
		btnTelReceivingTab9.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab9.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab9, "cell 2 2");
		
		btnTelReceivingTab10 = new JButton("10");
		btnTelReceivingTab10.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab10.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab10, "cell 3 2");
		
		btnTelReceivingTab11 = new JButton("11");
		btnTelReceivingTab11.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab11.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab11, "cell 4 2");
		
		btnTelReceivingTab12 = new JButton("12");
		btnTelReceivingTab12.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab12.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab12, "cell 1 3");
		
		btnTelReceivingTab13 = new JButton("13");
		btnTelReceivingTab13.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab13.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab13, "cell 2 3");
		
		btnTelReceivingTab14 = new JButton("14");
		btnTelReceivingTab14.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab14.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab14, "cell 3 3");
		
		btnTelReceivingTab15 = new JButton("15");
		btnTelReceivingTab15.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab15.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab15, "cell 4 3");
		
		btnTelReceivingTab16 = new JButton("16");
		btnTelReceivingTab16.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab16.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab16, "cell 1 4");
		
		btnTelReceivingTab17 = new JButton("17");
		btnTelReceivingTab17.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab17.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab17, "cell 2 4");
		
		btnTelReceivingTab18 = new JButton("18");
		btnTelReceivingTab18.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab18.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab18, "cell 3 4");
		
		btnTelReceivingTab19 = new JButton("19");
		btnTelReceivingTab19.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab19.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab19, "cell 4 4");
		
		btnTelReceivingTab20 = new JButton("20");
		btnTelReceivingTab20.setMaximumSize(new Dimension(90, 23));
		btnTelReceivingTab20.setMinimumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab20, "cell 1 5");
		
		btnTelReceivingTab21 = new JButton("21");
		btnTelReceivingTab21.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab21.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab21, "cell 2 5");
		
		btnTelReceivingTab22 = new JButton("22");
		btnTelReceivingTab22.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab22.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab22, "cell 3 5");
		
		btnTelReceivingTab23 = new JButton("23");
		btnTelReceivingTab23.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab23.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab23, "cell 4 5");
		
		btnTelReceivingTab24 = new JButton("24");
		btnTelReceivingTab24.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab24.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab24, "cell 1 6");
		
		btnTelReceivingTab25 = new JButton("25");
		btnTelReceivingTab25.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab25.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab25, "cell 2 6");
		
		btnTelReceivingTab26 = new JButton("26");
		btnTelReceivingTab26.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab26.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab26, "cell 3 6");
		
		btnTelReceivingTab27 = new JButton("27");
		btnTelReceivingTab27.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab27.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab27, "cell 4 6");
		
		btnTelReceivingTab28 = new JButton("28");
		btnTelReceivingTab28.setMaximumSize(new Dimension(90, 23));
		btnTelReceivingTab28.setMinimumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab28, "cell 1 7");
		
		btnTelReceivingTab29 = new JButton("29");
		btnTelReceivingTab29.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab29.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab29, "cell 2 7");
		
		btnTelReceivingTab30 = new JButton("30");
		btnTelReceivingTab30.setMaximumSize(new Dimension(90, 23));
		btnTelReceivingTab30.setMinimumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab30, "cell 3 7");
		
		btnTelReceivingTab31 = new JButton("31");
		btnTelReceivingTab31.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab31.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab31, "cell 4 7");
		
		btnTelReceivingTab32 = new JButton("32");
		btnTelReceivingTab32.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab32.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab32, "cell 1 8");
		
		btnTelReceivingTab33 = new JButton("33");
		btnTelReceivingTab33.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab33.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab33, "cell 2 8");
		
		btnTelReceivingTab34 = new JButton("34");
		btnTelReceivingTab34.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab34.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab34, "cell 3 8");
		
		btnTelReceivingTab35 = new JButton("35");
		btnTelReceivingTab35.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab35.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab35, "cell 4 8");
		
		btnTelReceivingTab36 = new JButton("36");
		btnTelReceivingTab36.setMaximumSize(new Dimension(90, 23));
		btnTelReceivingTab36.setMinimumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab36, "cell 1 9");
		
		btnTelReceivingTab37 = new JButton("37");
		btnTelReceivingTab37.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab37.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab37, "cell 2 9");
		
		btnTelReceivingTab38 = new JButton("38");
		btnTelReceivingTab38.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab38.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab38, "cell 3 9");
		
		btnTelReceivingTab39 = new JButton("39");
		btnTelReceivingTab39.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab39.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab39, "cell 4 9");
		
		btnTelReceivingTab40 = new JButton("40");
		btnTelReceivingTab40.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab40.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab40, "cell 1 10");
		
		btnTelReceivingTab41 = new JButton("41");
		btnTelReceivingTab41.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab41.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab41, "cell 2 10");
		
		btnTelReceivingTab42 = new JButton("42");
		btnTelReceivingTab42.setMaximumSize(new Dimension(90, 23));
		btnTelReceivingTab42.setMinimumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab42, "cell 3 10");
		
		btnTelReceivingTab43 = new JButton("43");
		btnTelReceivingTab43.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab43.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab43, "cell 4 10");
		
		btnTelReceivingTab44 = new JButton("44");
		btnTelReceivingTab44.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab44.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab44, "cell 1 11");
		
		btnTelReceivingTab45 = new JButton("45");
		btnTelReceivingTab45.setMaximumSize(new Dimension(90, 23));
		btnTelReceivingTab45.setMinimumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab45, "cell 2 11");
		
		btnTelReceivingTab46 = new JButton("46");
		btnTelReceivingTab46.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab46.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab46, "cell 3 11");
		
		btnTelReceivingTab47 = new JButton("47");
		btnTelReceivingTab47.setMinimumSize(new Dimension(90, 23));
		btnTelReceivingTab47.setMaximumSize(new Dimension(90, 23));
		pTelReceiving.add(btnTelReceivingTab47, "cell 4 11");
		
		pTelPickUp = new JPanel();
		tbpTel.addTab("Pick up line", null, pTelPickUp, "");
		pTelPickUp.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnTelPickUpTabBack = new JButton("");
		btnTelPickUpTabBack.setMinimumSize(new Dimension(20, 300));
		btnTelPickUpTabBack.setMaximumSize(new Dimension(20, 300));
		btnTelPickUpTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelPickUp.add(btnTelPickUpTabBack, "cell 0 0 1 12");
		
		btnTelPickUpTab0 = new JButton("0");
		btnTelPickUpTab0.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab0.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab0, "cell 1 0");
		
		btnTelPickUpTab1 = new JButton("1");
		btnTelPickUpTab1.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab1.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab1, "cell 2 0");
		
		btnTelPickUpTab2 = new JButton("2");
		btnTelPickUpTab2.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab2.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab2, "cell 3 0");
		
		btnTelPickUpTab3 = new JButton("3");
		btnTelPickUpTab3.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab3.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab3, "cell 4 0");
		
		btnTelPickUpTabNext = new JButton("");
		btnTelPickUpTabNext.setMinimumSize(new Dimension(20, 300));
		btnTelPickUpTabNext.setMaximumSize(new Dimension(20, 300));
		btnTelPickUpTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelPickUp.add(btnTelPickUpTabNext, "cell 5 0 1 12");
		
		btnTelPickUpTab4 = new JButton("4");
		btnTelPickUpTab4.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab4.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab4, "cell 1 1");
		
		btnTelPickUpTab5 = new JButton("5");
		btnTelPickUpTab5.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab5.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab5, "cell 2 1");
		
		btnTelPickUpTab6 = new JButton("6");
		btnTelPickUpTab6.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab6.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab6, "cell 3 1");
		
		btnTelPickUpTab7 = new JButton("7");
		btnTelPickUpTab7.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab7.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab7, "cell 4 1");
		
		btnTelPickUpTab8 = new JButton("8");
		btnTelPickUpTab8.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab8.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab8, "cell 1 2");
		
		btnTelPickUpTab9 = new JButton("9");
		btnTelPickUpTab9.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab9.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab9, "cell 2 2");
		
		btnTelPickUpTab10 = new JButton("10");
		btnTelPickUpTab10.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab10.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab10, "cell 3 2");
		
		btnTelPickUpTab11 = new JButton("11");
		btnTelPickUpTab11.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab11.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab11, "cell 4 2");
		
		btnTelPickUpTab12 = new JButton("12");
		btnTelPickUpTab12.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab12.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab12, "cell 1 3");
		
		btnTelPickUpTab13 = new JButton("13");
		btnTelPickUpTab13.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab13.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab13, "cell 2 3");
		
		btnTelPickUpTab14 = new JButton("14");
		btnTelPickUpTab14.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab14.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab14, "cell 3 3");
		
		btnTelPickUpTab15 = new JButton("15");
		btnTelPickUpTab15.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab15.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab15, "cell 4 3");
		
		btnTelPickUpTab16 = new JButton("16");
		btnTelPickUpTab16.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab16.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab16, "cell 1 4");
		
		btnTelPickUpTab17 = new JButton("17");
		btnTelPickUpTab17.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab17.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab17, "cell 2 4");
		
		btnTelPickUpTab18 = new JButton("18");
		btnTelPickUpTab18.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab18.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab18, "cell 3 4");
		
		btnTelPickUpTab19 = new JButton("19");
		btnTelPickUpTab19.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab19.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab19, "cell 4 4");
		
		btnTelPickUpTab20 = new JButton("20");
		btnTelPickUpTab20.setMaximumSize(new Dimension(90, 23));
		btnTelPickUpTab20.setMinimumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab20, "cell 1 5");
		
		btnTelPickUpTab21 = new JButton("21");
		btnTelPickUpTab21.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab21.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab21, "cell 2 5");
		
		btnTelPickUpTab22 = new JButton("22");
		btnTelPickUpTab22.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab22.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab22, "cell 3 5");
		
		btnTelPickUpTab23 = new JButton("23");
		btnTelPickUpTab23.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab23.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab23, "cell 4 5");
		
		btnTelPickUpTab24 = new JButton("24");
		btnTelPickUpTab24.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab24.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab24, "cell 1 6");
		
		btnTelPickUpTab25 = new JButton("25");
		btnTelPickUpTab25.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab25.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab25, "cell 2 6");
		
		btnTelPickUpTab26 = new JButton("26");
		btnTelPickUpTab26.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab26.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab26, "cell 3 6");
		
		btnTelPickUpTab27 = new JButton("27");
		btnTelPickUpTab27.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab27.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab27, "cell 4 6");
		
		btnTelPickUpTab28 = new JButton("28");
		btnTelPickUpTab28.setMaximumSize(new Dimension(90, 23));
		btnTelPickUpTab28.setMinimumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab28, "cell 1 7");
		
		btnTelPickUpTab29 = new JButton("29");
		btnTelPickUpTab29.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab29.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab29, "cell 2 7");
		
		btnTelPickUpTab30 = new JButton("30");
		btnTelPickUpTab30.setMaximumSize(new Dimension(90, 23));
		btnTelPickUpTab30.setMinimumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab30, "cell 3 7");
		
		btnTelPickUpTab31 = new JButton("31");
		btnTelPickUpTab31.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab31.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab31, "cell 4 7");
		
		btnTelPickUpTab32 = new JButton("32");
		btnTelPickUpTab32.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab32.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab32, "cell 1 8");
		
		btnTelPickUpTab33 = new JButton("33");
		btnTelPickUpTab33.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab33.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab33, "cell 2 8");
		
		btnTelPickUpTab34 = new JButton("34");
		btnTelPickUpTab34.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab34.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab34, "cell 3 8");
		
		btnTelPickUpTab35 = new JButton("35");
		btnTelPickUpTab35.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab35.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab35, "cell 4 8");
		
		btnTelPickUpTab36 = new JButton("36");
		btnTelPickUpTab36.setMaximumSize(new Dimension(90, 23));
		btnTelPickUpTab36.setMinimumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab36, "cell 1 9");
		
		btnTelPickUpTab37 = new JButton("37");
		btnTelPickUpTab37.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab37.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab37, "cell 2 9");
		
		btnTelPickUpTab38 = new JButton("38");
		btnTelPickUpTab38.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab38.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab38, "cell 3 9");
		
		btnTelPickUpTab39 = new JButton("39");
		btnTelPickUpTab39.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab39.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab39, "cell 4 9");
		
		btnTelPickUpTab40 = new JButton("40");
		btnTelPickUpTab40.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab40.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab40, "cell 1 10");
		
		btnTelPickUpTab41 = new JButton("41");
		btnTelPickUpTab41.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab41.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab41, "cell 2 10");
		
		btnTelPickUpTab42 = new JButton("42");
		btnTelPickUpTab42.setMaximumSize(new Dimension(90, 23));
		btnTelPickUpTab42.setMinimumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab42, "cell 3 10");
		
		btnTelPickUpTab43 = new JButton("43");
		btnTelPickUpTab43.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab43.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab43, "cell 4 10");
		
		btnTelPickUpTab44 = new JButton("44");
		btnTelPickUpTab44.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab44.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab44, "cell 1 11");
		
		btnTelPickUpTab45 = new JButton("45");
		btnTelPickUpTab45.setMaximumSize(new Dimension(90, 23));
		btnTelPickUpTab45.setMinimumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab45, "cell 2 11");
		
		btnTelPickUpTab46 = new JButton("46");
		btnTelPickUpTab46.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab46.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab46, "cell 3 11");
		
		btnTelPickUpTab47 = new JButton("47");
		btnTelPickUpTab47.setMinimumSize(new Dimension(90, 23));
		btnTelPickUpTab47.setMaximumSize(new Dimension(90, 23));
		pTelPickUp.add(btnTelPickUpTab47, "cell 4 11");
		
		pTelWaitToSend = new JPanel();
		tbpTel.addTab("Wait To Send", null, pTelWaitToSend, null);
		pTelWaitToSend.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnTelWaitToSendTabBack = new JButton("");
		btnTelWaitToSendTabBack.setMinimumSize(new Dimension(20, 300));
		btnTelWaitToSendTabBack.setMaximumSize(new Dimension(20, 300));
		btnTelWaitToSendTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pTelWaitToSend.add(btnTelWaitToSendTabBack, "cell 0 0 1 12");
		
		btnTelWaitToSendTab0 = new JButton("0");
		btnTelWaitToSendTab0.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab0.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab0, "cell 1 0");
		
		btnTelWaitToSendTab1 = new JButton("1");
		btnTelWaitToSendTab1.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab1.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab1, "cell 2 0");
		
		btnTelWaitToSendTab2 = new JButton("2");
		btnTelWaitToSendTab2.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab2.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab2, "cell 3 0");
		
		btnTelWaitToSendTab3 = new JButton("3");
		btnTelWaitToSendTab3.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab3.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab3, "cell 4 0");
		
		btnTelWaitToSendTabNext = new JButton("");
		btnTelWaitToSendTabNext.setMinimumSize(new Dimension(20, 300));
		btnTelWaitToSendTabNext.setMaximumSize(new Dimension(20, 300));
		btnTelWaitToSendTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pTelWaitToSend.add(btnTelWaitToSendTabNext, "cell 5 0 1 12");
		
		btnTelWaitToSendTab4 = new JButton("4");
		btnTelWaitToSendTab4.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab4.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab4, "cell 1 1");
		
		btnTelWaitToSendTab5 = new JButton("5");
		btnTelWaitToSendTab5.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab5.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab5, "cell 2 1");
		
		btnTelWaitToSendTab6 = new JButton("6");
		btnTelWaitToSendTab6.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab6.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab6, "cell 3 1");
		
		btnTelWaitToSendTab7 = new JButton("7");
		btnTelWaitToSendTab7.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab7.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab7, "cell 4 1");
		
		btnTelWaitToSendTab8 = new JButton("8");
		btnTelWaitToSendTab8.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab8.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab8, "cell 1 2");
		
		btnTelWaitToSendTab9 = new JButton("9");
		btnTelWaitToSendTab9.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab9.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab9, "cell 2 2");
		
		btnTelWaitToSendTab10 = new JButton("10");
		btnTelWaitToSendTab10.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab10.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab10, "cell 3 2");
		
		btnTelWaitToSendTab11 = new JButton("11");
		btnTelWaitToSendTab11.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab11.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab11, "cell 4 2");
		
		btnTelWaitToSendTab12 = new JButton("12");
		btnTelWaitToSendTab12.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab12.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab12, "cell 1 3");
		
		btnTelWaitToSendTab13 = new JButton("13");
		btnTelWaitToSendTab13.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab13.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab13, "cell 2 3");
		
		btnTelWaitToSendTab14 = new JButton("14");
		btnTelWaitToSendTab14.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab14.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab14, "cell 3 3");
		
		btnTelWaitToSendTab15 = new JButton("15");
		btnTelWaitToSendTab15.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab15.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab15, "cell 4 3");
		
		btnTelWaitToSendTab16 = new JButton("16");
		btnTelWaitToSendTab16.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab16.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab16, "cell 1 4");
		
		btnTelWaitToSendTab17 = new JButton("17");
		btnTelWaitToSendTab17.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab17.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab17, "cell 2 4");
		
		btnTelWaitToSendTab18 = new JButton("18");
		btnTelWaitToSendTab18.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab18.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab18, "cell 3 4");
		
		btnTelWaitToSendTab19 = new JButton("19");
		btnTelWaitToSendTab19.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab19.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab19, "cell 4 4");
		
		btnTelWaitToSendTab20 = new JButton("20");
		btnTelWaitToSendTab20.setMaximumSize(new Dimension(90, 23));
		btnTelWaitToSendTab20.setMinimumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab20, "cell 1 5");
		
		btnTelWaitToSendTab21 = new JButton("21");
		btnTelWaitToSendTab21.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab21.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab21, "cell 2 5");
		
		btnTelWaitToSendTab22 = new JButton("22");
		btnTelWaitToSendTab22.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab22.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab22, "cell 3 5");
		
		btnTelWaitToSendTab23 = new JButton("23");
		btnTelWaitToSendTab23.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab23.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab23, "cell 4 5");
		
		btnTelWaitToSendTab24 = new JButton("24");
		btnTelWaitToSendTab24.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab24.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab24, "cell 1 6");
		
		btnTelWaitToSendTab25 = new JButton("25");
		btnTelWaitToSendTab25.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab25.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab25, "cell 2 6");
		
		btnTelWaitToSendTab26 = new JButton("26");
		btnTelWaitToSendTab26.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab26.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab26, "cell 3 6");
		
		btnTelWaitToSendTab27 = new JButton("27");
		btnTelWaitToSendTab27.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab27.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab27, "cell 4 6");
		
		btnTelWaitToSendTab28 = new JButton("28");
		btnTelWaitToSendTab28.setMaximumSize(new Dimension(90, 23));
		btnTelWaitToSendTab28.setMinimumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab28, "cell 1 7");
		
		btnTelWaitToSendTab29 = new JButton("29");
		btnTelWaitToSendTab29.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab29.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab29, "cell 2 7");
		
		btnTelWaitToSendTab30 = new JButton("30");
		btnTelWaitToSendTab30.setMaximumSize(new Dimension(90, 23));
		btnTelWaitToSendTab30.setMinimumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab30, "cell 3 7");
		
		btnTelWaitToSendTab31 = new JButton("31");
		btnTelWaitToSendTab31.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab31.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab31, "cell 4 7");
		
		btnTelWaitToSendTab32 = new JButton("32");
		btnTelWaitToSendTab32.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab32.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab32, "cell 1 8");
		
		btnTelWaitToSendTab33 = new JButton("33");
		btnTelWaitToSendTab33.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab33.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab33, "cell 2 8");
		
		btnTelWaitToSendTab34 = new JButton("34");
		btnTelWaitToSendTab34.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab34.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab34, "cell 3 8");
		
		btnTelWaitToSendTab35 = new JButton("35");
		btnTelWaitToSendTab35.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab35.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab35, "cell 4 8");
		
		btnTelWaitToSendTab36 = new JButton("36");
		btnTelWaitToSendTab36.setMaximumSize(new Dimension(90, 23));
		btnTelWaitToSendTab36.setMinimumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab36, "cell 1 9");
		
		btnTelWaitToSendTab37 = new JButton("37");
		btnTelWaitToSendTab37.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab37.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab37, "cell 2 9");
		
		btnTelWaitToSendTab38 = new JButton("38");
		btnTelWaitToSendTab38.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab38.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab38, "cell 3 9");
		
		btnTelWaitToSendTab39 = new JButton("39");
		btnTelWaitToSendTab39.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab39.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab39, "cell 4 9");
		
		btnTelWaitToSendTab40 = new JButton("40");
		btnTelWaitToSendTab40.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab40.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab40, "cell 1 10");
		
		btnTelWaitToSendTab41 = new JButton("41");
		btnTelWaitToSendTab41.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab41.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab41, "cell 2 10");
		
		btnTelWaitToSendTab42 = new JButton("42");
		btnTelWaitToSendTab42.setMaximumSize(new Dimension(90, 23));
		btnTelWaitToSendTab42.setMinimumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab42, "cell 3 10");
		
		btnTelWaitToSendTab43 = new JButton("43");
		btnTelWaitToSendTab43.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab43.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab43, "cell 4 10");
		
		btnTelWaitToSendTab44 = new JButton("44");
		btnTelWaitToSendTab44.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab44.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab44, "cell 1 11");
		
		btnTelWaitToSendTab45 = new JButton("45");
		btnTelWaitToSendTab45.setMaximumSize(new Dimension(90, 23));
		btnTelWaitToSendTab45.setMinimumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab45, "cell 2 11");
		
		btnTelWaitToSendTab46 = new JButton("46");
		btnTelWaitToSendTab46.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab46.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab46, "cell 3 11");
		
		btnTelWaitToSendTab47 = new JButton("47");
		btnTelWaitToSendTab47.setMinimumSize(new Dimension(90, 23));
		btnTelWaitToSendTab47.setMaximumSize(new Dimension(90, 23));
		pTelWaitToSend.add(btnTelWaitToSendTab47, "cell 4 11");
	}
	
	private void initiateBeePanel() {
		pBeeOverall = new JPanel();
		tbpBee.addTab("Overall", null, pBeeOverall, null);
		pBeeOverall.setLayout(new MigLayout("", "[right][][][][][]", "[][][][][][][][][][][][]"));
		
		JLabel lblBeeSending = new JLabel("Sending:");
		lblBeeSending.setHorizontalAlignment(SwingConstants.LEFT);
		lblBeeSending.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pBeeOverall.add(lblBeeSending, "cell 0 0 1 2");
		
		btnBeeSendingBack = new JButton("");
		btnBeeSendingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBeeSendingBack.setMinimumSize(new Dimension(20, 48));
		btnBeeSendingBack.setMaximumSize(new Dimension(20, 48));
		btnBeeSendingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeOverall.add(btnBeeSendingBack, "cell 1 0 1 2");
		
		btnBeeSending0 = new JButton("0");
		btnBeeSending0.setMinimumSize(new Dimension(90, 23));
		btnBeeSending0.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeSending0, "cell 2 0");
		
		btnBeeSending1 = new JButton("1");
		btnBeeSending1.setMinimumSize(new Dimension(90, 23));
		btnBeeSending1.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeSending1, "cell 3 0");
		
		btnBeeSending2 = new JButton("2");
		btnBeeSending2.setMinimumSize(new Dimension(90, 23));
		btnBeeSending2.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeSending2, "cell 4 0");
		
		btnBeeSendingNext = new JButton("");
		btnBeeSendingNext.setMinimumSize(new Dimension(20, 48));
		btnBeeSendingNext.setMaximumSize(new Dimension(20, 48));
		btnBeeSendingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeOverall.add(btnBeeSendingNext, "cell 5 0 1 2");
		
		btnBeeSending3 = new JButton("3");
		btnBeeSending3.setMinimumSize(new Dimension(90, 23));
		btnBeeSending3.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeSending3, "cell 2 1");
		
		btnBeeSending4 = new JButton("4");
		btnBeeSending4.setMinimumSize(new Dimension(90, 23));
		btnBeeSending4.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeSending4, "cell 3 1");
		
		btnBeeSending5 = new JButton("5");
		btnBeeSending5.setMinimumSize(new Dimension(90, 23));
		btnBeeSending5.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeSending5, "cell 4 1");
		
		JLabel lblBeeReceiving = new JLabel("Receiving:");
		lblBeeReceiving.setHorizontalAlignment(SwingConstants.LEFT);
		lblBeeReceiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pBeeOverall.add(lblBeeReceiving, "cell 0 2 1 2");
		
		btnBeeReceivingBack = new JButton("");
		btnBeeReceivingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBeeReceivingBack.setMinimumSize(new Dimension(20, 48));
		btnBeeReceivingBack.setMaximumSize(new Dimension(20, 48));
		btnBeeReceivingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeOverall.add(btnBeeReceivingBack, "cell 1 2 1 2");
		
		btnBeeReceiving0 = new JButton("0");
		btnBeeReceiving0.setMinimumSize(new Dimension(90, 23));
		btnBeeReceiving0.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeReceiving0, "cell 2 2");
		
		btnBeeReceiving1 = new JButton("1");
		btnBeeReceiving1.setMinimumSize(new Dimension(90, 23));
		btnBeeReceiving1.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeReceiving1, "cell 3 2");
		
		btnBeeReceiving2 = new JButton("2");
		btnBeeReceiving2.setMinimumSize(new Dimension(90, 23));
		btnBeeReceiving2.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeReceiving2, "cell 4 2");
		
		btnBeeReceivingNext = new JButton("");
		btnBeeReceivingNext.setMinimumSize(new Dimension(20, 48));
		btnBeeReceivingNext.setMaximumSize(new Dimension(20, 48));
		btnBeeReceivingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeOverall.add(btnBeeReceivingNext, "cell 5 2 1 2");
		
		btnBeeReceiving3 = new JButton("3");
		btnBeeReceiving3.setMinimumSize(new Dimension(90, 23));
		btnBeeReceiving3.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeReceiving3, "cell 2 3");
		
		btnBeeReceiving4 = new JButton("4");
		btnBeeReceiving4.setMinimumSize(new Dimension(90, 23));
		btnBeeReceiving4.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeReceiving4, "cell 3 3");
		
		btnBeeReceiving5 = new JButton("5");
		btnBeeReceiving5.setMinimumSize(new Dimension(90, 23));
		btnBeeReceiving5.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeReceiving5, "cell 4 3");
		
		JLabel lblBeePickUp = new JLabel("Pick Up:");
		lblBeePickUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblBeePickUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBeePickUp.setToolTipText("Pick Up Line");
		pBeeOverall.add(lblBeePickUp, "cell 0 4 1 2");
		
		btnBeePickUpBack = new JButton("");
		btnBeePickUpBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBeePickUpBack.setMinimumSize(new Dimension(20, 48));
		btnBeePickUpBack.setMaximumSize(new Dimension(20, 48));
		btnBeePickUpBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeOverall.add(btnBeePickUpBack, "cell 1 4 1 2");
		
		btnBeePickUp0 = new JButton("0");
		btnBeePickUp0.setMinimumSize(new Dimension(90, 23));
		btnBeePickUp0.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeePickUp0, "cell 2 4");
		
		btnBeePickUp1 = new JButton("1");
		btnBeePickUp1.setMinimumSize(new Dimension(90, 23));
		btnBeePickUp1.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeePickUp1, "cell 3 4");
		
		btnBeePickUp2 = new JButton("2");
		btnBeePickUp2.setMinimumSize(new Dimension(90, 23));
		btnBeePickUp2.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeePickUp2, "cell 4 4");
		
		btnBeePickUpNext = new JButton("");
		btnBeePickUpNext.setMinimumSize(new Dimension(20, 48));
		btnBeePickUpNext.setMaximumSize(new Dimension(20, 48));
		btnBeePickUpNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeOverall.add(btnBeePickUpNext, "cell 5 4 1 2");
		
		btnBeePickUp3 = new JButton("3");
		btnBeePickUp3.setMinimumSize(new Dimension(90, 23));
		btnBeePickUp3.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeePickUp3, "cell 2 5");
		
		btnBeePickUp4 = new JButton("4");
		btnBeePickUp4.setMinimumSize(new Dimension(90, 23));
		btnBeePickUp4.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeePickUp4, "cell 3 5");
		
		btnBeePickUp5 = new JButton("5");
		btnBeePickUp5.setMinimumSize(new Dimension(90, 23));
		btnBeePickUp5.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeePickUp5, "cell 4 5");
		
		JLabel lblBeeWaitingToSend = new JLabel("Waiting To Send:");
		lblBeeWaitingToSend.setHorizontalAlignment(SwingConstants.LEFT);
		lblBeeWaitingToSend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pBeeOverall.add(lblBeeWaitingToSend, "cell 0 6 1 2");
		
		btnBeeWaitingToSendBack = new JButton("");
		btnBeeWaitingToSendBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBeeWaitingToSendBack.setMinimumSize(new Dimension(20, 48));
		btnBeeWaitingToSendBack.setMaximumSize(new Dimension(20, 48));
		btnBeeWaitingToSendBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeOverall.add(btnBeeWaitingToSendBack, "cell 1 6 1 2");
		
		btnBeeWaitingToSend0 = new JButton("0");
		btnBeeWaitingToSend0.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitingToSend0.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeWaitingToSend0, "cell 2 6");
		
		btnBeeWaitingToSend1 = new JButton("1");
		btnBeeWaitingToSend1.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitingToSend1.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeWaitingToSend1, "cell 3 6");
		
		btnBeeWaitingToSend2 = new JButton("2");
		btnBeeWaitingToSend2.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitingToSend2.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeWaitingToSend2, "cell 4 6");
		
		btnBeeWaitingToSendNext = new JButton("");
		btnBeeWaitingToSendNext.setMinimumSize(new Dimension(20, 48));
		btnBeeWaitingToSendNext.setMaximumSize(new Dimension(20, 48));
		btnBeeWaitingToSendNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeOverall.add(btnBeeWaitingToSendNext, "cell 5 6 1 2");
		
		btnBeeWaitingToSend3 = new JButton("3");
		btnBeeWaitingToSend3.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitingToSend3.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeWaitingToSend3, "cell 2 7");
		
		btnBeeWaitingToSend4 = new JButton("4");
		btnBeeWaitingToSend4.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitingToSend4.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeWaitingToSend4, "cell 3 7");
		
		btnBeeWaitingToSend5 = new JButton("5");
		btnBeeWaitingToSend5.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitingToSend5.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeWaitingToSend5, "cell 4 7");
		
		JLabel lblBeeQSenders = new JLabel("Q. Senders:");
		lblBeeQSenders.setToolTipText("Queue Senders");
		lblBeeQSenders.setHorizontalAlignment(SwingConstants.LEFT);
		lblBeeQSenders.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pBeeOverall.add(lblBeeQSenders, "cell 0 8 1 2");
		
		btnBeeQSendersBack = new JButton("");
		btnBeeQSendersBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBeeQSendersBack.setMinimumSize(new Dimension(20, 48));
		btnBeeQSendersBack.setMaximumSize(new Dimension(20, 48));
		btnBeeQSendersBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeOverall.add(btnBeeQSendersBack, "cell 1 8 1 2");
		
		btnBeeQSenders0 = new JButton("0");
		btnBeeQSenders0.setMinimumSize(new Dimension(90, 23));
		btnBeeQSenders0.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQSenders0, "cell 2 8");
		
		btnBeeQSenders1 = new JButton("1");
		btnBeeQSenders1.setMinimumSize(new Dimension(90, 23));
		btnBeeQSenders1.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQSenders1, "cell 3 8");
		
		btnBeeQSenders2 = new JButton("2");
		btnBeeQSenders2.setMinimumSize(new Dimension(90, 23));
		btnBeeQSenders2.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQSenders2, "cell 4 8");
		
		btnBeeQSendersNext = new JButton("");
		btnBeeQSendersNext.setMinimumSize(new Dimension(20, 48));
		btnBeeQSendersNext.setMaximumSize(new Dimension(20, 48));
		btnBeeQSendersNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeOverall.add(btnBeeQSendersNext, "cell 5 8 1 2");
		
		btnBeeQSenders3 = new JButton("3");
		btnBeeQSenders3.setMinimumSize(new Dimension(90, 23));
		btnBeeQSenders3.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQSenders3, "cell 2 9 2 1,alignx center");
		
		btnBeeQSenders4 = new JButton("4");
		btnBeeQSenders4.setMinimumSize(new Dimension(90, 23));
		btnBeeQSenders4.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQSenders4, "cell 3 9 2 1,alignx center");
		
		JLabel lblBeeQReceivers = new JLabel("Q. Receivers:");
		lblBeeQReceivers.setToolTipText("Queue Receivers");
		lblBeeQReceivers.setHorizontalAlignment(SwingConstants.LEFT);
		lblBeeQReceivers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pBeeOverall.add(lblBeeQReceivers, "cell 0 10 1 2");
		
		btnBeeQReceiversBack = new JButton("");
		btnBeeQReceiversBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBeeQReceiversBack.setMinimumSize(new Dimension(20, 48));
		btnBeeQReceiversBack.setMaximumSize(new Dimension(20, 48));
		btnBeeQReceiversBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeOverall.add(btnBeeQReceiversBack, "cell 1 10 1 2");
		
		btnBeeQReceivers0 = new JButton("0");
		btnBeeQReceivers0.setMinimumSize(new Dimension(90, 23));
		btnBeeQReceivers0.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQReceivers0, "cell 2 10");
		
		btnBeeQReceivers1 = new JButton("1");
		btnBeeQReceivers1.setMinimumSize(new Dimension(90, 23));
		btnBeeQReceivers1.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQReceivers1, "cell 3 10");
		
		btnBeeQReceivers2 = new JButton("2");
		btnBeeQReceivers2.setMinimumSize(new Dimension(90, 23));
		btnBeeQReceivers2.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQReceivers2, "cell 4 10");
		
		btnBeeQReceiversNext = new JButton("");
		btnBeeQReceiversNext.setMinimumSize(new Dimension(20, 48));
		btnBeeQReceiversNext.setMaximumSize(new Dimension(20, 48));
		btnBeeQReceiversNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeOverall.add(btnBeeQReceiversNext, "cell 5 10 1 2");
		
		btnBeeQReceivers3 = new JButton("3");
		btnBeeQReceivers3.setMinimumSize(new Dimension(90, 23));
		btnBeeQReceivers3.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQReceivers3, "cell 2 11 2 1,alignx center");
		
		btnBeeQReceivers4 = new JButton("4");
		btnBeeQReceivers4.setMinimumSize(new Dimension(90, 23));
		btnBeeQReceivers4.setMaximumSize(new Dimension(90, 23));
		pBeeOverall.add(btnBeeQReceivers4, "cell 3 11 2 1,alignx center");
		
		pBeeSending = new JPanel();
		tbpBee.addTab("Sending", null, pBeeSending, null);
		pBeeSending.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnBeeSendingTabBack = new JButton("");
		btnBeeSendingTabBack.setMinimumSize(new Dimension(20, 300));
		btnBeeSendingTabBack.setMaximumSize(new Dimension(20, 300));
		btnBeeSendingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeSending.add(btnBeeSendingTabBack, "cell 0 0 1 12");
		
		btnBeeSendingTab0 = new JButton("0");
		btnBeeSendingTab0.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab0.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab0, "cell 1 0");
		
		btnBeeSendingTab1 = new JButton("1");
		btnBeeSendingTab1.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab1.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab1, "cell 2 0");
		
		btnBeeSendingTab2 = new JButton("2");
		btnBeeSendingTab2.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab2.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab2, "cell 3 0");
		
		btnBeeSendingTab3 = new JButton("3");
		btnBeeSendingTab3.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab3.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab3, "cell 4 0");
		
		btnBeeSendingTabNext = new JButton("");
		btnBeeSendingTabNext.setMinimumSize(new Dimension(20, 300));
		btnBeeSendingTabNext.setMaximumSize(new Dimension(20, 300));
		btnBeeSendingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeSending.add(btnBeeSendingTabNext, "cell 5 0 1 12");
		
		btnBeeSendingTab4 = new JButton("4");
		btnBeeSendingTab4.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab4.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab4, "cell 1 1");
		
		btnBeeSendingTab5 = new JButton("5");
		btnBeeSendingTab5.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab5.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab5, "cell 2 1");
		
		btnBeeSendingTab6 = new JButton("6");
		btnBeeSendingTab6.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab6.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab6, "cell 3 1");
		
		btnBeeSendingTab7 = new JButton("7");
		btnBeeSendingTab7.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab7.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab7, "cell 4 1");
		
		btnBeeSendingTab8 = new JButton("8");
		btnBeeSendingTab8.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab8.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab8, "cell 1 2");
		
		btnBeeSendingTab9 = new JButton("9");
		btnBeeSendingTab9.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab9.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab9, "cell 2 2");
		
		btnBeeSendingTab10 = new JButton("10");
		btnBeeSendingTab10.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab10.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab10, "cell 3 2");
		
		btnBeeSendingTab11 = new JButton("11");
		btnBeeSendingTab11.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab11.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab11, "cell 4 2");
		
		btnBeeSendingTab12 = new JButton("12");
		btnBeeSendingTab12.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab12.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab12, "cell 1 3");
		
		btnBeeSendingTab13 = new JButton("13");
		btnBeeSendingTab13.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab13.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab13, "cell 2 3");
		
		btnBeeSendingTab14 = new JButton("14");
		btnBeeSendingTab14.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab14.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab14, "cell 3 3");
		
		btnBeeSendingTab15 = new JButton("15");
		btnBeeSendingTab15.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab15.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab15, "cell 4 3");
		
		btnBeeSendingTab16 = new JButton("16");
		btnBeeSendingTab16.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab16.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab16, "cell 1 4");
		
		btnBeeSendingTab17 = new JButton("17");
		btnBeeSendingTab17.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab17.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab17, "cell 2 4");
		
		btnBeeSendingTab18 = new JButton("18");
		btnBeeSendingTab18.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab18.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab18, "cell 3 4");
		
		btnBeeSendingTab19 = new JButton("19");
		btnBeeSendingTab19.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab19.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab19, "cell 4 4");
		
		btnBeeSendingTab20 = new JButton("20");
		btnBeeSendingTab20.setMaximumSize(new Dimension(90, 23));
		btnBeeSendingTab20.setMinimumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab20, "cell 1 5");
		
		btnBeeSendingTab21 = new JButton("21");
		btnBeeSendingTab21.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab21.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab21, "cell 2 5");
		
		btnBeeSendingTab22 = new JButton("22");
		btnBeeSendingTab22.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab22.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab22, "cell 3 5");
		
		btnBeeSendingTab23 = new JButton("23");
		btnBeeSendingTab23.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab23.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab23, "cell 4 5");
		
		btnBeeSendingTab24 = new JButton("24");
		btnBeeSendingTab24.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab24.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab24, "cell 1 6");
		
		btnBeeSendingTab25 = new JButton("25");
		btnBeeSendingTab25.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab25.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab25, "cell 2 6");
		
		btnBeeSendingTab26 = new JButton("26");
		btnBeeSendingTab26.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab26.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab26, "cell 3 6");
		
		btnBeeSendingTab27 = new JButton("27");
		btnBeeSendingTab27.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab27.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab27, "cell 4 6");
		
		btnBeeSendingTab28 = new JButton("28");
		btnBeeSendingTab28.setMaximumSize(new Dimension(90, 23));
		btnBeeSendingTab28.setMinimumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab28, "cell 1 7");
		
		btnBeeSendingTab29 = new JButton("29");
		btnBeeSendingTab29.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab29.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab29, "cell 2 7");
		
		btnBeeSendingTab30 = new JButton("30");
		btnBeeSendingTab30.setMaximumSize(new Dimension(90, 23));
		btnBeeSendingTab30.setMinimumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab30, "cell 3 7");
		
		btnBeeSendingTab31 = new JButton("31");
		btnBeeSendingTab31.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab31.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab31, "cell 4 7");
		
		btnBeeSendingTab32 = new JButton("32");
		btnBeeSendingTab32.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab32.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab32, "cell 1 8");
		
		btnBeeSendingTab33 = new JButton("33");
		btnBeeSendingTab33.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab33.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab33, "cell 2 8");
		
		btnBeeSendingTab34 = new JButton("34");
		btnBeeSendingTab34.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab34.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab34, "cell 3 8");
		
		btnBeeSendingTab35 = new JButton("35");
		btnBeeSendingTab35.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab35.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab35, "cell 4 8");
		
		btnBeeSendingTab36 = new JButton("36");
		btnBeeSendingTab36.setMaximumSize(new Dimension(90, 23));
		btnBeeSendingTab36.setMinimumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab36, "cell 1 9");
		
		btnBeeSendingTab37 = new JButton("37");
		btnBeeSendingTab37.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab37.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab37, "cell 2 9");
		
		btnBeeSendingTab38 = new JButton("38");
		btnBeeSendingTab38.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab38.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab38, "cell 3 9");
		
		btnBeeSendingTab39 = new JButton("39");
		btnBeeSendingTab39.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab39.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab39, "cell 4 9");
		
		btnBeeSendingTab40 = new JButton("40");
		btnBeeSendingTab40.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab40.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab40, "cell 1 10");
		
		btnBeeSendingTab41 = new JButton("41");
		btnBeeSendingTab41.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab41.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab41, "cell 2 10");
		
		btnBeeSendingTab42 = new JButton("42");
		btnBeeSendingTab42.setMaximumSize(new Dimension(90, 23));
		btnBeeSendingTab42.setMinimumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab42, "cell 3 10");
		
		btnBeeSendingTab43 = new JButton("43");
		btnBeeSendingTab43.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab43.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab43, "cell 4 10");
		
		btnBeeSendingTab44 = new JButton("44");
		btnBeeSendingTab44.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab44.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab44, "cell 1 11");
		
		btnBeeSendingTab45 = new JButton("45");
		btnBeeSendingTab45.setMaximumSize(new Dimension(90, 23));
		btnBeeSendingTab45.setMinimumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab45, "cell 2 11");
		
		btnBeeSendingTab46 = new JButton("46");
		btnBeeSendingTab46.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab46.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab46, "cell 3 11");
		
		btnBeeSendingTab47 = new JButton("47");
		btnBeeSendingTab47.setMinimumSize(new Dimension(90, 23));
		btnBeeSendingTab47.setMaximumSize(new Dimension(90, 23));
		pBeeSending.add(btnBeeSendingTab47, "cell 4 11");
		
		pBeeReceiving = new JPanel();
		tbpBee.addTab("Receiving", null, pBeeReceiving, null);
		pBeeReceiving.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnBeeReceivingTabBack = new JButton("");
		btnBeeReceivingTabBack.setMinimumSize(new Dimension(20, 300));
		btnBeeReceivingTabBack.setMaximumSize(new Dimension(20, 300));
		btnBeeReceivingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeReceiving.add(btnBeeReceivingTabBack, "cell 0 0 1 12");
		
		btnBeeReceivingTab0 = new JButton("0");
		btnBeeReceivingTab0.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab0.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab0, "cell 1 0");
		
		btnBeeReceivingTab1 = new JButton("1");
		btnBeeReceivingTab1.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab1.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab1, "cell 2 0");
		
		btnBeeReceivingTab2 = new JButton("2");
		btnBeeReceivingTab2.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab2.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab2, "cell 3 0");
		
		btnBeeReceivingTab3 = new JButton("3");
		btnBeeReceivingTab3.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab3.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab3, "cell 4 0");
		
		btnBeeReceivingTabNext = new JButton("");
		btnBeeReceivingTabNext.setMinimumSize(new Dimension(20, 300));
		btnBeeReceivingTabNext.setMaximumSize(new Dimension(20, 300));
		btnBeeReceivingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeReceiving.add(btnBeeReceivingTabNext, "cell 5 0 1 12");
		
		btnBeeReceivingTab4 = new JButton("4");
		btnBeeReceivingTab4.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab4.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab4, "cell 1 1");
		
		btnBeeReceivingTab5 = new JButton("5");
		btnBeeReceivingTab5.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab5.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab5, "cell 2 1");
		
		btnBeeReceivingTab6 = new JButton("6");
		btnBeeReceivingTab6.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab6.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab6, "cell 3 1");
		
		btnBeeReceivingTab7 = new JButton("7");
		btnBeeReceivingTab7.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab7.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab7, "cell 4 1");
		
		btnBeeReceivingTab8 = new JButton("8");
		btnBeeReceivingTab8.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab8.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab8, "cell 1 2");
		
		btnBeeReceivingTab9 = new JButton("9");
		btnBeeReceivingTab9.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab9.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab9, "cell 2 2");
		
		btnBeeReceivingTab10 = new JButton("10");
		btnBeeReceivingTab10.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab10.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab10, "cell 3 2");
		
		btnBeeReceivingTab11 = new JButton("11");
		btnBeeReceivingTab11.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab11.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab11, "cell 4 2");
		
		btnBeeReceivingTab12 = new JButton("12");
		btnBeeReceivingTab12.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab12.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab12, "cell 1 3");
		
		btnBeeReceivingTab13 = new JButton("13");
		btnBeeReceivingTab13.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab13.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab13, "cell 2 3");
		
		btnBeeReceivingTab14 = new JButton("14");
		btnBeeReceivingTab14.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab14.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab14, "cell 3 3");
		
		btnBeeReceivingTab15 = new JButton("15");
		btnBeeReceivingTab15.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab15.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab15, "cell 4 3");
		
		btnBeeReceivingTab16 = new JButton("16");
		btnBeeReceivingTab16.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab16.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab16, "cell 1 4");
		
		btnBeeReceivingTab17 = new JButton("17");
		btnBeeReceivingTab17.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab17.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab17, "cell 2 4");
		
		btnBeeReceivingTab18 = new JButton("18");
		btnBeeReceivingTab18.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab18.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab18, "cell 3 4");
		
		btnBeeReceivingTab19 = new JButton("19");
		btnBeeReceivingTab19.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab19.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab19, "cell 4 4");
		
		btnBeeReceivingTab20 = new JButton("20");
		btnBeeReceivingTab20.setMaximumSize(new Dimension(90, 23));
		btnBeeReceivingTab20.setMinimumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab20, "cell 1 5");
		
		btnBeeReceivingTab21 = new JButton("21");
		btnBeeReceivingTab21.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab21.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab21, "cell 2 5");
		
		btnBeeReceivingTab22 = new JButton("22");
		btnBeeReceivingTab22.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab22.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab22, "cell 3 5");
		
		btnBeeReceivingTab23 = new JButton("23");
		btnBeeReceivingTab23.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab23.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab23, "cell 4 5");
		
		btnBeeReceivingTab24 = new JButton("24");
		btnBeeReceivingTab24.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab24.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab24, "cell 1 6");
		
		btnBeeReceivingTab25 = new JButton("25");
		btnBeeReceivingTab25.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab25.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab25, "cell 2 6");
		
		btnBeeReceivingTab26 = new JButton("26");
		btnBeeReceivingTab26.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab26.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab26, "cell 3 6");
		
		btnBeeReceivingTab27 = new JButton("27");
		btnBeeReceivingTab27.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab27.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab27, "cell 4 6");
		
		btnBeeReceivingTab28 = new JButton("28");
		btnBeeReceivingTab28.setMaximumSize(new Dimension(90, 23));
		btnBeeReceivingTab28.setMinimumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab28, "cell 1 7");
		
		btnBeeReceivingTab29 = new JButton("29");
		btnBeeReceivingTab29.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab29.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab29, "cell 2 7");
		
		btnBeeReceivingTab30 = new JButton("30");
		btnBeeReceivingTab30.setMaximumSize(new Dimension(90, 23));
		btnBeeReceivingTab30.setMinimumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab30, "cell 3 7");
		
		btnBeeReceivingTab31 = new JButton("31");
		btnBeeReceivingTab31.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab31.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab31, "cell 4 7");
		
		btnBeeReceivingTab32 = new JButton("32");
		btnBeeReceivingTab32.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab32.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab32, "cell 1 8");
		
		btnBeeReceivingTab33 = new JButton("33");
		btnBeeReceivingTab33.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab33.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab33, "cell 2 8");
		
		btnBeeReceivingTab34 = new JButton("34");
		btnBeeReceivingTab34.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab34.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab34, "cell 3 8");
		
		btnBeeReceivingTab35 = new JButton("35");
		btnBeeReceivingTab35.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab35.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab35, "cell 4 8");
		
		btnBeeReceivingTab36 = new JButton("36");
		btnBeeReceivingTab36.setMaximumSize(new Dimension(90, 23));
		btnBeeReceivingTab36.setMinimumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab36, "cell 1 9");
		
		btnBeeReceivingTab37 = new JButton("37");
		btnBeeReceivingTab37.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab37.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab37, "cell 2 9");
		
		btnBeeReceivingTab38 = new JButton("38");
		btnBeeReceivingTab38.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab38.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab38, "cell 3 9");
		
		btnBeeReceivingTab39 = new JButton("39");
		btnBeeReceivingTab39.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab39.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab39, "cell 4 9");
		
		btnBeeReceivingTab40 = new JButton("40");
		btnBeeReceivingTab40.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab40.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab40, "cell 1 10");
		
		btnBeeReceivingTab41 = new JButton("41");
		btnBeeReceivingTab41.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab41.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab41, "cell 2 10");
		
		btnBeeReceivingTab42 = new JButton("42");
		btnBeeReceivingTab42.setMaximumSize(new Dimension(90, 23));
		btnBeeReceivingTab42.setMinimumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab42, "cell 3 10");
		
		btnBeeReceivingTab43 = new JButton("43");
		btnBeeReceivingTab43.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab43.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab43, "cell 4 10");
		
		btnBeeReceivingTab44 = new JButton("44");
		btnBeeReceivingTab44.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab44.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab44, "cell 1 11");
		
		btnBeeReceivingTab45 = new JButton("45");
		btnBeeReceivingTab45.setMaximumSize(new Dimension(90, 23));
		btnBeeReceivingTab45.setMinimumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab45, "cell 2 11");
		
		btnBeeReceivingTab46 = new JButton("46");
		btnBeeReceivingTab46.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab46.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab46, "cell 3 11");
		
		btnBeeReceivingTab47 = new JButton("47");
		btnBeeReceivingTab47.setMinimumSize(new Dimension(90, 23));
		btnBeeReceivingTab47.setMaximumSize(new Dimension(90, 23));
		pBeeReceiving.add(btnBeeReceivingTab47, "cell 4 11");
		
		pBeePickUp = new JPanel();
		tbpBee.addTab("Pick up line", null, pBeePickUp, "");
		pBeePickUp.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnBeePickUpTabBack = new JButton("");
		btnBeePickUpTabBack.setMinimumSize(new Dimension(20, 300));
		btnBeePickUpTabBack.setMaximumSize(new Dimension(20, 300));
		btnBeePickUpTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeePickUp.add(btnBeePickUpTabBack, "cell 0 0 1 12");
		
		btnBeePickUpTab0 = new JButton("0");
		btnBeePickUpTab0.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab0.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab0, "cell 1 0");
		
		btnBeePickUpTab1 = new JButton("1");
		btnBeePickUpTab1.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab1.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab1, "cell 2 0");
		
		btnBeePickUpTab2 = new JButton("2");
		btnBeePickUpTab2.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab2.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab2, "cell 3 0");
		
		btnBeePickUpTab3 = new JButton("3");
		btnBeePickUpTab3.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab3.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab3, "cell 4 0");
		
		btnBeePickUpTabNext = new JButton("");
		btnBeePickUpTabNext.setMinimumSize(new Dimension(20, 300));
		btnBeePickUpTabNext.setMaximumSize(new Dimension(20, 300));
		btnBeePickUpTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeePickUp.add(btnBeePickUpTabNext, "cell 5 0 1 12");
		
		btnBeePickUpTab4 = new JButton("4");
		btnBeePickUpTab4.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab4.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab4, "cell 1 1");
		
		btnBeePickUpTab5 = new JButton("5");
		btnBeePickUpTab5.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab5.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab5, "cell 2 1");
		
		btnBeePickUpTab6 = new JButton("6");
		btnBeePickUpTab6.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab6.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab6, "cell 3 1");
		
		btnBeePickUpTab7 = new JButton("7");
		btnBeePickUpTab7.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab7.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab7, "cell 4 1");
		
		btnBeePickUpTab8 = new JButton("8");
		btnBeePickUpTab8.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab8.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab8, "cell 1 2");
		
		btnBeePickUpTab9 = new JButton("9");
		btnBeePickUpTab9.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab9.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab9, "cell 2 2");
		
		btnBeePickUpTab10 = new JButton("10");
		btnBeePickUpTab10.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab10.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab10, "cell 3 2");
		
		btnBeePickUpTab11 = new JButton("11");
		btnBeePickUpTab11.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab11.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab11, "cell 4 2");
		
		btnBeePickUpTab12 = new JButton("12");
		btnBeePickUpTab12.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab12.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab12, "cell 1 3");
		
		btnBeePickUpTab13 = new JButton("13");
		btnBeePickUpTab13.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab13.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab13, "cell 2 3");
		
		btnBeePickUpTab14 = new JButton("14");
		btnBeePickUpTab14.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab14.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab14, "cell 3 3");
		
		btnBeePickUpTab15 = new JButton("15");
		btnBeePickUpTab15.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab15.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab15, "cell 4 3");
		
		btnBeePickUpTab16 = new JButton("16");
		btnBeePickUpTab16.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab16.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab16, "cell 1 4");
		
		btnBeePickUpTab17 = new JButton("17");
		btnBeePickUpTab17.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab17.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab17, "cell 2 4");
		
		btnBeePickUpTab18 = new JButton("18");
		btnBeePickUpTab18.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab18.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab18, "cell 3 4");
		
		btnBeePickUpTab19 = new JButton("19");
		btnBeePickUpTab19.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab19.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab19, "cell 4 4");
		
		btnBeePickUpTab20 = new JButton("20");
		btnBeePickUpTab20.setMaximumSize(new Dimension(90, 23));
		btnBeePickUpTab20.setMinimumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab20, "cell 1 5");
		
		btnBeePickUpTab21 = new JButton("21");
		btnBeePickUpTab21.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab21.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab21, "cell 2 5");
		
		btnBeePickUpTab22 = new JButton("22");
		btnBeePickUpTab22.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab22.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab22, "cell 3 5");
		
		btnBeePickUpTab23 = new JButton("23");
		btnBeePickUpTab23.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab23.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab23, "cell 4 5");
		
		btnBeePickUpTab24 = new JButton("24");
		btnBeePickUpTab24.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab24.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab24, "cell 1 6");
		
		btnBeePickUpTab25 = new JButton("25");
		btnBeePickUpTab25.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab25.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab25, "cell 2 6");
		
		btnBeePickUpTab26 = new JButton("26");
		btnBeePickUpTab26.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab26.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab26, "cell 3 6");
		
		btnBeePickUpTab27 = new JButton("27");
		btnBeePickUpTab27.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab27.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab27, "cell 4 6");
		
		btnBeePickUpTab28 = new JButton("28");
		btnBeePickUpTab28.setMaximumSize(new Dimension(90, 23));
		btnBeePickUpTab28.setMinimumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab28, "cell 1 7");
		
		btnBeePickUpTab29 = new JButton("29");
		btnBeePickUpTab29.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab29.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab29, "cell 2 7");
		
		btnBeePickUpTab30 = new JButton("30");
		btnBeePickUpTab30.setMaximumSize(new Dimension(90, 23));
		btnBeePickUpTab30.setMinimumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab30, "cell 3 7");
		
		btnBeePickUpTab31 = new JButton("31");
		btnBeePickUpTab31.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab31.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab31, "cell 4 7");
		
		btnBeePickUpTab32 = new JButton("32");
		btnBeePickUpTab32.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab32.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab32, "cell 1 8");
		
		btnBeePickUpTab33 = new JButton("33");
		btnBeePickUpTab33.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab33.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab33, "cell 2 8");
		
		btnBeePickUpTab34 = new JButton("34");
		btnBeePickUpTab34.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab34.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab34, "cell 3 8");
		
		btnBeePickUpTab35 = new JButton("35");
		btnBeePickUpTab35.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab35.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab35, "cell 4 8");
		
		btnBeePickUpTab36 = new JButton("36");
		btnBeePickUpTab36.setMaximumSize(new Dimension(90, 23));
		btnBeePickUpTab36.setMinimumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab36, "cell 1 9");
		
		btnBeePickUpTab37 = new JButton("37");
		btnBeePickUpTab37.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab37.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab37, "cell 2 9");
		
		btnBeePickUpTab38 = new JButton("38");
		btnBeePickUpTab38.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab38.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab38, "cell 3 9");
		
		btnBeePickUpTab39 = new JButton("39");
		btnBeePickUpTab39.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab39.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab39, "cell 4 9");
		
		btnBeePickUpTab40 = new JButton("40");
		btnBeePickUpTab40.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab40.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab40, "cell 1 10");
		
		btnBeePickUpTab41 = new JButton("41");
		btnBeePickUpTab41.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab41.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab41, "cell 2 10");
		
		btnBeePickUpTab42 = new JButton("42");
		btnBeePickUpTab42.setMaximumSize(new Dimension(90, 23));
		btnBeePickUpTab42.setMinimumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab42, "cell 3 10");
		
		btnBeePickUpTab43 = new JButton("43");
		btnBeePickUpTab43.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab43.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab43, "cell 4 10");
		
		btnBeePickUpTab44 = new JButton("44");
		btnBeePickUpTab44.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab44.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab44, "cell 1 11");
		
		btnBeePickUpTab45 = new JButton("45");
		btnBeePickUpTab45.setMaximumSize(new Dimension(90, 23));
		btnBeePickUpTab45.setMinimumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab45, "cell 2 11");
		
		btnBeePickUpTab46 = new JButton("46");
		btnBeePickUpTab46.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab46.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab46, "cell 3 11");
		
		btnBeePickUpTab47 = new JButton("47");
		btnBeePickUpTab47.setMinimumSize(new Dimension(90, 23));
		btnBeePickUpTab47.setMaximumSize(new Dimension(90, 23));
		pBeePickUp.add(btnBeePickUpTab47, "cell 4 11");
		
		pBeeWaitToSend = new JPanel();
		tbpBee.addTab("Wait To Send", null, pBeeWaitToSend, null);
		pBeeWaitToSend.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnBeeWaitToSendTabBack = new JButton("");
		btnBeeWaitToSendTabBack.setMinimumSize(new Dimension(20, 300));
		btnBeeWaitToSendTabBack.setMaximumSize(new Dimension(20, 300));
		btnBeeWaitToSendTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pBeeWaitToSend.add(btnBeeWaitToSendTabBack, "cell 0 0 1 12");
		
		btnBeeWaitToSendTab0 = new JButton("0");
		btnBeeWaitToSendTab0.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab0.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab0, "cell 1 0");
		
		btnBeeWaitToSendTab1 = new JButton("1");
		btnBeeWaitToSendTab1.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab1.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab1, "cell 2 0");
		
		btnBeeWaitToSendTab2 = new JButton("2");
		btnBeeWaitToSendTab2.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab2.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab2, "cell 3 0");
		
		btnBeeWaitToSendTab3 = new JButton("3");
		btnBeeWaitToSendTab3.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab3.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab3, "cell 4 0");
		
		btnBeeWaitToSendTabNext = new JButton("");
		btnBeeWaitToSendTabNext.setMinimumSize(new Dimension(20, 300));
		btnBeeWaitToSendTabNext.setMaximumSize(new Dimension(20, 300));
		btnBeeWaitToSendTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pBeeWaitToSend.add(btnBeeWaitToSendTabNext, "cell 5 0 1 12");
		
		btnBeeWaitToSendTab4 = new JButton("4");
		btnBeeWaitToSendTab4.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab4.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab4, "cell 1 1");
		
		btnBeeWaitToSendTab5 = new JButton("5");
		btnBeeWaitToSendTab5.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab5.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab5, "cell 2 1");
		
		btnBeeWaitToSendTab6 = new JButton("6");
		btnBeeWaitToSendTab6.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab6.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab6, "cell 3 1");
		
		btnBeeWaitToSendTab7 = new JButton("7");
		btnBeeWaitToSendTab7.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab7.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab7, "cell 4 1");
		
		btnBeeWaitToSendTab8 = new JButton("8");
		btnBeeWaitToSendTab8.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab8.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab8, "cell 1 2");
		
		btnBeeWaitToSendTab9 = new JButton("9");
		btnBeeWaitToSendTab9.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab9.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab9, "cell 2 2");
		
		btnBeeWaitToSendTab10 = new JButton("10");
		btnBeeWaitToSendTab10.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab10.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab10, "cell 3 2");
		
		btnBeeWaitToSendTab11 = new JButton("11");
		btnBeeWaitToSendTab11.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab11.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab11, "cell 4 2");
		
		btnBeeWaitToSendTab12 = new JButton("12");
		btnBeeWaitToSendTab12.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab12.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab12, "cell 1 3");
		
		btnBeeWaitToSendTab13 = new JButton("13");
		btnBeeWaitToSendTab13.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab13.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab13, "cell 2 3");
		
		btnBeeWaitToSendTab14 = new JButton("14");
		btnBeeWaitToSendTab14.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab14.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab14, "cell 3 3");
		
		btnBeeWaitToSendTab15 = new JButton("15");
		btnBeeWaitToSendTab15.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab15.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab15, "cell 4 3");
		
		btnBeeWaitToSendTab16 = new JButton("16");
		btnBeeWaitToSendTab16.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab16.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab16, "cell 1 4");
		
		btnBeeWaitToSendTab17 = new JButton("17");
		btnBeeWaitToSendTab17.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab17.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab17, "cell 2 4");
		
		btnBeeWaitToSendTab18 = new JButton("18");
		btnBeeWaitToSendTab18.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab18.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab18, "cell 3 4");
		
		btnBeeWaitToSendTab19 = new JButton("19");
		btnBeeWaitToSendTab19.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab19.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab19, "cell 4 4");
		
		btnBeeWaitToSendTab20 = new JButton("20");
		btnBeeWaitToSendTab20.setMaximumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab20.setMinimumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab20, "cell 1 5");
		
		btnBeeWaitToSendTab21 = new JButton("21");
		btnBeeWaitToSendTab21.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab21.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab21, "cell 2 5");
		
		btnBeeWaitToSendTab22 = new JButton("22");
		btnBeeWaitToSendTab22.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab22.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab22, "cell 3 5");
		
		btnBeeWaitToSendTab23 = new JButton("23");
		btnBeeWaitToSendTab23.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab23.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab23, "cell 4 5");
		
		btnBeeWaitToSendTab24 = new JButton("24");
		btnBeeWaitToSendTab24.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab24.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab24, "cell 1 6");
		
		btnBeeWaitToSendTab25 = new JButton("25");
		btnBeeWaitToSendTab25.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab25.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab25, "cell 2 6");
		
		btnBeeWaitToSendTab26 = new JButton("26");
		btnBeeWaitToSendTab26.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab26.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab26, "cell 3 6");
		
		btnBeeWaitToSendTab27 = new JButton("27");
		btnBeeWaitToSendTab27.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab27.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab27, "cell 4 6");
		
		btnBeeWaitToSendTab28 = new JButton("28");
		btnBeeWaitToSendTab28.setMaximumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab28.setMinimumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab28, "cell 1 7");
		
		btnBeeWaitToSendTab29 = new JButton("29");
		btnBeeWaitToSendTab29.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab29.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab29, "cell 2 7");
		
		btnBeeWaitToSendTab30 = new JButton("30");
		btnBeeWaitToSendTab30.setMaximumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab30.setMinimumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab30, "cell 3 7");
		
		btnBeeWaitToSendTab31 = new JButton("31");
		btnBeeWaitToSendTab31.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab31.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab31, "cell 4 7");
		
		btnBeeWaitToSendTab32 = new JButton("32");
		btnBeeWaitToSendTab32.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab32.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab32, "cell 1 8");
		
		btnBeeWaitToSendTab33 = new JButton("33");
		btnBeeWaitToSendTab33.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab33.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab33, "cell 2 8");
		
		btnBeeWaitToSendTab34 = new JButton("34");
		btnBeeWaitToSendTab34.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab34.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab34, "cell 3 8");
		
		btnBeeWaitToSendTab35 = new JButton("35");
		btnBeeWaitToSendTab35.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab35.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab35, "cell 4 8");
		
		btnBeeWaitToSendTab36 = new JButton("36");
		btnBeeWaitToSendTab36.setMaximumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab36.setMinimumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab36, "cell 1 9");
		
		btnBeeWaitToSendTab37 = new JButton("37");
		btnBeeWaitToSendTab37.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab37.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab37, "cell 2 9");
		
		btnBeeWaitToSendTab38 = new JButton("38");
		btnBeeWaitToSendTab38.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab38.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab38, "cell 3 9");
		
		btnBeeWaitToSendTab39 = new JButton("39");
		btnBeeWaitToSendTab39.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab39.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab39, "cell 4 9");
		
		btnBeeWaitToSendTab40 = new JButton("40");
		btnBeeWaitToSendTab40.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab40.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab40, "cell 1 10");
		
		btnBeeWaitToSendTab41 = new JButton("41");
		btnBeeWaitToSendTab41.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab41.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab41, "cell 2 10");
		
		btnBeeWaitToSendTab42 = new JButton("42");
		btnBeeWaitToSendTab42.setMaximumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab42.setMinimumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab42, "cell 3 10");
		
		btnBeeWaitToSendTab43 = new JButton("43");
		btnBeeWaitToSendTab43.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab43.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab43, "cell 4 10");
		
		btnBeeWaitToSendTab44 = new JButton("44");
		btnBeeWaitToSendTab44.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab44.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab44, "cell 1 11");
		
		btnBeeWaitToSendTab45 = new JButton("45");
		btnBeeWaitToSendTab45.setMaximumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab45.setMinimumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab45, "cell 2 11");
		
		btnBeeWaitToSendTab46 = new JButton("46");
		btnBeeWaitToSendTab46.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab46.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab46, "cell 3 11");
		
		btnBeeWaitToSendTab47 = new JButton("47");
		btnBeeWaitToSendTab47.setMinimumSize(new Dimension(90, 23));
		btnBeeWaitToSendTab47.setMaximumSize(new Dimension(90, 23));
		pBeeWaitToSend.add(btnBeeWaitToSendTab47, "cell 4 11");
	}
	
	private void initiateEilPanel() {
		pEilOverall = new JPanel();
		tbpEil.addTab("Overall", null, pEilOverall, null);
		pEilOverall.setLayout(new MigLayout("", "[right][][][][][]", "[][][][][][][][][][][][]"));
		
		JLabel lblEilSending = new JLabel("Sending:");
		lblEilSending.setHorizontalAlignment(SwingConstants.LEFT);
		lblEilSending.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pEilOverall.add(lblEilSending, "cell 0 0 1 2");
		
		btnEilSendingBack = new JButton("");
		btnEilSendingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEilSendingBack.setMinimumSize(new Dimension(20, 48));
		btnEilSendingBack.setMaximumSize(new Dimension(20, 48));
		btnEilSendingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilOverall.add(btnEilSendingBack, "cell 1 0 1 2");
		
		btnEilSending0 = new JButton("0");
		btnEilSending0.setMinimumSize(new Dimension(90, 23));
		btnEilSending0.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilSending0, "cell 2 0");
		
		btnEilSending1 = new JButton("1");
		btnEilSending1.setMinimumSize(new Dimension(90, 23));
		btnEilSending1.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilSending1, "cell 3 0");
		
		btnEilSending2 = new JButton("2");
		btnEilSending2.setMinimumSize(new Dimension(90, 23));
		btnEilSending2.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilSending2, "cell 4 0");
		
		btnEilSendingNext = new JButton("");
		btnEilSendingNext.setMinimumSize(new Dimension(20, 48));
		btnEilSendingNext.setMaximumSize(new Dimension(20, 48));
		btnEilSendingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilOverall.add(btnEilSendingNext, "cell 5 0 1 2");
		
		btnEilSending3 = new JButton("3");
		btnEilSending3.setMinimumSize(new Dimension(90, 23));
		btnEilSending3.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilSending3, "cell 2 1");
		
		btnEilSending4 = new JButton("4");
		btnEilSending4.setMinimumSize(new Dimension(90, 23));
		btnEilSending4.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilSending4, "cell 3 1");
		
		btnEilSending5 = new JButton("5");
		btnEilSending5.setMinimumSize(new Dimension(90, 23));
		btnEilSending5.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilSending5, "cell 4 1");
		
		JLabel lblEilReceiving = new JLabel("Receiving:");
		lblEilReceiving.setHorizontalAlignment(SwingConstants.LEFT);
		lblEilReceiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pEilOverall.add(lblEilReceiving, "cell 0 2 1 2");
		
		btnEilReceivingBack = new JButton("");
		btnEilReceivingBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEilReceivingBack.setMinimumSize(new Dimension(20, 48));
		btnEilReceivingBack.setMaximumSize(new Dimension(20, 48));
		btnEilReceivingBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilOverall.add(btnEilReceivingBack, "cell 1 2 1 2");
		
		btnEilReceiving0 = new JButton("0");
		btnEilReceiving0.setMinimumSize(new Dimension(90, 23));
		btnEilReceiving0.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilReceiving0, "cell 2 2");
		
		btnEilReceiving1 = new JButton("1");
		btnEilReceiving1.setMinimumSize(new Dimension(90, 23));
		btnEilReceiving1.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilReceiving1, "cell 3 2");
		
		btnEilReceiving2 = new JButton("2");
		btnEilReceiving2.setMinimumSize(new Dimension(90, 23));
		btnEilReceiving2.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilReceiving2, "cell 4 2");
		
		btnEilReceivingNext = new JButton("");
		btnEilReceivingNext.setMinimumSize(new Dimension(20, 48));
		btnEilReceivingNext.setMaximumSize(new Dimension(20, 48));
		btnEilReceivingNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilOverall.add(btnEilReceivingNext, "cell 5 2 1 2");
		
		btnEilReceiving3 = new JButton("3");
		btnEilReceiving3.setMinimumSize(new Dimension(90, 23));
		btnEilReceiving3.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilReceiving3, "cell 2 3");
		
		btnEilReceiving4 = new JButton("4");
		btnEilReceiving4.setMinimumSize(new Dimension(90, 23));
		btnEilReceiving4.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilReceiving4, "cell 3 3");
		
		btnEilReceiving5 = new JButton("5");
		btnEilReceiving5.setMinimumSize(new Dimension(90, 23));
		btnEilReceiving5.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilReceiving5, "cell 4 3");
		
		JLabel lblEilPickUp = new JLabel("Pick Up:");
		lblEilPickUp.setHorizontalAlignment(SwingConstants.LEFT);
		lblEilPickUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEilPickUp.setToolTipText("Pick Up Line");
		pEilOverall.add(lblEilPickUp, "cell 0 4 1 2");
		
		btnEilPickUpBack = new JButton("");
		btnEilPickUpBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEilPickUpBack.setMinimumSize(new Dimension(20, 48));
		btnEilPickUpBack.setMaximumSize(new Dimension(20, 48));
		btnEilPickUpBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilOverall.add(btnEilPickUpBack, "cell 1 4 1 2");
		
		btnEilPickUp0 = new JButton("0");
		btnEilPickUp0.setMinimumSize(new Dimension(90, 23));
		btnEilPickUp0.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilPickUp0, "cell 2 4");
		
		btnEilPickUp1 = new JButton("1");
		btnEilPickUp1.setMinimumSize(new Dimension(90, 23));
		btnEilPickUp1.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilPickUp1, "cell 3 4");
		
		btnEilPickUp2 = new JButton("2");
		btnEilPickUp2.setMinimumSize(new Dimension(90, 23));
		btnEilPickUp2.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilPickUp2, "cell 4 4");
		
		btnEilPickUpNext = new JButton("");
		btnEilPickUpNext.setMinimumSize(new Dimension(20, 48));
		btnEilPickUpNext.setMaximumSize(new Dimension(20, 48));
		btnEilPickUpNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilOverall.add(btnEilPickUpNext, "cell 5 4 1 2");
		
		btnEilPickUp3 = new JButton("3");
		btnEilPickUp3.setMinimumSize(new Dimension(90, 23));
		btnEilPickUp3.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilPickUp3, "cell 2 5");
		
		btnEilPickUp4 = new JButton("4");
		btnEilPickUp4.setMinimumSize(new Dimension(90, 23));
		btnEilPickUp4.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilPickUp4, "cell 3 5");
		
		btnEilPickUp5 = new JButton("5");
		btnEilPickUp5.setMinimumSize(new Dimension(90, 23));
		btnEilPickUp5.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilPickUp5, "cell 4 5");
		
		JLabel lblEilWaitingToSend = new JLabel("Waiting To Send:");
		lblEilWaitingToSend.setHorizontalAlignment(SwingConstants.LEFT);
		lblEilWaitingToSend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pEilOverall.add(lblEilWaitingToSend, "cell 0 6 1 2");
		
		btnEilWaitingToSendBack = new JButton("");
		btnEilWaitingToSendBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEilWaitingToSendBack.setMinimumSize(new Dimension(20, 48));
		btnEilWaitingToSendBack.setMaximumSize(new Dimension(20, 48));
		btnEilWaitingToSendBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilOverall.add(btnEilWaitingToSendBack, "cell 1 6 1 2");
		
		btnEilWaitingToSend0 = new JButton("0");
		btnEilWaitingToSend0.setMinimumSize(new Dimension(90, 23));
		btnEilWaitingToSend0.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilWaitingToSend0, "cell 2 6");
		
		btnEilWaitingToSend1 = new JButton("1");
		btnEilWaitingToSend1.setMinimumSize(new Dimension(90, 23));
		btnEilWaitingToSend1.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilWaitingToSend1, "cell 3 6");
		
		btnEilWaitingToSend2 = new JButton("2");
		btnEilWaitingToSend2.setMinimumSize(new Dimension(90, 23));
		btnEilWaitingToSend2.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilWaitingToSend2, "cell 4 6");
		
		btnEilWaitingToSendNext = new JButton("");
		btnEilWaitingToSendNext.setMinimumSize(new Dimension(20, 48));
		btnEilWaitingToSendNext.setMaximumSize(new Dimension(20, 48));
		btnEilWaitingToSendNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilOverall.add(btnEilWaitingToSendNext, "cell 5 6 1 2");
		
		btnEilWaitingToSend3 = new JButton("3");
		btnEilWaitingToSend3.setMinimumSize(new Dimension(90, 23));
		btnEilWaitingToSend3.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilWaitingToSend3, "cell 2 7");
		
		btnEilWaitingToSend4 = new JButton("4");
		btnEilWaitingToSend4.setMinimumSize(new Dimension(90, 23));
		btnEilWaitingToSend4.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilWaitingToSend4, "cell 3 7");
		
		btnEilWaitingToSend5 = new JButton("5");
		btnEilWaitingToSend5.setMinimumSize(new Dimension(90, 23));
		btnEilWaitingToSend5.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilWaitingToSend5, "cell 4 7");
		
		JLabel lblEilQSenders = new JLabel("Q. Senders:");
		lblEilQSenders.setToolTipText("Queue Senders");
		lblEilQSenders.setHorizontalAlignment(SwingConstants.LEFT);
		lblEilQSenders.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pEilOverall.add(lblEilQSenders, "cell 0 8 1 2");
		
		btnEilQSendersBack = new JButton("");
		btnEilQSendersBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEilQSendersBack.setMinimumSize(new Dimension(20, 48));
		btnEilQSendersBack.setMaximumSize(new Dimension(20, 48));
		btnEilQSendersBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilOverall.add(btnEilQSendersBack, "cell 1 8 1 2");
		
		btnEilQSenders0 = new JButton("0");
		btnEilQSenders0.setMinimumSize(new Dimension(90, 23));
		btnEilQSenders0.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQSenders0, "cell 2 8");
		
		btnEilQSenders1 = new JButton("1");
		btnEilQSenders1.setMinimumSize(new Dimension(90, 23));
		btnEilQSenders1.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQSenders1, "cell 3 8");
		
		btnEilQSenders2 = new JButton("2");
		btnEilQSenders2.setMinimumSize(new Dimension(90, 23));
		btnEilQSenders2.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQSenders2, "cell 4 8");
		
		btnEilQSendersNext = new JButton("");
		btnEilQSendersNext.setMinimumSize(new Dimension(20, 48));
		btnEilQSendersNext.setMaximumSize(new Dimension(20, 48));
		btnEilQSendersNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilOverall.add(btnEilQSendersNext, "cell 5 8 1 2");
		
		btnEilQSenders3 = new JButton("3");
		btnEilQSenders3.setMinimumSize(new Dimension(90, 23));
		btnEilQSenders3.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQSenders3, "cell 2 9 2 1,alignx center");
		
		btnEilQSenders4 = new JButton("4");
		btnEilQSenders4.setMinimumSize(new Dimension(90, 23));
		btnEilQSenders4.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQSenders4, "cell 3 9 2 1,alignx center");
		
		JLabel lblEilQReceivers = new JLabel("Q. Receivers:");
		lblEilQReceivers.setToolTipText("Queue Receivers");
		lblEilQReceivers.setHorizontalAlignment(SwingConstants.LEFT);
		lblEilQReceivers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pEilOverall.add(lblEilQReceivers, "cell 0 10 1 2");
		
		btnEilQReceiversBack = new JButton("");
		btnEilQReceiversBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEilQReceiversBack.setMinimumSize(new Dimension(20, 48));
		btnEilQReceiversBack.setMaximumSize(new Dimension(20, 48));
		btnEilQReceiversBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilOverall.add(btnEilQReceiversBack, "cell 1 10 1 2");
		
		btnEilQReceivers0 = new JButton("0");
		btnEilQReceivers0.setMinimumSize(new Dimension(90, 23));
		btnEilQReceivers0.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQReceivers0, "cell 2 10");
		
		btnEilQReceivers1 = new JButton("1");
		btnEilQReceivers1.setMinimumSize(new Dimension(90, 23));
		btnEilQReceivers1.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQReceivers1, "cell 3 10");
		
		btnEilQReceivers2 = new JButton("2");
		btnEilQReceivers2.setMinimumSize(new Dimension(90, 23));
		btnEilQReceivers2.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQReceivers2, "cell 4 10");
		
		btnEilQReceiversNext = new JButton("");
		btnEilQReceiversNext.setMinimumSize(new Dimension(20, 48));
		btnEilQReceiversNext.setMaximumSize(new Dimension(20, 48));
		btnEilQReceiversNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilOverall.add(btnEilQReceiversNext, "cell 5 10 1 2");
		
		btnEilQReceivers3 = new JButton("3");
		btnEilQReceivers3.setMinimumSize(new Dimension(90, 23));
		btnEilQReceivers3.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQReceivers3, "cell 2 11 2 1,alignx center");
		
		btnEilQReceivers4 = new JButton("4");
		btnEilQReceivers4.setMinimumSize(new Dimension(90, 23));
		btnEilQReceivers4.setMaximumSize(new Dimension(90, 23));
		pEilOverall.add(btnEilQReceivers4, "cell 3 11 2 1,alignx center");
		
		pEilSending = new JPanel();
		tbpEil.addTab("Sending", null, pEilSending, null);
		pEilSending.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnEilSendingTabBack = new JButton("");
		btnEilSendingTabBack.setMinimumSize(new Dimension(20, 300));
		btnEilSendingTabBack.setMaximumSize(new Dimension(20, 300));
		btnEilSendingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilSending.add(btnEilSendingTabBack, "cell 0 0 1 12");
		
		btnEilSendingTab0 = new JButton("0");
		btnEilSendingTab0.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab0.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab0, "cell 1 0");
		
		btnEilSendingTab1 = new JButton("1");
		btnEilSendingTab1.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab1.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab1, "cell 2 0");
		
		btnEilSendingTab2 = new JButton("2");
		btnEilSendingTab2.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab2.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab2, "cell 3 0");
		
		btnEilSendingTab3 = new JButton("3");
		btnEilSendingTab3.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab3.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab3, "cell 4 0");
		
		btnEilSendingTabNext = new JButton("");
		btnEilSendingTabNext.setMinimumSize(new Dimension(20, 300));
		btnEilSendingTabNext.setMaximumSize(new Dimension(20, 300));
		btnEilSendingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilSending.add(btnEilSendingTabNext, "cell 5 0 1 12");
		
		btnEilSendingTab4 = new JButton("4");
		btnEilSendingTab4.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab4.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab4, "cell 1 1");
		
		btnEilSendingTab5 = new JButton("5");
		btnEilSendingTab5.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab5.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab5, "cell 2 1");
		
		btnEilSendingTab6 = new JButton("6");
		btnEilSendingTab6.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab6.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab6, "cell 3 1");
		
		btnEilSendingTab7 = new JButton("7");
		btnEilSendingTab7.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab7.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab7, "cell 4 1");
		
		btnEilSendingTab8 = new JButton("8");
		btnEilSendingTab8.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab8.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab8, "cell 1 2");
		
		btnEilSendingTab9 = new JButton("9");
		btnEilSendingTab9.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab9.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab9, "cell 2 2");
		
		btnEilSendingTab10 = new JButton("10");
		btnEilSendingTab10.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab10.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab10, "cell 3 2");
		
		btnEilSendingTab11 = new JButton("11");
		btnEilSendingTab11.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab11.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab11, "cell 4 2");
		
		btnEilSendingTab12 = new JButton("12");
		btnEilSendingTab12.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab12.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab12, "cell 1 3");
		
		btnEilSendingTab13 = new JButton("13");
		btnEilSendingTab13.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab13.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab13, "cell 2 3");
		
		btnEilSendingTab14 = new JButton("14");
		btnEilSendingTab14.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab14.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab14, "cell 3 3");
		
		btnEilSendingTab15 = new JButton("15");
		btnEilSendingTab15.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab15.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab15, "cell 4 3");
		
		btnEilSendingTab16 = new JButton("16");
		btnEilSendingTab16.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab16.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab16, "cell 1 4");
		
		btnEilSendingTab17 = new JButton("17");
		btnEilSendingTab17.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab17.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab17, "cell 2 4");
		
		btnEilSendingTab18 = new JButton("18");
		btnEilSendingTab18.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab18.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab18, "cell 3 4");
		
		btnEilSendingTab19 = new JButton("19");
		btnEilSendingTab19.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab19.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab19, "cell 4 4");
		
		btnEilSendingTab20 = new JButton("20");
		btnEilSendingTab20.setMaximumSize(new Dimension(90, 23));
		btnEilSendingTab20.setMinimumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab20, "cell 1 5");
		
		btnEilSendingTab21 = new JButton("21");
		btnEilSendingTab21.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab21.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab21, "cell 2 5");
		
		btnEilSendingTab22 = new JButton("22");
		btnEilSendingTab22.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab22.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab22, "cell 3 5");
		
		btnEilSendingTab23 = new JButton("23");
		btnEilSendingTab23.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab23.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab23, "cell 4 5");
		
		btnEilSendingTab24 = new JButton("24");
		btnEilSendingTab24.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab24.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab24, "cell 1 6");
		
		btnEilSendingTab25 = new JButton("25");
		btnEilSendingTab25.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab25.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab25, "cell 2 6");
		
		btnEilSendingTab26 = new JButton("26");
		btnEilSendingTab26.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab26.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab26, "cell 3 6");
		
		btnEilSendingTab27 = new JButton("27");
		btnEilSendingTab27.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab27.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab27, "cell 4 6");
		
		btnEilSendingTab28 = new JButton("28");
		btnEilSendingTab28.setMaximumSize(new Dimension(90, 23));
		btnEilSendingTab28.setMinimumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab28, "cell 1 7");
		
		btnEilSendingTab29 = new JButton("29");
		btnEilSendingTab29.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab29.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab29, "cell 2 7");
		
		btnEilSendingTab30 = new JButton("30");
		btnEilSendingTab30.setMaximumSize(new Dimension(90, 23));
		btnEilSendingTab30.setMinimumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab30, "cell 3 7");
		
		btnEilSendingTab31 = new JButton("31");
		btnEilSendingTab31.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab31.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab31, "cell 4 7");
		
		btnEilSendingTab32 = new JButton("32");
		btnEilSendingTab32.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab32.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab32, "cell 1 8");
		
		btnEilSendingTab33 = new JButton("33");
		btnEilSendingTab33.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab33.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab33, "cell 2 8");
		
		btnEilSendingTab34 = new JButton("34");
		btnEilSendingTab34.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab34.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab34, "cell 3 8");
		
		btnEilSendingTab35 = new JButton("35");
		btnEilSendingTab35.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab35.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab35, "cell 4 8");
		
		btnEilSendingTab36 = new JButton("36");
		btnEilSendingTab36.setMaximumSize(new Dimension(90, 23));
		btnEilSendingTab36.setMinimumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab36, "cell 1 9");
		
		btnEilSendingTab37 = new JButton("37");
		btnEilSendingTab37.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab37.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab37, "cell 2 9");
		
		btnEilSendingTab38 = new JButton("38");
		btnEilSendingTab38.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab38.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab38, "cell 3 9");
		
		btnEilSendingTab39 = new JButton("39");
		btnEilSendingTab39.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab39.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab39, "cell 4 9");
		
		btnEilSendingTab40 = new JButton("40");
		btnEilSendingTab40.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab40.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab40, "cell 1 10");
		
		btnEilSendingTab41 = new JButton("41");
		btnEilSendingTab41.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab41.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab41, "cell 2 10");
		
		btnEilSendingTab42 = new JButton("42");
		btnEilSendingTab42.setMaximumSize(new Dimension(90, 23));
		btnEilSendingTab42.setMinimumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab42, "cell 3 10");
		
		btnEilSendingTab43 = new JButton("43");
		btnEilSendingTab43.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab43.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab43, "cell 4 10");
		
		btnEilSendingTab44 = new JButton("44");
		btnEilSendingTab44.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab44.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab44, "cell 1 11");
		
		btnEilSendingTab45 = new JButton("45");
		btnEilSendingTab45.setMaximumSize(new Dimension(90, 23));
		btnEilSendingTab45.setMinimumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab45, "cell 2 11");
		
		btnEilSendingTab46 = new JButton("46");
		btnEilSendingTab46.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab46.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab46, "cell 3 11");
		
		btnEilSendingTab47 = new JButton("47");
		btnEilSendingTab47.setMinimumSize(new Dimension(90, 23));
		btnEilSendingTab47.setMaximumSize(new Dimension(90, 23));
		pEilSending.add(btnEilSendingTab47, "cell 4 11");
		
		pEilReceiving = new JPanel();
		tbpEil.addTab("Receiving", null, pEilReceiving, null);
		pEilReceiving.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnEilReceivingTabBack = new JButton("");
		btnEilReceivingTabBack.setMinimumSize(new Dimension(20, 300));
		btnEilReceivingTabBack.setMaximumSize(new Dimension(20, 300));
		btnEilReceivingTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilReceiving.add(btnEilReceivingTabBack, "cell 0 0 1 12");
		
		btnEilReceivingTab0 = new JButton("0");
		btnEilReceivingTab0.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab0.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab0, "cell 1 0");
		
		btnEilReceivingTab1 = new JButton("1");
		btnEilReceivingTab1.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab1.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab1, "cell 2 0");
		
		btnEilReceivingTab2 = new JButton("2");
		btnEilReceivingTab2.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab2.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab2, "cell 3 0");
		
		btnEilReceivingTab3 = new JButton("3");
		btnEilReceivingTab3.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab3.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab3, "cell 4 0");
		
		btnEilReceivingTabNext = new JButton("");
		btnEilReceivingTabNext.setMinimumSize(new Dimension(20, 300));
		btnEilReceivingTabNext.setMaximumSize(new Dimension(20, 300));
		btnEilReceivingTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilReceiving.add(btnEilReceivingTabNext, "cell 5 0 1 12");
		
		btnEilReceivingTab4 = new JButton("4");
		btnEilReceivingTab4.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab4.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab4, "cell 1 1");
		
		btnEilReceivingTab5 = new JButton("5");
		btnEilReceivingTab5.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab5.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab5, "cell 2 1");
		
		btnEilReceivingTab6 = new JButton("6");
		btnEilReceivingTab6.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab6.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab6, "cell 3 1");
		
		btnEilReceivingTab7 = new JButton("7");
		btnEilReceivingTab7.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab7.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab7, "cell 4 1");
		
		btnEilReceivingTab8 = new JButton("8");
		btnEilReceivingTab8.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab8.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab8, "cell 1 2");
		
		btnEilReceivingTab9 = new JButton("9");
		btnEilReceivingTab9.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab9.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab9, "cell 2 2");
		
		btnEilReceivingTab10 = new JButton("10");
		btnEilReceivingTab10.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab10.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab10, "cell 3 2");
		
		btnEilReceivingTab11 = new JButton("11");
		btnEilReceivingTab11.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab11.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab11, "cell 4 2");
		
		btnEilReceivingTab12 = new JButton("12");
		btnEilReceivingTab12.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab12.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab12, "cell 1 3");
		
		btnEilReceivingTab13 = new JButton("13");
		btnEilReceivingTab13.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab13.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab13, "cell 2 3");
		
		btnEilReceivingTab14 = new JButton("14");
		btnEilReceivingTab14.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab14.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab14, "cell 3 3");
		
		btnEilReceivingTab15 = new JButton("15");
		btnEilReceivingTab15.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab15.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab15, "cell 4 3");
		
		btnEilReceivingTab16 = new JButton("16");
		btnEilReceivingTab16.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab16.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab16, "cell 1 4");
		
		btnEilReceivingTab17 = new JButton("17");
		btnEilReceivingTab17.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab17.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab17, "cell 2 4");
		
		btnEilReceivingTab18 = new JButton("18");
		btnEilReceivingTab18.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab18.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab18, "cell 3 4");
		
		btnEilReceivingTab19 = new JButton("19");
		btnEilReceivingTab19.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab19.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab19, "cell 4 4");
		
		btnEilReceivingTab20 = new JButton("20");
		btnEilReceivingTab20.setMaximumSize(new Dimension(90, 23));
		btnEilReceivingTab20.setMinimumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab20, "cell 1 5");
		
		btnEilReceivingTab21 = new JButton("21");
		btnEilReceivingTab21.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab21.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab21, "cell 2 5");
		
		btnEilReceivingTab22 = new JButton("22");
		btnEilReceivingTab22.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab22.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab22, "cell 3 5");
		
		btnEilReceivingTab23 = new JButton("23");
		btnEilReceivingTab23.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab23.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab23, "cell 4 5");
		
		btnEilReceivingTab24 = new JButton("24");
		btnEilReceivingTab24.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab24.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab24, "cell 1 6");
		
		btnEilReceivingTab25 = new JButton("25");
		btnEilReceivingTab25.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab25.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab25, "cell 2 6");
		
		btnEilReceivingTab26 = new JButton("26");
		btnEilReceivingTab26.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab26.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab26, "cell 3 6");
		
		btnEilReceivingTab27 = new JButton("27");
		btnEilReceivingTab27.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab27.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab27, "cell 4 6");
		
		btnEilReceivingTab28 = new JButton("28");
		btnEilReceivingTab28.setMaximumSize(new Dimension(90, 23));
		btnEilReceivingTab28.setMinimumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab28, "cell 1 7");
		
		btnEilReceivingTab29 = new JButton("29");
		btnEilReceivingTab29.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab29.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab29, "cell 2 7");
		
		btnEilReceivingTab30 = new JButton("30");
		btnEilReceivingTab30.setMaximumSize(new Dimension(90, 23));
		btnEilReceivingTab30.setMinimumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab30, "cell 3 7");
		
		btnEilReceivingTab31 = new JButton("31");
		btnEilReceivingTab31.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab31.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab31, "cell 4 7");
		
		btnEilReceivingTab32 = new JButton("32");
		btnEilReceivingTab32.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab32.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab32, "cell 1 8");
		
		btnEilReceivingTab33 = new JButton("33");
		btnEilReceivingTab33.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab33.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab33, "cell 2 8");
		
		btnEilReceivingTab34 = new JButton("34");
		btnEilReceivingTab34.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab34.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab34, "cell 3 8");
		
		btnEilReceivingTab35 = new JButton("35");
		btnEilReceivingTab35.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab35.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab35, "cell 4 8");
		
		btnEilReceivingTab36 = new JButton("36");
		btnEilReceivingTab36.setMaximumSize(new Dimension(90, 23));
		btnEilReceivingTab36.setMinimumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab36, "cell 1 9");
		
		btnEilReceivingTab37 = new JButton("37");
		btnEilReceivingTab37.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab37.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab37, "cell 2 9");
		
		btnEilReceivingTab38 = new JButton("38");
		btnEilReceivingTab38.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab38.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab38, "cell 3 9");
		
		btnEilReceivingTab39 = new JButton("39");
		btnEilReceivingTab39.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab39.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab39, "cell 4 9");
		
		btnEilReceivingTab40 = new JButton("40");
		btnEilReceivingTab40.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab40.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab40, "cell 1 10");
		
		btnEilReceivingTab41 = new JButton("41");
		btnEilReceivingTab41.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab41.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab41, "cell 2 10");
		
		btnEilReceivingTab42 = new JButton("42");
		btnEilReceivingTab42.setMaximumSize(new Dimension(90, 23));
		btnEilReceivingTab42.setMinimumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab42, "cell 3 10");
		
		btnEilReceivingTab43 = new JButton("43");
		btnEilReceivingTab43.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab43.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab43, "cell 4 10");
		
		btnEilReceivingTab44 = new JButton("44");
		btnEilReceivingTab44.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab44.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab44, "cell 1 11");
		
		btnEilReceivingTab45 = new JButton("45");
		btnEilReceivingTab45.setMaximumSize(new Dimension(90, 23));
		btnEilReceivingTab45.setMinimumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab45, "cell 2 11");
		
		btnEilReceivingTab46 = new JButton("46");
		btnEilReceivingTab46.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab46.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab46, "cell 3 11");
		
		btnEilReceivingTab47 = new JButton("47");
		btnEilReceivingTab47.setMinimumSize(new Dimension(90, 23));
		btnEilReceivingTab47.setMaximumSize(new Dimension(90, 23));
		pEilReceiving.add(btnEilReceivingTab47, "cell 4 11");
		
		pEilPickUp = new JPanel();
		tbpEil.addTab("Pick up line", null, pEilPickUp, "");
		pEilPickUp.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnEilPickUpTabBack = new JButton("");
		btnEilPickUpTabBack.setMinimumSize(new Dimension(20, 300));
		btnEilPickUpTabBack.setMaximumSize(new Dimension(20, 300));
		btnEilPickUpTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilPickUp.add(btnEilPickUpTabBack, "cell 0 0 1 12");
		
		btnEilPickUpTab0 = new JButton("0");
		btnEilPickUpTab0.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab0.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab0, "cell 1 0");
		
		btnEilPickUpTab1 = new JButton("1");
		btnEilPickUpTab1.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab1.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab1, "cell 2 0");
		
		btnEilPickUpTab2 = new JButton("2");
		btnEilPickUpTab2.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab2.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab2, "cell 3 0");
		
		btnEilPickUpTab3 = new JButton("3");
		btnEilPickUpTab3.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab3.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab3, "cell 4 0");
		
		btnEilPickUpTabNext = new JButton("");
		btnEilPickUpTabNext.setMinimumSize(new Dimension(20, 300));
		btnEilPickUpTabNext.setMaximumSize(new Dimension(20, 300));
		btnEilPickUpTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilPickUp.add(btnEilPickUpTabNext, "cell 5 0 1 12");
		
		btnEilPickUpTab4 = new JButton("4");
		btnEilPickUpTab4.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab4.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab4, "cell 1 1");
		
		btnEilPickUpTab5 = new JButton("5");
		btnEilPickUpTab5.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab5.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab5, "cell 2 1");
		
		btnEilPickUpTab6 = new JButton("6");
		btnEilPickUpTab6.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab6.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab6, "cell 3 1");
		
		btnEilPickUpTab7 = new JButton("7");
		btnEilPickUpTab7.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab7.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab7, "cell 4 1");
		
		btnEilPickUpTab8 = new JButton("8");
		btnEilPickUpTab8.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab8.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab8, "cell 1 2");
		
		btnEilPickUpTab9 = new JButton("9");
		btnEilPickUpTab9.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab9.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab9, "cell 2 2");
		
		btnEilPickUpTab10 = new JButton("10");
		btnEilPickUpTab10.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab10.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab10, "cell 3 2");
		
		btnEilPickUpTab11 = new JButton("11");
		btnEilPickUpTab11.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab11.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab11, "cell 4 2");
		
		btnEilPickUpTab12 = new JButton("12");
		btnEilPickUpTab12.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab12.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab12, "cell 1 3");
		
		btnEilPickUpTab13 = new JButton("13");
		btnEilPickUpTab13.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab13.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab13, "cell 2 3");
		
		btnEilPickUpTab14 = new JButton("14");
		btnEilPickUpTab14.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab14.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab14, "cell 3 3");
		
		btnEilPickUpTab15 = new JButton("15");
		btnEilPickUpTab15.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab15.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab15, "cell 4 3");
		
		btnEilPickUpTab16 = new JButton("16");
		btnEilPickUpTab16.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab16.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab16, "cell 1 4");
		
		btnEilPickUpTab17 = new JButton("17");
		btnEilPickUpTab17.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab17.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab17, "cell 2 4");
		
		btnEilPickUpTab18 = new JButton("18");
		btnEilPickUpTab18.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab18.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab18, "cell 3 4");
		
		btnEilPickUpTab19 = new JButton("19");
		btnEilPickUpTab19.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab19.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab19, "cell 4 4");
		
		btnEilPickUpTab20 = new JButton("20");
		btnEilPickUpTab20.setMaximumSize(new Dimension(90, 23));
		btnEilPickUpTab20.setMinimumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab20, "cell 1 5");
		
		btnEilPickUpTab21 = new JButton("21");
		btnEilPickUpTab21.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab21.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab21, "cell 2 5");
		
		btnEilPickUpTab22 = new JButton("22");
		btnEilPickUpTab22.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab22.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab22, "cell 3 5");
		
		btnEilPickUpTab23 = new JButton("23");
		btnEilPickUpTab23.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab23.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab23, "cell 4 5");
		
		btnEilPickUpTab24 = new JButton("24");
		btnEilPickUpTab24.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab24.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab24, "cell 1 6");
		
		btnEilPickUpTab25 = new JButton("25");
		btnEilPickUpTab25.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab25.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab25, "cell 2 6");
		
		btnEilPickUpTab26 = new JButton("26");
		btnEilPickUpTab26.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab26.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab26, "cell 3 6");
		
		btnEilPickUpTab27 = new JButton("27");
		btnEilPickUpTab27.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab27.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab27, "cell 4 6");
		
		btnEilPickUpTab28 = new JButton("28");
		btnEilPickUpTab28.setMaximumSize(new Dimension(90, 23));
		btnEilPickUpTab28.setMinimumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab28, "cell 1 7");
		
		btnEilPickUpTab29 = new JButton("29");
		btnEilPickUpTab29.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab29.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab29, "cell 2 7");
		
		btnEilPickUpTab30 = new JButton("30");
		btnEilPickUpTab30.setMaximumSize(new Dimension(90, 23));
		btnEilPickUpTab30.setMinimumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab30, "cell 3 7");
		
		btnEilPickUpTab31 = new JButton("31");
		btnEilPickUpTab31.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab31.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab31, "cell 4 7");
		
		btnEilPickUpTab32 = new JButton("32");
		btnEilPickUpTab32.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab32.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab32, "cell 1 8");
		
		btnEilPickUpTab33 = new JButton("33");
		btnEilPickUpTab33.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab33.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab33, "cell 2 8");
		
		btnEilPickUpTab34 = new JButton("34");
		btnEilPickUpTab34.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab34.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab34, "cell 3 8");
		
		btnEilPickUpTab35 = new JButton("35");
		btnEilPickUpTab35.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab35.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab35, "cell 4 8");
		
		btnEilPickUpTab36 = new JButton("36");
		btnEilPickUpTab36.setMaximumSize(new Dimension(90, 23));
		btnEilPickUpTab36.setMinimumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab36, "cell 1 9");
		
		btnEilPickUpTab37 = new JButton("37");
		btnEilPickUpTab37.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab37.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab37, "cell 2 9");
		
		btnEilPickUpTab38 = new JButton("38");
		btnEilPickUpTab38.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab38.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab38, "cell 3 9");
		
		btnEilPickUpTab39 = new JButton("39");
		btnEilPickUpTab39.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab39.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab39, "cell 4 9");
		
		btnEilPickUpTab40 = new JButton("40");
		btnEilPickUpTab40.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab40.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab40, "cell 1 10");
		
		btnEilPickUpTab41 = new JButton("41");
		btnEilPickUpTab41.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab41.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab41, "cell 2 10");
		
		btnEilPickUpTab42 = new JButton("42");
		btnEilPickUpTab42.setMaximumSize(new Dimension(90, 23));
		btnEilPickUpTab42.setMinimumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab42, "cell 3 10");
		
		btnEilPickUpTab43 = new JButton("43");
		btnEilPickUpTab43.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab43.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab43, "cell 4 10");
		
		btnEilPickUpTab44 = new JButton("44");
		btnEilPickUpTab44.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab44.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab44, "cell 1 11");
		
		btnEilPickUpTab45 = new JButton("45");
		btnEilPickUpTab45.setMaximumSize(new Dimension(90, 23));
		btnEilPickUpTab45.setMinimumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab45, "cell 2 11");
		
		btnEilPickUpTab46 = new JButton("46");
		btnEilPickUpTab46.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab46.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab46, "cell 3 11");
		
		btnEilPickUpTab47 = new JButton("47");
		btnEilPickUpTab47.setMinimumSize(new Dimension(90, 23));
		btnEilPickUpTab47.setMaximumSize(new Dimension(90, 23));
		pEilPickUp.add(btnEilPickUpTab47, "cell 4 11");
		
		pEilWaitToSend = new JPanel();
		tbpEil.addTab("Wait To Send", null, pEilWaitToSend, null);
		pEilWaitToSend.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		
		btnEilWaitToSendTabBack = new JButton("");
		btnEilWaitToSendTabBack.setMinimumSize(new Dimension(20, 300));
		btnEilWaitToSendTabBack.setMaximumSize(new Dimension(20, 300));
		btnEilWaitToSendTabBack.setIcon(new ImageIcon(GameHard.class.getResource("/resources/back_16.png")));
		pEilWaitToSend.add(btnEilWaitToSendTabBack, "cell 0 0 1 12");
		
		btnEilWaitToSendTab0 = new JButton("0");
		btnEilWaitToSendTab0.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab0.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab0, "cell 1 0");
		
		btnEilWaitToSendTab1 = new JButton("1");
		btnEilWaitToSendTab1.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab1.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab1, "cell 2 0");
		
		btnEilWaitToSendTab2 = new JButton("2");
		btnEilWaitToSendTab2.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab2.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab2, "cell 3 0");
		
		btnEilWaitToSendTab3 = new JButton("3");
		btnEilWaitToSendTab3.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab3.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab3, "cell 4 0");
		
		btnEilWaitToSendTabNext = new JButton("");
		btnEilWaitToSendTabNext.setMinimumSize(new Dimension(20, 300));
		btnEilWaitToSendTabNext.setMaximumSize(new Dimension(20, 300));
		btnEilWaitToSendTabNext.setIcon(new ImageIcon(GameHard.class.getResource("/resources/next_16.png")));
		pEilWaitToSend.add(btnEilWaitToSendTabNext, "cell 5 0 1 12");
		
		btnEilWaitToSendTab4 = new JButton("4");
		btnEilWaitToSendTab4.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab4.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab4, "cell 1 1");
		
		btnEilWaitToSendTab5 = new JButton("5");
		btnEilWaitToSendTab5.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab5.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab5, "cell 2 1");
		
		btnEilWaitToSendTab6 = new JButton("6");
		btnEilWaitToSendTab6.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab6.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab6, "cell 3 1");
		
		btnEilWaitToSendTab7 = new JButton("7");
		btnEilWaitToSendTab7.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab7.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab7, "cell 4 1");
		
		btnEilWaitToSendTab8 = new JButton("8");
		btnEilWaitToSendTab8.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab8.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab8, "cell 1 2");
		
		btnEilWaitToSendTab9 = new JButton("9");
		btnEilWaitToSendTab9.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab9.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab9, "cell 2 2");
		
		btnEilWaitToSendTab10 = new JButton("10");
		btnEilWaitToSendTab10.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab10.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab10, "cell 3 2");
		
		btnEilWaitToSendTab11 = new JButton("11");
		btnEilWaitToSendTab11.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab11.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab11, "cell 4 2");
		
		btnEilWaitToSendTab12 = new JButton("12");
		btnEilWaitToSendTab12.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab12.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab12, "cell 1 3");
		
		btnEilWaitToSendTab13 = new JButton("13");
		btnEilWaitToSendTab13.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab13.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab13, "cell 2 3");
		
		btnEilWaitToSendTab14 = new JButton("14");
		btnEilWaitToSendTab14.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab14.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab14, "cell 3 3");
		
		btnEilWaitToSendTab15 = new JButton("15");
		btnEilWaitToSendTab15.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab15.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab15, "cell 4 3");
		
		btnEilWaitToSendTab16 = new JButton("16");
		btnEilWaitToSendTab16.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab16.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab16, "cell 1 4");
		
		btnEilWaitToSendTab17 = new JButton("17");
		btnEilWaitToSendTab17.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab17.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab17, "cell 2 4");
		
		btnEilWaitToSendTab18 = new JButton("18");
		btnEilWaitToSendTab18.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab18.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab18, "cell 3 4");
		
		btnEilWaitToSendTab19 = new JButton("19");
		btnEilWaitToSendTab19.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab19.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab19, "cell 4 4");
		
		btnEilWaitToSendTab20 = new JButton("20");
		btnEilWaitToSendTab20.setMaximumSize(new Dimension(90, 23));
		btnEilWaitToSendTab20.setMinimumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab20, "cell 1 5");
		
		btnEilWaitToSendTab21 = new JButton("21");
		btnEilWaitToSendTab21.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab21.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab21, "cell 2 5");
		
		btnEilWaitToSendTab22 = new JButton("22");
		btnEilWaitToSendTab22.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab22.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab22, "cell 3 5");
		
		btnEilWaitToSendTab23 = new JButton("23");
		btnEilWaitToSendTab23.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab23.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab23, "cell 4 5");
		
		btnEilWaitToSendTab24 = new JButton("24");
		btnEilWaitToSendTab24.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab24.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab24, "cell 1 6");
		
		btnEilWaitToSendTab25 = new JButton("25");
		btnEilWaitToSendTab25.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab25.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab25, "cell 2 6");
		
		btnEilWaitToSendTab26 = new JButton("26");
		btnEilWaitToSendTab26.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab26.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab26, "cell 3 6");
		
		btnEilWaitToSendTab27 = new JButton("27");
		btnEilWaitToSendTab27.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab27.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab27, "cell 4 6");
		
		btnEilWaitToSendTab28 = new JButton("28");
		btnEilWaitToSendTab28.setMaximumSize(new Dimension(90, 23));
		btnEilWaitToSendTab28.setMinimumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab28, "cell 1 7");
		
		btnEilWaitToSendTab29 = new JButton("29");
		btnEilWaitToSendTab29.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab29.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab29, "cell 2 7");
		
		btnEilWaitToSendTab30 = new JButton("30");
		btnEilWaitToSendTab30.setMaximumSize(new Dimension(90, 23));
		btnEilWaitToSendTab30.setMinimumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab30, "cell 3 7");
		
		btnEilWaitToSendTab31 = new JButton("31");
		btnEilWaitToSendTab31.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab31.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab31, "cell 4 7");
		
		btnEilWaitToSendTab32 = new JButton("32");
		btnEilWaitToSendTab32.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab32.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab32, "cell 1 8");
		
		btnEilWaitToSendTab33 = new JButton("33");
		btnEilWaitToSendTab33.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab33.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab33, "cell 2 8");
		
		btnEilWaitToSendTab34 = new JButton("34");
		btnEilWaitToSendTab34.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab34.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab34, "cell 3 8");
		
		btnEilWaitToSendTab35 = new JButton("35");
		btnEilWaitToSendTab35.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab35.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab35, "cell 4 8");
		
		btnEilWaitToSendTab36 = new JButton("36");
		btnEilWaitToSendTab36.setMaximumSize(new Dimension(90, 23));
		btnEilWaitToSendTab36.setMinimumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab36, "cell 1 9");
		
		btnEilWaitToSendTab37 = new JButton("37");
		btnEilWaitToSendTab37.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab37.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab37, "cell 2 9");
		
		btnEilWaitToSendTab38 = new JButton("38");
		btnEilWaitToSendTab38.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab38.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab38, "cell 3 9");
		
		btnEilWaitToSendTab39 = new JButton("39");
		btnEilWaitToSendTab39.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab39.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab39, "cell 4 9");
		
		btnEilWaitToSendTab40 = new JButton("40");
		btnEilWaitToSendTab40.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab40.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab40, "cell 1 10");
		
		btnEilWaitToSendTab41 = new JButton("41");
		btnEilWaitToSendTab41.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab41.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab41, "cell 2 10");
		
		btnEilWaitToSendTab42 = new JButton("42");
		btnEilWaitToSendTab42.setMaximumSize(new Dimension(90, 23));
		btnEilWaitToSendTab42.setMinimumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab42, "cell 3 10");
		
		btnEilWaitToSendTab43 = new JButton("43");
		btnEilWaitToSendTab43.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab43.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab43, "cell 4 10");
		
		btnEilWaitToSendTab44 = new JButton("44");
		btnEilWaitToSendTab44.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab44.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab44, "cell 1 11");
		
		btnEilWaitToSendTab45 = new JButton("45");
		btnEilWaitToSendTab45.setMaximumSize(new Dimension(90, 23));
		btnEilWaitToSendTab45.setMinimumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab45, "cell 2 11");
		
		btnEilWaitToSendTab46 = new JButton("46");
		btnEilWaitToSendTab46.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab46.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab46, "cell 3 11");
		
		btnEilWaitToSendTab47 = new JButton("47");
		btnEilWaitToSendTab47.setMinimumSize(new Dimension(90, 23));
		btnEilWaitToSendTab47.setMaximumSize(new Dimension(90, 23));
		pEilWaitToSend.add(btnEilWaitToSendTab47, "cell 4 11");
	}
	
	private void initiateEvents() {
		
	}
}
