package ��������;

import javax.swing.JOptionPane;

public class �⺻����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� �����ϴ� ������?
		//�Է��� ���� ���� ������ String ���� �ν��Ѵ�.
		String food = JOptionPane.showInputDialog("����� �����ϴ� ������?");
		
		//����� �����ϴ� ������ ¥����̱���!
		System.out.println("����� �����ϴ� ������ "+food+"�̱���!");
		
		String age = JOptionPane.showInputDialog("���̸� �Է�?");
		
		//String�� -> intó��
		//100 (��ȯ ���� ) aaa (��ȯ �Ұ��� ���ʿ䰡 ����) => �׷��� �м��Ѵٶ�� ǥ���� �ϴ°�
		int age2 = Integer.parseInt(age); // "100" -> 100
		System.out.println("������ �� ���̴� "+(age2+1)+"��");
		
	}

}
