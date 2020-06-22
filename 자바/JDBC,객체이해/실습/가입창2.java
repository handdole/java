package ½Ç½À;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import DB¿¬°á.DBÃ³¸®;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class °¡ÀÔÃ¢2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void login() {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(112, 27, 278, 39);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(40, 91, 103, 33);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(40, 151, 103, 33);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uC774\uB984");
		lblNewLabel_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(40, 219, 103, 33);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\uBC88\uD638");
		lblNewLabel_1_3.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		lblNewLabel_1_3.setBounds(40, 285, 103, 33);
		f.getContentPane().add(lblNewLabel_1_3);
		
		t1 = new JTextField();
		t1.setBounds(155, 91, 260, 33);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(155, 151, 260, 33);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(155, 219, 260, 33);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(155, 285, 260, 33);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("\uD68C\uC6D0\uAC00\uC785\uC644\uB8CC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBÃ³¸® db = new DBÃ³¸®();
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				
				db.insert(id, pw, name, tel);
			}
		});
		btnNewButton.setBounds(78, 366, 321, 47);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		f.setVisible(true);
		
	}

}
