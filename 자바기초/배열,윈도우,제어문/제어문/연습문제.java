package ���;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�� ���� �Է¹޾ƺ��ô�.");
			System.out.print("ù ��° �� >> ");
			int a = sc.nextInt();
			System.out.print("�� ��° �� >> ");
			int b = sc.nextInt();
			System.out.print("�����ڴ�? >> ");
			String oper = sc.next();
			sc.close();
			
			switch (oper) {
			case "+":
				System.out.println((a+b)+"�Դϴ�.");
				break;
			case "-":
				System.out.println((a-b)+"�Դϴ�.");
				break;
			case "*":
				System.out.println((a*b)+"�Դϴ�.");
				break;
			case "/":
				System.out.println((a/b)+"�Դϴ�.");
				break;
			default:
				System.out.println("�߸��Է��߽���");
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