package 인터페이스사용;

import 인터페이스구현.Computer;
import 인터페이스구현.SamsungComputer;

public class UseComputer3 implements Computer {
	
	public UseComputer3() {
		on();
		off();
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("comON");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("comOFF");
		
	}
	
	public static void main(String[] args) {
		new UseComputer3();
	}
	
}
