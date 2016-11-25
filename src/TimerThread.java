import javax.swing.*;

public class TimerThread implements Runnable {
	
	JLabel timerLabel;
	
	private int n = 60;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public Integer getn() {
		return n;
	}
	
	public void run() {
		while(n>=0) {
			
			if(n>=10)
				timerLabel.setText("00:"+n);
			else
				timerLabel.setText("00:0"+n);
			
			n--;
			
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
