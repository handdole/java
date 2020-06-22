package bank;

public class BankUse {
	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NomalBank b2 = new NomalBank();
		GoodBank b3 = new GoodBank();
		
		System.out.println("BadBank rates : " + b1.getInterestRate());
		System.out.println("NomalBank rates : " + b2.getInterestRate());
		System.out.println("GoodBank rates : " + b3.getInterestRate());
	}
}
