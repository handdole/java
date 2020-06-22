
package 제어문;

import java.util.Date;

public class iftest02 {

	public static void main(String[] args) {
		char c = 'A';
		
		switch (c) {
			case 'A' :
				System.out.println("최우수!");break;
			case'B' :
				System.out.println("우수!"); break;
			default :
				System.out.println("쓰르으ㅏㅇ르!");break;
		}
	}
}




/*
 Date date = new Date();
		int month = date.getMonth() +1 ;
		
		 // 변수 들어갈 수 있는 타입이 정수이다. 정수도 long 타입은 안됨.
		// 실수는 안됨!
		// char 가능
		// String 됨.
		switch (month) {
			case 1: case 3: case 5: case 7 : case 8: case 10: case 12:
				System.out.println("31일까지");
				break;
			case 2: 
				System.out.println("28일까지");
				break;
			default:
				System.out.println("30일까지");				
 */

/*
 Date date = new Date();
		int month = date.getMonth() +1 ;
		
		switch (month) {
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case  10: case 11:
				System.out.println("가을");
				break;
			default:
				System.out.println("겨울");				
 */

/*
String food = "라면";

switch (food) {

case "짜장":
	System.out.println("중국집으로");
	break;
case "우동":
	System.out.println("일식집으로");
	break;
case "라면":
	System.out.println("분식집으로");
	break;
default:
	System.out.println("집에서!");
	
}   // food 와 매칭하여 어딨는지 찾고 거기서 부터 아래까지 다 진행된다.
*/