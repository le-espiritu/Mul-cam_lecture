package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayHomeExam01_2 {
	public static void main(String[] args) {
		/*
		 * int�� �迭�� �����ϰ� �Ʒ��� ���� ������ ������ �� �ֵ��� �۾�
		 * [����]
		 * 1. int�� ������ 5���� ������ �� �ֵ��� ����
		 * 2. Random��(1���� 50������ ��)�� �迭������ �� ��ҿ� �����ϱ�(Scanner�� �Է� �޾Ƽ� �����ص� ����)
		 * 3. �迭 ��ҿ� ����� ���� ¦������ Ȧ������ �Ǻ��Ͽ� ����ϱ�
		 * 
		 * [�������] - Scanner
		 * �迭��ҿ� ����� �� :____
		 * �迭��ҿ� ����� �� :____
		 * �迭��ҿ� ����� �� :____
		 * �迭��ҿ� ����� �� :____
		 * �迭��ҿ� ����� �� :____
		 * �Է°����� 25 ���� -> Ȧ��
		 * �Է°����� 42 ���� -> ¦��
		 * �Է°����� 33 ���� -> Ȧ��
		 * �Է°����� 17 ���� -> Ȧ��
		 * �Է°����� 8 ���� -> ¦��
		 */
		int[] myarr = new int[5];
		Scanner key = new Scanner(System.in);
		//�迭�� �����͸� �����ϱ� ����  for��
		for(int i=0;i<myarr.length;i++) {
			System.out.print("�迭��ҿ� ����� ��:");
			myarr[i] = key.nextInt();
		}
		
		
		//�迭�� ����� �����͸� ������ ����ϱ� ���� for��
		for(int i=0;i<myarr.length;i++) {
			if(myarr[i]%2==0) {
				System.out.println("�Է°����� :"+myarr[i]+"���� -> ¦��");
			}else {
				System.out.println("�Է°����� :"+myarr[i]+"���� -> Ȧ�� ");
			}
		}
	}
}



























