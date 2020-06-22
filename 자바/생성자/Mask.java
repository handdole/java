package 생성자;


public class Mask {
	//인스턴스 변수
	String color;
	int price;
	int count;
	static int total;
	static final String COMPANY = "LG생활";     // 상수 표현 키워드는 final 이다.
	public Mask() {
		// TODO Auto-generated constructor stub
	}
	
	public Mask(String color , int price , int count ) {
		this.color = color;
		this.price = price;
		this.count = count;
		total++; // 만들어진 마스크 개수를 세어보자 .
	}
	
	
//	public static int getcount() {
//		return count;   // 인스턴스 변수는 객체 생성 후, 주소로만 접근 가능.
//	}
	
	public static int gettotal() {
		return total;    //스테틱 메소드를 사용하는 경우에는 멤버 변수는 static 변수여야 한다.
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}

	


}
