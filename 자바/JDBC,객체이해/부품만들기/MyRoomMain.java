package 부품만들기;

// 메소드를 정의했다고 해서 혼자 실행되지 않는다.
// 메소드는 호출해야만 실행된다.

public class MyRoomMain {
	public static void main(String[] args) {
		
		Tv myTv = new Tv();
		
		//tv 클래스를 복사 (new)
		//new는 멤버 변수가 복사됨!
		myTv.channel = 5;
		myTv.onOff = true;

		
		Tv yourTv = new Tv();
		yourTv.channel = 5;
		yourTv.volume = 10;
		yourTv.onOff = true;
		
		myTv.trunOn();
		yourTv.turnOff();
		
		
		Phone fPhone = new Phone();
		fPhone.color = "파랑";
		fPhone.model = "galaxy20";
		fPhone.number = "010544394859";
		fPhone.text();
		
		Phone mPhone = new Phone();
		mPhone.color = "yellow";
		mPhone.model = "iphone11";
		mPhone.number = "01094745128";
		mPhone.call();
		
		dog d1 = new dog();
		d1.name = "막지";
		d1.age = 22;
		
		
		System.out.println(myTv);
		System.out.println(d1);
		
		

	}
}
