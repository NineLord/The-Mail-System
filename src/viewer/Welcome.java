package viewer;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import game.objects.BankAccount;
import game.objects.Clock;
import game.objects.GameSave;
import game.objects.PostalCompany;
import game.objects.Score;
import game.objects.ScoreBoard;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup radtioDifficulty = new ButtonGroup();
	private JButton btnTutorial;
	private JButton btnAbout;
	private JButton btnQuit;
	private JButton btnLeaderBoard;
	private JButton btnPlay;
	private JLabel lblDifficulty;
	private JRadioButton rdbtnEasy;
	private JRadioButton rdbtnNormal;
	private JRadioButton rdbtnHard;
	
	private ScoreBoard sbMain;
	private int iResumeGame;

	/** Launch the application. */
	public static void main(String[] args) {
		ScoreBoard sbMain = new ScoreBoard();
		sbMain.addScore(new Score(0, "Shaked"), 0);
		sbMain.addScore(new Score(0, "Oren"), 0);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome(sbMain);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** Create the frame. */
	public Welcome(ScoreBoard sbMain) {
		initiateComponents(sbMain);
		initiateEvents();
	}
	
	// Create the window
	private void initiateComponents(ScoreBoard sbMain) {
		this.sbMain = sbMain;
		iResumeGame = doIResume();
		
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Welcome.class.getResource("/resources/mail_256.png")));
		setTitle("The Mail System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTheMailSystem = new JLabel("The Mail System");
		lblTheMailSystem.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTheMailSystem.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		btnLeaderBoard = new JButton("Leader Board");
		btnLeaderBoard.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		btnTutorial = new JButton("Tutorial");
		btnTutorial.setFont(new Font("Tahoma", Font.PLAIN, 24));

		btnAbout = new JButton("About");

		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		btnQuit = new JButton("Quit");

		btnQuit.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		lblDifficulty = new JLabel("Difficulty:");
		lblDifficulty.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnEasy = new JRadioButton("Easy");
		rdbtnEasy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnEasy.setHorizontalAlignment(SwingConstants.CENTER);
		radtioDifficulty.add(rdbtnEasy);
		
		rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setSelected(true);
		rdbtnNormal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNormal.setHorizontalAlignment(SwingConstants.CENTER);
		radtioDifficulty.add(rdbtnNormal);
		
		rdbtnHard = new JRadioButton("Hard");
		rdbtnHard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnHard.setHorizontalAlignment(SwingConstants.CENTER);
		
		if (iResumeGame != -1) {
			rdbtnEasy.setVisible(false);
			rdbtnNormal.setVisible(false);
			rdbtnHard.setVisible(false);
			lblDifficulty.setVisible(false);
			btnPlay.setText("Resume");
			switch (iResumeGame) {
			case 0:
				rdbtnEasy.setSelected(true);
				rdbtnNormal.setSelected(false);
				rdbtnHard.setSelected(false);
				break;
			case 1:
				rdbtnEasy.setSelected(false);
				rdbtnNormal.setSelected(true);
				rdbtnHard.setSelected(false);
				break;
			case 2:
				rdbtnEasy.setSelected(false);
				rdbtnNormal.setSelected(false);
				rdbtnHard.setSelected(true);
				break;
			}
		}
		
		radtioDifficulty.add(rdbtnHard);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAbout, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTutorial)
						.addComponent(btnLeaderBoard)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDifficulty)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnEasy)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNormal)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnHard))
						.addComponent(btnPlay))
					.addContainerGap(35, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(lblTheMailSystem, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTheMailSystem, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnPlay)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDifficulty)
						.addComponent(rdbtnEasy)
						.addComponent(rdbtnNormal)
						.addComponent(rdbtnHard))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLeaderBoard)
					.addGap(18)
					.addComponent(btnTutorial)
					.addGap(18)
					.addComponent(btnAbout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	// Event methods
	private void initiateEvents() {
		// Tutorial button has been clicked.
		// Will open dialog window of Tutorial.
		btnTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tutorial fTut = new Tutorial();
				fTut.setModal(true);
				fTut.setLocation((int)(getLocationOnScreen().getX()+(getSize().getWidth()-fTut.getSize().getWidth())/2),
						(int)(getLocationOnScreen().getY()+(getSize().getHeight()-fTut.getSize().getHeight())/2));
				fTut.setVisible(true);
			}
		});
		
		// About button has been clicked.
		// Will open dialog window of About.
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About fAbout = new About();
				fAbout.setModal(true);
				fAbout.setLocation((int)(getLocationOnScreen().getX()+(getSize().getWidth()-fAbout.getSize().getWidth())/2),
						(int)(getLocationOnScreen().getY()+(getSize().getHeight()-fAbout.getSize().getHeight())/2));
				fAbout.setVisible(true);
			}
		});
		
		// Quit button has been clicked.
		// Will dispose the program.
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dispose();
				System.exit(0);
			}
		});

		// Leader Board has been clicked.
		// Will open the leader board dialog.
		btnLeaderBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeaderBoard fLeaderBoard = new LeaderBoard(sbMain);
				fLeaderBoard.setModal(true);
				fLeaderBoard.setLocation((int)(getLocationOnScreen().getX()+(getSize().getWidth()-fLeaderBoard.getSize().getWidth())/2),
						(int)(getLocationOnScreen().getY()+(getSize().getHeight()-fLeaderBoard.getSize().getHeight())/2));
				fLeaderBoard.setVisible(true);
			}
		});
		
		// Play button has been clicked.
		// Will check which difficulty was chosen and start a game.
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingWorker<Void, Integer[]> swPlay = new SwingWorker<Void, Integer[]>() {

					@Override
					protected Void doInBackground() throws Exception {
						iResumeGame = doIResume();
						Integer[] iPublish = new Integer[2];
						if (iResumeGame == -1) {
							String strPlayer = JOptionPane.showInputDialog(Welcome.this, "Enter the player name to continue", "Player Name", JOptionPane.PLAIN_MESSAGE);
							if (strPlayer != null) {
								if (!strPlayer.equals("")) {
									int iDifficulty = 0;
									if (rdbtnEasy.isSelected())
										iDifficulty = 0;
									else if (rdbtnNormal.isSelected())
										iDifficulty = 1;
									else
										iDifficulty = 2;
									setVisible(false);
									switch (iDifficulty) {
									case 0:
										GameEasy fEasy = new GameEasy(strPlayer);
										fEasy.setLocationRelativeTo(null);
										fEasy.setVisible(true);
										switch (fEasy.getExit()[0]) {
										case 0:
										case 1:
											sbMain.addScore(new Score(fEasy.getExit()[1], strPlayer), iDifficulty);
											writeScoreBoard(sbMain);
											updateResume(1, 1);
											iPublish[0] = 0;
											publish(iPublish);
											break;
										case 2:
											updateResume(0, 1);
											iPublish[0] = 2;
											iPublish[1] = 0;
											publish(iPublish);
											break;
										case 3:
											updateResume(1, 1);
											iPublish[0] = 0;
											publish(iPublish);
											break;
										}
										setVisible(true);
										break;
									case 1:
										JOptionPane.showMessageDialog(Welcome.this, "Will be available in the next update!");
//										GameNormal fNormal = new GameNormal();
//										fNormal.setLocationRelativeTo(null);
//										fNormal.setVisible(true);
//										// sbMain.addScore(new Score(fNormal.getScore(), strPlayer), iDifficulty);
										setVisible(true);
										break;
									case 2:
										JOptionPane.showMessageDialog(Welcome.this, "Will be available in the next update!");
//										GameHard fHard = new GameHard();
//										fHard.setLocationRelativeTo(null);
//										fHard.setVisible(true);
//										// sbMain.addScore(new Score(fHard.getScore(), strPlayer), iDifficulty);
										setVisible(true);
										break;
									}
								} else
									JOptionPane.showMessageDialog(Welcome.this, "Please enter a name", "Invalid Name", JOptionPane.ERROR_MESSAGE);
							}
						} else {
							setVisible(false);
							switch (iResumeGame) {
							case 1: // Easy
								GameSave gsTemp = readGame();
								GameEasy fEasy = new GameEasy(gsTemp.getPlayer(), gsTemp.getPostal(), gsTemp.getClock(), gsTemp.getBank());
								fEasy.setLocationRelativeTo(null);
								fEasy.setVisible(true);
								switch (fEasy.getExit()[0]) {
								case 0:
								case 1:
									sbMain.addScore(new Score(fEasy.getExit()[1], fEasy.getPlayer()), 0);
									writeScoreBoard(sbMain);
									updateResume(1, 1);
									iPublish[0] = 0;
									publish(iPublish);
									break;
								case 2:
									updateResume(0, 1);
									iPublish[0] = 2;
									iPublish[1] = 0;
									publish(iPublish);
									break;
								case 3:
									updateResume(1, 1);
									iPublish[0] = 0;
									publish(iPublish);
									break;
								}
								setVisible(true);
								break;
							case 2: // Normal
								break;
							case 3: // Hard
								break;
							}
						}
						
						return null;
					}

					@Override
					protected void process(List<Integer[]> chunks) {
						for (Integer[] iExit : chunks) {
							switch (iExit[0]) {
							case 0:
								btnPlay.setText("Play");
								lblDifficulty.setVisible(true);
								rdbtnEasy.setVisible(true);
								rdbtnNormal.setVisible(true);
								rdbtnHard.setVisible(true);
								break;
							case 2:
								btnPlay.setText("Resume");
								lblDifficulty.setVisible(false);
								rdbtnEasy.setVisible(false);
								rdbtnNormal.setVisible(false);
								rdbtnHard.setVisible(false);
								switch (iExit[1]) {
								case 0:
									rdbtnEasy.setSelected(true);
									rdbtnNormal.setSelected(false);
									rdbtnHard.setSelected(false);
									break;
								case 1:
									rdbtnEasy.setSelected(false);
									rdbtnNormal.setSelected(true);
									rdbtnHard.setSelected(false);
									break;
								case 2:
									rdbtnEasy.setSelected(false);
									rdbtnNormal.setSelected(false);
									rdbtnHard.setSelected(true);
									break;
								}
								break;
							}
						}
					}
					
				};
				swPlay.execute();
			}
		});
	}

	// Write methods
	private static void writeScoreBoard(ScoreBoard sbMain) {
		File directory = new File (".");
		File saves = new File("Saves");
		if (!saves.exists()) {
			saves.mkdir();
		}
		try (FileOutputStream fs = new FileOutputStream( directory.getCanonicalPath() + File.separator + "Saves" + File.separator + "ScoreBoard.bin" )) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(sbMain);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void updateResume(int iStatus, int iDiff) {
		File directory = new File (".");
		File saves = new File("Saves");
		if (!saves.exists()) {
			saves.mkdir();
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter( directory.getCanonicalPath() + File.separator + "Saves" + File.separator + "Resume.txt" ))) {
			bw.write(Integer.toString(iStatus) + " " + iDiff);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Read methods
	private static GameSave readGame() {
		GameSave gsTemp = null;
		File directory = new File (".");
		File saves = new File("Saves");
		if (!saves.exists()) {
			saves.mkdir();
		}
		try (FileInputStream fi = new FileInputStream( directory.getCanonicalPath() + File.separator + "Saves" + File.separator + "Game.bin" )) {
			ObjectInputStream os = new ObjectInputStream(fi);
			gsTemp = (GameSave) os.readObject();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return gsTemp;
	}

	private static int doIResume() {
		// return: -1=do not resume, 1=easy, 2=normal, 3=hard.
		int iResumeGame = -1;
		try {
			File directory = new File (".");
			File saves = new File("Saves");
			if (!saves.exists()) {
				saves.mkdir();
			}
			Scanner in = new Scanner(new FileReader( directory.getCanonicalPath() + File.separator + "Saves" + File.separator + "Resume.txt" ));
			int iScan = in.nextInt();
			if (iScan == 0) { // 0=Resume game, 1=do not resume game.
				iResumeGame = in.nextInt();
			} else if (iScan != 1) {
				System.err.println("Welcome.doIResume(): The file does not contain 0 or 1");
				iResumeGame = -1;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println("Welcome.doIResume(): couldn't find the file.");
			iResumeGame = -1;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return iResumeGame;
	}
}
