package ��ǰ�����;

public class dog {
	String name;
	int age;
	char gender;
	
	public void eat(String food) {
		System.out.println(food + "�Դ�");
	}
	public void bark(int min , String at , String how) {
		System.out.println(min+"�е���"+at+"����"+how+"¢��");
	}
	public void wave(String power,int min) {     // () �ȿ��ٰ� �ӽú����� ������ִ�. 
		// �Ű����� parameter , wave ��� �ż��� �ȿ����� ��밡�� �� , ���������̴�~
		System.out.println(min+"�е��� "+ power+"������ ����.");
	}
	@Override
	public String toString() {
		return "������ [�̸�=" + name + ", ����=" + age + ", ����=" + gender + "]";
	}
	
	
	
}
