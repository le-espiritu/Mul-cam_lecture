package statement;

import java.util.Scanner;

public class MultiIfTest {
	public static void main(String[] args) {
		//Scanner�� �ֹι�ȣ 7��° �ڸ� ���� �Է¹޾Ƽ� ó��
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
		int ssn = key.nextInt();
		System.out.println(ssn);
		if(ssn==1 | ssn==3) {
			System.out.println("����");
		}else if(ssn==2 | ssn==4) {
			System.out.println("����");
		}else {
			System.out.println("��Ÿ");
		}
	}
}
