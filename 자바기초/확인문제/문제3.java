package Ȯ�ι���;

import java.util.Date;
import java.util.Scanner; // ��ĳ�� ��� import

import javax.swing.JOptionPane;

public class ����3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //��ĳ�� ����� �̸��� sc�� ����
		
		//1��
		System.out.println("-----------���� ���� �ܰ��-----------");
		System.out.print("���� ����� ������ �ִ� ����? >> ");
		int a = sc.nextInt();   
		// ���� a �� �������ְ� �ֿܼ��� �Է°��� a�� ���� / next ���ϸ� �ȵ� Int������. 
		System.out.print("���� ����� ������ �� ����? >> "); 
		int b = sc.nextInt();
		System.out.println("=================================");
		System.out.println("���� ���� ������ �� ����"+(a+b)+"�Դϴ�.");
		
		//2��
		System.out.println("       <<��������>>       ");
		System.out.println("------------------------");
		System.out.print("-������ :");
		String go = sc.next();
		System.out.print("-��� : ");
		int mo = sc.nextInt();
		System.out.print("-������: ");
		double sa = sc.nextDouble();  // �������� �Ǽ������� double�� ���� Ÿ�� ����
		System.out.println("�������: "+(mo*(1-sa)));   //1-�������� ���� ������ �ۼ�������
		System.out.println("------------------------");
		System.out.println("12�� �߼��� ���� �� ����");
		
		//3��
		System.out.print("������ ��� �� �ݾ� : ");
		Double aa = sc.nextDouble();   
		// �ݾ׿��� �ο����� �������ϰ� �Ҽ��� ���� �ڸ����� ��ġ���� �Ѵٰ��ϸ� aaȤ�� bb�� �Ǽ��� ����
		System.out.print("�Բ� ���� ��� �ο��� : ");
		int bb = sc.nextInt();
		System.out.println("---------------------");
		System.out.println("���� ������ �� >> "+(aa/bb)+"���Դϴ�."); //�Ҽ������� ����

		//4��
		Date date1 = new Date(); 
		int time = date1.getHours(); //Ÿ���� ���� �ð�
		System.out.print("Ŀ�ǰ���? >> ");
		int aaa = sc.nextInt();
		System.out.print("�ο�����? >> ");
		int bbb = sc.nextInt();
		System.out.println(time);
		if (time < 22) {   // ����ð��� 10�ø� �ѱ��� �ʾ��� ��� ����
			System.out.println("Ŀ�� ������  "+(aaa*bbb)+"�� �Դϴ�.");
		}
		else if (time >= 22) { // ����ð��� 10�ø� �Ѿ��� ��� 5000�� ����
			System.out.println("Ŀ�� ������"+(aaa*bbb-5000)+"�� �Դϴ�.");
		}
		else {
			System.out.println("�߸��Է�");
		}
	}

}
