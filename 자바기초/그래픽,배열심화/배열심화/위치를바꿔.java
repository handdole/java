package �迭��ȭ;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ��ġ���ٲ� {

	public static void main(String[] args) {
			
		
		int[] num = {66,77,33,22,99};
		int temp = num[0];  // temp <- 66
		num[0] = num[1];  // 66 <- 77
		num[1] = temp;  // 77 <- 66
		for (int i : num) {
			
			System.out.println(i);
		}
		

	}

}
