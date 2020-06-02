package 인터페이스구현;

import 인터페이스정의.MegaPhone;


//추상 클래스 ( 클래스긴 한대 추상메소드가 들어가는 클래스 )
// 원래 추상 메소드는 interface에서밖에 안되는데 
// 추상클래스에서는 추상메소드 사용 가눙
public abstract class ApplePhone implements MegaPhone {
	
	
	public abstract void camera();
	
	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("인터넷 on!");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화 on!");
	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		System.out.println("문자 on!");
	}

	@Override
	public void kakao() {
		// TODO Auto-generated method stub
		System.out.println("카톡 on!");
	}

	@Override
	public void map() {
		// TODO Auto-generated method stub
		System.out.println("지도 on!");
	}

	@Override
	public void trace() {
		// TODO Auto-generated method stub
		System.out.println("추적 on!");
	}

	@Override
	public void siri() {
		// TODO Auto-generated method stub
		System.out.println("시리 on!");
	}

	
}
