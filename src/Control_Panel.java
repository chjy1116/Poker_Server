import java.awt.Graphics;

import javax.swing.*;

public class Control_Panel extends JPanel{
	
	private ImageIcon icon_back = new ImageIcon("back.jpg");

	Control_Panel() {
		super();
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.drawImage(icon_back.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
	}
}