package �������迭;

public class �������迭1 {

	public static void main(String[] args) {
		// ���� �̸� �˰� �ִ°� �𸣰� �ִ°�?
		int[][] seat = new int[3][10]; // 3�� 10�� (30���� �������)
		// 30���� ��������� ��� 0���� �ʱ�ȭ �Ǿ� �ִ� ����
		// �迭�� �ڵ� �ʱ�ȭ�� �����ش�. int -> 0 , ������ -> null
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
