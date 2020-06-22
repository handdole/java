package 제어문;

import java.util.Random;
import java.util.Scanner;

public class 입력테스트3 {

	public static void main(String[] args) {
		// 랜덤한 int값을 발생 시켜아함.
		// 랜덤한 값 발생시킬 수 있는 random 클레스 필요
		Random r = new Random();
		int target = r.nextInt(100); // 0부터 99까지
		int n1 = 1;  //시도 횟수 
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println(n1 + "번째 시도!");
			System.out.println("당신이 생각하는 숫자는? (종료는 -1) >> ");
			int think = sc.nextInt();
			if (think == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (target == think) {
				System.out.println("정답입니다. 축하드립니다.");
				System.out.println("축하합니다." + n1 + "번째만에 맞추셨습니다.");
				System.out.println("실패 횟수는 " + (n1 - 1) + "회 입니다.");
				System.out.println("시스템종료");
				break;

			} else {
				if (target > think) {
					System.out.println("너무작앙");
				} else {
					System.out.println("너무컹");
				} // else
					// 정답보다 생각한값이 높으면 너무 높앙
					// 정답보다 생각한 값이 낮으면 너무 낮앙
				n1++; // 증감 연산자
			} // else 괄호

		} // 메인 while의 괄호
		sc.close();
	}// main

}// calss
