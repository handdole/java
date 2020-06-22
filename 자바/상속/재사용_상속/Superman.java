package 재사용_상속;

public class Superman extends Man{
	String cloth;
	
	@Override
	public String toString() {
		return "Superman [cloth=" + cloth + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	public void fly() {
		System.out.println("하늘을 날다.");
	}
}
