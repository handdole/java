package Cook;

import java.util.Scanner;

public class CockManager {
	
	ICook cook;
	
	public int CockManager() {
		System.out.println("�ѽ� 1 �߽� 2");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice==1) {
			System.out.println("�ѽ� ������ֲ� ��������");
			
		}else if (choice == 2) {
			System.out.println("�߽� ������ֲ� ��������");
		}
		else {
			System.out.println("�� ����.");
		}
		sc.close();
		return choice;
	}
	
	public int orderRice(int choice) {
		
//		if (choice == 1) {
//			cook = new KoreaCock();
//			cook.makeRice();
//			System.out.println("�ѽ� �䳪���ϴ�.");
//		}
//		else {
//			cook = new ChineseCock();
//			cook.makeRice();
//			System.out.println("�߽� �䳪���ϴ�.");
//		}
		return choice;
	}
	
	public void orderSoup(int choice) {
//		if (choice == 1) {
//			cook = new KoreaCock();
//			System.out.println("�ѽ� �������ϴ�.");
//		}
//		else {
//			cook = new ChineseCock();
//			System.out.println("�߽� �������ϴ�.");
//		}
	}
	
	
}
