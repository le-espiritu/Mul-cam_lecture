package test;

import oop.basic.Person;

//jvm�� ���� �۾� ���� ��Ű��(test), java.lang��Ű���� �⺻���� �ν��Ѵ�.
//���� �� ���� ��Ű���� �ۼ��� Ŭ������ ����ϱ� ���ؼ� import
public class PublicTest {
	public static void main(String[] args) {
		Person p = new Person();
		//p.name �� public���� ���ǵǾ��� ������ �ٸ� ��Ű���� Ŭ�������� ������ ����
		System.out.println(p.name+","+p.addr);//addr������ default���������ڷ� ���ǵǾ��� ������ Person Ŭ������ ���ǵ�
		                                      //oop.basic��Ű���� Ŭ���������� ������ ����
	}
}
