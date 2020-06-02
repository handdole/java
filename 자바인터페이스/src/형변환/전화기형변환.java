package 형변환;

import 인터페이스구현.ApplePhone;
import 인터페이스구현.ApplePhone1;
import 인터페이스정의.Phone;

public class 전화기형변환 {
	public static void main(String[] args) {
		ApplePhone phone = new ApplePhone1();
		Phone phone2 = new ApplePhone1();
		
		phone.kakao();
	}
}
