package oop.poly;
//instanceOf������
//=> ���������� �����ϰ� �ִ� ��ü�� Ÿ���� Ȯ���� �� �ִ� ������
class ChildA extends Parent{
}
class ChildB extends Super{
	@Override
	public void display() {
	}
}

public class InstanceOfTest {
	public static void main(String[] args) {
		ChildA obj1 = new ChildA();
		Child obj2 = new Child();
		ChildB obj3 = new ChildB();
		
		//�� ���������� �Ҵ�� ��ü�� Ÿ���� Ȯ��
		//���������� �Ҵ�� ��ü�� instanceOf �ڿ� ����� Ÿ������ ������ �� �ִ���???
		//Parent obj = obj1
		if(obj1 instanceof Parent) {
			System.out.println("ParentŸ���̴�.");
		}else {
			System.out.println("ParentŸ���� �ƴϴ�.");
		}
		
		if(obj2 instanceof Parent) {
			System.out.println("ParentŸ���̴�.");
		}else {
			System.out.println("ParentŸ���� �ƴϴ�.");
		}
		
//		if(obj3 instanceof Parent) {
//			System.out.println("ParentŸ���̴�.");
//		}else {
//			System.out.println("ParentŸ���� �ƴϴ�.");
//		}

	}

}
