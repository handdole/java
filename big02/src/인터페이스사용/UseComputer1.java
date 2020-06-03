package 인터페이스사용;

import 인터페이스구현.LgComputer;

public class UseComputer1 {
	
	public static void main(String[] args) {
		LgComputer lg1 = new LgComputer();
		lg1.on();
		lg1.off();
	}
	
}
