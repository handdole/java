package �׷���;

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

public class ��ȭ�ٹ�1 {
	static int start = 5; // ó�� �������� �� ������ �ε���
	private static JTextField t2;
	private static JTextField t1;

	public static void main(String[] args) {
		String[] movies = { "m1.jpg", "m2.jpg", "m3.jpg", "m4.jpg", "m5.jpg", "m6.jpg", "m7.jpg", "m8.jpg", "m9.jpg",
				"m10.jpg" };
		String[] names = { "1917", "�����", "�����", "���ۼҴ�", "�����ƾ���", "�������ĺ�", "��������", "������", "Ŭ����", "����" };
		double[] point = { 8.7, 9.9, 4.5, 6.5, 3.2, 4.1, 4.6, 5.5, 7.1, 8.9 };
		JFrame f = new JFrame();
		f.setTitle("\uC601\uD654\uC568\uBC94");
		f.setSize(400, 600);
		JButton img = new JButton("");

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start == 0) {
					start = 9;
				} else { // else ���� �Ȼ��� ��������?
					start--;
				}
				t1.setText(names[start]);
				t2.setText("���� >> " + point[start]);
				ImageIcon icon = new ImageIcon(movies[start]);
				img.setIcon(icon);
			}
		});
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setBackground(new Color(154, 205, 50));
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);

		t2 = new JTextField();
		t2.setText("���� >> " + point[start]);
		t2.setBackground(new Color(255, 102, 0));
		t2.setFont(new Font("����", Font.PLAIN, 51));
		f.getContentPane().add(t2, BorderLayout.SOUTH);
		t2.setColumns(10);

		t1 = new JTextField();
		t1.setText(names[start]);
		t1.setBackground(new Color(255, 102, 0));
		t1.setFont(new Font("����", Font.PLAIN, 51));
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);

		ImageIcon icon = new ImageIcon(movies[start]);
		img.setIcon(icon);
		f.getContentPane().add(img, BorderLayout.CENTER);

		f.setVisible(true); // ��Ʈ�� ����Ʈ o => �ڵ� ����Ʈ

	}

}
