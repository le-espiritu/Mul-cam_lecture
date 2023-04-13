package api.util;

import java.util.Vector;

//List������ ���� Ŭ������ Vector�� �����
public class VectorTest01 {
	public static void main(String[] args) {
		//1.Vector�� ���� - 5.0���� �������� <> �ȿ� Vector�� ����Ǵ� �������� Ÿ���� ����ؾ� �Ѵ�.
		//                             ---------------------
		//                              Generic�̶� �Ѵ�. 
		//=> Vector�ȿ� ����Ǵ� �������� Ÿ���� ����(�⺻���� ��쿡�� WrapperŸ���� ���)
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(10);
		System.out.println("���� ������ �뷮=>"+v.capacity());
		System.out.println("���� ���Ϳ� ����� ����� ����=>"+v.size());
		
		for (int i = 0; i <=10; i++) {
			v.add(i);
		}
		System.out.println("���� ������ �뷮=>"+v.capacity());
		System.out.println("���� ���Ϳ� ����� ����� ����=>"+v.size());

		System.out.println("���Ϳ� ����� 0�� ���=>"+v.get(0));
		
		//Vector�� ����� ��� ��Ҹ� ������ - ���������� ��, �迭�� ������ ������ ���� �ִ� �ڷᱸ��(for������ Ž���� ����)
		for (int i = 0; i < v.size(); i++) {
			int data = v.get(i);//�����ڽ� - �ڵ����� �����Ϸ��� Integer��ü�� int�� ��ȯ�ؼ� ������ ����
			System.out.println(i+"��° ���=>"+data);
		}
	}
}
