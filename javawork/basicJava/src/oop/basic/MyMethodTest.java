package oop.basic;
//MyMethodŬ������ ���ǵ� �޼ҵ带 ȣ��
public class MyMethodTest {
	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		System.out.println("��������");
		System.out.println("�۾�1");
		//1. �޼ҵ��� ȣ�� - �Ű������� ���� ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display();
		
		System.out.println("�۾�2");
		m.display();
		
		System.out.println("�۾�3");
		m.display();
		m.display();
		
		//2. �Ű������� �ְ� ���ϰ��� ���� �޼ҵ��� ȣ��
		
		//�Ű����� �� ��
		m.display("��");//����ϰ� ���� Ư�����ڸ� �Ű������� ����
		m.display("��");
		m.display("��");
		
		//�Ű�����2��
		m.display("��", 20);
		m.display("��", 2);
		m.display("��", 120);
		m.display("��", 50);
		
		
		//3. �Ű������� �ְ� ���ϰ��� �ִ� �޼ҵ带 ȣ��
		//=> ���޵Ǵ� ���ϰ��� ������� �ʾƼ� ��ȭ�� ����.
		//  1) ���ϰ��� �ִ� �޼ҵ带 ȣ���ϴ� ��� ����Ÿ�԰� ���� ������ �����ϰ� ���޵Ǵ� ���� �Ҵ�ǵ��� �Ѵ�.
		int result = m.add(100, 200);
		System.out.println("add�޼ҵ� ȣ����=>"+result);
		if(result>100) {
			System.out.println("ũ��.");
		}else {
			System.out.println("�۴�.");
		}
		//2) �ٸ� �޼ҵ��� �Ű������� �޼ҵ��� ���ϰ��� �ٷ� ������ �� �ִ�.
		System.out.println(m.add(300, 500));
	//	System.out.println(m.display()); //����Ÿ���� void�� �޼ҵ�� �ٸ� �޼ҵ��� �Ű������� ������ �� ����.
	}
}

















