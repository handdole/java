package 제어문;

import java.util.Scanner;

public class whiletest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 >> ");
		int start = sc.nextInt();
		System.out.print("종료값 >> ");
		int finish = sc.nextInt();
		int sum = 0;
		
		int s = start;
		int f = finish;
		while (s <+ f) {
			sum = sum + s;
			s ++;			
		}
		System.out.println("총합은"+sum);
	}

}
