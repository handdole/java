package 재사용_상속;

public class Person { //사람
	//성질 , 동작
	String name;
	int age;
	
	public void talk() {
		System.out.println("말을 하다.");
		
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public void think() {
		System.out.println("생각하다.");
		
	}

}
