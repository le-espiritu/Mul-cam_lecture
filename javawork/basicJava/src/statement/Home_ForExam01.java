package statement;

import java.util.Scanner;

public class Home_ForExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1 ���� ũ�� 10 ���� ���� ������ �Է��ϼ��� . : ");
		int dan = key.nextInt();
		if(dan<2 | dan>9) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}else {
			for(int i=1;i<=9;i=i+1) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
	}
}
