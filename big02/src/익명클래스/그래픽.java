package �͸�Ŭ����;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �׷��� extends JFrame {
	
	public �׷���() {
		setSize(300,300);
		
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("����", Font.BOLD,50);
		b1.setFont(font);
		b2.setFont(font);
		
		add(b1);
		add(b2);
		
		//�͸�Ŭ����
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư ���� ������");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư �� ����");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		�׷��� name = new �׷���();
	}
	
}
