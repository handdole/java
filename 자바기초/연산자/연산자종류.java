package ������;

import javax.swing.JOptionPane;

public class ���������� {

	public static void main(String[] args) {
		// �� ������ �Է¹�������.
		String a = JOptionPane.showInputDialog("�� ������ �Է��ϼ���.");
		int money = Integer.parseInt(a);
		// �� �ο����� �Է¹�������.
		String b =  JOptionPane.showInputDialog("�� �ο����� �Է��ϼ���.");
		double people = Double.parseDouble(b);
		// �Ѹ�� �󸶾� �����ϴ°�?(�Ҽ���)
		System.out.println(money / people);
		
		// �ݺ��� : �ʱⰪ , ���ǽ�, ������ 
		// 0~9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("���Ⱑ ��");
	}

}
