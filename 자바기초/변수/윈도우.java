package ����;

import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
//		�Է� �������� ��� Ÿ���� String���� ó��!!
		String name = JOptionPane.showInputDialog("�̸��� �Է�");
		String age = JOptionPane.showInputDialog("���̸� �Է�");
//		����� �ֿ� ���α׷��� ���� �����ΰ���?
//		����� ���� ���� �����ΰ���?
		String program = JOptionPane.showInputDialog("����� �ֿ����α׷��� ���� �����ΰ���?");
		String language = JOptionPane.showInputDialog("����� ���� ���� �����ΰ���?");
		
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("����� �̸��� "+name+" �Դϴ�.");
		System.out.println("����� �ֿ� ���α׷� ����"+program+"�Դϴ�.");
		System.out.println("����� �� ���α׷� ����"+language+"�Դϴ�.");
		
	}
}
