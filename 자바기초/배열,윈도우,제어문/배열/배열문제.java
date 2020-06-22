package 배열;

import java.util.Random;

public class 배열문제 {

	public static void main(String[] args) {
			int friday [] = new int[20];
			System.out.println(friday.length);
			System.out.println("------------------------");
			friday[0] = 100;
			System.out.println(friday[0]);
			System.out.println("------------------------");
			friday[2] = 200;
			System.out.println(friday[2]);
			System.out.println("------------------------");
			friday[friday.length-1] = 200;
			System.out.println(friday[friday.length-1]);
			System.out.println("------------------------");
			System.out.println(friday[9]);
			System.out.println("------------------------");
			System.out.println(friday[12]);
			System.out.println("------------------------");
			for (int i = 0; i < friday.length; i++) {
				System.out.print(friday[i]);
				System.out.print(" ");
			}
			
			
		}
	}


