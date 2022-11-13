import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello");
		frame.setLayout(null);
		frame.setBounds(10, 10, 500, 500);
		
		/*
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, frame.getWidth() - 25, frame.getHeight() - 50);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(panel);
		*/
		
		JLabel lblFirstName = new JLabel("First name: ");
		lblFirstName.setBounds(10, 10, 90, 30);
		frame.getContentPane().add(lblFirstName);
		
		JTextField txtFirstName = new JTextField("");
		txtFirstName.setBounds(100, 10, 300, 30);
		frame.getContentPane().add(txtFirstName);
		
		
		JButton btnTest = new JButton("Click me");
		btnTest.setBounds(10, 40, 100, 30);
		frame.getContentPane().add(btnTest);
		
		btnTest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("Congratulations, you clicked a button");
				txtFirstName.setText("Congratulations, you clicked a button");
				
			}
		});
		
		
		
		
		frame.show();

	}

}
