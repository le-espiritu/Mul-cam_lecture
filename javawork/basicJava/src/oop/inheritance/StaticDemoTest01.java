package oop.inheritance;

public class StaticDemoTest01 {
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		//num�� �ν��Ͻ������̹Ƿ� �ν��Ͻ��� �����ϴ� ���������� obj1���� �׼����ϸ� �ȴ�.
		//staticNum�� ��ü�� �����ɶ����� ��ü ���ο� ���Ӱ� ��������� ������ �ƴ϶� Ŭ������ ó�� �޸𸮿� �ε��ɶ�
		// �� ���� �ε��Ǿ� �Ҵ�Ǵ� �����̹Ƿ� ��ü ��, �ν��Ͻ��� ������ �� �� ����.
		//����, static������� �������������� �׼������� �ʰ� Ŭ���������� �׼����Ѵ�.
		//                                          -----------------------
		//                                             ������ Ŭ������.XXX
		//static����� staticNum�� Ŭ���������� ��� ��ü�� �����ؼ� ����ϴ� ����
		//static������� - ���
		System.out.println(obj1.num+","+StaticDemo.staticNum);
		
		StaticDemo obj2 = new StaticDemo();
		obj2.display();
		System.out.println(obj2.num+","+StaticDemo.staticNum);
		
		StaticDemo obj3 = new StaticDemo();
		obj3.display();
		System.out.println(obj3.num+","+StaticDemo.staticNum);
		
	}
}
