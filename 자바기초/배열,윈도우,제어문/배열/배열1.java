package 배열;

public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seat = new int[10];
		// int[] : int로 만들어진 배열
		// seat : 배열의 이름, 주소, 참조형 변수
		// int[10] : 기본형 변수인 int 10개
		// new :복사

		System.out.println(seat);
		System.out.println(seat[0]);
		System.out.println(seat[1]);
		System.out.println(seat[2]);
		System.out.println(seat[3]);
		System.out.println(seat[4]);
		System.out.println("---------------------------");
		// 배열의 개수를 알고 싶으면 , 배열명 . length
		System.out.println(seat[seat.length - 1]);
		// 배열의 마지막 인덱스는 ??seat[9]
		// seat[seat.length-1]

		System.out.println(seat[seat.length - 1]);
		seat[seat.length - 1] = 100;
		for (int i = 0; i < seat.length; i++) {
			System.out.println(seat[i]);
		}

	}

}
