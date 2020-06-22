package 제너릭프로그램;

public class CarTest {
	public static void main(String[] args) {
		Car<Integer> car = new Car<Integer>(100);
		System.out.println(car.getsize());
		
		Car<String> car2 = new Car<String>("큰거");
		System.out.println(car2.getsize());
	}
}
