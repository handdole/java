package 확인문제;

import java.util.Date;
import java.util.Scanner; // 스캐너 모듈 import

import javax.swing.JOptionPane;

public class 문제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //스캐너 모듈의 이름을 sc로 정의
		
		//1번
		System.out.println("-----------나의 현금 잔고는-----------");
		System.out.print("현재 당신이 가지고 있는 돈은? >> ");
		int a = sc.nextInt();   
		// 변수 a 를 지정해주고 콘솔에서 입력값을 a로 받음 / next 로하면 안됨 Int들어가야함. 
		System.out.print("내일 당신이 가지게 될 돈은? >> "); 
		int b = sc.nextInt();
		System.out.println("=================================");
		System.out.println("내일 내가 가지게 될 돈은"+(a+b)+"입니다.");
		
		//2번
		System.out.println("       <<여행정보>>       ");
		System.out.println("------------------------");
		System.out.print("-여행지 :");
		String go = sc.next();
		System.out.print("-경비 : ");
		int mo = sc.nextInt();
		System.out.print("-할인율: ");
		double sa = sc.nextDouble();  // 할인율은 실수임으로 double로 변수 타입 지정
		System.out.println("실제경비: "+(mo*(1-sa)));   //1-할인율은 내가 내야할 퍼센테이지
		System.out.println("------------------------");
		System.out.println("12월 중순에 갔을 대 가격");
		
		//3번
		System.out.print("음식점 계산 총 금액 : ");
		Double aa = sc.nextDouble();   
		// 금액에서 인원수를 나눠야하고 소수점 밑의 자리까지 더치페이 한다고하면 aa혹은 bb를 실수로 선언
		System.out.print("함께 먹은 사람 인원수 : ");
		int bb = sc.nextInt();
		System.out.println("---------------------");
		System.out.println("각자 내야할 돈 >> "+(aa/bb)+"원입니다."); //소수점까지 나옴

		//4번
		Date date1 = new Date(); 
		int time = date1.getHours(); //타임은 현재 시간
		System.out.print("커피값은? >> ");
		int aaa = sc.nextInt();
		System.out.print("인원수는? >> ");
		int bbb = sc.nextInt();
		System.out.println(time);
		if (time < 22) {   // 현재시간이 10시를 넘기지 않았을 경우 제값
			System.out.println("커피 가격은  "+(aaa*bbb)+"원 입니다.");
		}
		else if (time >= 22) { // 현재시간이 10시를 넘었을 경우 5000원 할인
			System.out.println("커피 가격은"+(aaa*bbb-5000)+"원 입니다.");
		}
		else {
			System.out.println("잘못입력");
		}
	}

}
