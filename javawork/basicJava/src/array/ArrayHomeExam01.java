package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayHomeExam01 {
	public static void main(String[] args) {
		/*
		 * int�� �迭�� �����ϰ� �Ʒ��� ���� ������ ������ �� �ֵ��� �۾�
		 * [����]
		 * 1. int�� ������ 5���� ������ �� �ֵ��� ����
		 * 2. Random��(1���� 50������ ��)�� �迭������ �� ��ҿ� �����ϱ�(Scanner�� �Է� �޾Ƽ� �����ص� ����)
		 * 3. �迭 ��ҿ� ����� ���� ¦������ Ȧ������ �Ǻ��Ͽ� ����ϱ�
		 * 
		 * [�������] - Random
		 * �������� 25 ���� -> Ȧ��
		 * �������� 42 ���� -> ¦��
		 * �������� 33 ���� -> Ȧ��
		 * �������� 17 ���� -> Ȧ��
		 * �������� 8 ���� -> ¦��
		 * 
	
		 */
		int[] myarr = new int[5];
		Random rand = new Random();
		//�迭�� �����͸� �����ϱ� ����  for��
		for(int i=0;i<myarr.length;i++) {
			myarr[i] = rand.nextInt(50)+1;
		}
		
		
		//�迭�� ����� �����͸� ������ ����ϱ� ���� for��
		for(int i=0;i<myarr.length;i++) {
			if(myarr[i]%2==0) {
				System.out.println("�������� :"+myarr[i]+"���� -> ¦��");
			}else {
				System.out.println("�������� :"+myarr[i]+"���� -> Ȧ�� ");
			}
		}
	}
}



























