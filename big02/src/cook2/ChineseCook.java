package cook2;

public class ChineseCook implements ICook{
	
	public ChineseCook() {
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
