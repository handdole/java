package ���;

import java.util.Random;
import java.util.Scanner;

public class �Է��׽�Ʈ3 {

	public static void main(String[] args) {
		// ������ int���� �߻� ���Ѿ���.
		// ������ �� �߻���ų �� �ִ� random Ŭ���� �ʿ�
		Random r = new Random();
		int target = r.nextInt(100); // 0���� 99����
		int n1 = 1;  //�õ� Ƚ�� 
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println(n1 + "��° �õ�!");
			System.out.println("����� �����ϴ� ���ڴ�? (����� -1) >> ");
			int think = sc.nextInt();
			if (think == -1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if (target == think) {
				System.out.println("�����Դϴ�. ���ϵ帳�ϴ�.");
				System.out.println("�����մϴ�." + n1 + "��°���� ���߼̽��ϴ�.");
				System.out.println("���� Ƚ���� " + (n1 - 1) + "ȸ �Դϴ�.");
				System.out.println("�ý�������");
				break;

			} else {
				if (target > think) {
					System.out.println("�ʹ��۾�");
				} else {
					System.out.println("�ʹ���");
				} // else
					// ���亸�� �����Ѱ��� ������ �ʹ� ����
					// ���亸�� ������ ���� ������ �ʹ� ����
				n1++; // ���� ������
			} // else ��ȣ

		} // ���� while�� ��ȣ
		sc.close();
	}// main

}// calss
