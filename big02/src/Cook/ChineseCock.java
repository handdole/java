package Cook;

public class ChineseCock implements ICook{
	
	public ChineseCock() {
		System.out.println("�߽��ֹ� ����");
	}
	
	@Override
	public void makeRice() {
		System.out.println("�߽� �ֹ濡�� ���� �����");
	}

	@Override
	public void makeSoup() {
		System.out.println("�߽� �ֹ濡�� ���� �����");
	}

	@Override
	public void makeSalad() {
		System.out.println("�߽� �ֹ濡�� ������� �����");
	}

	@Override
	public void makeSource() {
		System.out.println("�߽� �ֹ濡�� �ҽ��� �����");
	}

}
