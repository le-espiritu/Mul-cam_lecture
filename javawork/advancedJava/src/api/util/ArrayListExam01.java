package api.util;

import java.util.ArrayList;

public class ArrayListExam01 {
	public static void main(String[] args) {
		//78,99,100,95,100���� ArrayList�� �����ϰ� ������ ����� 
		//���ؼ� ����ϼ��� - DM���� �����ϱ�
		//[�������]
		//ArrayList�� ����� ����� ��:_____
		//ArrayList�� ����� ����� ���:______
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(78);
		list.add(99);
		list.add(100);
		list.add(95);
		list.add(100);
		int sum =0;//�� ����� ����
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);//  sum = sum+list[i]
		}
		System.out.println("ArrayList�� ����� ����� ��:"+sum);
		System.out.println("ArrayList�� ����� ����� ���:"+((double)sum/list.size()));
	}
}
