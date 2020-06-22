package 제어문;

import java.util.Scanner;

public class fortest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("팩토리얼 구해줄게 숫자 알려줘 >> ");
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
