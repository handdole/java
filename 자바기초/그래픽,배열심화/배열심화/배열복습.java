package �迭��ȭ;

import javax.swing.JOptionPane;

public class �迭���� {

	public static void main(String[] args) {
		//1. ���� �迭�� �� ������ ó������ �˰��ִ� ���
		String[]names = {"ȫ�浿","���浿","�۱浿"};
		//2. ���� �迭�� �� ������ ���߿� �־��ִ� ���
		String[] subject = new String[3];
//		subject , length , sub[0] , sub[1], sub[2]
		//�迭�� ������ �Է¹޾Ƽ� ���� �ִ� �ڵ� 
		for (int i = 0; i < subject.length; i++) {
			subject[i] = JOptionPane.showInputDialog("�����Է�");
		}
		//�迭 ������ ����Ʈ�ϴ� �ڵ� 
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
		}
		for (String s : subject) {
			System.out.println(s);
		}
		
		
	}

}
