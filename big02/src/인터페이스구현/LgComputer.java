package 인터페이스구현;

public class LgComputer implements Computer {
	
	@Override
	public void on() {
		System.out.println("LG컴퓨터 온!!");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("LG컴퓨터 오프!!!");
	}

}
