package oop.basic;

import java.util.Scanner;

public class PersonTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("**********�λ�����ý���**********");
		System.out.println("1. ������");
		System.out.println("2. �����ȸ");
		System.out.println("3. �������");
		System.out.println("4. �������");
		System.out.println("5. ��������ȸ");
		System.out.println("���ϴ� �۾��� �����ϼ���:");
		int choiceJob = key.nextInt();
		switch(choiceJob) {
			case 1:
				System.out.println("========������=========");
				System.out.print("����:");
				String name = key.next();
				System.out.print("����:");
				int age = key.nextInt();
				System.out.print("�ּ�:");
				String addr = key.next();
				
				Person p = new Person();
				//�ڹٿ����� ������ ������ ���� �ִ� �����ʹ� ������ ������ ó��
				p.name = name;   //p.name���� ����� ������ Person�� ���� �ִ� ��������̰� = �����ʿ� ������ name ������ Scanner
				                 //�� ���ؼ� �ܺο��� �Է¹��� ���� ������ ��������
				                 // �������� name�� ����Ǿ� �ִ� ���� heap�� �Ҵ�� Person �� ��������� name�� �����ϰڴٴ� �ǹ�
				p.age = age;
				p.addr = addr;
				System.out.println("����:"+p.name);
				System.out.println("����:"+p.age);
				System.out.println("�ּ�:"+p.addr);
				break;
			case 2:
				System.out.println("========�����ȸ=========");
				break;
			case 3:
				System.out.println("========�������=========");
				break;	
		}
	}
}







