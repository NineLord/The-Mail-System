package application;

import java.awt.EventQueue;
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
import java.io.PrintStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import game.objects.ScoreBoard;
import viewer.Welcome;

public class MainApplication {
	
	public static void main(String[] args) {
		ScoreBoard sbMain;
		if (readFirstTime()) {
			sbMain = new ScoreBoard();
			writeScoreBoard(sbMain);
		}
		else {
			sbMain = readScoreBoard();
		}
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			writeLog("MainApp: Couldn't setLookAndFeel of system (UIManager)");
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome fWelcome = new Welcome(sbMain);
					fWelcome.setLocationRelativeTo(null);
					fWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
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
	
	private static void writeLog(String  strError) {
		DateTimeFormatter dtfLog = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime ldtNow = LocalDateTime.now();
		StringBuilder strbLog = new StringBuilder();
		File directory = new File (".");
		File logs = new File("Logs");
		if (!logs.exists()) {
			logs.mkdir();
		}
		try {
			strbLog.append( directory.getCanonicalPath() );
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		strbLog.append( File.separator );
		strbLog.append("Logs");
		strbLog.append( File.separator );
		strbLog.append(dtfLog.format(ldtNow));
		strbLog.append(" Log.txt");
		try (FileWriter fw = new FileWriter(strbLog.toString(), true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			dtfLog = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			out.print(dtfLog.format(ldtNow));
			out.print(" | ");
			out.println(strError);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void writeFirstTime() {
		File directory = new File (".");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter( directory.getCanonicalPath() + File.separator + "First Time.txt" ))) {
			bw.write("1");
		} catch (IOException e) {
			writeLog("MainApp.writeFirstTime(): Couldn't write '1' to First Time.txt");
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("./Saves/Resume.txt"))) {
			bw.write("1");
		} catch (IOException e) {
			writeLog("MainApp.writeFirstTime(): Couldn't write '1' to Resume.txt");
		}
	}
	
	// Read methods
	private static ScoreBoard readScoreBoard() {
		ScoreBoard sbTemp = null;
		File directory = new File (".");
		File saves = new File("Saves");
		if (!saves.exists()) {
			saves.mkdir();
		}
		try (FileInputStream fi = new FileInputStream( directory.getCanonicalPath() + File.separator + "Saves" + File.separator + "ScoreBoard.bin" )) {
			ObjectInputStream os = new ObjectInputStream(fi);
			sbTemp = (ScoreBoard) os.readObject();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sbTemp;
	}
	
	private static boolean readFirstTime() {
		// 0=first time. 1=not the first time.
		boolean bFirstTime = false;
			File directory = new File (".");
			Scanner in;
			try {
				in = new Scanner(new FileReader( directory.getCanonicalPath() + File.separator + "First Time.txt" ));
				int iScan = in.nextInt();
				if (iScan == 0) {
					bFirstTime = true;
					writeFirstTime();
				} else if (iScan != 1) {
					writeLog("MainApp.readFirstTime(): The file does not contain 0 or 1");
					writeFirstTime();
					bFirstTime = true;
				}
				in.close();
			} catch (FileNotFoundException e) {
				writeLog("MainApp.readFirstTime(): couldn't find the file.");
				writeFirstTime();
				bFirstTime = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		return bFirstTime;
	}
	
	// Specific methods
	public static void changeOutputToFile() {
		PrintStream out;
		try {
			out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static void testHowFastYourCode() {
		  long start = System.currentTimeMillis();
		  // insert code here.
		  long end = System.currentTimeMillis();
		  System.out.println("Time taken: " + (end - start));
	}
}
