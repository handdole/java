package 이차원배열;

public class 이차원배열1 {

	public static void main(String[] args) {
		// 값을 미리 알고 있는가 모르고 있는가?
		int[][] seat = new int[3][10]; // 3행 10열 (30개의 저장공간)
		// 30개의 저장공간에 모두 0으로 초기화 되어 있는 상태
		// 배열은 자동 초기화를 시켜준다. int -> 0 , 참조형 -> null
		System.out.println(seat[0][3]);
		seat[0][9] = 100;
		System.out.println(seat[0][9]);
		seat[0][6] = 200;
		seat[1][8] = 300;
		seat[2][3] = 400;
		System.out.println(seat[0].length);
		
		
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i+"/");
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]+"/");
			}
			System.out.println("");
		}
		
		
		
	}



}
