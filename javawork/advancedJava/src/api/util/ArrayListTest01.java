package api.util;

import java.util.ArrayList;
//ArrayList�� �����
public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<Integer>(); 
		v.add(10);
		System.out.println("���� ArrayList�� ����� ����� ����=>"+v.size());
		for (int i = 0; i <=10; i++) {
			v.add(i);
		}
		System.out.println("���� ArrayList�� ����� ����� ����=>"+v.size());
		System.out.println("ArrayList�� ����� 0�� ���=>"+v.get(0));
		for (int i = 0; i < v.size(); i++) {
			int data = v.get(i);//�����ڽ� - �ڵ����� �����Ϸ��� Integer��ü�� 
			                    //int�� ��ȯ�ؼ� ������ ����
			System.out.println(i+"��° ���=>"+data);
		}
	}
}
