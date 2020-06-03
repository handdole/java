package myRoom;

public class MyRoom {
	static WoodBlueRadio radio;
	public static void main(String[] args) {
		radio = new WoodBlueRadio();
		radio.soundUp();
		radio.soundDown();
		radio.maxSound();
	}
}
