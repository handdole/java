package ������;

import javax.swing.JFrame;   // ��Ű�� java�� javax  �� ����� �ȵ� �̹� �⺻������ ��������ִ°͵��� ����.
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class �� {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(742, 566);
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("PUSH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(null, "��ħ�� �Ծ�����?");

				if (con == 0) {
					JOptionPane.showMessageDialog(null, "���� ��ܸ�");
				} else if (con == 1) {
					JOptionPane.showMessageDialog(null, "������ڳ׿�");
				} else {
					JOptionPane.showMessageDialog(null, "������ �ֱ׷���?");
				}
			}
		});
		btnNewButton.setBounds(55, 81, 141, 154);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uB098\uB97C \uB20C\uB7EC...");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				//�⺻�� �ۿ� �ȵǴµ� root �� ��Ʈ���̴ϱ� �����Լ��� �� �������.
				if (id.equals("root")&& pw.equals("1234")) {
					JOptionPane.showMessageDialog(null, "�α��� ok");
				} else {
					JOptionPane.showMessageDialog(null, "�α��� not!");
				}
				t1.setText("");
				t2.setText("");   // �α��� �Ǹ� ������ ���;� �ϱ� ������ �̷� ó���� ����.
			}
		});
		btnNewButton_1.setBounds(55, 289, 521, 102);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("\uBC15\uD55C\uC194\uC758 \uC708\uB3C4\uC6B0");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel.setBounds(271, 81, 305, 48);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBounds(271, 139, 305, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(271, 196, 305, 39);
		f.getContentPane().add(t2);

		f.setVisible(true);
	}
}
