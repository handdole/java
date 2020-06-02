package 인터페이스구현;

// public , protected , default(안씀) , private

// private => 해당 클래스 안에서만 접근가능
// default => 해당 패키지 안에서만 접근가능
// protected => 해당 패키지 + 다른패키지(상속받은 곳)
// public => 모든 곳 접근 가능
public class BuyPhone {
	
	
	public static void main(String[] args) {
//		추상클래스는 객체생성 불가
//		ApplePhone p1 = new ApplePhone();
		ApplePhone1 p1 = new ApplePhone1();
		p1.camera();
		
	}
}
