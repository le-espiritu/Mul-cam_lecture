package api.lang;

import java.util.Date;

public class ObjectTest01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass());
		System.out.println(obj1.hashCode());
		//��ü�� �⺻�޼ҵ�� toString()
		//public String toString()
		//�⺻�޼ҵ�� ������ �����ϴ�. - ���������� �����ص� ��������.toString()�� �ǹ�
		System.out.println(obj1.toString()) ;
		System.out.println(obj1);
		
		Person p = new Person("�嵿��",50,"����");
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println("����:"+p.getName()+",����:"+p.getAge()+",�ּ�:"+p.getAddr());
		
		
		String str = new String("java");
		System.out.println(str);
		System.out.println(str.toString());
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		
		
		
	}
}
