package 제어문;

import java.util.Scanner;

public class 입력테스트 {

	public static void main(String[] args) {
		// 입력용 부품(class)을 복사해옵시다.
		
		Scanner sc = new Scanner(System.in);   //sc는 스트림이다. => 빨대
		//오늘의 날씨는 ? 화창 입력!
		System.out.print("오늘의 날씨는 >> ");
		String weather = sc.next();
		System.out.println(weather);
		
		// 몇도 인가요? 1
		System.out.println("몇 도 인가요?");
		int temp = sc.nextInt();
		
		if (temp >= 0) {
			System.out.println("봄이왔나봄");
		} 
		else {
			System.out.println("아이고 추브라~");
		}
		
	
		sc.close(); // 빨대를 꼽았으면 빼야제.
		
		
		
	}

}
