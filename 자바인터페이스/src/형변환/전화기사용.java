package 형변환;

public class 전화기사용 {
	public static void main(String[] args) {
		byte a = 100; // -128 ~ 127
		int b = a; //-21억 ~ 21억
		//자동 형변환 ( 큰 <- 작 )
		
		byte c = (byte) b; //강제 형변환 ( 작 <- 큰 )
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = 1000;
		byte e = (byte) d; // 이런 형변환은 하면 안됨. 말이 안됨.
	}
}
