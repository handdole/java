package ��������;

import javax.swing.JOptionPane;

public class �⺻�����2 {

	public static void main(String[] args) {
		//���̸� �Է��ؼ� , ���� ���̸� ���غ�����.
		//Integer,parseInt()�� �̿�
		
		//Ű�� �Է��ؼ� , ���� Ű�� ���غ�����.
		//Double.parseDouble()
		
		String age = JOptionPane.showInputDialog("���� ���̴�?");
		int realAge = Integer.parseInt(age);
		System.out.println("���� ���̴� "+ (realAge + 1)+"�Դϴ�.");
		String height = JOptionPane.showInputDialog("Ű�Է�");
		double realHeight = Double.parseDouble(height);
		System.out.println("���� Ű�� "+(realHeight + 5)+"�Դϴ�.");
		
		//��ħ�� �Ծ�����? true
		String food = JOptionPane.showInputDialog("��ħ�� �Ծ�����?");
		boolean realFood = Boolean.parseBoolean(food);
		System.out.println("��ħ�� �Ծ����� ���� ");
		
		if(realFood == true) {
			System.out.println("�谡 �θ��Áٱ���");
			
		}
		else {
			System.out.println("�谡 �����ðڱ���");
		}
	}

}
