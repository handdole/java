package ������;

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

public class �׷��ȿ���  {
	static int count = 0;
	static int my_win = 0;
	static int com_win = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(857,519);
		JLabel result = new JLabel("\uAC8C\uC784\uACB0\uACFC\uB098\uD0C0\uB0A0 \uC790\uB9AC");
		f.setTitle("���� ���� �� ����");
		Random r = new Random();
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
//				result.setText("������ ������");
				//���� ��ǻ�� ���ؼ� ���� Ȯ��
				
				int c = r.nextInt(3);
				if (c == 0) {
					result.setText("��迩!");
				} else if (c == 1) {
					result.setText("����!");
					com_win++;
				} else {
					result.setText("�̱迩!");
					my_win++;
				}
				f.setTitle("���� ���� �� ����// �Ѱ��� Ƚ�� >> " + count+"//���� �̱� Ƚ�� >> "+my_win+"��ǻ�Ͱ� �̱� Ƚ�� >> "+com_win+"�·� >> "+(my_win/(double)count)*100+"%");
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setName("\uAC00\uC704");
		btnNewButton.setIcon(new ImageIcon("E:\\hansol\\java\\data03\\11.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
//				result.setText("������ ������");
				
				int c = r.nextInt(3);
				if (c == 0) {
					result.setText("�̱迩!");
					my_win++;
				} else if (c == 1) {
					result.setText("��迩!");
				} else {
					result.setText("����!");
					com_win++;
				}
				f.setTitle("���� ���� �� ����// �Ѱ��� Ƚ�� >> " + count+"//���� �̱� Ƚ�� >> "+my_win+"��ǻ�Ͱ� �̱� Ƚ�� >> "+com_win+"�·� >> "+(my_win/(double)count)*100+"%");
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setName("\uBC14\uC704");
		btnNewButton_1.setIcon(new ImageIcon("E:\\hansol\\java\\data03\\22.png"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
//				result.setText("���� ������");
				
				int c = r.nextInt(3);
				if (c == 0) {
					result.setText("�̱迩!");
					my_win++;
				} else if (c == 1) {
					result.setText("����!");
					com_win++;
				} else {
					result.setText("��迩!");
				}
				f.setTitle("���� ���� �� ����// �Ѱ��� Ƚ�� >> " + count+"//���� �̱� Ƚ�� >> "+my_win+"��ǻ�Ͱ� �̱� Ƚ�� >> "+com_win+"�·� >> "+(my_win/(double)count)*100+"%");
			}
		});
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.setName("\uBCF4");
		btnNewButton_2.setIcon(new ImageIcon("E:\\hansol\\java\\data03\\33.png"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		
		result.setFont(new Font("����", Font.PLAIN, 35));
		result.setBackground(new Color(255, 0, 0));
		f.getContentPane().add(result, BorderLayout.NORTH);
		
		f.setVisible(true);
	}

}
