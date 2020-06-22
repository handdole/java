package 재사용_상속;

public class Man extends Person{
	//성질(2), 동작(2)
	int power;
	
	public void wild() {
		System.out.println("거칠다.");
	}

	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
