import java.awt.BorderLayout;

import javax.swing.*;

public class Server_Frame extends JFrame{
	
	Start_Panel start_panel;
	
	Server_Frame() {
		super("POKER_SERVER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1400, 900);
		
		start_panel = new Start_Panel();
		add(start_panel, BorderLayout.CENTER);
		
		setVisible(true);
		setResizable(false);
	}
}
