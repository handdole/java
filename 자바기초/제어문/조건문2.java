package ���;

import java.sql.Date;

import javax.swing.JOptionPane;

public class ���ǹ�2 {

	public static void main(String[] args) {
		/*
		 * id = 1111
		 * pw = 2222
		 * 
		 * id�� pw�� �����ϸ� �α��� ok 
		 * �Է¹޾Ƽ� 
		 */
		
		// 1��
		int id = 1111;
		int pw = 2222;
		if (id == 1111 && pw == 2222) {
			System.out.println("�α��� ok");
		}
		else {
			System.out.println("�α��� not");
		}
		
		//2��
		String id1 = JOptionPane.showInputDialog("���̵� �Է��ϼ���");
		int id2 = Integer.parseInt(id1);
		String pw1 = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");
		int pw2 = Integer.parseInt(pw1);
		
		if (id2 == 1111 && pw2 == 2222) {
			System.out.println("�α��� ok");
		}
		else {
			System.out.println("�α��� not");
		}
		//3��
		String day = JOptionPane.showInputDialog("������ �������ּ��� 1. ���� /  2.�ָ�");
		int day1 = Integer.parseInt(day);
		if (day1 == 1) {
			System.out.println("������ �����սô�.");
		}
		else {
			System.out.println("������ ��ƺ��ô�.");
		}
		//4��
		String W = JOptionPane.showInputDialog("������ ������ 1)�� 2)�帲 3)�� 4)ȭâ");
		int w = Integer.parseInt(W);
		if (w==1 || w==3) {
			System.out.println("����ö�� ���� ����.");
		}
		else {
			System.out.println("������ Ÿ����.");
		}
		
		//5��
		String Day = JOptionPane.showInputDialog("������ ���������ΰ���? 1)�� 2)ȭ 3)�� 4)�� 5)�� 6)�� 7)��");
		int our = Integer.parseInt(Day);
		if (our == 1){
			System.out.println("������");
		}
		else if (our == 2){
			System.out.println("ȭȭȭ");
		}
		else if (our == 3) {
			System.out.println("������");
		}
		else if (our == 4 ) {
			System.out.println("����");
			
		}
		else if(our == 5) {
			System.out.println("�ݱݱ�");
		}
		else if (our == 6) {
			System.out.println("������");
		}
		else if (our == 7){
			System.out.println("������");
		}
		else {
			System.out.println("�̻��ϰ� �Կ�");
		}
		
		//6��
		String hour = JOptionPane.showInputDialog("������ ����Դϱ�?");
		int Hour = Integer.parseInt(hour);
		if (Hour < 11) {
			System.out.println("�¸��");
		}
		else if (Hour < 16) {
			System.out.println("���̺��");
		}
		else if (Hour < 20) {
			System.out.println("���̺��");
		}
		else if (Hour <= 24) {
			System.out.println("�³���");
		}
		else {
			System.out.println("�߸��Է��ߴµ�;");
		}
		
		//7��
		String ga = JOptionPane.showInputDialog("���θ� �����ּ���");
		int g = Integer.parseInt(ga);
		String se = JOptionPane.showInputDialog("���θ� �����ּ���.");
		int s = Integer.parseInt(se);
		
		if (g*s >50) {
			System.out.println("�ʹ� �б���");
		}
		else if (g*s <= 50){
			System.out.println("�ʹ� ������");
		}
		else {
			System.out.println("�߸��Է�");
		}
	}

}
