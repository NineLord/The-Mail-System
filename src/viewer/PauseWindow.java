package viewer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.KeyEventDispatcher;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class PauseWindow extends JDialog {
	private JLabel lblPlayername;
	private JLabel lblCurrentscore;
	private JLabel lblCurrentdiff;
	private JLabel lblCurrentmostgold;
	private JButton btnResumeGame;
	private JButton btnTutorial;
	private JButton btnQuitAndSave;
	private JButton btnQuitWithoutSave;
	private int[] iExit = new int[] { -1, 0, 0 }; // { ExitCode: 0=Resume|1=save|2=don't save, CheatCash }
	private volatile boolean bIsConsoleOpen = false;

	/** Launch the application. */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			Frame lol = new Frame();
			PauseWindow dialog = new PauseWindow("PauseMenu Test 1 HOW LONG CAN YOU GO", 0, 100, 1111, lol, 0);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
			while (dialog.isDisplayable()) {
				Thread.sleep(1000);
			}
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	/** Create the dialog. */
	public PauseWindow(String strPlayerName, int iDiff, int iScore, int iMostGold, Window fParent, int iDay) {
		super(fParent);
		initiateComponents(strPlayerName, iDiff, iScore, iMostGold);
		initiateEvents(iDay);
	}
	
	public int[] getExit() {
		return iExit;
	}
	
	private void initiateComponents(String strPlayerName, int iDiff, int iScore, int iMostGold) {
		setUndecorated(true);
		setBounds(100, 100, 440, 225);
		
		JPanel pMain = new JPanel();
		pMain.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(pMain, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(pMain, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JPanel pOptions = new JPanel();
		pOptions.setBorder(new TitledBorder(null, "Options", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JPanel pSummary = new JPanel();
		pSummary.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Summary", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_pMain = new GroupLayout(pMain);
		gl_pMain.setHorizontalGroup(
			gl_pMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pMain.createSequentialGroup()
					.addContainerGap()
					.addComponent(pOptions, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pSummary, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_pMain.setVerticalGroup(
			gl_pMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pMain.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_pMain.createParallelGroup(Alignment.LEADING)
						.addComponent(pSummary, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addComponent(pOptions, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblPlayer = new JLabel("Player:");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		lblDifficulty.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblMostgold = new JLabel("Most Gold:");
		lblMostgold.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblPlayername = new JLabel(strPlayerName);
		lblPlayername.setMaximumSize(new Dimension(110, 17));
		lblPlayername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pSummary.setLayout(new MigLayout("", "[6px,fill][61px][110px:110px:110px]", "[35px,fill][17px][17px][17px][17px]"));
		pSummary.add(lblPlayer, "cell 1 1,alignx left,aligny top");
		pSummary.add(lblDifficulty, "cell 1 2,alignx left,aligny top");
		
		switch (iDiff) {
		case 0:
			lblCurrentdiff = new JLabel("Easy");
			break;
		case 1:
			lblCurrentdiff = new JLabel("Normal");
			break;
		case 2:
			lblCurrentdiff = new JLabel("Hard");
			break;
		default:
			lblCurrentdiff = new JLabel("CurrentDiff");
			break;
		}
		lblCurrentdiff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pSummary.add(lblCurrentdiff, "cell 2 2");
		pSummary.add(lblScore, "cell 1 3,alignx left,aligny top");
		
		lblCurrentscore = new JLabel(Integer.toString(iScore));
		lblCurrentscore.setMaximumSize(new Dimension(110, 17));
		lblCurrentscore.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pSummary.add(lblCurrentscore, "cell 2 3");
		pSummary.add(lblMostgold, "cell 1 4,alignx left,aligny top");
		pSummary.add(lblPlayername, "cell 2 1,alignx left,aligny top");
		
		lblCurrentmostgold = new JLabel(Integer.toString(iMostGold));
		lblCurrentmostgold.setMaximumSize(new Dimension(110, 17));
		lblCurrentmostgold.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pSummary.add(lblCurrentmostgold, "cell 2 4");
		
		btnResumeGame = new JButton("Resume game");
		btnResumeGame.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnTutorial = new JButton("Tutorial");
		btnTutorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnQuitAndSave = new JButton("<html>\r\n<center>\r\nQuit & save\r\n</center>\r\n</html>");
		btnQuitAndSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnQuitWithoutSave = new JButton("<html>\r\n<center>\r\nQuit without saving\r\n</center>\r\n</html>");
		btnQuitWithoutSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_pOptions = new GroupLayout(pOptions);
		gl_pOptions.setHorizontalGroup(
			gl_pOptions.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pOptions.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_pOptions.createParallelGroup(Alignment.LEADING)
						.addComponent(btnResumeGame, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnQuitWithoutSave, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnQuitAndSave, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTutorial, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_pOptions.setVerticalGroup(
			gl_pOptions.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pOptions.createSequentialGroup()
					.addGap(16)
					.addComponent(btnResumeGame)
					.addGap(10)
					.addComponent(btnTutorial)
					.addGap(10)
					.addComponent(btnQuitAndSave)
					.addGap(10)
					.addComponent(btnQuitWithoutSave)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		pOptions.setLayout(gl_pOptions);
		pMain.setLayout(gl_pMain);
		getContentPane().setLayout(groupLayout);
	}
	
	private void initiateEvents(int iDay) {
		// Resume Game button has been clicked.
		btnResumeGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PauseWindow.this.iExit[0] = 0;
				dispose();
			}
		});
		
		// Tutorial button has been clicked.
		btnTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tutorial fTut = new Tutorial();
				fTut.setModal(true);
				fTut.setLocation(
						(int) (getLocationOnScreen().getX() + (getSize().getWidth() - fTut.getSize().getWidth()) / 2),
						(int) (getLocationOnScreen().getY() + (getSize().getHeight() - fTut.getSize().getHeight()) / 2));
				fTut.setVisible(true);
			}
		});
		
		// Quit and save has been clicked.
		btnQuitAndSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (iDay == 0) {
					int iYesNo = JOptionPane.showConfirmDialog(PauseWindow.this, "You are still at your first day, the game will not save your progress. Are you sure you want to leave?", "Quit game", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (iYesNo == 0)
						PauseWindow.this.iExit[0] = 2;
				} else {
					int iYesNo = JOptionPane.showConfirmDialog(PauseWindow.this, "Are you sure you want to leave the game? the game save only at the start of the day!", "Quit game", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (iYesNo == 0)
						PauseWindow.this.iExit[0] = 1;
					else
						PauseWindow.this.iExit[0] = 0;
				}
				dispose();
			}
			
		});
		
		// Quit without saving has been clicked.
		btnQuitWithoutSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iYesNo = JOptionPane.showConfirmDialog(PauseWindow.this, "Are you sure you want to leave the game? all your progress will be lost!", "Quit game", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (iYesNo == 0)
					PauseWindow.this.iExit[0] = 2;
				else
					PauseWindow.this.iExit[0] = 0;
				dispose();
			}
		});
	
		// KeyListener to open the console. CTRL+SHIFT+C
		KeyListener klConsole = new KeyListener() {

			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.isControlDown() && ke.isShiftDown() && ke.getKeyCode() == 67 && !bIsConsoleOpen) {
					SwingWorker<Void, Void> swConsole = new SwingWorker<Void, Void>() {

						@Override
						protected Void doInBackground() throws Exception {
							bIsConsoleOpen = true;
							String strInput = JOptionPane.showInputDialog(PauseWindow.this, "");
							switch (strInput) {
							case "kaching":
								iExit[1] += 1000;
								publish();
								break;
							case "motherlode":
								iExit[1] += 50000;
								publish();
								break;
							case "time warp":
								iExit[2] = 1;
								publish();
								break;
							case "rest in peace":
								iExit[1] = -1000000;
								publish();
								break;
							}
							return null;
						}

						@Override
						protected void process(List<Void> chunks) {
							lblCurrentmostgold.setText("Cheater!");
						}
					};
					swConsole.execute();
				}
			}

			@Override
			public void keyReleased(KeyEvent ke) {
				bIsConsoleOpen = false;
			}

			@Override
			public void keyTyped(KeyEvent ke) {
			}
			
		};
		
		// Add the keyListener to all buttons.
		btnResumeGame.addKeyListener(klConsole);
		btnTutorial.addKeyListener(klConsole);
		btnQuitAndSave.addKeyListener(klConsole);
		btnQuitWithoutSave.addKeyListener(klConsole);
	}
}
