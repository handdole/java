package ������;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class ��ǰ���Ẹ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��¥, �ð� ���ϴ� ��.
		Date d1 = new Date();
		int hour = d1.getHours();
		System.out.println("hour"+"��");
		int min = d1.getMinutes();
		System.out.println("min"+"��");
		int sec = d1.getSeconds();
		System.out.println("sec"+"��");
		
		int year = d1.getYear();
		System.out.println("���ش�"+ (year+1900));   // ��ǻ�Ͱ� 1900���� ����
		int month = d1.getMonth();
		System.out.println("�̹� ����"+month);
		int day = d1.getDay();
		System.out.println("������"+day+"����");   // 0 : �Ͽ���  ~  6:�����
		
		//����
		
		Random r = new Random(1);
		int num = r.nextInt(46);
		System.out.println(num);
		
		
		
		//�ֿܼ��� �Է��ؼ� �ڵ��� Ÿ���� �ٲپ��ִ� ���
		Scanner sc = new Scanner(System.in);   // ()���� �о����ʹ�. ������ Ű���� = system.in 
		System.out.print("�̸��� �Է� >>");
		String name = sc.next();  // �ֿܼ��� ĥ���ְ� ������.
		System.out.println("����� �̸��� " + name);
		
		System.out.print("���̸� �Է� >> ");
		int age = sc.nextInt();  //String ---> int ��ȯ
		System.out.println("���� ���̴� "+(age+1));
	}

}
