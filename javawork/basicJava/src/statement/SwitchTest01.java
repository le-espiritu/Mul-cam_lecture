package statement;

import java.util.Scanner;
//switch���� �׽�Ʈ - MultiIfTest.java�� switch�� ��ȯ�ϱ�
public class SwitchTest01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
		int ssn = key.nextInt();
		switch(ssn) { //ssn�� ���� ���� ����� ����
			case 1: //ssn�� 1�� ��� ������ ������ ���� - ��Ȯ�ϰ� ��ġ�ϴ��� ��(==) �񱳿����ڸ� ���� ����� ����.
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			default:
				System.out.println("��Ÿ");
		}
	}
}
