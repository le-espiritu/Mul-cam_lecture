package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		//HashSet���� ����(set1) ����� - 10,20,30,50,60,100
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(50);
		set1.add(60);
		set1.add(100);
		print(set1,"����1:");
		//HashSet���� ����(set2) ����� - 30,60,90,120
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(30);
		set2.add(60);
		set2.add(90);
		set2.add(120);
		print(set2,"����2:");
		
		set2.retainAll(set1);
		print(set2,"����1�� ����2�� ������  :");
		//�� ������ ���� ����ϰ� �������� ����ϱ�
		//[�������]
		// ����1 : ____________
		// ����2 : ____________
		// ����1�� ����2�� ������  : ____________
		//DM���� �����ϱ�
	}
	public static void print(Set<Integer> set,String msg) {
		Iterator<Integer> it = set.iterator(); //1. Iterator�� ��ȯ
		System.out.print(msg);
		while(it.hasNext()) {//2. Iterator�� ����� ��Ұ� �ִ��� Ȯ��
			int element = it.next(); //3. Iterator�� ����� ��Ҹ� ������
			System.out.print(element +"\t");
		}
		System.out.println();
		System.out.println("============================================");
	}
}
