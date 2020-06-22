package 생성자;

public class Company {
	String name;
	String gender;
	int age;
	
	static int sum;
	static int count;
	
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	public Company() {
	}
	
	public Company(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum = sum + age;
	}
	
	public void work() {
		System.out.println("일중");
	}
	
	
	public void friendship() {
		System.out.println("친화력있음..");
	}
	
	
}
