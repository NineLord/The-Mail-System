package viewer;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class SendPackageEasy extends JDialog {
	private JButton btnBranch1;
	private JButton btnBranch2;
	private JButton btnCancel;
	private int iBranch;
	private int iChoice = -1;

	/** Launch the application. */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			SendPackageEasy dialog = new SendPackageEasy(1, null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** Create the dialog. */
	public SendPackageEasy(int iBranch, Window fParent) {
		super(fParent);
		initiateComponents(iBranch);
		initiateEvents();
	}
	
	public int getChoice() {
		return iChoice;
	}

	private void initiateComponents(int iBranch) {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Sending to...");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 345, 97);
		getContentPane().setLayout(new MigLayout("", "[105px:105px:105px,center][105px:105px:105px,center][105px:105px:105px,center]", "[25px:25px:25px,center][center]"));

		JLabel lblChoose = new JLabel("Choose which branch to send the package to");
		lblChoose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblChoose, "cell 0 0 3 1");

		String strBranch1 = "", strBranch2 = "";
		switch (iBranch) {
		case 0:
			strBranch1 = "Tel Aviv";
			strBranch2 = "Eilat";
			break;
		case 1:
			strBranch1 = "Haifa";
			strBranch2 = "Eilat";
			break;
		case 2:
			strBranch1 = "Haifa";
			strBranch2 = "Tel Aviv";
			break;
		}
		this.iBranch = iBranch;
		
		btnBranch1 = new JButton(strBranch1);
		btnBranch1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBranch1, "cell 0 1");

		btnBranch2 = new JButton(strBranch2);
		btnBranch2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBranch2, "cell 1 1");

		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnCancel, "cell 2 1");
	}
	
	private void initiateEvents() {
		btnBranch1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (iBranch) {
				case 0:
					iChoice = 1;
					break;
				case 1:
					iChoice = 0;
					break;
				case 2:
					iChoice = 0;
					break;
				}
				dispose();
			}
		});
		
		btnBranch2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (iBranch) {
				case 0:
					iChoice = 2;
					break;
				case 1:
					iChoice = 2;
					break;
				case 2:
					iChoice = 1;
					break;
				}
				dispose();
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
