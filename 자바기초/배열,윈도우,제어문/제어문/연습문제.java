package 제어문;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("두 수를 입력받아봅시다.");
			System.out.print("첫 번째 수 >> ");
			int a = sc.nextInt();
			System.out.print("두 번째 수 >> ");
			int b = sc.nextInt();
			System.out.print("연산자는? >> ");
			String oper = sc.next();
			sc.close();
			
			switch (oper) {
			case "+":
				System.out.println((a+b)+"입니다.");
				break;
			case "-":
				System.out.println((a-b)+"입니다.");
				break;
			case "*":
				System.out.println((a*b)+"입니다.");
				break;
			case "/":
				System.out.println((a/b)+"입니다.");
				break;
			default:
				System.out.println("잘못입력했슴둥");
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