package oop.inheritance;
//Ŭ�����޼ҵ�� �ν��Ͻ��޼ҵ��� ����
//- �޼ҵ� ����ο� static�� �߰��� �޼ҵ� : Ŭ�����޼ҵ�
public class StaticDemo2 {
	int num;
	static int staticNum;
	public static void test() { //Ŭ�����޼ҵ�
		//1. static�޼ҵ忡�� static�޼ҵ带 ȣ�� - �޼ҵ��� �Ϲ����� ���ٹ������ ����
		show();
		System.out.println("test()");
	}
	public void display() {//�ν��Ͻ��޼ҵ� : non-static�޼ҵ�
		//2. non-static�޼ҵ忡�� static�޼ҵ带 ȣ�� - �޼ҵ��� �Ϲ����� ���ٹ������ ����
		test();
		System.out.println("display()");
	}
	public static void show() { //Ŭ�����޼ҵ�
		//4. static�޼ҵ忡�� non-static�޼ҵ带 ȣ��
		//=> static�޼ҵ忡�� run�� ������ �� �� ����. static�޼ҵ忡�� non-static�޼ҵ带 �׼����Ϸ��� �ڱ� �ڽ� ��ü�� �޼ҵ��� �ϴ��� new�ؼ� ��ü�� 
		//   ������ �� �����ؾ� �Ѵ�.
		StaticDemo2 obj = new StaticDemo2();
		obj.run();
		//run();//�߸��� ���ٹ��
		System.out.println("show()");
	}
	public void run() {
		System.out.println("run()");
	}
	public void change() {//�ν��Ͻ��޼ҵ�
		//3. non-static�޼ҵ忡�� non-static�޼ҵ带 ȣ�� - �Ϲ����� ���ٹ������ ����
		display();
		System.out.println("change()");
	}
	
}
