package Cook;

public class ChineseCock implements ICook{
	
	public ChineseCock() {
		System.out.println("중식주방 가동");
	}
	
	@Override
	public void makeRice() {
		System.out.println("중식 주방에서 밥을 만들다");
	}

	@Override
	public void makeSoup() {
		System.out.println("중식 주방에서 국을 만들다");
	}

	@Override
	public void makeSalad() {
		System.out.println("중식 주방에서 샐라드을 만들다");
	}

	@Override
	public void makeSource() {
		System.out.println("중식 주방에서 소스를 만들다");
	}

}
