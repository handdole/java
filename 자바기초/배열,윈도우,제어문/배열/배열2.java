package 배열;

public class 배열2 {

	public static void main(String[] args) {
			int[] seat = new int[1000]; // int seat[] 와 같다.
										// 10은 개수 ! 
			// 자바에서의 배열은 크기를 정하지않으면 쓸 수 없다.
			
			for (int i = 0; i < seat.length; i++) {
				seat[i] = i+1;
			}
			for (int i = 0; i < seat.length; i++) {
				System.out.println(seat[i]);
			}
		}

	}


