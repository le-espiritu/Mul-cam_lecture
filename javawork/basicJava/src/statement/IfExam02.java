package statement;

import java.util.Scanner;

public class IfExam02 {
	public static void main(String[] args) {
		//1. ������ �� �� �߻���Ű��
		//   1) �����ڵ� - 1~4����
		//   2) ���� - 1 ~ 100
		//2. ������ ���̸� ������ �Ǵ��ؼ� ����� ����ϱ�(��øif�� �̿�)
		//   1) ���γ��� : �����ڵ� 1,3 ���� 20���̻�
		//   2) ���ο��� : �����ڵ� 2,4 ���� 20���̻�
		//   3) û�ҳ⿩�� :
		//   4) û�ҳⳲ�� :
		//[�������]
		//���γ���(22,1)
//		Random rand = new Random();
//		int gender = rand.nextInt(4)+1;
//		int age = rand.nextInt(100)+1;
		//Scanner�� ��ȯ�ϱ�
		Scanner key = new Scanner(System.in);
		System.out.print("����:");
		int gender = key.nextInt();
		System.out.print("����:");
		int age = key.nextInt();
		
		if(gender==1 | gender==3) {//����
			if(age>=20) {
				System.out.println("���γ���("+age+","+ gender+")");
			}else {
				System.out.println("û�ҳⳲ��("+age+","+ gender+")");
			}
		}else {
			if(age>20) {
				System.out.println("���ο���("+age+","+ gender+")");
			}else {
				System.out.println("û�ҳ⿩��("+age+","+ gender+")");
			}
		}
	}
}









