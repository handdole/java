package 윈도우;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class 부품을써보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 날짜, 시간 구하는 것.
		Date d1 = new Date();
		int hour = d1.getHours();
		System.out.println("hour"+"시");
		int min = d1.getMinutes();
		System.out.println("min"+"분");
		int sec = d1.getSeconds();
		System.out.println("sec"+"초");
		
		int year = d1.getYear();
		System.out.println("올해는"+ (year+1900));   // 컴퓨터가 1900부터 시작
		int month = d1.getMonth();
		System.out.println("이번 달은"+month);
		int day = d1.getDay();
		System.out.println("오늘은"+day+"요일");   // 0 : 일요일  ~  6:토요일
		
		//랜덤
		
		Random r = new Random(1);
		int num = r.nextInt(46);
		System.out.println(num);
		
		
		
		//콘솔에서 입력해서 자동을 타입을 바꾸어주는 기능
		Scanner sc = new Scanner(System.in);   // ()에서 읽어오고싶다. 지금은 키보드 = system.in 
		System.out.print("이름을 입력 >>");
		String name = sc.next();  // 콘솔에서 칠수있게 도와줌.
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("나이를 입력 >> ");
		int age = sc.nextInt();  //String ---> int 변환
		System.out.println("내년 나이는 "+(age+1));
	}

}
