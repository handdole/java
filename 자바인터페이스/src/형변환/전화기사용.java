package ����ȯ;

public class ��ȭ���� {
	public static void main(String[] args) {
		byte a = 100; // -128 ~ 127
		int b = a; //-21�� ~ 21��
		//�ڵ� ����ȯ ( ū <- �� )
		
		byte c = (byte) b; //���� ����ȯ ( �� <- ū )
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = 1000;
		byte e = (byte) d; // �̷� ����ȯ�� �ϸ� �ȵ�. ���� �ȵ�.
	}
}
