package Ȯ�ι���;

import javax.swing.JOptionPane;

public class ����2 {

	public static void main(String[] args) {
		/*
		 * ����� �����ϴ� ��ȭ ������ ? �����
		 * ��ȭ�� �⿬�ڴ� ? �۰�ȣ , ������
		 * ��ȭ�� �����? 15�� 
		 * ��ȭ ������ ? 8.49
		 * ��ȭ�� ��ǥ�⵵�� ? 2019
		 * ����� �� ��ȭ�� ���̳���? true
		 * ����� ���̴� ? 
		 * ------------------------------------
		 */
		String name = JOptionPane.showInputDialog("����� �����ϴ� ��ȭ ������?");
		String performer = JOptionPane.showInputDialog("��ȭ�� �⿬�ڴ�?");
		String rating = JOptionPane.showInputDialog("��ȭ�� �����?");
		String point = JOptionPane.showInputDialog("��ȭ�� ������?");
		String year = JOptionPane.showInputDialog("��ȭ�� ��ǥ �⵵��?");
		String see = JOptionPane.showInputDialog("����� �̿�ȭ�� ���̳���?");
		String age = JOptionPane.showInputDialog("����� ���̴�?");
		double Point = Double.parseDouble(point); // ��ȭ ������ �Ǽ��̱� ������ Double�� ���
		int Year = Integer.parseInt(year);        // year�� �����̱� ������ int ���
		int Rating = Integer.parseInt(rating);    // ��ȭ�� �� ���δ� true or false �̱� ������ Boolean ���
		boolean See = Boolean.parseBoolean(see);  // ���̴� int
		int Age = Integer.parseInt(age);
		
		System.out.println("��ȭ ����: "+name);    
		System.out.println("�⿬��: "+performer);  
		System.out.println("��� : "+Rating+"��");  
		System.out.println("���� : "+Point+"(��)" );  
		if (Rating > 5.5) {
			System.out.println("�ٸ� ��ȭ�� ��� ������ 5.5���Դϴ�. �� ��ȭ�� ���� ���Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ��ȭ���� ������ ������...");
		}
		System.out.println("�󿵱Ⱓ : "+(2020 - Year + 1)+"��° ����");
		System.out.println("��ȭ�� �� ��");
		if (See == true) {    // ���࿡ ��ȭ�� ������
			System.out.println("�ı⸦ �ۼ��Ϸ� ���ϴ�.");   
		}
		else { //��ȭ�� �Ⱥ�����
			System.out.println("���Ÿ� �Ϸ���.");
		}
		if (Age >= 15) {  // 15�� ���� ������ 
			System.out.println("��ȭ�� �� �� �ֽ��ϴ�.");
		}
		else {   // 15�캸�� ������
			System.out.println("��ȭ�� �� �� �����ϴ�.");
		}

	}

}
