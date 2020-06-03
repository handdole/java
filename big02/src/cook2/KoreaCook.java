package cook2;

public class KoreaCook implements ICook{
	
	public KoreaCook() {
		System.out.println("한식주방 가동");
	}
	
	@Override
	public void makeRice() {
		System.out.println("한식 주방에서 밥을 만들다");
	}

	@Override
	public void makeSoup() {
		System.out.println("한식 주방에서 국을 만들다");
	}

	@Override
	public void makeSalad() {
		System.out.println("한식 주방에서 샐라드을 만들다");
	}

	@Override
	public void makeSource() {
		System.out.println("한식 주방에서 소스를 만들다");
	}

}
