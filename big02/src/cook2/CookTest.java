package cook2;

import java.util.Scanner;

public class CookTest {

	public CookTest() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("� ������ ���Ͻó���? 1 �ѽ� 2 �߽� >> ");
		int field = sc.nextInt();
		ICook icook;

		if (field == 1) {
			icook = new KoreaCook();
		} else {
			icook = new ChineseCook();
		}

		System.out.print("� ������ ���Ͻó���? 1 �� 2 ���� >> ");
		int food = sc.nextInt();
		CookManager manager = new CookManager(icook);
		if (food == 1) {
			manager.orderSoup();
		} else {
			manager.orderRice();
		}

		sc.close();
	}

}
