package array;

import java.util.Random;

//�������迭�� ��� - �������迭������ �ּҰ� ����ȴ�.
public class ArrayTest03 {
	public static void main(String[] args) {
		//int�� �迭 - int���� �����ϱ� ���� ���� �� ���� �迭�� ����
		int[] intArr = new int[2];
		intArr[0] = 100;
		intArr[1] = 200;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		//String�� �迭 - String������ ���� heap�� �Ҵ�� ��ü�� �ּҸ� �����ϴ� ����
		//              ���� String �迭�� String��ü�� �����ϴ� ���� 3���� �迭�� ����
		//              �������迭�� ���������� ���� ���� �迭�� ����
		String[] strArr = new String[3];
		strArr[0] = new String("java");
		strArr[1] = new String("jsp");
		strArr[2] = new String("spring");
		
		//Random�� �迭
		Random[] randArr = new Random[3];
		//Random��ü�� randArr�� �� ��ҿ� �Ҵ��ϱ�
		//1�� index�� ��Ҹ� ����ϱ�
		randArr[0] = new Random();
		randArr[1] = new Random();
		randArr[2] = new Random();
		System.out.println(randArr[0]);
		System.out.println(randArr[1]);
		System.out.println(randArr[2]);
	}
}
