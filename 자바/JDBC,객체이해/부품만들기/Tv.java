package ��ǰ�����;

public class Tv {
	int channel ;
	boolean onOff ;
	int volume;
	
	
	public void trunOn() {
		String onOff = "ON";
		System.out.println("Ƽ�� "+ onOff);
		System.out.println("���� volume "+volume+" �Դϴ�.");
		System.out.println("���� ä����"+channel+" �Դϴ�.");
	}
	
	public void turnOff() {
		String onOff = "Off";
		System.out.println("Ƽ�� "+ onOff);
	}

	@Override  // sourece => generate to string => generate
	public String toString() {
		return "����� ����Ʈ [ä��=" + channel + ", Ƽ������=" + onOff + ", ����=" + volume + "]";
	}
	
	
	
	
	
	
}
