package ����;

public class �⺻�� {
	static String name;
//	int age = 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�⺻�� ������ - �ش� Ÿ���� ���� ���� ������
//		����
//			���� : int
//			�Ǽ� : double
//		����(�ѱ���) : char   # �ڹٿ����� ��Ʈ���� �⺻���� �ƴϴ�. ��Ʈ���� �ڹٿ��� ������
//		��(bool) : boolean (true/false)
		
		//����!!! => Ÿ���� ���� �������� ���ִ� ����.
		//���� ������ ���������.(������ �Ҵ��Ѵ�.)
		int age = 100;  // ���� (-21�� ~ 21��) 4����Ʈ 
		double eye = 0.7; // �Ǽ� (�Ҽ��� 16�ڸ�) 8����Ʈ
		char gender = '��';  // ���ڴ� �ѱ��� 2����Ʈ
		boolean food = true; // Ʈ�� �������� ����� => ���� ���׻��� �͵� (�ڿ����� ������ �̸����� ����� �� ����) 1����Ʈ
		System.out.println("���� ���̴� "+age+"��");
		System.out.println("���� �÷��� "+eye);
		System.out.println("���� ������ "+gender+"��");
		System.out.println("���� ������ �Ծ������? "+food);
		name = "ȫ�浿";
		System.out.println(name);
	}

}
