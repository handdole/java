package �迭;

import java.util.Random;

public class �迭3 {

	public static void main(String[] args) {
			int[] seat = new int[1000];
			
			//���� Ŭ�� �ʿ�
			Random r = new Random(50);
			for (int i = 0; i < seat.length; i++) {
				seat[i] = r.nextInt(1000);
			}
			for (int i = 0; i < seat.length; i++) {
				System.out.println(seat[i]);
			}
			int count = 0;
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 999 ) {
					count++;
				}
			}
			System.out.println("------------------------------");
			System.out.println(count);
		}
	}


