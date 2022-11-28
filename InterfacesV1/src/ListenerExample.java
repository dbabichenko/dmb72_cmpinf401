import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListenerExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Hello");
		f.setBounds(10, 10, 500, 500);
		f.setLayout(null);
		
		JButton b = new JButton("Press me");
		b.setBounds(10, 10, 100, 30);
		f.getContentPane().add(b);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		f.setVisible(true);
	}
}
