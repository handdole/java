package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class 기차예매프로그램 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("\uC601\uD654\uC568\uBC94");
		f.setSize(900, 400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 105, 88, 57);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(112, 105, 128, 57);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(252, 105, 128, 57);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(392, 105, 128, 57);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(532, 105, 128, 57);
		f.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(672, 105, 128, 57);
		f.getContentPane().add(btnNewButton_4);


		f.setVisible(true); // 컨트롤 쉬프트 o => 자동 임포트

	}

}
