
package ���;

import java.util.Date;

public class iftest02 {

	public static void main(String[] args) {
		char c = 'A';
		
		switch (c) {
			case 'A' :
				System.out.println("�ֿ��!");break;
			case'B' :
				System.out.println("���!"); break;
			default :
				System.out.println("������������!");break;
		}
	}
}




/*
 Date date = new Date();
		int month = date.getMonth() +1 ;
		
		 // ���� �� �� �ִ� Ÿ���� �����̴�. ������ long Ÿ���� �ȵ�.
		// �Ǽ��� �ȵ�!
		// char ����
		// String ��.
		switch (month) {
			case 1: case 3: case 5: case 7 : case 8: case 10: case 12:
				System.out.println("31�ϱ���");
				break;
			case 2: 
				System.out.println("28�ϱ���");
				break;
			default:
				System.out.println("30�ϱ���");				
 */

/*
 Date date = new Date();
		int month = date.getMonth() +1 ;
		
		switch (month) {
			case 3: case 4: case 5:
				System.out.println("��");
				break;
			case 6: case 7: case 8:
				System.out.println("����");
				break;
			case 9: case  10: case 11:
				System.out.println("����");
				break;
			default:
				System.out.println("�ܿ�");				
 */

/*
String food = "���";

switch (food) {

case "¥��":
	System.out.println("�߱�������");
	break;
case "�쵿":
	System.out.println("�Ͻ�������");
	break;
case "���":
	System.out.println("�н�������");
	break;
default:
	System.out.println("������!");
	
}   // food �� ��Ī�Ͽ� ������� ã�� �ű⼭ ���� �Ʒ����� �� ����ȴ�.
*/