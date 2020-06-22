package 이차원배열;

public class 구구단 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " x "+j+" = "+(i*j)+" ");
			}
			System.out.println(" ");
		}
	}

}
