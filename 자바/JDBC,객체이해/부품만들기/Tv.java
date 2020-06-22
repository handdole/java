package 부품만들기;

public class Tv {
	int channel ;
	boolean onOff ;
	int volume;
	
	
	public void trunOn() {
		String onOff = "ON";
		System.out.println("티비 "+ onOff);
		System.out.println("현재 volume "+volume+" 입니다.");
		System.out.println("현재 채널은"+channel+" 입니다.");
	}
	
	public void turnOff() {
		String onOff = "Off";
		System.out.println("티비 "+ onOff);
	}

	@Override  // sourece => generate to string => generate
	public String toString() {
		return "결과값 프린트 [채널=" + channel + ", 티비전원=" + onOff + ", 음량=" + volume + "]";
	}
	
	
	
	
	
	
}
