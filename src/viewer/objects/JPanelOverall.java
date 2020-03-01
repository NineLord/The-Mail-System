package viewer.objects;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class JPanelOverall extends JPanel {
	private static final long serialVersionUID = 2685117289562172025L;

	public JPanelOverall() {
		super();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Toolkit.getDefaultToolkit().getImage(JPanelOverall.class.getResource("/resources/PanelOverall.png")), 0, 0, null);
	}
	
	

}
