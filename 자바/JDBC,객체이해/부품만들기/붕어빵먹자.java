package ��ǰ�����;

public class �ؾ���� {

	public static void main(String[] args) {
		BongABbang pop = new BongABbang(); // �� �ؾ ��ü ����
		pop.inside = "��";   // �� �ؾ�� �� ���� ����
		pop.price = 500;     // �� �ؾ�� ���� ���� ����
		
		pop.eat();     // �� �ؾ �Դ� �޼ҵ� ȣ��
		
		BongABbang cream = new BongABbang();   // ũ�� �ؾ ��ü ����
		cream.inside = "ũ��";   // ũ�� �ؾ�� �� ���� ����
		cream.price = 1500;		// ũ�� �ؾ ���� ���� ����
	
		cream.takeout();   // ũ�� �ؾ ���� �޼ҵ� ȣ��
	
	
	}

}
