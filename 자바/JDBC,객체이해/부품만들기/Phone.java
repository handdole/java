package ��ǰ�����;

public class Phone {
//	phone
//	------------
//	��� ����   => ��ȣ , ���� , ����
//	��� �޼ҵ�   => ��ȭ�ϴ� , �����ϴ� , ������ ����
//	(3���̻� ����)
//
//
//
//	MyRoom
//	------------
//	Fphone
//	Mphone
//	�޸� ������ �׷����ÿ�.
		String number ;
		String model;
		String color;
		
		public void call() {
			System.out.println("�޴��� ��ȣ >> "+number+" ���� >> "+model+" ���� >> "+color+" �� ���Դϴ�.");
			System.out.println("��ȭ�� �̴ϴ�.");
		}
		public void text() {
			System.out.println("�޴��� ��ȣ >> "+number+" ���� >> "+model+" ���� >> "+color+" �� ���Դϴ�.");
			System.out.println("���ڸ� �����ϴ�.");
		}
		public void watch() {
			System.out.println("�޴��� ��ȣ >> "+number+" ���� >> "+model+" ���� >> "+color+" �� ���Դϴ�.");
			System.out.println("������ ���ϴ�.");
		}

}
