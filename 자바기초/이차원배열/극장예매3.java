package �������迭;

import java.util.Scanner;

public class ���忹��3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    // ��ĳ�� �޼ҵ� ȣ��
		int[][] seat = new int[3][10];         // 3�� 10�� ¥�� �迭 ����
		int count = 0;							// ���ʿ� �� ���� ��ȭǥ count �ϱ����� ��������
		while (true) {		 // �ݺ� ���� ����   �����ư ���� ��� break
			System.out.println("���� ���� �ý��� �Դϴ�.");    
			System.out.print("    ");
			for (int i = 0; i < 10; i++) {       // �¼� ���� ��ȣ�� ����
				System.out.print((i+1) + " ");
			}
			System.out.println("");
			System.out.println("-----------------------------------");
			for (int i = 0; i < seat.length; i++) {      
				System.out.print((i+1)+"��  ");  			// �� ���� ��ȣ ����
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");      // �¼��� ���� �Ǿ��ִ��� �ȵǾ��ִ��� ��Ÿ�� 0 ���Ű��� 1 �Ұ���
				}
				System.out.println("");
			}
			System.out.println("-----------------------------------");
			System.out.print("���Ͻô� �� (1~3) ����� -1�� �Է����ּ���. >> ");    //���ϴ� �� ����
			int row = sc.nextInt();
			
			System.out.println("-----------------------------------");
			if (row-1 == -2) {

				System.out.println("-----------------------------------");
				// ���űݾ� ����Ȯ��
				System.out.println("�� �¼� �� : " + count + " �� �ݾ� : " + (count * 10000)+"��" + " �Դϴ�. �����մϴ�.");
				System.out.println("��ȭ���� �ý����� �����մϴ�.");
				break;
			} else if (((row-1) < 0) || ((row-1) > 2)) {
				System.out.println("�������� �ʴ� �¼��Դϴ�.");
				System.out.println("-----------------------------------");
				continue;
			}
			System.out.print("���Ͻô� ��(1~10) >> ");
			int col = sc.nextInt();
			System.out.println("-----------------------------------");
			if ((col-1 < 0) || (col-1 > 9)) {
				System.out.println("�������� �ʴ� �¼��Դϴ�.");
				System.out.println("-----------------------------------");
				continue;
			}
			
			if (seat[row-1][col-1] == 1) {
				System.out.println("���Ű� �Ǿ��ִ� �¼��Դϴ�.");
				System.out.println("-----------------------------------");
			} else {
				seat[row-1][col-1] = 1;
				System.out.println("����ó�� �Ϸ�");
				System.out.println("-----------------------------------");
				count++;
			}

		}
		sc.close();

	}

}
