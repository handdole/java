package �迭;

public class �迭2 {

	public static void main(String[] args) {
			int[] seat = new int[1000]; // int seat[] �� ����.
										// 10�� ���� ! 
			// �ڹٿ����� �迭�� ũ�⸦ ������������ �� �� ����.
			
			for (int i = 0; i < seat.length; i++) {
				seat[i] = i+1;
			}
			for (int i = 0; i < seat.length; i++) {
				System.out.println(seat[i]);
			}
		}

	}


