package ���;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class �Է��׽�Ʈ2 {

	public static void main(String[] args) {
		//1. �Է¹޴� Ŭ����(��ǰ) �ʿ�.
		//��Ʈ�� + ����Ʈ + ����o  ==> �ڵ� import 
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("�Է� (���� : x) >> ");
			String data = sc.next();
			//���� ���ϴ� ��� �񱳿����ڴ� �⺻������ Ÿ�Ը� �� �� �ִ�.
			//�⺻������ : ���� �Ǽ� ���� , ��(boolean)
			if (data.equals("x")) {  // true / false
				JOptionPane.showMessageDialog(null, "�ý������ᾲ");
				System.out.println("���̴�");
				break;  // break�� �����ϰ� �ִ� �ݺ����� ������.
			}
			System.out.println("����� �Է� �����ʹ� : " +data);
		}
		
		
		//2. �ֿܼ� ����Ʈ (���)
		

		

	}

}
