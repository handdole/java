package ���;

import java.util.Scanner;

public class fortest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���丮�� �����ٰ� ���� �˷��� >> ");
		int a = sc.nextInt();		
		int fac =1;
		int i = 1;
		while (i <= a) {
			fac = fac * i;
			i++;
			}
		System.out.println(fac);
		
		
	}
}
