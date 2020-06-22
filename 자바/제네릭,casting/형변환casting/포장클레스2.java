package 형변환casting;

public class 포장클레스2 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer b = 100;
		
		int i2 = i;   // 기본형 <- 포장 클레스
						//auto un-boxing (오토 언박싱)
		
		i = i2; // 포장클레스 <- 기본형
					//auto boxing (오토 박싱)
		int c = b;
		b = c;
		
		
		
	}
}
