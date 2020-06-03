package Cook;


public class Cooktest{
	static CockManager cookorder = new CockManager();
	static KoreaCock koreacook = new KoreaCock();
	static ChineseCock chcook = new ChineseCock();
	
	public Cooktest() {
	}
	
	
	public static void main(String[] args) {
		int choice = cookorder.CockManager();
		if (choice == 1) {
			koreacook.makeRice();
		} else {
			chcook.makeRice();
		}
	}
}
