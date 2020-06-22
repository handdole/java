package �迭��ȭ;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class �ִ밪ã��2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ��ĳ�� �Լ� ����Ʈ
		int[] nums = new int[5]; // nums ��� ����Ʈ ���� 5�� ����
		for (int i = 0; i < nums.length; i++) { // ���� 5�� �Է¹ޱ� ���� for ��
			System.out.print("���� 5�� �Է� >> "); // ���� �Է� �޼��� ���
			int num = sc.nextInt(); // ���� ���ڸ� num�̶�� ������ ����
			nums[i] = num; // �Է¹��� num �� num[i]�� �´� �ε����� �� ������ ����
			System.out.println(""); // �� ����
		}

		sc.close(); // ��ĳ�� �Լ� ����

		// 1. �ִ밪�� ã������ �迭�� �� ���ƾ��Ѵ�.
		// 2. �ش� index�� ������ �� ������ �ִ밪�� �����ϱ����� �ӽú����� �ϳ� ����
		// 3. �迭�� �� �������� �ӽú������� �ִ밪�� ���� ���̴�.

		int min = nums[0];
		// �� ù��° ���� �־���ҳ�?
		// 1) ���������� 0�� �ֱ� ������ , ã���� �ϴ� ����Ʈ �̿��� ���� �־�θ� �������� ���ߴ� ������ �߻��ϰ� ��.
		// => 0 ������ ���� ������ ������ ����
		// 2) �ӽú������� ����Ʈ�� �ִ� ���� �ϳ��� ������ �ȴ�.
		// => index �� �����ϸ鼭 ��ȸ�ϱ� ������ ù��° ���� �ִ´�.

		for (int i = 0; i < nums.length; i++) {
			// �ش� �ε����� ����ִ� ���� max �������� ������ ���� üũ
			// true �̸� , �ش� �ε����� ����ִ� ���� min ������ ����
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("�ִ밪�� " + min);

	}

}
