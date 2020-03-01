package viewer;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import game.objects.Score;
import game.objects.ScoreBoard;

public class LeaderBoard extends JDialog {
	private JButton btnOk;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ScoreBoard sbMain = new ScoreBoard();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			LeaderBoard dialog = new LeaderBoard(sbMain);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LeaderBoard(ScoreBoard sbMain) {
		initiateComponents(sbMain);
		initiateEvents();
	}
	
	// Create the window
	private void initiateComponents(ScoreBoard sbMain) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LeaderBoard.class.getResource("/resources/mail_256.png")));
		setTitle("Leader Board");
		setResizable(false);
		setBounds(100, 100, 661, 310);
		{
			btnOk = new JButton("OK");
			btnOk.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnOk.setActionCommand("OK");
			getRootPane().setDefaultButton(btnOk);
		}
		
		JLabel lblLeaderBoard = new JLabel("Leader Board");
		lblLeaderBoard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(300)
							.addComponent(btnOk))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(254)
							.addComponent(lblLeaderBoard))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 633, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblLeaderBoard)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(btnOk)
					.addGap(15))
		);
		
		table = new JTable();
		table.setToolTipText("lol");
		table.setRowSelectionAllowed(false);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Easy", "Normal", "Hard"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		for (int iCount = 0; iCount<10; iCount++) {
			if (sbMain.getEasy().get(iCount).getName().equals("")) {
				table.getModel().setValueAt("", iCount, 0);
			} else {
				table.getModel().setValueAt(sbMain.getEasy().get(iCount).toStringTable(), iCount, 0);
			}
			if (sbMain.getNormal().get(iCount).getName().equals("")) {
				table.getModel().setValueAt("", iCount, 1);
			} else {
				table.getModel().setValueAt(sbMain.getNormal().get(iCount).toStringTable(), iCount, 1);
			}
			if (sbMain.getHard().get(iCount).getName().equals("")) {
				table.getModel().setValueAt("", iCount, 2);
			} else {
				table.getModel().setValueAt(sbMain.getHard().get(iCount).toStringTable(), iCount, 2);
			}
		}
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
	}
	
	// Event methods
	private void initiateEvents() {
		// ok button has been clicked.
		// Will dispose the frame.
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}
}
