package cook2;

import java.util.Scanner;

public class CookTest {

	public CookTest() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 종류를 원하시나요? 1 한식 2 중식 >> ");
		int field = sc.nextInt();
		ICook icook;

		if (field == 1) {
			icook = new KoreaCook();
		} else {
			icook = new ChineseCook();
		}

		System.out.print("어떤 음식을 원하시나요? 1 밥 2 스프 >> ");
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
