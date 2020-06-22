package 이차원배열;

import java.util.Scanner;

public class 극장예매3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    // 스캐너 메소드 호출
		int[][] seat = new int[3][10];         // 3행 10열 짜리 배열 생성
		int count = 0;							// 뒷쪽에 총 구매 영화표 count 하기위한 변수생성
		while (true) {		 // 반복 구문 실행   종료버튼 누를 경우 break
			System.out.println("극장 예매 시스템 입니다.");    
			System.out.print("    ");
			for (int i = 0; i < 10; i++) {       // 좌석 열의 번호를 지정
				System.out.print((i+1) + " ");
			}
			System.out.println("");
			System.out.println("-----------------------------------");
			for (int i = 0; i < seat.length; i++) {      
				System.out.print((i+1)+"행  ");  			// 각 행의 번호 지정
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");      // 좌석에 예매 되어있는지 안되어있는지 나타냄 0 예매가능 1 불가능
				}
				System.out.println("");
			}
			System.out.println("-----------------------------------");
			System.out.print("원하시는 행 (1~3) 종료는 -1을 입력해주세요. >> ");    //원하는 행 지정
			int row = sc.nextInt();
			
			System.out.println("-----------------------------------");
			if (row-1 == -2) {

				System.out.println("-----------------------------------");
				// 예매금액 결제확인
				System.out.println("총 좌석 수 : " + count + " 총 금액 : " + (count * 10000)+"원" + " 입니다. 감사합니다.");
				System.out.println("영화예매 시스템을 종료합니다.");
				break;
			} else if (((row-1) < 0) || ((row-1) > 2)) {
				System.out.println("존재하지 않는 좌석입니다.");
				System.out.println("-----------------------------------");
				continue;
			}
			System.out.print("원하시는 열(1~10) >> ");
			int col = sc.nextInt();
			System.out.println("-----------------------------------");
			if ((col-1 < 0) || (col-1 > 9)) {
				System.out.println("존재하지 않는 좌석입니다.");
				System.out.println("-----------------------------------");
				continue;
			}
			
			if (seat[row-1][col-1] == 1) {
				System.out.println("예매가 되어있는 좌석입니다.");
				System.out.println("-----------------------------------");
			} else {
				seat[row-1][col-1] = 1;
				System.out.println("예매처리 완료");
				System.out.println("-----------------------------------");
				count++;
			}

		}
		sc.close();

	}

}
