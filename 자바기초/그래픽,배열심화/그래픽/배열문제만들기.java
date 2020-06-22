package ±×·¡ÇÈ;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ¹è¿­¹®Á¦¸¸µé±â {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton btnX;
	private static JButton btnNewButton_3;
	private static JTextField t6;
	private static JButton btnNewButton_2;
	
	static int start = 0;
	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("±¼¸²", Font.PLAIN, 17));
		f.getContentPane().setForeground(new Color(255, 255, 255));
		f.getContentPane().setBackground(new Color(51, 102, 0));
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		int [] num1 = {3,7,5,2,4,8,6,10,15,12,14,17,18,19,121,50,26,18,19,60};
		int [] num3 = {2,4,3,9,7,1,5,2,16,12,10,15,23,47,11,11,10,6,16,52};
		int [] num5 = {5,11,15,18,11,7,30,5,31,144,140,235,41,66,11,550,16,128,3,8};
		
		
		
		t1 = new JTextField();
		t1.setForeground(new Color(255, 255, 255));
		t1.setBackground(new Color(51, 102, 0));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("±¼¸²", Font.PLAIN, 34));
		t1.setBounds(38, 90, 94, 129);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(51, 102, 0));
		t2.setForeground(new Color(255, 255, 255));
		t2.setText("?");
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("±¼¸²", Font.PLAIN, 34));
		t2.setColumns(10);
		t2.setBounds(151, 90, 95, 129);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setForeground(new Color(255, 255, 255));
		t3.setBackground(new Color(51, 102, 0));
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setFont(new Font("±¼¸²", Font.PLAIN, 34));
		t3.setColumns(10);
		t3.setBounds(258, 90, 88, 129);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setForeground(new Color(255, 255, 255));
		t4.setBackground(new Color(51, 102, 0));
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setFont(new Font("±¼¸²", Font.PLAIN, 34));
		t4.setText("£½");
		t4.setColumns(10);
		t4.setBounds(365, 90, 83, 129);
		f.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setForeground(new Color(255, 255, 255));
		t5.setBackground(new Color(51, 102, 0));
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setFont(new Font("±¼¸²", Font.PLAIN, 34));
		t5.setColumns(10);
		t5.setBounds(459, 90, 88, 129);
		f.getContentPane().add(t5);
		
		btnNewButton = new JButton("+");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (num1[start] + num3[start] == num5[start]) {
					start++;
					t1.setText(num1[start] + "");
					t3.setText(num3[start] + "");
					t5.setText(num5[start] + "");
					count1++;
					t6.setText(" ÃÑ È½¼ö : "+(count1+count2)+"/20  "+  "¸ÂÃáÈ½¼ö : " + count1 + "   Æ²¸°È½¼ö : " + count2);
				} 
				else {
					start++;
					t1.setText(num1[start] + "");
					t3.setText(num3[start] + "");
					t5.setText(num5[start] + "");
					count2++;
					t6.setText(" ÃÑ È½¼ö : "+(count1+count2)+"/20  "+  "¸ÂÃáÈ½¼ö : " + count1 + "   Æ²¸°È½¼ö : " + count2);
				}

				
			}
		});
		btnNewButton.setFont(new Font("µ¸¿ò", Font.PLAIN, 30));
		btnNewButton.setBounds(38, 241, 111, 71);
		f.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1[start] - num3[start] == num5[start]) {
					start++;
					t1.setText(num1[start] + "");
					t3.setText(num3[start] + "");
					t5.setText(num5[start] + "");
					count1++;
					t6.setText(" ÃÑ È½¼ö : "+(count1+count2)+"/20  "+  "¸ÂÃáÈ½¼ö : " + count1 + "   Æ²¸°È½¼ö : " + count2);
				} else {
					start++;
					t1.setText(num1[start] + "");
					t3.setText(num3[start] + "");
					t5.setText(num5[start] + "");
					count2++;
					t6.setText(" ÃÑ È½¼ö : "+(count1+count2)+"/20  "+  "¸ÂÃáÈ½¼ö : " + count1 + "   Æ²¸°È½¼ö : " + count2);
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("µ¸¿ò", Font.PLAIN, 30));
		btnNewButton_1.setBounds(175, 241, 111, 71);
		f.getContentPane().add(btnNewButton_1);
		
		btnX = new JButton("\u00D7");
		btnX.setBackground(Color.WHITE);
		btnX.setForeground(Color.BLACK);
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1[start] * num3[start] == num5[start]) {
					start++;
					t1.setText(num1[start] + "");
					t3.setText(num3[start] + "");
					t5.setText(num5[start] + "");
					count1++;
					t6.setText(" ÃÑ È½¼ö : "+(count1+count2)+"/20  "+  "¸ÂÃáÈ½¼ö : " + count1 + "   Æ²¸°È½¼ö : " + count2);
				} else {
					start++;
					t1.setText(num1[start] + "");
					t3.setText(num3[start] + "");
					t5.setText(num5[start] + "");
					count2++;
					t6.setText(" ÃÑ È½¼ö : "+(count1+count2)+"/20  "+  "¸ÂÃáÈ½¼ö : " + count1 + "   Æ²¸°È½¼ö : " + count2);
				}
				
			}
		});
		btnX.setFont(new Font("µ¸¿ò", Font.PLAIN, 30));
		btnX.setBounds(310, 241, 111, 71);
		f.getContentPane().add(btnX);
		
		btnNewButton_3 = new JButton("\u00F7");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num1[start] / num3[start] == num5[start]) {
					start++;
					t1.setText(num1[start] + "");
					t3.setText(num3[start] + "");
					t5.setText(num5[start] + "");
					count1++;
					t6.setText(" ÃÑ È½¼ö : "+(count1+count2)+"/20  "+  "¸ÂÃáÈ½¼ö : " + count1 + "   Æ²¸°È½¼ö : " + count2);
				} else {
					start++;
					t1.setText(num1[start] + "");
					t3.setText(num3[start] + "");
					t5.setText(num5[start] + "");
					count2++;
					t6.setText(" ÃÑ È½¼ö : "+(count1+count2)+"/20  "+  "¸ÂÃáÈ½¼ö : " + count1 + "   Æ²¸°È½¼ö : " + count2);
				}
				
			}
		});
		btnNewButton_3.setFont(new Font("µ¸¿ò", Font.PLAIN, 30));
		btnNewButton_3.setBounds(436, 241, 111, 71);
		f.getContentPane().add(btnNewButton_3);
		
		t6 = new JTextField();
		t6.setBackground(new Color(51, 102, 0));
		t6.setForeground(new Color(255, 255, 255));
		t6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		t6.setText("\uAC8C\uC784\uC2DC\uC791 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC2DC\uACE0 \uAC00\uC6B4\uB370\uC5D0 \uB4E4\uC5B4\uAC08 \uC5F0\uC0B0\uC790\uB97C \uB9DE\uCDB0\uC8FC\uC138\uC694.");
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setBounds(38, 419, 525, 71);
		f.getContentPane().add(t6);
		t6.setColumns(10);
		
		btnNewButton_2 = new JButton("\uAC8C\uC784\uC2DC\uC791");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnX.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				t1.setText(num1[start]+"");
				t3.setText(num3[start]+"");
				t5.setText(num5[start]+"");
				t6.setText("°ÔÀÓ ½ÃÀÛ!!!");
			}
		});
		btnNewButton_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 22));
		btnNewButton_2.setBounds(83, 334, 431, 50);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\uC5F0\uC0B0 \uB9DE\uCD94\uAE30 \uAC8C\uC784");
		lblNewLabel.setBackground(new Color(51, 102, 0));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		lblNewLabel.setBounds(39, 20, 508, 42);
		f.getContentPane().add(lblNewLabel);
		
		
		
		
		f.setVisible(true);
		
		
	}
}
