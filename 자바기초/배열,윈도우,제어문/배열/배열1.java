package �迭;

public class �迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seat = new int[10];
		// int[] : int�� ������� �迭
		// seat : �迭�� �̸�, �ּ�, ������ ����
		// int[10] : �⺻�� ������ int 10��
		// new :����

		System.out.println(seat);
		System.out.println(seat[0]);
		System.out.println(seat[1]);
		System.out.println(seat[2]);
		System.out.println(seat[3]);
		System.out.println(seat[4]);
		System.out.println("---------------------------");
		// �迭�� ������ �˰� ������ , �迭�� . length
		System.out.println(seat[seat.length - 1]);
		// �迭�� ������ �ε����� ??seat[9]
		// seat[seat.length-1]

		System.out.println(seat[seat.length - 1]);
		seat[seat.length - 1] = 100;
		for (int i = 0; i < seat.length; i++) {
			System.out.println(seat[i]);
		}

	}

}
