package ��������;

public class �⺻������ {

	public static void main(String[] args) {
		// �ּ� , comment , ����
//		��Ʈ�� + / (�ڵ��ּ� ����, ����)
		/*
		 * ���� ���� Ȧ�ѷη� => ������ �ּ�.
		 */
		System.out.println("����Ϳ� ���");
		System.out.println("�� �Ȱǰ�?");
//		�⺻�� 4���� 
//		���� , �Ǽ� , ���� , ��
//		�ڹٴ� ������ �Ҵ��� �� �����Ͱ� ���� Ÿ�԰� ũ�⸦ ����
//		���� �տ� Ÿ�Կ� �ش��ϴ� Ű���带 ���ش�.
//		ex) int num;
//		int , double , char , boolean
//		byte(1����Ʈ -128~127) / int (4����Ʈ +-21��) ->long (8����Ʈ)
		int num; // ���� ! => ������ �Ҵ�
		num = 0; // ������ ���� ����ִ� ����
		long money = 22L;

		double height = 180.5;
//		float wight = 445.5; => �������� ������ ��ǻ�ʹ� 445.500000000000000000000 
//								�̷������� �ν��ϴµ� float�� 8�ڸ��� �ν��ؼ�

		char level = 'A'; // 2����Ʈ ���� �ѱ���
		// �ڵ��ϼ� ( ��Ʈ�� + �����̽��� )
		boolean coffee = false;

		// �⺻���� �ƴѵ� �ʹ� ���� ���Ƿ�, �⺻��ó�� ������ �� �� �ְ� ����� ����.
		// ���ڿ� (String) => �ִٿ�ǥ(") ���
		String name = "ȫ�浿�浿�̱浿��";
		System.out.println("-----------------------");
		System.out.println("���� �����ϴ� ����" + num);
		System.out.println("�� Ű" + height);
		System.out.println("�� �����" + level);
		System.out.println("Ŀ�� ���� ����" + coffee);
		System.out.println("�� �̸���" + name);

	}

}
