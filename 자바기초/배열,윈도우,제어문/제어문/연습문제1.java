package ���;

import java.util.Scanner;

public class ��������1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�����ȣ�� �Է����ּ���.");
			String oper = sc.next();
			char dept = oper.charAt(0);
			sc.close();
			
			switch (dept) {
			case 'A':
				System.out.println("��ȹ��");
				break;
			case 'B':
				System.out.println("�ѹ����Դϴ�.");
				break;
			case 'C':
				System.out.println("�λ���Դϴ�");
				break;
			default:
				System.out.println("���� �μ��ε���");
			}

		}
	}









/*
//TODO Auto-generated method stub
		String sn = "901010-2055111";
		char gender = sn.charAt(7);
		switch (gender) {
		case '1': case '3':
			System.out.println("����");
			break;

		default:
			System.out.println("����");
			break;
		}
*/