package ����ȯ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �׷�������ȯ implements ActionListener{
	static JButton b1 , b2 , b3;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500 , 500);
		
		b1 = new JButton("��ư1");
		b2 = new JButton("��ư2");
		b3 = new JButton("��ư3");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//�ڹٿ����� �̺�Ʈ ó���� ���� 
		//�������̽��� ����
		//�������̽��� �����ؼ� ����ϸ� ��.
		b1.addActionListener(new �׷�������ȯ());
		b2.addActionListener(new �׷�������ȯ());
		b3.addActionListener(new �׷�������ȯ());
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent who) {
		// TODO Auto-generated method stub
		System.out.println("��ư�� Ŭ���ϸ� ���� ȣ���");
		if (who.getSource()==b1) {
			System.out.println("b1��ư ����");
		}else if (who.getSource()==b2) {
			System.out.println("b2��ư ����");
		} else {
			System.out.println("b3��ư ����");
		}
	}
}
