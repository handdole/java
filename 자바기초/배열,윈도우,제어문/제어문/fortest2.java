package ���;

import java.util.Scanner;

public class fortest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� >> ");
		int a = sc.nextInt();
		System.out.print("�� �� >> ");
		int b = sc.nextInt();
		int sum = 0;
		for ( int i = a ; i <= b ; i++) {
			sum = sum+ i;
		}
		
		System.out.println(sum);
		sc.close();
		
	}
}
