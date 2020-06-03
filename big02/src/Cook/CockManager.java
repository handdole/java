package Cook;

import java.util.Scanner;

public class CockManager {
	
	ICook cook;
	
	public int CockManager() {
		System.out.println("한식 1 중식 2");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice==1) {
			System.out.println("한식 만들어주께 ㄱㄷㄱㄷ");
			
		}else if (choice == 2) {
			System.out.println("중식 만들어주께 ㄱㄷㄱㄷ");
		}
		else {
			System.out.println("너 나가.");
		}
		sc.close();
		return choice;
	}
	
	public int orderRice(int choice) {
		
//		if (choice == 1) {
//			cook = new KoreaCock();
//			cook.makeRice();
//			System.out.println("한식 밥나갑니다.");
//		}
//		else {
//			cook = new ChineseCock();
//			cook.makeRice();
//			System.out.println("중식 밥나갑니다.");
//		}
		return choice;
	}
	
	public void orderSoup(int choice) {
//		if (choice == 1) {
//			cook = new KoreaCock();
//			System.out.println("한식 국나갑니다.");
//		}
//		else {
//			cook = new ChineseCock();
//			System.out.println("중식 국나갑니다.");
//		}
	}
	
	
}
