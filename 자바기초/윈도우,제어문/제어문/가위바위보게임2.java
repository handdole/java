package 제어문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임2 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int myWin = 0;
		int comWin = 0;
		int count = 0;
		while (true) {

			int c = r.nextInt(3); // 컴퓨터가 가위바위보를 지정하는 숫자가 매번 달라야한다.
			// 이부분이 while 문 밖으로 나가면 랜덤으로 지정되지 않음.
			// r.nextInt() -21~21억 발생
			// r.nextInt(3)-2 / -2 ~ 2까지
			// r.nextInt() 0 ~ 숫자 -1 발생! 범위를 줄일 수 있다.
			System.out.println("가위바위보게임을 시작합니다.(종료 : -1)");
			System.out.println("가위 >> 0 바위 >> 1  보>>2");
			System.out.println("--------------------");
			System.out.print("무엇을 내시겠습니까? >> ");
			int me = sc.nextInt();
			if (me == 0) { // 내가 가위일때
				count++;
				if (c == 0) {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("무승부 입니다!");
					System.out.println("-------------------");
				} else if (c == 1) {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("컴퓨터 승리!");
					comWin++;// 컴퓨터가 승리했을때 누적합
					System.out.println("-------------------");
				} else {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("나의 승리!");
					myWin++;// 내가 승리했을때 누적합
					System.out.println("-------------------");
				}
			} else if (me == 1) // 내가 주먹일때
			{
				count++;
				if (c == 0) {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("나의 승리!");
					myWin++;// 내가 승리했을때 누적합
					System.out.println("-------------------");
				} else if (c == 1) {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("무승부!!");
					System.out.println("-------------------");
				} else {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("컴퓨터 승리!");
					comWin++; // 컴퓨터가 승리했을때 누적합
					System.out.println("-------------------");
				}
			} else if (me == 2) { // 내가 보일때
				count++;
				if (c == 0) {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("컴퓨터승리!");
					comWin++; // 컴퓨터가 승리했을때 누적합
					System.out.println("-------------------");
				} else if (c == 1) {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("나의승리!");
					myWin++; // 내가 승리했을때 누적합
					System.out.println("-------------------");
				} else {
					System.out.println("가위 바위 보!");
					System.out.println("컴퓨터 >>" + c + "vs 나 >> " + me);
					System.out.println("무승부!");
					System.out.println("-------------------");
				}
			} else if (me == -1) { // 종료버튼을 눌렀을 때
				System.out.println("프로그램을 종료합니다.");
				System.out.println("내가 승리한 횟수 >> " + myWin); // 내가 승리한 횟수 출력
				System.out.println("컴터가 승리한 횟수 >> " + comWin); // 컴퓨터가 승리한 횟수 출력
				System.out.println("나의 승률 >> " + ((myWin / (double) count) * 100) + "%");
				break;
			} else { // 잘못된 버튼을 눌렀을 때
				System.out.println("잘못된 입력입니다.");
				System.out.println("-------------------");
			}
		}

		sc.close();
	}// main

}// calss

//내가 승리한거 
//컴퓨터 승리 횟수
//총승률
