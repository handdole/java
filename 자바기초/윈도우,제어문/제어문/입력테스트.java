package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ {

	public static void main(String[] args) {
		// �Է¿� ��ǰ(class)�� �����ؿɽô�.
		
		Scanner sc = new Scanner(System.in);   //sc�� ��Ʈ���̴�. => ����
		//������ ������ ? ȭâ �Է�!
		System.out.print("������ ������ >> ");
		String weather = sc.next();
		System.out.println(weather);
		
		// � �ΰ���? 1
		System.out.println("�� �� �ΰ���?");
		int temp = sc.nextInt();
		
		if (temp >= 0) {
			System.out.println("���̿Գ���");
		} 
		else {
			System.out.println("���̰� �ߺ��~");
		}
		
	
		sc.close(); // ���븦 �ž����� ������.
		
		
		
	}

}
