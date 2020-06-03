package 인터페이스구현;

public class SamsungComputer implements Computer{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("컴터전원 ON!");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("컴터전원 OFF!");
	}

}
