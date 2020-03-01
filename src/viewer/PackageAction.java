package viewer;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class PackageAction extends JDialog {
	private JButton btnWaitingToSend;
	private JButton btnPickUp;
	private JButton btnCancel;
	private int iChoice = -1;

	/** Launch the application. */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			PackageAction dialog = new PackageAction(new Window(new Frame()));
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** Create the dialog. */
	public PackageAction(Window fParent) {
		super(fParent);
		initiateComponents();
		initiateEvents();
	}
	
	public int getChoice() {
		return iChoice;
	}

	private void initiateComponents() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Moving to...");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 332, 97);

		JLabel lblChoose = new JLabel("Choose where to move the package to");
		lblChoose.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnWaitingToSend = new JButton("Waiting To Send");
		btnWaitingToSend.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnPickUp = new JButton("Pick Up");
		btnPickUp.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addComponent(lblChoose))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnWaitingToSend)
					.addGap(10)
					.addComponent(btnPickUp)
					.addGap(10)
					.addComponent(btnCancel))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblChoose)
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnWaitingToSend)
						.addComponent(btnPickUp)
						.addComponent(btnCancel)))
		);
		getContentPane().setLayout(groupLayout);
	}
	
	private void initiateEvents() {
		btnWaitingToSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iChoice = 3;
				dispose();
			}
		});
		
		btnPickUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iChoice = 2;
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
