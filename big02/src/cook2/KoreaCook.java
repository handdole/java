package cook2;

public class KoreaCook implements ICook{
	
	public KoreaCook() {
		System.out.println("�ѽ��ֹ� ����");
	}
	
	@Override
	public void makeRice() {
		System.out.println("�ѽ� �ֹ濡�� ���� �����");
	}

	@Override
	public void makeSoup() {
		System.out.println("�ѽ� �ֹ濡�� ���� �����");
	}

	@Override
	public void makeSalad() {
		System.out.println("�ѽ� �ֹ濡�� ������� �����");
	}

	@Override
	public void makeSource() {
		System.out.println("�ѽ� �ֹ濡�� �ҽ��� �����");
	}

}
