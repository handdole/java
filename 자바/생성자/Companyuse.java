package 생성자;

public class Companyuse {

	public static void main(String[] args) {
		
		Company w = new Company("임아무개","남",24);
		Company w1 = new Company("임아무개","남",24);
		Company w2 = new Company("임아무개","남",24);
		
		System.out.println("전체 직원수는>>  " + Company.count);
		System.out.println("첫번째 직원의 이름은 ? >> " + w.name);
		System.out.println("직원들 평균 나이는 ? >> " + Company.sum/Company.count);
		
	}

}
