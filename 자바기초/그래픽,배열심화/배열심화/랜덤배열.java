package �迭��ȭ;

import java.util.Random;

public class �����迭 {

	public static void main(String[] args) {
		// 1. �����ϰ� ���� 1000�� ���Ѽ� ,
		Random r = new Random(10); // �������� ������ ���� �õ尪 �־���. // ������ ���� , ���� ���� // () => �ȿ� �ִ� ���� �õ尪
		// 1000���̤� �����͸� ���� �� �� �ִ� ���� �ʿ�
		// => �迭(array)

		int[] nums = new int[1000]; // 1000���� ������ �������

		// nums�� 0~999������ ������ ���� 0-999������ �ε����� ����
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(1000); // 0~999
		}

		// 0���� ������ ����Ʈ �ε��� + 1 �� ���� �� �ε����� �´� �� ���
		for (int i = 0; i < nums.length; i++) {
			System.out.println((i + 1) + ":" + nums[i]);
		}

		// 2. �ִ밪�� �������� ã�ƺ��� ,
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println(max);
		
		System.out.println("----------------------------");
		// 3. ��ġ�� ������� ã�ƺ��� ,
		for (int i = 0; i < nums.length; i++) {
			if (max == nums[i]) {
				System.out.println(i);
			}
		}
		
		// 4. �� ���� �ִ��� ã�ƺ��ô�.
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (max == nums[i]) {
				count++;
			}
		}
		System.out.println("-----------------------------------");
		System.out.println(count);

	}

}
