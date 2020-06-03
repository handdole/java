package 익명클래스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽 extends JFrame {
	
	public 그래픽() {
		setSize(300,300);
		
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("굴림", Font.BOLD,50);
		b1.setFont(font);
		b2.setFont(font);
		
		add(b1);
		add(b2);
		
		//익명클래스
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("바튼 완을 눌러씀");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("바튼 투 누름");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		그래픽 name = new 그래픽();
	}
	
}
