package myRoom;

public abstract class BlueRadio implements Radio {
	
	public abstract void maxSound();
	
	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("소리 업!");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("소리 업!");
	}

}
