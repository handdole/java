package �������̽�����;

import �������̽�����.MegaPhone;


//�߻� Ŭ���� ( Ŭ������ �Ѵ� �߻�޼ҵ尡 ���� Ŭ���� )
// ���� �߻� �޼ҵ�� interface�����ۿ� �ȵǴµ� 
// �߻�Ŭ���������� �߻�޼ҵ� ��� ����
public abstract class ApplePhone implements MegaPhone {
	
	
	public abstract void camera();
	
	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("���ͳ� on!");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ on!");
	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		System.out.println("���� on!");
	}

	@Override
	public void kakao() {
		// TODO Auto-generated method stub
		System.out.println("ī�� on!");
	}

	@Override
	public void map() {
		// TODO Auto-generated method stub
		System.out.println("���� on!");
	}

	@Override
	public void trace() {
		// TODO Auto-generated method stub
		System.out.println("���� on!");
	}

	@Override
	public void siri() {
		// TODO Auto-generated method stub
		System.out.println("�ø� on!");
	}

	
}
