package �迭��ȭ;

import java.util.ArrayList;

public class �߰������� {

	public static void main(String[] args) {
		// 1~100 ������ �� �߿��� ¦���� ���ؼ� �迭�� �־�ô�.
//		int [] even = new int[50];      �갡 0~49 ���� �̱� ������ �ؿ� i�� ������ ����� �� ����.
//		int index = 0; // ¦�� �迭�� �ش��ϴ� �ε���
//		for (int i = 0; i < 100; i++) {
//			if ((i % 2 == 0) && (i != 0)) {    // %�� ������ ������.
//				even[i] = i+1;
//			}
//		}
//		for (int i = 0; i < even.length; i++) {
//			System.out.println(even[i]);
//		}
		// ���� �ְ������ �ش� ����� ���� �ִ� Ŭ�󽺸� ã�ƾ���.
		
		
		
		ArrayList even = new ArrayList();
		
		             // �ε����� �����ϱ����� ���� ����
		for (int i = 1; i <= 100; i++) {  // 1~100������ ���߿� ¦���μ��� ���ϱ� ���� �ݺ���  (���� ��)
			if (i % 2 == 0) { 					// i�� 2�� ������ �� �������� 0�̸� 
				even.add(i);				// even�̶�� ����Ʈ�� i�� �־���.
			}
		}

		System.out.println(even);
		System.out.println(even.size());
		
		

	}

}
