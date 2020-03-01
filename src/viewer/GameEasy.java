package viewer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import game.objects.BankAccount;
import game.objects.Branch;
import game.objects.Clock;
import game.objects.GameSave;
import game.objects.Locker;
import game.objects.Package;
import game.objects.Person;
import game.objects.PostalCompany;
import net.miginfocom.swing.MigLayout;
import viewer.objects.JButtonGame;
import viewer.objects.JPanelOverall;
import viewer.objects.JPanelTab;

public class GameEasy extends JDialog {

	// The game objects.
	private String strPlayer;
	private Clock cMain;
	private BankAccount baMain = new BankAccount();
	private PostalCompany pcMain;
	private final Locker objLockPC = new Locker();
	private int[] iExit = new int[] { 0, 0, 0 }; // { ExitCode: 0=Resume game|1=Lose&save|2=Quit&Save|3=Quit without saving , Score, Difficulty=0=Easy }
//	private final transient Object objPauseLock = new Object();
//	private volatile boolean bIsGamePaused = false;
//	private volatile boolean bDidTheGameEnd = false;
	// Side frames.
	private PauseWindow fPause;
	// ContentPanel
	private JPanel contentPane;
	private JLabel lblDayCounter;
	private JLabel lblGoldCounter;
	private JLabel lblTimeCounter;
	private JProgressBar pbTimeTillEndDay;
	private JButton btnOptions;
	// Connection between the game objects to the tab panels.
	private final Locker objLockPages = new Locker();
	private int[][][] iTotalPages = new int[3][8][2]; //[Branch][Group][0=Number of pages,1=Current page]
	// All the buttons in the tab panels.
	private final Locker objLockButtons = new Locker();
	private JButton[][][] btnPanels = new JButtonGame[3][10][]; //[Branch][Group][Index]
	// Tab Panels
	private JTabbedPane[] tbpArray = new JTabbedPane[3];
	private JPanel[][] pArray = new JPanel[3][5];
	private JLabel[] lblOverall = new JLabel[6];
	// other
	private ExecutorService threadPool = Executors.newFixedThreadPool(1000);
	
	/** Launch the application. */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameEasy frame = new GameEasy("Shaked");
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** Create the frame. */
	public GameEasy(String strPlayer) {
		super(null, java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
		initiateComponents(strPlayer);
		initiateEvents();
		runGame();
	}
	
	public GameEasy(String strPlayer, PostalCompany pcMain, Clock cMain, BankAccount baMain) {
		super(null, java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
		initiateComponents(strPlayer);
		GameEasy.this.pcMain = pcMain;
		GameEasy.this.cMain = cMain;
		GameEasy.this.baMain = baMain;
		updateUIEverything();
		initiateEvents();
		runGameResume();
	}
	
	// Get methods
	public int[] getExit() {
		return iExit;
	}
	
	public PostalCompany getPostal() {
		return pcMain;
	}
	
	public Clock getClock() {
		return cMain;
	}
	
	public BankAccount getBank() {
		return this.baMain;
	}
	
	public String getPlayer() {
		return this.strPlayer;
	}
	
	// Initiate items
	private void initiateComponents(String strPlayer) {
		this.strPlayer = strPlayer;
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameEasy.class.getResource("/resources/mail_256.png")));
		setTitle("The Mail System");
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 960, 880);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tbpArray[0] = new JTabbedPane(JTabbedPane.TOP);
		tbpArray[0].setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Haifa", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		tbpArray[1] = new JTabbedPane(JTabbedPane.TOP);
		tbpArray[1].setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tel Aviv", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		tbpArray[2] = new JTabbedPane(JTabbedPane.TOP);
		tbpArray[2].setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Eilat", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 0)));
		
		JLabel lblDays = new JLabel("Days:");
		lblDays.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDays.setToolTipText("The number of days you have worked");
		
		lblDayCounter = new JLabel("000");
		lblDayCounter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblTimeCounter = new JLabel("08:00");
		lblTimeCounter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTimeTillEnd = new JLabel("Time till end day:");
		lblTimeTillEnd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		pbTimeTillEndDay = new JProgressBar();
		pbTimeTillEndDay.setMaximum(660);
		
		JLabel lblGold = new JLabel("Gold:");
		lblGold.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblGoldCounter = new JLabel("00000");
		lblGoldCounter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnOptions = new JButton("");
		btnOptions.setIcon(new ImageIcon(GameEasy.class.getResource("/resources/options_32.png")));
		
		JTable tblTravelTimes = new JTable();
		tblTravelTimes.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		tblTravelTimes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tblTravelTimes.setRowSelectionAllowed(false);
		tblTravelTimes.setModel(new DefaultTableModel(
			new Object[][] {
				{" FROM/TO", "Haifa", "Tel-Aviv", "Eilat"},
				{" Haifa", "0", "1", "5"},
				{" Tel-Aviv", "1", "0", "4"},
				{" Eilat", "5", "4", "0"},
			},
			new String[] {
				"From", "Haifa", "Tel Aviv", "Eilat"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, false, false
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
		
		JLabel lblTravelTimes = new JLabel("Travel Times:");
		lblTravelTimes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(tbpArray[1], GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(tbpArray[0], GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE))
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
									.addGap(30)
									.addComponent(lblGold)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblGoldCounter)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnOptions, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(lblTravelTimes)
							.addGap(10)
							.addComponent(tblTravelTimes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(tbpArray[2], GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
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
									.addComponent(lblGoldCounter))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(btnOptions, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tbpArray[0], GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
						.addComponent(tbpArray[1], GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(tbpArray[2], GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(169)
							.addComponent(tblTravelTimes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(192)
							.addComponent(lblTravelTimes)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		SwingWorker<Void, Void> swInitiatePages = new SwingWorker<Void, Void>() {

			@Override
			protected Void doInBackground() throws Exception {
				synchronized (objLockPages) {
					for (int iBranch = 0; iBranch < iTotalPages.length; iBranch++) {
						for (int iGroup = 0; iGroup < iTotalPages[iBranch].length; iGroup++) {
							iTotalPages[iBranch][iGroup][0] = 0;
							iTotalPages[iBranch][iGroup][1] = 1;
						}
					}
				}
				return null;
			}
		};
		swInitiatePages.execute();
		initiatePanels(0);
		initiatePanels(1);
		initiatePanels(2);
	}
	
	private void initiatePanels(int iBranch) {
		// Create the buttons objects for [0]Sending, [1]Receiving, [2]PickUp and [3]WaitingToSend
		for (int iCount = 0; iCount < 4; iCount++) {
			btnPanels[iBranch][iCount] = new JButtonGame[] { new JButtonGame("", iBranch, 0, iCount), new JButtonGame("", iBranch, 1, iCount),
					new JButtonGame("", iBranch, 2, iCount), new JButtonGame("", iBranch, 3, iCount), new JButtonGame("", iBranch, 4, iCount),
					new JButtonGame("", iBranch, 5, iCount), new JButtonGame("", iBranch, 6, iCount), new JButtonGame("", iBranch, 7, iCount) };
		}
		
		// Create the buttons objects for [4]QSenders and [5]QReceivers
		for (int iCount = 4; iCount < 6; iCount++) {
			btnPanels[iBranch][iCount] = new JButtonGame[] { new JButtonGame("", iBranch, 0, iCount), new JButtonGame("", iBranch, 1, iCount),
					new JButtonGame("", iBranch, 2, iCount), new JButtonGame("", iBranch, 3, iCount), new JButtonGame("", iBranch, 4, iCount) };
		}
		
		// Create the buttons objects for [6]SendingTab, [7]ReceivingTab, [8]PickUpTab and [9]WaitToSendTab
		for (int iCount = 6; iCount < 10; iCount++) {
			btnPanels[iBranch][iCount] = new JButtonGame[] { new JButtonGame("", iBranch, 0, iCount), new JButtonGame("", iBranch, 1, iCount),
					new JButtonGame("", iBranch, 2, iCount), new JButtonGame("", iBranch, 3, iCount), new JButtonGame("", iBranch, 4, iCount),
					new JButtonGame("", iBranch, 5, iCount), new JButtonGame("", iBranch, 6, iCount), new JButtonGame("", iBranch, 7, iCount),
					new JButtonGame("", iBranch, 8, iCount), new JButtonGame("", iBranch, 9, iCount), new JButtonGame("", iBranch, 10, iCount),
					new JButtonGame("", iBranch, 11, iCount), new JButtonGame("", iBranch, 12, iCount), new JButtonGame("", iBranch, 13, iCount),
					new JButtonGame("", iBranch, 14, iCount), new JButtonGame("", iBranch, 15, iCount), new JButtonGame("", iBranch, 16, iCount),
					new JButtonGame("", iBranch, 17, iCount), new JButtonGame("", iBranch, 18, iCount), new JButtonGame("", iBranch, 19, iCount),
					new JButtonGame("", iBranch, 20, iCount), new JButtonGame("", iBranch, 21, iCount), new JButtonGame("", iBranch, 22, iCount),
					new JButtonGame("", iBranch, 23, iCount), new JButtonGame("", iBranch, 24, iCount), new JButtonGame("", iBranch, 25, iCount),
					new JButtonGame("", iBranch, 26, iCount), new JButtonGame("", iBranch, 27, iCount), new JButtonGame("", iBranch, 28, iCount),
					new JButtonGame("", iBranch, 29, iCount), new JButtonGame("", iBranch, 30, iCount), new JButtonGame("", iBranch, 31, iCount),
					new JButtonGame("", iBranch, 32, iCount), new JButtonGame("", iBranch, 33, iCount), new JButtonGame("", iBranch, 34, iCount),
					new JButtonGame("", iBranch, 35, iCount), new JButtonGame("", iBranch, 36, iCount), new JButtonGame("", iBranch, 37, iCount),
					new JButtonGame("", iBranch, 38, iCount), new JButtonGame("", iBranch, 39, iCount), new JButtonGame("", iBranch, 40, iCount),
					new JButtonGame("", iBranch, 41, iCount), new JButtonGame("", iBranch, 42, iCount), new JButtonGame("", iBranch, 43, iCount),
					new JButtonGame("", iBranch, 44, iCount), new JButtonGame("", iBranch, 45, iCount), new JButtonGame("", iBranch, 46, iCount),
					new JButtonGame("", iBranch, 47, iCount), new JButtonGame("", iBranch, 48, iCount), new JButtonGame("", iBranch, 49, iCount) };
		}
		
		// button for [0]Sending, [1]Receiving, [2]PickUp and [3]WaitingToSend
		for (int iGroup = 0; iGroup < 4; iGroup++) {
			for (int iIndex = 0; iIndex < 7; iIndex++) {
				btnPanels[iBranch][iGroup][iIndex].setVisible(false);
				btnPanels[iBranch][iGroup][iIndex].setMinimumSize(new Dimension(90, 23));
				btnPanels[iBranch][iGroup][iIndex].setMaximumSize(new Dimension(90, 23));
			}
			btnPanels[iBranch][iGroup][6].setVisible(false);
			btnPanels[iBranch][iGroup][6].setMinimumSize(new Dimension(20, 48));
			btnPanels[iBranch][iGroup][6].setMaximumSize(new Dimension(20, 48));
			btnPanels[iBranch][iGroup][6].setIcon(new ImageIcon(GameEasy.class.getResource("/resources/back_16.png")));
			
			btnPanels[iBranch][iGroup][7].setVisible(false);
			btnPanels[iBranch][iGroup][7].setMinimumSize(new Dimension(20, 48));
			btnPanels[iBranch][iGroup][7].setMaximumSize(new Dimension(20, 48));
			btnPanels[iBranch][iGroup][7].setIcon(new ImageIcon(GameEasy.class.getResource("/resources/next_16.png")));
		}
		// Disable [0]Sending buttons
		for (int iIndex = 0; iIndex < 7; iIndex++) {
			btnPanels[iBranch][0][iIndex].setEnabled(false);
		}
		
		// buttons for [4]QSenders, [5]QReceivers
		for (int iIndex = 0; iIndex < 5; iIndex++) {
			btnPanels[iBranch][4][iIndex].setVisible(false);
			btnPanels[iBranch][4][iIndex].setEnabled(false);
			btnPanels[iBranch][4][iIndex].setMinimumSize(new Dimension(90, 23));
			btnPanels[iBranch][4][iIndex].setMaximumSize(new Dimension(90, 23));
			
			btnPanels[iBranch][5][iIndex].setVisible(false);
			btnPanels[iBranch][5][iIndex].setEnabled(false);
			btnPanels[iBranch][5][iIndex].setMinimumSize(new Dimension(90, 23));
			btnPanels[iBranch][5][iIndex].setMaximumSize(new Dimension(90, 23));
		}
		btnPanels[iBranch][4][0].setEnabled(true);
		btnPanels[iBranch][5][0].setEnabled(true);
		
		// buttons for [6]SendingTab, [7]ReceivingTab, [8]PickUpTab and [9]WaitToSendTab
		for (int iGroup = 6; iGroup < 10; iGroup++) {
			for (int iIndex = 0; iIndex < 48; iIndex++) {
				btnPanels[iBranch][iGroup][iIndex].setVisible(false);
				btnPanels[iBranch][iGroup][iIndex].setMinimumSize(new Dimension(90, 23));
				btnPanels[iBranch][iGroup][iIndex].setMaximumSize(new Dimension(90, 23));
			}
			btnPanels[iBranch][iGroup][48].setVisible(false);
			btnPanels[iBranch][iGroup][48].setMinimumSize(new Dimension(20, 300));
			btnPanels[iBranch][iGroup][48].setMaximumSize(new Dimension(20, 300));
			btnPanels[iBranch][iGroup][48].setIcon(new ImageIcon(GameEasy.class.getResource("/resources/back_16.png")));
			
			btnPanels[iBranch][iGroup][49].setVisible(false);
			btnPanels[iBranch][iGroup][49].setMinimumSize(new Dimension(20, 300));
			btnPanels[iBranch][iGroup][49].setMaximumSize(new Dimension(20, 300));
			btnPanels[iBranch][iGroup][49].setIcon(new ImageIcon(GameEasy.class.getResource("/resources/next_16.png")));
		}
		// Disable [6]SendingTab buttons
		for (int iIndex = 0; iIndex < 48; iIndex++) {
			btnPanels[iBranch][6][iIndex].setEnabled(false);
		}
		
		// Create all the sub panels: [0]Overall, [1]Sending, [2]Receiving, [3]PickUp and [4]WaitToSend
		pArray[iBranch][0] = new JPanelOverall();
		pArray[iBranch][0].setLayout(new MigLayout("", "[right][][][][][]", "[][][][][][][][][][][][]"));
		for (int iPanel = 1; iPanel < 5; iPanel++) {
			pArray[iBranch][iPanel] = new JPanelTab();
			pArray[iBranch][iPanel].setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][][]"));
		}
		
		// Create the labels for the Overall panel
		lblOverall[0] = new JLabel("Sending:");
		lblOverall[1] = new JLabel("Receiving:");
		lblOverall[2] = new JLabel("Pick Up:");
		lblOverall[3] = new JLabel("Waiting To Send:");
		lblOverall[4] = new JLabel("Q. Senders:");
		lblOverall[5] = new JLabel("Q. Receivers:");
		for (int iLabel = 0; iLabel < 6; iLabel++) {
			lblOverall[iLabel].setHorizontalAlignment(SwingConstants.LEFT);
			lblOverall[iLabel].setFont(new Font("Tahoma", Font.PLAIN, 12));
		}
		lblOverall[2].setToolTipText("Pick Up Line");
		lblOverall[4].setToolTipText("Queue Senders");
		lblOverall[5].setToolTipText("Queue Receivers");
		
		// Add labels to Overall panel.
		pArray[iBranch][0].add(lblOverall[0], "cell 0 0 1 2");
		pArray[iBranch][0].add(lblOverall[1], "cell 0 2 1 2");
		pArray[iBranch][0].add(lblOverall[2], "cell 0 4 1 2");
		pArray[iBranch][0].add(lblOverall[3], "cell 0 6 1 2");
		pArray[iBranch][0].add(lblOverall[4], "cell 0 8 1 2");
		pArray[iBranch][0].add(lblOverall[5], "cell 0 10 1 2");
		
		// Add buttons to Overall panel.
		// [0]Sending, [1]Receiving, [2]PickUp and [3]WaitingToSend
		int iRow = 0, iIndex, iRow2 = 0;
		for (int iGroup = 0; iGroup < 4; iGroup++) {
			iIndex = 0;
			for (int iCount = 0; iCount < 2; iCount++) {
				for (int iCol = 2; iCol < 5; iCol++) {
					pArray[iBranch][0].add(btnPanels[iBranch][iGroup][iIndex], String.format("cell %d %d", iCol, iRow));
					iIndex++;
				}
				iRow++;
			}
			pArray[iBranch][0].add(btnPanels[iBranch][iGroup][6], String.format("cell 1 %d 1 2", iRow2));
			pArray[iBranch][0].add(btnPanels[iBranch][iGroup][7], String.format("cell 5 %d 1 2", iRow2));
			iRow2 = iRow2+2;
		}
		// [4]QSenders and [5]QReceivers
		iRow = 8;
		for (int iGroup = 4; iGroup < 6; iGroup++) {
			iIndex = 0;
			for (int iCol = 2; iCol < 5; iCol++) {
				pArray[iBranch][0].add(btnPanels[iBranch][iGroup][iIndex], String.format("cell %d %d", iCol, iRow));
				iIndex++;
			}
			iRow++;
			pArray[iBranch][0].add(btnPanels[iBranch][iGroup][iIndex], String.format("cell 2 %d 2 1,alignx center", iRow));
			iIndex++;
			pArray[iBranch][0].add(btnPanels[iBranch][iGroup][iIndex], String.format("cell 3 %d 2 1,alignx center", iRow));
			iRow++;
		}
		
		// Add buttons to tabs: [1]Sending, [2]Receiving, [3]PickUp and [4]WaitToSend
		iIndex = 0;
		for (iRow = 0; iRow < 12; iRow++) {
			for (int iCol = 1; iCol < 5; iCol++) {
				pArray[iBranch][1].add(btnPanels[iBranch][6][iIndex], String.format("cell %d %d",iCol, iRow));
				pArray[iBranch][2].add(btnPanels[iBranch][7][iIndex], String.format("cell %d %d",iCol, iRow));
				pArray[iBranch][3].add(btnPanels[iBranch][8][iIndex], String.format("cell %d %d",iCol, iRow));
				pArray[iBranch][4].add(btnPanels[iBranch][9][iIndex], String.format("cell %d %d",iCol, iRow));
				iIndex++;
			}
		}
		for (int iTab = 1; iTab < 5; iTab++) {
			pArray[iBranch][iTab].add(btnPanels[iBranch][iTab+5][48], "cell 0 0 1 12");
			pArray[iBranch][iTab].add(btnPanels[iBranch][iTab+5][49], "cell 5 0 1 12");
		}
		
		// Add all sub panels to the Tab panel
		tbpArray[iBranch].addTab("Overall", null, pArray[iBranch][0], null);
		tbpArray[iBranch].addTab("Sending", null, pArray[iBranch][1], null);
		tbpArray[iBranch].addTab("Receiving", null, pArray[iBranch][2], null);
		tbpArray[iBranch].addTab("Pick up line", null, pArray[iBranch][3], null);
		tbpArray[iBranch].addTab("Wait To Send", null, pArray[iBranch][4], null);
	}

	private void initiateEvents() {
		// Pause game when window minimized
		WindowAdapter waMinimize = new WindowAdapter() {

			@Override
			public void windowIconified(WindowEvent we) {
				cMain.pauseThread();
				pcMain.pauseThread();
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				SwingWorker<int[], Void> swShowPause = new SwingWorker<int[], Void>() {

					@Override
					protected int[] doInBackground() throws Exception {
						int iMostCash = baMain.getMostCash();
						int[] iInfo = {( (iMostCash/10) + (cMain.getDay()*100) ), iMostCash};
						return iInfo;
					}

					@Override
					protected void done() {
						int[] iInfo = {-1,-1};
						try {
							iInfo = get();
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ExecutionException e) {
							e.printStackTrace();
						}
						Window parentWindow = SwingUtilities.windowForComponent(btnOptions);
						fPause = new PauseWindow(strPlayer,0,iInfo[0],iInfo[1], parentWindow, GameEasy.this.cMain.getDay() );
						fPause.setModal(true);
						fPause.setLocation((int)(getLocationOnScreen().getX()+(getSize().getWidth()-fPause.getSize().getWidth())/2),
								(int)(getLocationOnScreen().getY()+(getSize().getHeight()-fPause.getSize().getHeight())/2));
						fPause.setVisible(true);
						cMain.resumeThread();
						pcMain.resumeThread();
					}
				};
				swShowPause.execute();
			}
		};
		
		// Add the WindowAdapter to the frame.
		addWindowListener(waMinimize);
		
		// Options button has been clicked.
		// Will open the options menu dialog.
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingWorker<int[], Void> swPause = new SwingWorker<int[], Void>() {

					@Override
					protected int[] doInBackground() throws Exception {
						int iMostCash = baMain.getMostCash();
						int[] iInfo = {( (iMostCash/10) + (cMain.getDay()*100) ), iMostCash};
						return iInfo;
					}

					@Override
					protected void done() {
						int[] iInfo = {-1,-1};
						try {
							iInfo = get();
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ExecutionException e) {
							e.printStackTrace();
						}
						Window parentWindow = SwingUtilities.windowForComponent(btnOptions);
						fPause = new PauseWindow(strPlayer,0,iInfo[0],iInfo[1], parentWindow, GameEasy.this.cMain.getDay());
						fPause.setModal(true);
						fPause.setLocation((int)(getLocationOnScreen().getX()+(getSize().getWidth()-fPause.getSize().getWidth())/2),
								(int)(getLocationOnScreen().getY()+(getSize().getHeight()-fPause.getSize().getHeight())/2));
						cMain.pauseThread();
						pcMain.pauseThread();
						fPause.setVisible(true);
						switch (fPause.getExit()[0]) {
						case 0:
							if (fPause.getExit()[2] == 1) {
								GameEasy.this.cMain.setHour(18);
								GameEasy.this.cMain.setMinute(50);
							}
							if (baMain.addOrRemoveCash(fPause.getExit()[1])) {
								pcMain.setTheGameEnd(true);
							} else {
								lblGoldCounter.setText(baMain.toString());
							}
							iExit[0] = 0;
							break;
						case 1:
							if (fPause.getExit()[2] == 1) {
								GameEasy.this.cMain.setHour(18);
								GameEasy.this.cMain.setMinute(50);
							}
							if (baMain.addOrRemoveCash(fPause.getExit()[1])) {
								iExit[0] = 1;
							} else {
								lblGoldCounter.setText(baMain.toString());
								iExit[0] = 2;
							}
							pcMain.setTheGameEnd(true);
							
							break;
						case 2:
							pcMain.setTheGameEnd(true);
							iExit[0] = 3;
							break;
						}
						cMain.resumeThread();
						pcMain.resumeThread();
					}
				};
				threadPool.submit(swPause);
			}
		});
		
		// Mouse listener for all buttons.
		MouseAdapter maTurnGlowOff = new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				e.getComponent().setBackground(UIManager.getColor("control"));
			}
		};
		
		// Action for QSenders buttons
		ActionListener alAccpetPackage = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingWorker<Integer[], Integer> swAccpetPackage = new SwingWorker<Integer[], Integer>() {

					@Override
					protected Integer[] doInBackground() throws Exception {
					    Pattern pIndex = Pattern.compile("(\\d+)");
					    Matcher mString = pIndex.matcher(e.getSource().toString());
					    mString.find();
					    int iBranch = Integer.valueOf(mString.group());
					    
						pcMain.takePackageFromPerson(iBranch);
						pcMain.decreaseBusyBranches(iBranch);
					    
						Integer[] iArrayReturn = new Integer[] {iBranch, -1};
						publish(iBranch);
						iArrayReturn[1] = pcMain.getBranch(iBranch).getPersonSend().size();
						return iArrayReturn;
					}

					@Override
					protected void process(List<Integer> chunks) {
						for (Integer iBranch : chunks) {
							synchronized (objLockButtons) {
								btnPanels[iBranch][4][0].setText(btnPanels[iBranch][4][1].getText());
								btnPanels[iBranch][4][0].setToolTipText(btnPanels[iBranch][4][1].getToolTipText());
								
								btnPanels[iBranch][4][1].setText(btnPanels[iBranch][4][2].getText());
								btnPanels[iBranch][4][1].setToolTipText(btnPanels[iBranch][4][2].getToolTipText());
								
								btnPanels[iBranch][4][2].setText(btnPanels[iBranch][4][3].getText());
								btnPanels[iBranch][4][2].setToolTipText(btnPanels[iBranch][4][3].getToolTipText());
								
								btnPanels[iBranch][4][3].setText(btnPanels[iBranch][4][4].getText());
								btnPanels[iBranch][4][3].setToolTipText(btnPanels[iBranch][4][4].getToolTipText());
							}
						}
					}

					@Override
					protected void done() {
						try {
							int iBranch = get()[0];
							synchronized (objLockButtons) {
								btnPanels[iBranch][4][get()[1]].setVisible(false);
							}
							updateUIlist(3,iBranch);
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ExecutionException e) {
							e.printStackTrace();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				threadPool.submit(swAccpetPackage);
			}
		};
		
		// Action for WaitingToSend's Next button
		ActionListener alNextPageWaitingToSend = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUInextPageOverall(3, e);
			}
		};
		
		// Action for WaitingToSend's Back button
		ActionListener alBackPageWaitingToSend = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUIbackPageOverall(3, e);
			}
		};
		
		// Action for WaitingToSend buttons
		ActionListener alSendPackage = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SwingWorker<Integer[], Integer> swSendPackage = new SwingWorker<Integer[], Integer>() {

					@Override
					protected Integer[] doInBackground() throws Exception {
						Pattern pIndex = Pattern.compile("(\\d+)");
					    Matcher mString = pIndex.matcher(e.getSource().toString());
					    mString.find();
					    int iBranch = Integer.valueOf(mString.group());
					    mString.find();
					    int iIndex = Integer.valueOf(mString.group());
					    mString.find();
					    mString.find();
					    mString.find();
					    int iGroup = Integer.valueOf(mString.group());
					    
					    Window parentWindow;
					    if (iGroup == 3) {
					    	parentWindow = SwingUtilities.windowForComponent(btnPanels[iBranch][3][iIndex]);
					    	iIndex += (iTotalPages[iBranch][3][1]-1)*6;
					    }
					    else {
					    	parentWindow = SwingUtilities.windowForComponent(btnPanels[iBranch][9][iIndex]);
					    	iIndex += (iTotalPages[iBranch][7][1]-1)*6;
					    }
					    
					    SendPackageEasy fChoose = new SendPackageEasy(iBranch, parentWindow);
					    fChoose.setLocation(MouseInfo.getPointerInfo().getLocation());
					    fChoose.setVisible(true);
					    int iNextBranch = fChoose.getChoice();
					    if (iNextBranch != -1) {
					    	int iHoursTillDeliveried = pcMain.howHoursBetweenBranches(iBranch, iNextBranch);
							if (cMain.didTheDayAlreadyEnded(cMain.getTimeInXHours(iHoursTillDeliveried))) {
								JOptionPane.showMessageDialog(GameEasy.this, "The day is about to end! there is no time to send the package today.", "Package Was Not Sent", JOptionPane.ERROR_MESSAGE);
								return new Integer[] {-1, 0};
							}
							else {
								int iPackageID = -1;
								synchronized (objLockPC) {
									pcMain.decreaseActions();
									int[] iTimeOfArriving = cMain.getTimeInXHours(iHoursTillDeliveried);
									iPackageID = pcMain.movePackageFromWaitSendToSending(iBranch, iIndex, iTimeOfArriving);
									publish(iBranch);
								}
								
								for (int iCount = (iHoursTillDeliveried * 60); iCount>0; iCount-- ) {
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									pcMain.checkForPaused();
								}
								
								synchronized (objLockPC) {
									int iIndexSending = -1, iTempIndex;
									Package paTemp;
									List<Package> lSending = pcMain.getBranch(iBranch).getBranchSend();
									ListIterator<Package> iterator = lSending.listIterator();
									while (iterator.hasNext()) {
										iTempIndex = iterator.nextIndex();
										paTemp = iterator.next();
										if (paTemp.getID() == iPackageID) {
											iIndexSending = iTempIndex;
											break;
										}
									}
									
									//pcMain.updatePackageTimeLeft(iBranch, 0, iIndexSending, iHoursTillDeliveried); /////////////////////////DELETED
									int iIndexReceiving = pcMain.movePackageBetweenBranches(iBranch, iNextBranch, iIndexSending);
									pcMain.updatePackageLocation(iNextBranch, iIndexReceiving);
									pcMain.incrementActions();
								}
								
								return new Integer[] {iBranch, iNextBranch};
							}
					    } else
					    	return new Integer[] {-1, 0};
					}

					@Override
					protected void process(List<Integer> chunks) {
						for (int iBranch : chunks) {
							updateUIlist(3, iBranch);
							updateUIlist(0, iBranch);
						}
					}

					@Override
					protected void done() {
						try {
							int iBranch = get()[0];
							int iNextBranch = get()[1];
							if (iBranch != -1) {
								updateUIlist(1, iNextBranch);
								updateUIlist(0, iBranch);
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ExecutionException e) {
							e.printStackTrace();
						}
					}
				};
				threadPool.submit(swSendPackage);
			}
		};
		
		// Action for Sending's Next button
		ActionListener alNextPageSending = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUInextPageOverall(0, e);
			}
		};

		// Action for Sending's Back button
		ActionListener alBackPageSending = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUIbackPageOverall(0, e);
			}
		};
		
		// Action for Receiving's buttons
		ActionListener alPackageAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SwingWorker<Void, Integer[]> swPackageAction = new SwingWorker<Void, Integer[]>() {

					@Override
					protected Void doInBackground() throws Exception {
						Pattern pIndex = Pattern.compile("(\\d+)");
					    Matcher mString = pIndex.matcher(e.getSource().toString());
					    mString.find();
					    int iBranch = Integer.valueOf(mString.group());
					    mString.find();
					    int iIndex = Integer.valueOf(mString.group());
					    mString.find();
					    mString.find();
					    mString.find();
					    int iGroup = Integer.valueOf(mString.group());
					    
					    Window parentWindow;
					    if (iGroup == 1) {
					    	parentWindow = SwingUtilities.windowForComponent(btnPanels[iBranch][1][iIndex]);
					    	iIndex += (iTotalPages[iBranch][1][1]-1)*6;
					    }
						else {
							parentWindow = SwingUtilities.windowForComponent(btnPanels[iBranch][7][iIndex]);
							iIndex += (iTotalPages[iBranch][5][1]-1)*6;
						}
					    
					    PackageAction fChoose = new PackageAction(parentWindow);
					    fChoose.setLocation(MouseInfo.getPointerInfo().getLocation());
					    fChoose.setVisible(true);
					    switch (fChoose.getChoice()) {
					    case -1:
					    	break;
					    case 2:
					    	int iPackageID = -2;
							synchronized (objLockPC) {
								iPackageID = pcMain.movePackageFromReceivedToPickUp(iBranch, iIndex);
							}
							if (iPackageID < 0) {
								JOptionPane.showMessageDialog(GameEasy.this, "The package does not belong to this branch.", "Package Location", JOptionPane.ERROR_MESSAGE);
							} else {
								Package paTemp;
								synchronized (objLockPC) {
									int iIndexPickUp = -2, iTempIndex;
									List<Package> lPickUp = pcMain.getBranch(iBranch).getPickUp();
									ListIterator<Package> iterator = lPickUp.listIterator();
									while (iterator.hasNext()) {
										iTempIndex = iterator.nextIndex();
										paTemp = iterator.next();
										if (paTemp.getID() == iPackageID) {
											iIndexPickUp = iTempIndex;
											break;
										}
									}
									
									double dPackageDelay = pcMain.getPackageDelay();
									paTemp = pcMain.getBranch(iBranch).getPickUp().get(iIndexPickUp);
									int iNewRewardSize = 0;
									
									double dTimeLeft = paTemp.getBestTime() - cMain.HowManyHoursSinces(paTemp.getTimeStart());
									System.err.println("start " + paTemp.getTimeStart()[0] + ":" + paTemp.getTimeStart()[1] + ":" + paTemp.getTimeStart()[2]);
									System.err.println("dTimeLeft " + dTimeLeft);
									double dTime;
									if (dTimeLeft > 0)
										dTime = ( paTemp.getBestTime() - dTimeLeft );
									else
										dTime = dTimeLeft;
									System.err.println("dTime " + dTime);
									double dGain100Persent = dPackageDelay * 0.8;
									int iMaxReward = 0;
									switch (paTemp.getSize()) {
									case "Small":
										iMaxReward = 100;
										break;
									case "Medium":
										iMaxReward = 200;
										break;
									case "Large":
										iMaxReward = 500;
										break;
									}
									if (dTime > dPackageDelay) {
										System.err.println("Error: Branch.updatePackageRewardSize(int iIndex, double dPackageDelay): Player found path that is faster than BestPathFinder()");
										System.err.println("dTime=" + dTime + "; dPackageDelay=" + dPackageDelay);
										iNewRewardSize = iMaxReward;
									} else if (dTime <= dPackageDelay && dTimeLeft >= dGain100Persent) {
										iNewRewardSize = iMaxReward;
									} else if (dTimeLeft < dGain100Persent && dTimeLeft >= 0) {
										iNewRewardSize = ((int) Math.round(iMaxReward * ( ((dGain100Persent - dTime) / dGain100Persent) /**100*/)));
									} else if (dTimeLeft > -dPackageDelay) {
										iNewRewardSize = ((int) ((-iMaxReward / 2) * ((dTime / (-dPackageDelay)) /** 100*/)));
									} else {
										iNewRewardSize = (-iMaxReward / 2);
									}
									System.err.println("iNewRewardSize " + iNewRewardSize);
									pcMain.updatePackageRewardSize(iBranch, iIndexPickUp, iNewRewardSize);
									pcMain.updatePackageTime(iBranch, iIndexPickUp, GameEasy.this.cMain.getTime()); // no reason to do this.
									callPersonToTakeHisPackage(iBranch, iIndexPickUp);
									publish(new Integer[] {iBranch, 2});
								}
							}
					    	break;
					    case 3:
					    	synchronized (objLockPC) {
					    		pcMain.movePackageFromReceivedToWaitingToSend(iBranch, iIndex);
							}
					    	publish(new Integer[] {iBranch, 3});
					    	break;
					    }
						return null;
					}

					@Override
					protected void process(List<Integer[]> chunks) {
						for (Integer[] iArray : chunks) {
							switch (iArray[1]) {
							case 2:
								updateUIlist(1, iArray[0]);
								updateUIlist(2, iArray[0]);
								break;
							case 3:
								updateUIlist(3, iArray[0]);
								updateUIlist(1, iArray[0]);
								break;
							}
						}
					}
				};
				threadPool.submit(swPackageAction);
			}
			
		};
		
		// Action for Receiving's Next button
		ActionListener alNextPageReceiving = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUInextPageOverall(1, e);
			}
		};
		
		// Action for Receiving's Back button
		ActionListener alBackPageReceiving = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUIbackPageOverall(1, e);
			}
		};
		
		// Action for PickUp's buttons
		ActionListener alGivePackageFromPickUp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SwingWorker<Integer[], Void> swGivePackagePickUp = new SwingWorker<Integer[], Void>() {

					@Override
					protected Integer[] doInBackground() throws Exception {
						Pattern pIndex = Pattern.compile("(\\d+)");
					    Matcher mString = pIndex.matcher(e.getSource().toString());
					    mString.find();
					    int iBranch = Integer.valueOf(mString.group());
					    mString.find();
					    int iIndex = Integer.valueOf(mString.group());
					    mString.find(); // finds XPos
					    mString.find(); // finds YPos
					    mString.find();
					    int iGroup = Integer.valueOf(mString.group());
					    
					    Integer[] iArrayReturn;
					    
					    if (iGroup == 2)
					    	iIndex += (iTotalPages[iBranch][2][1]-1)*6;
					    else
					    	iIndex += (iTotalPages[iBranch][6][1]-1)*6;
						
						int iRewardSize = pcMain.getRewardSize(iBranch, iIndex);
						int[] iTimeEnteredToBranch = pcMain.getEnterTimeToBranch(iBranch);
						int iIsThisTheRightPerson = pcMain.movePackageFromPickUpToPersonReceive(iBranch, iIndex);
						switch (iIsThisTheRightPerson) {
						case 0:
							double dTimePassed = GameEasy.this.cMain.HowManyHoursSinces(iTimeEnteredToBranch);
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
							if (GameEasy.this.baMain.addOrRemoveCash(iRewardSize)) {
								GameEasy.this.pcMain.setTheGameEnd(true);
							}
							else {
								if (iRewardSize > 0)
									JOptionPane.showMessageDialog(GameEasy.this, "Good job! you gained " + iRewardSize, "Package give away", JOptionPane.INFORMATION_MESSAGE);
								else if (iRewardSize < 0) {
									JOptionPane.showMessageDialog(GameEasy.this, "Oh no! it took you too long to deliver the package, your fee is " + (iRewardSize * -1), "Package give away", JOptionPane.WARNING_MESSAGE);
								}
								else
									JOptionPane.showMessageDialog(GameEasy.this, "The package arrived just in time! there is no fee but no gain as well.", "Package give away", JOptionPane.WARNING_MESSAGE);
							}
							iArrayReturn = new Integer[] {iBranch, pcMain.getBranch(iBranch).getPersonReceive().size()};
							break;
						case 1:
							JOptionPane.showMessageDialog(GameEasy.this, "The queue is empty! no one has come yet.", "Package give away", JOptionPane.ERROR_MESSAGE);
							iArrayReturn = new Integer[] {-1, -1};
							break;
						case 2:
							JOptionPane.showMessageDialog(GameEasy.this, "The package does not belong to the first person in the queue.", "Package give away", JOptionPane.ERROR_MESSAGE);
							iArrayReturn = new Integer[] {-2, -1};
							break;
						default:
							System.err.println("runtime error: GameEasy-actionPerformed-alGivePackageFromPickUp");
							iArrayReturn = new Integer[] { -3, -1 };
							break;
						}
						
						return iArrayReturn;
					}

					@Override
					protected void done() {
						try {
							int iBranch = get()[0];
							if (iBranch >= 0) {
								updateUIlist(2, iBranch);
								
								synchronized (objLockButtons) {
									btnPanels[iBranch][5][0].setText(btnPanels[iBranch][5][1].getText());
									btnPanels[iBranch][5][0].setToolTipText(btnPanels[iBranch][5][1].getToolTipText());
									
									btnPanels[iBranch][5][1].setText(btnPanels[iBranch][5][2].getText());
									btnPanels[iBranch][5][1].setToolTipText(btnPanels[iBranch][5][2].getToolTipText());
									
									btnPanels[iBranch][5][2].setText(btnPanels[iBranch][5][3].getText());
									btnPanels[iBranch][5][2].setToolTipText(btnPanels[iBranch][5][3].getToolTipText());
									
									btnPanels[iBranch][5][3].setText(btnPanels[iBranch][5][4].getText());
									btnPanels[iBranch][5][3].setToolTipText(btnPanels[iBranch][5][4].getToolTipText());
									
									btnPanels[iBranch][5][get()[1]].setVisible(false);
								}
								
								lblGoldCounter.setText(baMain.toString());
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ExecutionException e) {
							e.printStackTrace();
						}
					}
				};
				GameEasy.this.threadPool.submit(swGivePackagePickUp);
			}
			
		};
		
		// Action for QReceivers button
		ActionListener alGivePackageFromReceive = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SwingWorker<Integer[], Void> swGivePackageReceive = new SwingWorker<Integer[], Void>() {

					@Override
					protected Integer[] doInBackground() throws Exception {
						Pattern pIndex = Pattern.compile("(\\d+)");
					    Matcher mString = pIndex.matcher(e.getSource().toString());
					    mString.find();
					    int iBranch = Integer.valueOf(mString.group());
					    
					    Integer[] iArrayReturn;
					    int iIndex = -1;
					    synchronized (objLockPC) {
					    	String strRec = pcMain.getBranch(iBranch).getPersonReceive().peek().getName();
							int iTempIndex;
							Package paTemp;
							List<Package> lReceiving = pcMain.getBranch(iBranch).getPickUp();
							ListIterator<Package> iterator = lReceiving.listIterator();
							while (iterator.hasNext()) {
								iTempIndex = iterator.nextIndex();
								paTemp = iterator.next();
								if (paTemp.getReceive().equals(strRec)) {
									iIndex = iTempIndex;
									break;
								}
							}
					    }
						
						int iRewardSize = pcMain.getRewardSize(iBranch, iIndex);
						int[] iTimeEnteredToBranch = pcMain.getEnterTimeToBranch(iBranch);
						int iIsThisTheRightPerson = pcMain.movePackageFromPickUpToPersonReceive(iBranch, iIndex);
						switch (iIsThisTheRightPerson) {
						case 0:
							double dTimePassed = GameEasy.this.cMain.HowManyHoursSinces(iTimeEnteredToBranch);
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
							if (GameEasy.this.baMain.addOrRemoveCash(iRewardSize)) {
								GameEasy.this.pcMain.setTheGameEnd(true);
							}
							else {
								if (iRewardSize > 0)
									JOptionPane.showMessageDialog(GameEasy.this, "Good job! you gained " + iRewardSize, "Package give away", JOptionPane.INFORMATION_MESSAGE);
								else if (iRewardSize < 0) {
									JOptionPane.showMessageDialog(GameEasy.this, "Oh no! it took you too long to deliver the package, your fee is " + (iRewardSize * -1), "Package give away", JOptionPane.WARNING_MESSAGE);
								}
								else
									JOptionPane.showMessageDialog(GameEasy.this, "The package arrived just in time! there is no fee but no gain as well.", "Package give away", JOptionPane.WARNING_MESSAGE);
							}
							iArrayReturn = new Integer[] {iBranch, pcMain.getBranch(iBranch).getPersonReceive().size()};
							break;
						case 1:
							JOptionPane.showMessageDialog(GameEasy.this, "The queue is empty! no one has come yet.", "Package give away", JOptionPane.ERROR_MESSAGE);
							iArrayReturn = new Integer[] {-1, -1};
							break;
						case 2:
							JOptionPane.showMessageDialog(GameEasy.this, "The package does not belong to the first person in the queue.", "Package give away", JOptionPane.ERROR_MESSAGE);
							iArrayReturn = new Integer[] {-2, -1};
							break;
						default:
							System.err.println("runtime error: GameEasy-actionPerformed-alGivePackageFromPickUp");
							iArrayReturn = new Integer[] { -3, -1 };
							break;
						}
						
						return iArrayReturn;
					}

					@Override
					protected void done() {
						try {
							int iBranch = get()[0];
							if (iBranch >= 0) {
								updateUIlist(2, iBranch);
								
								synchronized (objLockButtons) {
									btnPanels[iBranch][5][0].setText(btnPanels[iBranch][5][1].getText());
									btnPanels[iBranch][5][0].setToolTipText(btnPanels[iBranch][5][1].getToolTipText());
									
									btnPanels[iBranch][5][1].setText(btnPanels[iBranch][5][2].getText());
									btnPanels[iBranch][5][1].setToolTipText(btnPanels[iBranch][5][2].getToolTipText());
									
									btnPanels[iBranch][5][2].setText(btnPanels[iBranch][5][3].getText());
									btnPanels[iBranch][5][2].setToolTipText(btnPanels[iBranch][5][3].getToolTipText());
									
									btnPanels[iBranch][5][3].setText(btnPanels[iBranch][5][4].getText());
									btnPanels[iBranch][5][3].setToolTipText(btnPanels[iBranch][5][4].getToolTipText());
									
									btnPanels[iBranch][5][get()[1]].setVisible(false);
								}
								
								lblGoldCounter.setText(baMain.toString());
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (ExecutionException e) {
							e.printStackTrace();
						}
					}
					
				};
				GameEasy.this.threadPool.submit(swGivePackageReceive);
			}

		};
		
		// Action for PickUp's Next button
		ActionListener alNextPagePickUp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateUInextPageOverall(2, e);
			}

		};

		// Action for PickUp's Back button
		ActionListener alBackPagePickUp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateUIbackPageOverall(2, e);
			}

		};
		
		// initiate events to the buttons
		for (int iBranch = 0; iBranch < btnPanels.length; iBranch++) {
			synchronized (objLockButtons) {
				// Give actionPerformed to QSenders buttons.
				btnPanels[iBranch][4][0].addActionListener(alAccpetPackage);
				btnPanels[iBranch][5][0].addActionListener(alGivePackageFromReceive);
				// Give actionPerformed to Back/Next buttons for WaitingToSend
				btnPanels[iBranch][3][6].addActionListener(alBackPageWaitingToSend);
				btnPanels[iBranch][3][7].addActionListener(alNextPageWaitingToSend);
				// Give actionPerformed to Back/Next buttons for Sending
				btnPanels[iBranch][0][6].addActionListener(alBackPageSending);
				btnPanels[iBranch][0][7].addActionListener(alNextPageSending);
				// Give actionPerformed to Back/Next buttons for Receiving
				btnPanels[iBranch][1][6].addActionListener(alBackPageReceiving);
				btnPanels[iBranch][1][7].addActionListener(alNextPageReceiving);
				// Give actionPerformed to Back/Next buttons for PickUp
				btnPanels[iBranch][2][6].addActionListener(alBackPagePickUp);
				btnPanels[iBranch][2][7].addActionListener(alNextPagePickUp);
				// Give actionPerformed to the rest of the buttons in overall panel
				for (int iIndex = 0; iIndex < 6; iIndex++) {
					btnPanels[iBranch][3][iIndex].addActionListener(alSendPackage);
					btnPanels[iBranch][1][iIndex].addActionListener(alPackageAction);
					btnPanels[iBranch][2][iIndex].addActionListener(alGivePackageFromPickUp);
				}
				// Give actionPerformed to the rest of the buttons in the tabs
				for (int iIndex = 0; iIndex < 48; iIndex++) {
					btnPanels[iBranch][9][iIndex].addActionListener(alSendPackage);
					btnPanels[iBranch][7][iIndex].addActionListener(alPackageAction);
					btnPanels[iBranch][8][iIndex].addActionListener(alGivePackageFromPickUp);
				}
			}
		}

		// Give QSenders,QReceivers,Receiving buttons in btnPanels mouseEntered
		for (int iBranch = 0; iBranch < btnPanels.length; iBranch++) {
			synchronized (objLockButtons) {
				for (int iIndex = 0; iIndex < 5; iIndex++) {
					btnPanels[iBranch][1][iIndex].addMouseListener(maTurnGlowOff);
					btnPanels[iBranch][4][iIndex].addMouseListener(maTurnGlowOff);
					btnPanels[iBranch][5][iIndex].addMouseListener(maTurnGlowOff);
				}
				btnPanels[iBranch][1][5].addMouseListener(maTurnGlowOff);
			}
		}
	}
	
	private void runGame() {
		SwingWorker<Void, int[]> swClock = new SwingWorker<Void, int[]>() {
			@Override
			protected Void doInBackground() throws Exception {
				cMain = new Clock(11);
				
				while (cMain.getRunThreadFlag()) {
					publish(cMain.getTime());
					if (cMain.clockTick()) {
						writeGame(GameEasy.this.pcMain, GameEasy.this.cMain, GameEasy.this.baMain, GameEasy.this.strPlayer);
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.err.println("Erorr: ClockObject.run(): Thread.sleep throw InterruptedException");
					}
					cMain.checkForPaused();
				}
				publish(cMain.getTime());
				return null;
			}

			@Override
			protected void process(List<int[]> chunks) {
				int[] iTime = chunks.get(chunks.size()-1);
				StringBuilder strbDay = new StringBuilder();
				if (iTime[0] < 10) {
					strbDay.append("00");
					strbDay.append(iTime[0]);
				} else if (iTime[0] < 100) {
					strbDay.append("0");
					strbDay.append(iTime[0]);
				} else {
					strbDay.append(iTime[0]);
				}
				lblDayCounter.setText(strbDay.toString());
				
				StringBuilder strbHour = new StringBuilder();
				if (iTime[1] < 10 && iTime[2] < 10) {
					strbHour.append("0");
					strbHour.append(iTime[1]);
					strbHour.append(":0");
					strbHour.append(iTime[2]);
				} else if (iTime[1] < 10 && iTime[2] >= 10) {
					strbHour.append("0");
					strbHour.append(iTime[1]);
					strbHour.append(":");
					strbHour.append(iTime[2]);
				} else if (iTime[1] >= 10 && iTime[2] < 10) {
					strbHour.append(iTime[1]);
					strbHour.append(":0");
					strbHour.append(iTime[2]);
				} else {
					strbHour.append(iTime[1]);
					strbHour.append(":");
					strbHour.append(iTime[2]);
				}
				lblTimeCounter.setText(strbHour.toString());
				
				pbTimeTillEndDay.setValue( 660 - cMain.getTimeTillEndDay() );
			}
		};
		SwingWorker<Void, Person> swPostal = new SwingWorker<Void, Person>() {
			
			@Override
			protected Void doInBackground() throws Exception {
				pcMain = new PostalCompany(0);
				baMain = new BankAccount();
				GameRunning:
				while (!(pcMain.didTheGameEnd())) {
					if (pcMain.getPlayableActions() <= 5) {
						for (int iCount = ThreadLocalRandom.current().nextInt(2, 8); iCount > 0; iCount--) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							pcMain.checkForPaused();
							if (pcMain.didTheGameEnd())
								break GameRunning;
						}
						
						int iMinBusy = pcMain.getBusyBranches(0);
						int[] iSameMin = new int[] { 0, -1, -1 };
						int iCountSame = 1;
						for (int iCount = 1; iCount<3; iCount++) {
							if (pcMain.getBusyBranches(iCount) < iMinBusy) {
								iMinBusy = pcMain.getBusyBranches(iCount);
								iSameMin = new int[] { -1, -1, -1 };
								iSameMin[0] = iCount;
								iCountSame = 1;
							} else if ( pcMain.getBusyBranches(iCount) == iMinBusy ) {
								iSameMin[iCountSame] = iCount;
								iCountSame++;
							}
						}
						int iChoosenBranch = iSameMin[ThreadLocalRandom.current().nextInt(0, iCountSame)];
						
						pcMain.incrementBusyBranches(iChoosenBranch);
						int iRandomIndexTo = ThreadLocalRandom.current().nextInt(0, 3);
						while (iChoosenBranch == iRandomIndexTo) {
							iRandomIndexTo = ThreadLocalRandom.current().nextInt(0, 3);
						}
						Person pSender;
						Person pReceiver;
						switch (iChoosenBranch) {
						case 0:
							pSender = pcMain.pollFromHaifa();
							break;
						case 1:
							pSender = pcMain.pollFromTelAviv();
							break;
						case 2:
							pSender = pcMain.pollFromEilat();
							break;
						default:
							pSender = new Person("Error", 0);
							break;
						}
						while (pSender == null) {
							Thread.sleep(5000);
							switch (iChoosenBranch) {
							case 0:
								pSender = pcMain.pollFromHaifa();
								break;
							case 1:
								pSender = pcMain.pollFromTelAviv();
								break;
							case 2:
								pSender = pcMain.pollFromEilat();
								break;
							default:
								pSender = new Person("Error", 0);
								break;
							}
						}
						switch (iRandomIndexTo) {
						case 0:
							pReceiver = pcMain.pollFromHaifa();
							break;
						case 1:
							pReceiver = pcMain.pollFromTelAviv();
							break;
						case 2:
							pReceiver = pcMain.pollFromEilat();
							break;
						default:
							pReceiver = new Person("Error", 0);
							break;
						}
						while (pReceiver == null) {
							Thread.sleep(5000);
							switch (iRandomIndexTo) {
							case 0:
								pReceiver = pcMain.pollFromHaifa();
								break;
							case 1:
								pReceiver = pcMain.pollFromTelAviv();
								break;
							case 2:
								pReceiver = pcMain.pollFromEilat();
								break;
							default:
								pReceiver = new Person("Error", 0);
								break;
							}
						}
						Package paNew = new Package(ThreadLocalRandom.current().nextInt(0, 3), pSender.getName(), pReceiver.getName(), iChoosenBranch);
						paNew.setBestTime(pcMain.bestPathTime(iChoosenBranch, iRandomIndexTo));
						paNew.setTimeStart( cMain.getTime() );
						pSender.setPackage(paNew);
						Branch braTemp = pcMain.getBranch(iChoosenBranch);
						boolean bDidPersonEnteredQueue = braTemp.addPersonToWantToSend(pSender);
						while(!(bDidPersonEnteredQueue)) { // The loop will happen only if all the branches are busy above 5 people.
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							pcMain.checkForPaused();
							if (pcMain.didTheGameEnd())
								break GameRunning;
							bDidPersonEnteredQueue = braTemp.addPersonToWantToSend(pSender);
						}
						pSender.setIndex(braTemp.getPersonSend().size()-1);
						pcMain.setPeople(pSender.getName(), pSender);
						pcMain.setPeople(pReceiver.getName(), pReceiver);
						pcMain.setBranch(iChoosenBranch, braTemp);
						publish(pSender);
					} else {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						pcMain.checkForPaused();
						if (pcMain.didTheGameEnd())
							break GameRunning;
					}
					pcMain.updatePlayableActions();
				}
				if (iExit[0] == 0 || iExit[0] == 1) {
					iExit[1] = ( (baMain.getMostCash()/10) + (cMain.getDay()*100) );
				}
				return null;
			}

			@Override
			protected void process(List<Person> chunks) {
				int iIndex;
				for (Person pTemp : chunks) {
					iIndex = pTemp.getIndex();
					synchronized (objLockButtons) {
						switch (pTemp.getSendLocation()) {
						case 0:
							btnPanels[0][4][iIndex].setText(pTemp.getName());
							btnPanels[0][4][iIndex].setBackground(Color.GREEN);
							btnPanels[0][4][iIndex].setToolTipText(pTemp.getName() + ", Package Size: " + pTemp.getPackage().getSize());
							btnPanels[0][4][iIndex].setVisible(true);
							break;
						case 1:
							btnPanels[1][4][iIndex].setText(pTemp.getName());
							btnPanels[1][4][iIndex].setBackground(Color.GREEN);
							btnPanels[1][4][iIndex].setToolTipText(pTemp.getName() + ", Package Size: " + pTemp.getPackage().getSize());
							btnPanels[1][4][iIndex].setVisible(true);
							break;
						case 2:
							btnPanels[2][4][iIndex].setText(pTemp.getName());
							btnPanels[2][4][iIndex].setBackground(Color.GREEN);
							btnPanels[2][4][iIndex].setToolTipText(pTemp.getName() + ", Package Size: " + pTemp.getPackage().getSize());
							btnPanels[2][4][iIndex].setVisible(true);
							break;
						}
					}
				}
			}
			
			@Override
			protected void done() {
				if (iExit[0] == 0 || iExit[0] == 1)
					JOptionPane.showMessageDialog(GameEasy.this, "Your Score is: " + iExit[1], "Game Over", JOptionPane.PLAIN_MESSAGE);
				dispose();
			}
		};
		GameEasy.this.threadPool.submit(swClock);
		GameEasy.this.threadPool.submit(swPostal);
	}
	
	private void runGameResume() {
		SwingWorker<Void, int[]> swClock = new SwingWorker<Void, int[]>() {
			@Override
			protected Void doInBackground() throws Exception {
				while (GameEasy.this.cMain.getRunThreadFlag()) {
					publish(GameEasy.this.cMain.getTime());
					if ( GameEasy.this.cMain.clockTick() ) {
						writeGame(GameEasy.this.pcMain, GameEasy.this.cMain, GameEasy.this.baMain, GameEasy.this.strPlayer);
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.err.println("Erorr: ClockObject.run(): Thread.sleep throw InterruptedException");
					}
					GameEasy.this.cMain.checkForPaused();
				}
				publish(GameEasy.this.cMain.getTime());
				return null;
			}

			@Override
			protected void process(List<int[]> chunks) {
				int[] iTime = chunks.get(chunks.size()-1);
				StringBuilder strbDay = new StringBuilder();
				if (iTime[0] < 10) {
					strbDay.append("00");
					strbDay.append(iTime[0]);
				} else if (iTime[0] < 100) {
					strbDay.append("0");
					strbDay.append(iTime[0]);
				} else {
					strbDay.append(iTime[0]);
				}
				lblDayCounter.setText(strbDay.toString());
				
				StringBuilder strbHour = new StringBuilder();
				if (iTime[1] < 10 && iTime[2] < 10) {
					strbHour.append("0");
					strbHour.append(iTime[1]);
					strbHour.append(":0");
					strbHour.append(iTime[2]);
				} else if (iTime[1] < 10 && iTime[2] >= 10) {
					strbHour.append("0");
					strbHour.append(iTime[1]);
					strbHour.append(":");
					strbHour.append(iTime[2]);
				} else if (iTime[1] >= 10 && iTime[2] < 10) {
					strbHour.append(iTime[1]);
					strbHour.append(":0");
					strbHour.append(iTime[2]);
				} else {
					strbHour.append(iTime[1]);
					strbHour.append(":");
					strbHour.append(iTime[2]);
				}
				lblTimeCounter.setText(strbHour.toString());
				
				pbTimeTillEndDay.setValue( 660 - GameEasy.this.cMain.getTimeTillEndDay() );
			}
		};
		SwingWorker<Void, Person> swPostal = new SwingWorker<Void, Person>() {
			
			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("end? " + GameEasy.this.pcMain.didTheGameEnd());
				GameRunning:
				while (!(GameEasy.this.pcMain.didTheGameEnd())) {
					try {
					if (GameEasy.this.pcMain.getPlayableActions() <= 5) {
						for (int iCount = ThreadLocalRandom.current().nextInt(2, 8); iCount > 0; iCount--) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							GameEasy.this.pcMain.checkForPaused();
							if (GameEasy.this.pcMain.didTheGameEnd())
								break GameRunning;
						}
						
						int iMinBusy = GameEasy.this.pcMain.getBusyBranches(0);
						int[] iSameMin = new int[] { 0, -1, -1 };
						int iCountSame = 1;
						for (int iCount = 1; iCount<3; iCount++) {
							if (GameEasy.this.pcMain.getBusyBranches(iCount) < iMinBusy) {
								iMinBusy = GameEasy.this.pcMain.getBusyBranches(iCount);
								iSameMin = new int[] { -1, -1, -1 };
								iSameMin[0] = iCount;
								iCountSame = 1;
							} else if ( GameEasy.this.pcMain.getBusyBranches(iCount) == iMinBusy ) {
								iSameMin[iCountSame] = iCount;
								iCountSame++;
							}
						}
						int iChoosenBranch = iSameMin[ThreadLocalRandom.current().nextInt(0, iCountSame)];
						
						GameEasy.this.pcMain.incrementBusyBranches(iChoosenBranch);
						int iRandomIndexTo = ThreadLocalRandom.current().nextInt(0, 3);
						while (iChoosenBranch == iRandomIndexTo) {
							iRandomIndexTo = ThreadLocalRandom.current().nextInt(0, 3);
						}
						Person pSender;
						Person pReceiver;
						switch (iChoosenBranch) {
						case 0:
							pSender = GameEasy.this.pcMain.pollFromHaifa();
							break;
						case 1:
							pSender = GameEasy.this.pcMain.pollFromTelAviv();
							break;
						case 2:
							pSender = GameEasy.this.pcMain.pollFromEilat();
							break;
						default:
							pSender = new Person("Error", 0);
							break;
						}
						while (pSender == null) {
							Thread.sleep(5000);
							switch (iChoosenBranch) {
							case 0:
								pSender = GameEasy.this.pcMain.pollFromHaifa();
								break;
							case 1:
								pSender = GameEasy.this.pcMain.pollFromTelAviv();
								break;
							case 2:
								pSender = GameEasy.this.pcMain.pollFromEilat();
								break;
							default:
								pSender = new Person("Error", 0);
								break;
							}
						}
						switch (iRandomIndexTo) {
						case 0:
							pReceiver = GameEasy.this.pcMain.pollFromHaifa();
							break;
						case 1:
							pReceiver = GameEasy.this.pcMain.pollFromTelAviv();
							break;
						case 2:
							pReceiver = GameEasy.this.pcMain.pollFromEilat();
							break;
						default:
							pReceiver = new Person("Error", 0);
							break;
						}
						while (pReceiver == null) {
							Thread.sleep(5000);
							switch (iRandomIndexTo) {
							case 0:
								pReceiver = GameEasy.this.pcMain.pollFromHaifa();
								break;
							case 1:
								pReceiver = GameEasy.this.pcMain.pollFromTelAviv();
								break;
							case 2:
								pReceiver = GameEasy.this.pcMain.pollFromEilat();
								break;
							default:
								pReceiver = new Person("Error", 0);
								break;
							}
						}
						Package paNew = new Package(ThreadLocalRandom.current().nextInt(0, 3), pSender.getName(), pReceiver.getName(), iChoosenBranch);
						paNew.setBestTime(GameEasy.this.pcMain.bestPathTime(iChoosenBranch, iRandomIndexTo));
						paNew.setTimeStart( GameEasy.this.cMain.getTime() );
						pSender.setPackage(paNew);
						Branch braTemp = GameEasy.this.pcMain.getBranch(iChoosenBranch);
						boolean bDidPersonEnteredQueue = braTemp.addPersonToWantToSend(pSender);
						while(!(bDidPersonEnteredQueue)) { // The loop will happen only if all the branches are busy above 5 people.
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							GameEasy.this.pcMain.checkForPaused();
							if (GameEasy.this.pcMain.didTheGameEnd())
								break GameRunning;
							bDidPersonEnteredQueue = braTemp.addPersonToWantToSend(pSender);
						}
						pSender.setIndex(braTemp.getPersonSend().size()-1);
						GameEasy.this.pcMain.setPeople(pSender.getName(), pSender);
						GameEasy.this.pcMain.setPeople(pReceiver.getName(), pReceiver);
						GameEasy.this.pcMain.setBranch(iChoosenBranch, braTemp);
						publish(pSender);
					} else {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						GameEasy.this.pcMain.checkForPaused();
						if (GameEasy.this.pcMain.didTheGameEnd())
							break GameRunning;
					}
					GameEasy.this.pcMain.updatePlayableActions();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("exit: " + iExit[0]);
				if (iExit[0] == 0 || iExit[0] == 1) {
					iExit[1] = ( (GameEasy.this.baMain.getMostCash()/10) + (GameEasy.this.cMain.getDay()*100) );
				}
				return null;
			}

			@Override
			protected void process(List<Person> chunks) {
				int iIndex;
				for (Person pTemp : chunks) {
					iIndex = pTemp.getIndex();
					synchronized (objLockButtons) {
						switch (pTemp.getSendLocation()) {
						case 0:
							btnPanels[0][4][iIndex].setText(pTemp.getName());
							btnPanels[0][4][iIndex].setBackground(Color.GREEN);
							btnPanels[0][4][iIndex].setToolTipText(pTemp.getName() + ", Package Size: " + pTemp.getPackage().getSize());
							btnPanels[0][4][iIndex].setVisible(true);
							break;
						case 1:
							btnPanels[1][4][iIndex].setText(pTemp.getName());
							btnPanels[1][4][iIndex].setBackground(Color.GREEN);
							btnPanels[1][4][iIndex].setToolTipText(pTemp.getName() + ", Package Size: " + pTemp.getPackage().getSize());
							btnPanels[1][4][iIndex].setVisible(true);
							break;
						case 2:
							btnPanels[2][4][iIndex].setText(pTemp.getName());
							btnPanels[2][4][iIndex].setBackground(Color.GREEN);
							btnPanels[2][4][iIndex].setToolTipText(pTemp.getName() + ", Package Size: " + pTemp.getPackage().getSize());
							btnPanels[2][4][iIndex].setVisible(true);
							break;
						}
					}
				}
			}
			
			@Override
			protected void done() {
				if (iExit[0] == 0 || iExit[0] == 1)
					JOptionPane.showMessageDialog(GameEasy.this, "Your Score is: " + iExit[1], "Game Over", JOptionPane.PLAIN_MESSAGE);
				dispose();
			}
		};
		GameEasy.this.threadPool.submit(swClock);
		GameEasy.this.threadPool.submit(swPostal);
	}

	private void callPersonToTakeHisPackage(int iBranch, int iIndex) {
		SwingWorker<Void, Person> swCallPerson = new SwingWorker<Void, Person>() {

			@Override
			protected Void doInBackground() throws Exception {
				if (GameEasy.this.cMain.didTheDayAlreadyEnded(GameEasy.this.cMain.getTimeInXHours(1.5))) {
					for (int iCount = GameEasy.this.cMain.getTimeTillEndDay(); iCount>=0; iCount--) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						GameEasy.this.pcMain.checkForPaused();
					}
				}
				int iRandom = ThreadLocalRandom.current().nextInt(5, 31);
				for (int iCount = iRandom; iCount>=0; iCount--) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					GameEasy.this.pcMain.checkForPaused();
				}
				while(pcMain.getBranch(iBranch).getPersonReceive().size() == 5) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					GameEasy.this.pcMain.checkForPaused();
				}
				Person pReceiver = pcMain.callPersonToTakeHisPackage(iBranch, iIndex, GameEasy.this.cMain.getTime());
				pReceiver.setIndex(GameEasy.this.pcMain.getBranch(iBranch).getPersonReceive().size()-1);
				pcMain.setPeople(pReceiver.getName(), pReceiver);
				publish(pReceiver);
				return null;
			}

			@Override
			protected void process(List<Person> chunks) {
				int iIndex;
				for (Person pTemp : chunks) {
					iIndex = pTemp.getIndex();
					synchronized (objLockButtons) {
						switch (pTemp.getSendLocation()) {
						case 0:
							btnPanels[0][5][iIndex].setText(pTemp.getName());
							btnPanels[0][5][iIndex].setBackground(Color.GREEN);
							btnPanels[0][5][iIndex].setToolTipText(pTemp.getName());
							btnPanels[0][5][iIndex].setVisible(true);
							break;
						case 1:
							btnPanels[1][5][iIndex].setText(pTemp.getName());
							btnPanels[1][5][iIndex].setBackground(Color.GREEN);
							btnPanels[1][5][iIndex].setToolTipText(pTemp.getName());
							btnPanels[1][5][iIndex].setVisible(true);
							break;
						case 2:
							btnPanels[2][5][iIndex].setText(pTemp.getName());
							btnPanels[2][5][iIndex].setBackground(Color.GREEN);
							btnPanels[2][5][iIndex].setToolTipText(pTemp.getName());
							btnPanels[2][5][iIndex].setVisible(true);
							break;
						}
					}
				}
			}
		};
		GameEasy.this.threadPool.submit(swCallPerson);
	}

	// Can update ONLY iGroup: [0]Sending, [1]Receiving, [2]PickUp and [3]WaitingToSend 
	private void updateUIlist(int iGroup, int iBranch) {
		SwingWorker<Void, String[][]> swUpdateOverall = new SwingWorker<Void, String[][]>() {

			@Override
			protected Void doInBackground() throws Exception {
				String[][] strPublish = new String[7][2];
				StringBuilder strbToolTip = new StringBuilder();
				Package paTemp;
				
				List<Package> lTemp;
				switch (iGroup) {
				case 0: // Sending
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getBranchSend();
					break;
				case 1: // Receiving
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getBranchReceive();
					break;
				case 2: // PickUp
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getPickUp();
					break;
				case 3: // WaitingToSend
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getWaitingToSend();
					break;
				default:
					lTemp = new LinkedList<>();
					break;
				}
				
				int iListSize = lTemp.size();
				int iPage = iListSize/6;
				int iExtra = iListSize%6;
				int iCurrentPage;
				if (iExtra > 0)
					iPage++;
				synchronized (objLockPages) {
					GameEasy.this.iTotalPages[iBranch][iGroup][0] = iPage;
					iCurrentPage = GameEasy.this.iTotalPages[iBranch][3][1];
					if (iCurrentPage > iPage || iCurrentPage == 0) {
						iCurrentPage = iPage;
						GameEasy.this.iTotalPages[iBranch][iGroup][1] = iPage;
					}
				}
				if (iCurrentPage == iPage && iExtra > 0) {
					for (int iIndex = 0; iIndex < iExtra; iIndex++) {
						paTemp = lTemp.get(iIndex + (iCurrentPage-1) * 6);
						
						strbToolTip.append("Address:");
						switch (iGroup) {
						case 0:
							strPublish[iIndex][0] = cMain.toString(paTemp.getTime());
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						case 2:
							strPublish[iIndex][0] = "To:" + paTemp.getReceive();
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						default:
							switch (GameEasy.this.pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strPublish[iIndex][0] = "To:Haifa";
								strbToolTip.append("Haifa");
								break;
							case 1:
								strPublish[iIndex][0] = "To:Tel-Aviv";
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strPublish[iIndex][0] = "To:Eilat";
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						}
						strbToolTip.append("|Size:");
						strbToolTip.append(paTemp.getSize());
						strbToolTip.append("|Sender:");
						strbToolTip.append(paTemp.getSend());
						strbToolTip.append("|Recipient:");
						strbToolTip.append(paTemp.getReceive());
						strPublish[iIndex][1] = strbToolTip.toString();
						strbToolTip.setLength(0);
					}
					strPublish[6][0] = Integer.toString(iExtra);
				} else if (iPage == 0) {
					strPublish[6][0] = Integer.toString(0);
				} else {
					for (int iIndex = 0; iIndex < 6; iIndex++) {
						paTemp = lTemp.get(iIndex + (iCurrentPage-1) * 6);

						strbToolTip.append("Address:");
						switch (iGroup) {
						case 0:
							strPublish[iIndex][0] = cMain.toString(paTemp.getTime());
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						case 2:
							strPublish[iIndex][0] = "To:" + paTemp.getReceive();
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						default:
							switch (GameEasy.this.pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strPublish[iIndex][0] = "To:Haifa";
								strbToolTip.append("Haifa");
								break;
							case 1:
								strPublish[iIndex][0] = "To:Tel-Aviv";
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strPublish[iIndex][0] = "To:Eilat";
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						}
						strbToolTip.append("|Size:");
						strbToolTip.append(paTemp.getSize());
						strbToolTip.append("|Sender:");
						strbToolTip.append(paTemp.getSend());
						strbToolTip.append("|Recipient:");
						strbToolTip.append(paTemp.getReceive());
						strPublish[iIndex][1] = strbToolTip.toString();
						strbToolTip.setLength(0);
					}
					strPublish[6][0] = Integer.toString(6);
				}
				if ( (iCurrentPage == 1 && iPage == 1) || iPage == 0 )
					strPublish[6][1] = Integer.toString(0); // no back button, no next button
				else if (iCurrentPage == 1 && iPage > 1)
					strPublish[6][1] = Integer.toString(1); // no back button, yes next button
				else if (iCurrentPage > 1 && iCurrentPage == iPage)
					strPublish[6][1] = Integer.toString(2); // yes back button, no next button
				else
					strPublish[6][1] = Integer.toString(3); // yes back button, yes next button
				publish(strPublish);
				return null;
			}

			@Override
			protected void process(List<String[][]> chunks) {
				int iExtra;
				for (String[][] strInfo : chunks) {
					iExtra = Integer.valueOf(strInfo[6][0]);
					if (iExtra == 6) {
						for (int iCount = 0; iCount < 6; iCount++) {
							synchronized (objLockButtons) {
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setText(strInfo[iCount][0]);
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setToolTipText(strInfo[iCount][1]);
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setVisible(true);
							}
						}
					}
					else {
						synchronized (objLockButtons) {
							for (int iCount = 0; iCount < iExtra; iCount++) {
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setText(strInfo[iCount][0]);
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setToolTipText(strInfo[iCount][1]);
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setVisible(true);
							}
							for (int iCount = iExtra; iCount < 6; iCount++) {
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setVisible(false);
							}
						}
					}
					synchronized (objLockButtons) {
						switch (Integer.valueOf(strInfo[6][1])) {
						case 0:
							GameEasy.this.btnPanels[iBranch][iGroup][6].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroup][6].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroup][7].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroup][7].setVisible(true);
							break;
						case 1:
							GameEasy.this.btnPanels[iBranch][iGroup][6].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroup][6].setVisible(true);
							
							GameEasy.this.btnPanels[iBranch][iGroup][7].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][7].setVisible(true);
							break;
						case 2:
							GameEasy.this.btnPanels[iBranch][iGroup][6].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][6].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroup][7].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroup][7].setVisible(true);
							break;
						case 3:
							GameEasy.this.btnPanels[iBranch][iGroup][6].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][6].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroup][7].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][7].setVisible(true);
							break;
						}
					}
				}
			}
		};
		SwingWorker<Void, String[][]> swUpdateTab = new SwingWorker<Void, String[][]>() {

			@Override
			protected Void doInBackground() throws Exception {
				String[][] strPublish = new String[49][2];
				StringBuilder strbToolTip = new StringBuilder();
				Package paTemp;
				
				int iGroupTab = 6 + iGroup;
				List<Package> lTemp;
				switch (iGroup) {
				case 0: // Sending
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getBranchSend();
					break;
				case 1: // Receiving
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getBranchReceive();
					break;
				case 2: // PickUp
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getPickUp();
					break;
				case 3: // WaitingToSend
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getWaitingToSend();
					break;
				default:
					lTemp = new LinkedList<>();
					break;
				}
				
				int iListSize = lTemp.size();
				int iPage = iListSize/48;
				int iExtra = iListSize%48;
				int iCurrentPage;
				if (iExtra > 0)
					iPage++;
				synchronized (objLockPages) {
					GameEasy.this.iTotalPages[iBranch][iGroupTab-2][0] = iPage;
					iCurrentPage = GameEasy.this.iTotalPages[iBranch][iGroupTab-2][1];
					if (iCurrentPage > iPage || iCurrentPage == 0) {
						iCurrentPage = iPage;
						GameEasy.this.iTotalPages[iBranch][iGroupTab-2][1] = iPage;
					}
				}
				if (iCurrentPage == iPage && iExtra > 0) {
					for (int iIndex = 0; iIndex < iExtra; iIndex++) {
						paTemp = lTemp.get(iIndex + (iCurrentPage-1) * 6);
						
						strbToolTip.append("Address:");
						if (iGroup == 0) {
							strPublish[iIndex][0] = cMain.toString(paTemp.getTime());
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
						} else {
							switch (GameEasy.this.pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strPublish[iIndex][0] = "To:Haifa";
								strbToolTip.append("Haifa");
								break;
							case 1:
								strPublish[iIndex][0] = "To:Tel-Aviv";
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strPublish[iIndex][0] = "To:Eilat";
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
						}
						strbToolTip.append("|Size:");
						strbToolTip.append(paTemp.getSize());
						strbToolTip.append("|Sender:");
						strbToolTip.append(paTemp.getSend());
						strbToolTip.append("|Recipient:");
						strbToolTip.append(paTemp.getReceive());
						strPublish[iIndex][1] = strbToolTip.toString();
						strbToolTip.setLength(0);
					}
					strPublish[48][0] = Integer.toString(iExtra);
				} else if (iPage == 0) {
					strPublish[48][0] = Integer.toString(0);
				} else {
					for (int iIndex = 0; iIndex < 48; iIndex++) {
						paTemp = lTemp.get(iIndex + (iCurrentPage-1) * 6);

						strbToolTip.append("Address:");
						if (iGroup == 0) {
							strPublish[iIndex][0] = cMain.toString(paTemp.getTime());
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
						} else {
							switch (GameEasy.this.pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strPublish[iIndex][0] = "To:Haifa";
								strbToolTip.append("Haifa");
								break;
							case 1:
								strPublish[iIndex][0] = "To:Tel-Aviv";
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strPublish[iIndex][0] = "To:Eilat";
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
						}
						strbToolTip.append("|Size:");
						strbToolTip.append(paTemp.getSize());
						strbToolTip.append("|Sender:");
						strbToolTip.append(paTemp.getSend());
						strbToolTip.append("|Recipient:");
						strbToolTip.append(paTemp.getReceive());
						strPublish[iIndex][1] = strbToolTip.toString();
						strbToolTip.setLength(0);
					}
					strPublish[48][0] = Integer.toString(48);
				}
				if ( (iCurrentPage == 1 && iPage == 1) || iPage == 0 )
					strPublish[48][1] = Integer.toString(0); // no back button, no next button
				else if (iCurrentPage == 1 && iPage > 1)
					strPublish[48][1] = Integer.toString(1); // no back button, yes next button
				else if (iCurrentPage > 1 && iCurrentPage == iPage)
					strPublish[48][1] = Integer.toString(2); // yes back button, no next button
				else
					strPublish[48][1] = Integer.toString(3); // yes back button, yes next button
				publish(strPublish);
				return null;
			}

			@Override
			protected void process(List<String[][]> chunks) {
				int iExtra, iGroupTab = 6 + iGroup;
				for (String[][] strInfo : chunks) {
					iExtra = Integer.valueOf(strInfo[48][0]);
					if (iExtra == 48) {
						for (int iCount = 0; iCount < 48; iCount++) {
							synchronized (objLockButtons) {
								GameEasy.this.btnPanels[iBranch][iGroupTab][iCount].setText(strInfo[iCount][0]);
								GameEasy.this.btnPanels[iBranch][iGroupTab][iCount].setToolTipText(strInfo[iCount][1]);
								GameEasy.this.btnPanels[iBranch][iGroupTab][iCount].setVisible(true);
							}
						}
					}
					else {
						synchronized (objLockButtons) {
							for (int iCount = 0; iCount < iExtra; iCount++) {
								GameEasy.this.btnPanels[iBranch][iGroupTab][iCount].setText(strInfo[iCount][0]);
								GameEasy.this.btnPanels[iBranch][iGroupTab][iCount].setToolTipText(strInfo[iCount][1]);
								GameEasy.this.btnPanels[iBranch][iGroupTab][iCount].setVisible(true);
							}
							for (int iCount = iExtra; iCount < 48; iCount++) {
								GameEasy.this.btnPanels[iBranch][iGroupTab][iCount].setVisible(false);
							}
						}
					}
					synchronized (objLockButtons) {
						switch (Integer.valueOf(strInfo[48][1])) {
						case 0:
							GameEasy.this.btnPanels[iBranch][iGroupTab][48].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroupTab][48].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroupTab][49].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroupTab][49].setVisible(true);
							break;
						case 1:
							GameEasy.this.btnPanels[iBranch][iGroupTab][48].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroupTab][48].setVisible(true);
							
							GameEasy.this.btnPanels[iBranch][iGroupTab][49].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroupTab][49].setVisible(true);
							break;
						case 2:
							GameEasy.this.btnPanels[iBranch][iGroupTab][48].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroupTab][48].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroupTab][49].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroupTab][49].setVisible(true);
							break;
						case 3:
							GameEasy.this.btnPanels[iBranch][iGroupTab][48].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroupTab][48].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroupTab][49].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroupTab][49].setVisible(true);
							break;
						}
					}
				}
			}
		};
		GameEasy.this.threadPool.submit(swUpdateOverall);
		GameEasy.this.threadPool.submit(swUpdateTab);
	}
	
	private void updateUIEverything() {
		for (int iBranch = 0; iBranch < 3; iBranch++) {
			for (int iGroup = 0; iGroup < 4; iGroup ++) {
				updateUIlist(iGroup, iBranch);
			}
			synchronized (objLockPC) {
				Queue<Person> qSend = GameEasy.this.pcMain.getBranch(iBranch).getPersonSend();
				Queue<Person> qReceive = GameEasy.this.pcMain.getBranch(iBranch).getPersonReceive();
				Iterator<Person> itSend = qSend.iterator();
				Iterator<Person> itReceive = qReceive.iterator();
				int iIndex = 0;
				Person pTemp;
				while ( itSend.hasNext() ) {
					pTemp = itSend.next();
					btnPanels[iBranch][4][iIndex].setText(pTemp.getName());
					btnPanels[iBranch][4][iIndex].setToolTipText(pTemp.getName() + ", Package Size: " + pTemp.getPackage().getSize());
					btnPanels[iBranch][4][iIndex].setVisible(true);
					iIndex++;
				}
				iIndex = 0;
				while ( itReceive.hasNext() ) {
					pTemp = itReceive.next();
					btnPanels[iBranch][5][iIndex].setText(pTemp.getName());
					btnPanels[iBranch][5][iIndex].setToolTipText(pTemp.getName() + ", Package Size: " + pTemp.getPackage().getSize());
					btnPanels[iBranch][5][iIndex].setVisible(true);
					iIndex++;
				}
			}
		}
		this.lblGoldCounter.setText(baMain.toString());
		this.lblTimeCounter.setText(cMain.toString());
	}
	
	private synchronized void updateUIbackPageOverall(int iGroup, ActionEvent e) {
		SwingWorker<Void, String[][]> swUpdateToBackPage = new SwingWorker<Void, String[][]>() {

			@Override
			protected Void doInBackground() throws Exception {
				Pattern pIndex = Pattern.compile("(\\d+)");
				Matcher mString = pIndex.matcher(e.getSource().toString());
				mString.find();
				int iBranch = Integer.valueOf(mString.group());
				
				String[][] strPublish = new String[7][2];
				StringBuilder strbToolTip = new StringBuilder();
				Package paTemp;
				
				List<Package> lTemp;
				switch (iGroup) {
				case 0: // Sending
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getBranchSend();
					break;
				case 1: // Receiving
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getBranchReceive();
					break;
				case 2: // PickUp
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getPickUp();
					break;
				case 3: // WaitingToSend
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getWaitingToSend();
					break;
				default:
					lTemp = new LinkedList<>();
					break;
				}
				
				int iCurrentPage;
				synchronized (objLockPages) {
					GameEasy.this.iTotalPages[iBranch][iGroup][1]--;
					iCurrentPage = GameEasy.this.iTotalPages[iBranch][iGroup][1];
				}
				int iIndex;
				for (int iCounter = 0; iCounter < 6; iCounter++) {
					iIndex = iCounter + (iCurrentPage - 1) * 6;
					paTemp = lTemp.get(iIndex);
					
					strbToolTip.append("Address:");
					switch (iGroup) {
					case 0:
						strPublish[iCounter][0] = cMain.toString(paTemp.getTime());
						switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
						case 0:
							strbToolTip.append("Haifa");
							break;
						case 1:
							strbToolTip.append("Tel-Aviv");
							break;
						case 2:
							strbToolTip.append("Eilat");
							break;
						default:
							strbToolTip.append("");
							break;
						}
						break;
					case 2:
						strPublish[iCounter][0] = "To:" + paTemp.getReceive();
						switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
						case 0:
							strbToolTip.append("Haifa");
							break;
						case 1:
							strbToolTip.append("Tel-Aviv");
							break;
						case 2:
							strbToolTip.append("Eilat");
							break;
						default:
							strbToolTip.append("");
							break;
						}
						break;
					default:
						switch (GameEasy.this.pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
						case 0:
							strPublish[iCounter][0] = "To:Haifa";
							strbToolTip.append("Haifa");
							break;
						case 1:
							strPublish[iCounter][0] = "To:Tel-Aviv";
							strbToolTip.append("Tel-Aviv");
							break;
						case 2:
							strPublish[iCounter][0] = "To:Eilat";
							strbToolTip.append("Eilat");
							break;
						default:
							strbToolTip.append("");
							break;
						}
						break;
					}
					strbToolTip.append("|Size:");
					strbToolTip.append(paTemp.getSize());
					strbToolTip.append("|Sender:");
					strbToolTip.append(paTemp.getSend());
					strbToolTip.append("|Recipient:");
					strbToolTip.append(paTemp.getReceive());
					strPublish[iCounter][1] = strbToolTip.toString();
					strbToolTip.setLength(0);
				}
				if (iCurrentPage == 1) {
					strPublish[6][1] = Integer.toString(1); // no back button, yes next button
				} else {
					strPublish[6][1] = Integer.toString(3); // yes back button, yes next button
				}
				strPublish[6][0] = Integer.toString(iBranch);
				publish(strPublish);
				return null;
			}

			@Override
			protected void process(List<String[][]> chunks) {
				int iBranch;
				for (String[][] strInfo : chunks) {
					iBranch = Integer.valueOf(strInfo[6][0]);
					for (int iCount = 0; iCount < 6; iCount++) {
						synchronized (objLockButtons) {
							GameEasy.this.btnPanels[iBranch][iGroup][iCount].setText(strInfo[iCount][0]);
							GameEasy.this.btnPanels[iBranch][iGroup][iCount].setToolTipText(strInfo[iCount][1]);
							GameEasy.this.btnPanels[iBranch][iGroup][iCount].setVisible(true);
						}
					}
					synchronized (objLockButtons) {
						switch (Integer.valueOf(strInfo[6][1])) {
						case 1:
							GameEasy.this.btnPanels[iBranch][iGroup][6].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroup][6].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroup][7].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][7].setVisible(true);
							break;
						case 3:
							GameEasy.this.btnPanels[iBranch][iGroup][6].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][6].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroup][7].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][7].setVisible(true);
							break;
						}
					}
				}
			}
		};
		GameEasy.this.threadPool.submit(swUpdateToBackPage);
	}
	
	private synchronized void updateUInextPageOverall(int iGroup, ActionEvent e) {
		SwingWorker<Void, String[][]> swUpdateToNextPage = new SwingWorker<Void, String[][]>() {

			@Override
			protected Void doInBackground() throws Exception {
				Pattern pIndex = Pattern.compile("(\\d+)");
			    Matcher mString = pIndex.matcher(e.getSource().toString());
			    mString.find();
			    int iBranch = Integer.valueOf(mString.group());
			    
				String[][] strPublish = new String[8][2];
				StringBuilder strbToolTip = new StringBuilder();
				Package paTemp;
				
				List<Package> lTemp;
				switch (iGroup) {
				case 0: // Sending
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getBranchSend();
					break;
				case 1: // Receiving
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getBranchReceive();
					break;
				case 2: // PickUp
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getPickUp();
					break;
				case 3: // WaitingToSend
					lTemp = GameEasy.this.pcMain.getBranch(iBranch).getWaitingToSend();
					break;
				default:
					lTemp = new LinkedList<>();
					break;
				}
				
				int iPage, iCurrentPage;
				synchronized (objLockPages) {
					iPage = GameEasy.this.iTotalPages[iBranch][iGroup][0];
					GameEasy.this.iTotalPages[iBranch][iGroup][1]++;
					iCurrentPage = GameEasy.this.iTotalPages[iBranch][iGroup][1];
				}
				int iExtra = ( lTemp.size() )%6;
				int iIndex;
				if (iCurrentPage == iPage && iExtra > 0) {
					for (int iCounter = 0; iCounter < iExtra; iCounter++) {
						iIndex = iCounter + (iCurrentPage-1) * 6;
						paTemp = lTemp.get(iIndex);
						
						strbToolTip.append("Address:");
						switch (iGroup) {
						case 0:
							strPublish[iCounter][0] = cMain.toString(paTemp.getTime());
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						case 2:
							strPublish[iCounter][0] = "To:" + paTemp.getReceive();
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						default:
							switch (GameEasy.this.pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strPublish[iCounter][0] = "To:Haifa";
								strbToolTip.append("Haifa");
								break;
							case 1:
								strPublish[iCounter][0] = "To:Tel-Aviv";
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strPublish[iCounter][0] = "To:Eilat";
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						}
						strbToolTip.append("|Size:");
						strbToolTip.append(paTemp.getSize());
						strbToolTip.append("|Sender:");
						strbToolTip.append(paTemp.getSend());
						strbToolTip.append("|Recipient:");
						strbToolTip.append(paTemp.getReceive());
						strPublish[iCounter][1] = strbToolTip.toString();
						strbToolTip.setLength(0);
					}
					strPublish[6][0] = Integer.toString(iExtra);
				} else {
					for (int iCounter = 0; iCounter < 6; iCounter++) {
						iIndex = iCounter + (iCurrentPage-1) * 6;
						paTemp = lTemp.get(iIndex);

						strbToolTip.append("Address:");
						switch (iGroup) {
						case 0:
							strPublish[iCounter][0] = cMain.toString(paTemp.getTime());
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						case 2:
							strPublish[iCounter][0] = "To:" + paTemp.getReceive();
							switch (pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strbToolTip.append("Haifa");
								break;
							case 1:
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						default:
							switch (GameEasy.this.pcMain.getPeople(paTemp.getReceive()).getReceiveLocation()) {
							case 0:
								strPublish[iCounter][0] = "To:Haifa";
								strbToolTip.append("Haifa");
								break;
							case 1:
								strPublish[iCounter][0] = "To:Tel-Aviv";
								strbToolTip.append("Tel-Aviv");
								break;
							case 2:
								strPublish[iCounter][0] = "To:Eilat";
								strbToolTip.append("Eilat");
								break;
							default:
								strbToolTip.append("");
								break;
							}
							break;
						}
						strbToolTip.append("|Size:");
						strbToolTip.append(paTemp.getSize());
						strbToolTip.append("|Sender:");
						strbToolTip.append(paTemp.getSend());
						strbToolTip.append("|Recipient:");
						strbToolTip.append(paTemp.getReceive());
						strPublish[iCounter][1] = strbToolTip.toString();
						strbToolTip.setLength(0);
					}
					strPublish[6][0] = Integer.toString(6);
				}
				if (iCurrentPage == iPage && iCurrentPage > 1) {
					strPublish[6][1] = Integer.toString(2); // yes back button, no next button
				}
				else {
					strPublish[6][1] = Integer.toString(3); // yes back button, yes next button
				}
				strPublish[7][0] = Integer.toString(iBranch);
				publish(strPublish);
				return null;
			}

			@Override
			protected void process(List<String[][]> chunks) {
				int iExtra, iBranch;
				for (String[][] strInfo : chunks) {
					iBranch = Integer.valueOf(strInfo[7][0]);
					iExtra = Integer.valueOf(strInfo[6][0]);
					if (iExtra == 6) {
						for (int iCount = 0; iCount < 6; iCount++) {
							synchronized (objLockButtons) {
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setText(strInfo[iCount][0]);
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setToolTipText(strInfo[iCount][1]);
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setVisible(true);
							}
						}
					} else {
						synchronized (objLockButtons) {
							for (int iCount = 0; iCount < iExtra; iCount++) {
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setText(strInfo[iCount][0]);
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setToolTipText(strInfo[iCount][1]);
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setVisible(true);
							}
							for (int iCount = iExtra; iCount < 6; iCount++) {
								GameEasy.this.btnPanels[iBranch][iGroup][iCount].setVisible(false);
							}
						}
					}
					synchronized (objLockButtons) {
						switch (Integer.valueOf(strInfo[6][1])) {
						case 2:
							GameEasy.this.btnPanels[iBranch][iGroup][6].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][6].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroup][7].setEnabled(false);
							GameEasy.this.btnPanels[iBranch][iGroup][7].setVisible(true);
							break;
						case 3:
							GameEasy.this.btnPanels[iBranch][iGroup][6].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][6].setVisible(true);

							GameEasy.this.btnPanels[iBranch][iGroup][7].setEnabled(true);
							GameEasy.this.btnPanels[iBranch][iGroup][7].setVisible(true);
							break;
						}
					}
				}
			}
		};
		GameEasy.this.threadPool.submit(swUpdateToNextPage);
	}
	
	private synchronized void updateUInextPageTab(int iGroupTab, ActionEvent e) {

	}
	
	private synchronized void updateUIbackPageTab(int iGroupTab, ActionEvent e) {

	}

	// Write methods
	private static void writeGame(PostalCompany pcMain, Clock cMain, BankAccount baMain, String strPlayer) {
		File directory = new File (".");
		File saves = new File("Saves");
		if (!saves.exists()) {
			saves.mkdir();
		}
		try (FileOutputStream fs = new FileOutputStream( directory.getCanonicalPath() + File.separator + "Saves" + File.separator + "Game.bin" )) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(new GameSave(pcMain, cMain, baMain, strPlayer));
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
