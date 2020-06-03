package 인터페이스사용;

import 인터페이스구현.Computer;
import 인터페이스구현.SamsungComputer;

public class UseComputer2 {
	
	public static void main(String[] args) {
		Computer sam = new SamsungComputer();
		sam.on();
		sam.off();
	}
}
