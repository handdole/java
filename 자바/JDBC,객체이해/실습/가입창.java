package Ω«Ω¿;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ∞°¿‘√¢ {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		∞°¿‘√¢2 login = new ∞°¿‘√¢2();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setFont(new Font("±º∏≤", Font.PLAIN, 24));
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("±º∏≤", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 160, 96, 37);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(34, 240, 96, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(161, 160, 246, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(161, 240, 246, 37);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("NAVER");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(66, 37, 360, 50);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(66, 326, 140, 37);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.login();
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(286, 326, 140, 37);
		f.getContentPane().add(btnNewButton_1);
		
		
		f.setVisible(true);
		
	}

}
