package ���;

import java.util.Random;
import java.util.Scanner;

public class ��������������2 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int myWin = 0;
		int comWin = 0;
		int count = 0;
		while (true) {

			int c = r.nextInt(3); // ��ǻ�Ͱ� ������������ �����ϴ� ���ڰ� �Ź� �޶���Ѵ�.
			// �̺κ��� while �� ������ ������ �������� �������� ����.
			// r.nextInt() -21~21�� �߻�
			// r.nextInt(3)-2 / -2 ~ 2����
			// r.nextInt() 0 ~ ���� -1 �߻�! ������ ���� �� �ִ�.
			System.out.println("���������������� �����մϴ�.(���� : -1)");
			System.out.println("���� >> 0 ���� >> 1  ��>>2");
			System.out.println("--------------------");
			System.out.print("������ ���ðڽ��ϱ�? >> ");
			int me = sc.nextInt();
			if (me == 0) { // ���� �����϶�
				count++;
				if (c == 0) {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("���º� �Դϴ�!");
					System.out.println("-------------------");
				} else if (c == 1) {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("��ǻ�� �¸�!");
					comWin++;// ��ǻ�Ͱ� �¸������� ������
					System.out.println("-------------------");
				} else {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("���� �¸�!");
					myWin++;// ���� �¸������� ������
					System.out.println("-------------------");
				}
			} else if (me == 1) // ���� �ָ��϶�
			{
				count++;
				if (c == 0) {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("���� �¸�!");
					myWin++;// ���� �¸������� ������
					System.out.println("-------------------");
				} else if (c == 1) {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("���º�!!");
					System.out.println("-------------------");
				} else {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("��ǻ�� �¸�!");
					comWin++; // ��ǻ�Ͱ� �¸������� ������
					System.out.println("-------------------");
				}
			} else if (me == 2) { // ���� ���϶�
				count++;
				if (c == 0) {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("��ǻ�ͽ¸�!");
					comWin++; // ��ǻ�Ͱ� �¸������� ������
					System.out.println("-------------------");
				} else if (c == 1) {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("���ǽ¸�!");
					myWin++; // ���� �¸������� ������
					System.out.println("-------------------");
				} else {
					System.out.println("���� ���� ��!");
					System.out.println("��ǻ�� >>" + c + "vs �� >> " + me);
					System.out.println("���º�!");
					System.out.println("-------------------");
				}
			} else if (me == -1) { // �����ư�� ������ ��
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("���� �¸��� Ƚ�� >> " + myWin); // ���� �¸��� Ƚ�� ���
				System.out.println("���Ͱ� �¸��� Ƚ�� >> " + comWin); // ��ǻ�Ͱ� �¸��� Ƚ�� ���
				System.out.println("���� �·� >> " + ((myWin / (double) count) * 100) + "%");
				break;
			} else { // �߸��� ��ư�� ������ ��
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.println("-------------------");
			}
		}

		sc.close();
	}// main

}// calss

//���� �¸��Ѱ� 
//��ǻ�� �¸� Ƚ��
//�ѽ·�
