package cook2;

public class CookManager {
	ICook icook; //field
	
	public CookManager(ICook icook) {
		this.icook = icook;
	}
	
	public void orderRice() {
		icook.makeRice();
	}
	
	public void orderSoup() {
		icook.makeSoup();
	}
	
}
