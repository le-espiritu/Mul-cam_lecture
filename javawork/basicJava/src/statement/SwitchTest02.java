package statement;

import java.util.Scanner;
//switch���� �׽�Ʈ - switch���� Ư���� Ȱ���ؼ� �ڵ带 �����ϰ�
public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
		int ssn = key.nextInt();
		switch(ssn) { //ssn�� ���� ���� ����� ����
			case 1: 
			case 3:
				System.out.println("����");
				break;
			case 2:
			case 4:
				System.out.println("����");
				break;
			default:
				System.out.println("��Ÿ");
		}
	}
}
