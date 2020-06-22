package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class 그래픽연습2 {
	static int jam = 0;
	static int woo = 0;
	static int jja = 0;
	static int jamPrice = 5000; // 짬뽕 가격
	static int wooPrice = 6000; // 우동 가격
	static int jjaPrice = 7000; // 짜장면 가격

	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel result1 = new JLabel();
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setBackground(Color.YELLOW);
		f.setSize(742, 566);
		f.getContentPane().setLayout(null);
		f.setTitle("나의 중국집 메뉴판");
		JLabel img = new JLabel("");

		JButton jButton = new JButton("\uC9EC\uBF55");
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ImageIcon icon = new ImageIcon("jjam.jpg");
				img.setIcon(icon);

				jam++; // 증감 연산자
				t1.setText((jam + woo + jja) + "개");
				int sum = ((jam * jamPrice) + (woo * wooPrice) + (jja * jjaPrice));
				// 짬뽕 개수 * 짬뽕 가격 + 우동 개수 * 우동가격 + 짜장 개수 * 짜장 가격 => 총액
				t2.setText(sum + "원");
			}
		});
		jButton.setFont(new Font("굴림", Font.PLAIN, 24));
		jButton.setBackground(Color.RED);
		jButton.setBounds(30, 24, 115, 38);
		f.getContentPane().add(jButton);

		JButton wooButton = new JButton("\uC6B0\uB3D9");
		wooButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ImageIcon icon = new ImageIcon("woo.jpg");
				img.setIcon(icon);
				woo++;
				t1.setText(String.valueOf((jam + woo + jja))); // int 를 string텍스트로 넣고싶을때
				int sum = ((jam * jamPrice) + (woo * wooPrice) + (jja * jjaPrice)); // 각각의 메뉴의 가격을 다르게하여 가격계산
				t2.setText(sum + "원");
			}
		});

		wooButton.setBackground(Color.ORANGE);
		wooButton.setFont(new Font("굴림", Font.PLAIN, 24));
		wooButton.setBounds(157, 24, 115, 38);
		f.getContentPane().add(wooButton);

		JButton jjaButton = new JButton("\uC9DC\uC7A5");
		jjaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ImageIcon icon = new ImageIcon("jja.jpg");
				img.setIcon(icon);
				jja++;
				t1.setText((jam + woo + jja) + "개");
				int sum = ((jam * jamPrice) + (woo * wooPrice) + (jja * jjaPrice));
				t2.setText(sum + "원");
			}
		});
		jjaButton.setFont(new Font("굴림", Font.PLAIN, 24));
		jjaButton.setBackground(Color.BLUE);
		jjaButton.setBounds(284, 24, 115, 38);
		f.getContentPane().add(jjaButton);

		JLabel lblNewLabel = new JLabel("\uAC1C\uC218");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(411, 24, 64, 38); // ( x축 , y축 , 가로 , 세로 )
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC9C0\uBD88\uD560 \uCD1D \uAE08\uC561 >>");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(30, 434, 300, 63);
		f.getContentPane().add(lblNewLabel_1);

		img.setIcon(new ImageIcon("E:\\hansol\\java\\data03\\house.jpg"));
		img.setBounds(30, 104, 654, 324);
		f.getContentPane().add(img);

		t1 = new JTextField();
		t1.setBounds(478, 24, 206, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(359, 434, 325, 63);
		f.getContentPane().add(t2);

		f.setVisible(true);
	}
}
