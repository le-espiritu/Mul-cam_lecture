package oop.basic;

public class PersonTest {
	public static void main(String[] args) {
		//PersonŬ������ ��ü����
		Person p1 = new Person();
		//������ ��ü�� ��������� �� �����ϱ�
		//private����� �ܺο��� ������ �Ұ���
		p1.name = "�嵿��";
		p1.age = 45;
		p1.addr = "�����";
		//������ ��ü�� ���õ� ���� ��������
		System.out.println("�̸�:"+p1.name+",����:"+p1.age+",�ּ�:"+p1.addr);
		System.out.println("Person��ü�� �Ҵ�� heap�� �ּ�"+p1);
		
		Person p2 = new Person();
		p2.name = "�輭��";
		p2.age = 25;
		p2.addr = "��õ��";
		System.out.println("�̸�:"+p2.name+",����:"+p2.age+",�ּ�:"+p2.addr);
		System.out.println("Person��ü�� �Ҵ�� heap�� �ּ�"+p2);
	}
}
