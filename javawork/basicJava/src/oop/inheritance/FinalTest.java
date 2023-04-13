package oop.inheritance;
//����Ŭ����
final class SuperB{ //����� �Ұ����� Ŭ����
	//�������(��������)�� final�� �߰��ϸ� ����� �ǹ� - ���� ���Ҵ� �� �� ����.
	//  => �ڹٿ����� ����� ������ �����ϱ� ���� ����� �빮�ڷ� �����ϱ�� ���
	public static final int NUM = 100;
	public final void display() { //����Ŭ�������� �������� �� ���� �޼ҵ�
		System.out.println("�θ��� dipalay()");
	}
}
class SubB extends SuperB{
	public void test() {
		super.NUM = 1000;
		System.out.println(NUM);
	}
	public void display() {
		System.out.println("�ڽ��� display()");
	}
}
public class FinalTest {
	public static void main(String[] args) {
		SubB obj = new SubB();
		obj.test();
	}
}
