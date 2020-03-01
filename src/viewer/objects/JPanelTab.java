package viewer.objects;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class JPanelTab extends JPanel {
	private static final long serialVersionUID = 4083367554596228602L;

	public JPanelTab() {
		super();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Toolkit.getDefaultToolkit().getImage(JPanelTab.class.getResource("/resources/PanelTab.png")), 0, 0, null);
	}
	
	

}
