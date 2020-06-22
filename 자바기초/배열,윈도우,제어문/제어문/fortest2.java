package 제어문;

import java.util.Scanner;

public class fortest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 수 >> ");
		int a = sc.nextInt();
		System.out.print("끝 수 >> ");
		int b = sc.nextInt();
		int sum = 0;
		for ( int i = a ; i <= b ; i++) {
			sum = sum+ i;
		}
		
		System.out.println(sum);
		sc.close();
		
	}
}
