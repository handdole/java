package 제어문;

import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("사원번호를 입력해주세요.");
			String oper = sc.next();
			char dept = oper.charAt(0);
			sc.close();
			
			switch (dept) {
			case 'A':
				System.out.println("기획부");
				break;
			case 'B':
				System.out.println("총무부입니다.");
				break;
			case 'C':
				System.out.println("인사부입니다");
				break;
			default:
				System.out.println("없는 부서인데여");
			}

		}
	}









/*
//TODO Auto-generated method stub
		String sn = "901010-2055111";
		char gender = sn.charAt(7);
		switch (gender) {
		case '1': case '3':
			System.out.println("남자");
			break;

		default:
			System.out.println("여자");
			break;
		}
*/