package ��ǰ�����;

// �޼ҵ带 �����ߴٰ� �ؼ� ȥ�� ������� �ʴ´�.
// �޼ҵ�� ȣ���ؾ߸� ����ȴ�.

public class MyRoomMain {
	public static void main(String[] args) {
		
		Tv myTv = new Tv();
		
		//tv Ŭ������ ���� (new)
		//new�� ��� ������ �����!
		myTv.channel = 5;
		myTv.onOff = true;

		
		Tv yourTv = new Tv();
		yourTv.channel = 5;
		yourTv.volume = 10;
		yourTv.onOff = true;
		
		myTv.trunOn();
		yourTv.turnOff();
		
		
		Phone fPhone = new Phone();
		fPhone.color = "�Ķ�";
		fPhone.model = "galaxy20";
		fPhone.number = "010544394859";
		fPhone.text();
		
		Phone mPhone = new Phone();
		mPhone.color = "yellow";
		mPhone.model = "iphone11";
		mPhone.number = "01094745128";
		mPhone.call();
		
		dog d1 = new dog();
		d1.name = "����";
		d1.age = 22;
		
		
		System.out.println(myTv);
		System.out.println(d1);
		
		

	}
}
