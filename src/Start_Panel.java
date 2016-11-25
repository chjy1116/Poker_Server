import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Start_Panel extends JPanel {
	
	JLabel timerLabel;
	private ImageIcon icon_back = new ImageIcon("poker.jpg");
	
	Start_Panel() {
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Serif", Font.BOLD, 60));
		timerLabel.setForeground(Color.WHITE);
		
		TimerThread timer = new TimerThread(timerLabel);
		Thread thtime = new Thread(timer);
		
		timerLabel.setLocation(100, 300);
		
		add(timerLabel);
		
		thtime.start();
		
//		if(timerLabel.getText().equals("00:00")) {
//			JPanel p = (JPanel)timerLabel.getParent();
//			Container c = timerLabel.getTopLevelAncestor();
//			
//			p.removeAll();
//			c.remove(p);
//			p.setVisible(false);
//			c.add(new Control_Panel());
//			
//			c.setVisible(true);
//		}
		
		
	}
	 
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(icon_back.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
		
		Font font = new Font("Serif", Font.ITALIC, 130);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("POKER SERVER", 200, 250);
	}
}
