package oop.poly;
interface A{
	
}
interface B{
	
}
interface C extends A{
	
}
class AA{
	
}
class BB{
	
}
class CC{
	
}
class Test extends AA implements C,B{
	
}
public class InterfaceTest02 {
	public static void main(String[] args) {
		AA obj = new Test();
		A obj2 = new Test();
		B obj3 = new Test();
		C obj4 = new Test();
		//CC obj5 = new Test();
		Test myobj = new Test();
		if(myobj instanceof AA) {
			System.out.println("AA�� ����Ŭ����");
		}
		if(myobj instanceof A) {
			System.out.println("A�� ����Ŭ����");
		}
		if(myobj instanceof B) {
			System.out.println("B�� ����Ŭ����");
		}
		if(myobj instanceof C) {
			System.out.println("C�� ����Ŭ����");
		}
		//Test��ü�� AA,A,B,CŸ���� ������ü�̹Ƿ� �� ���� Ÿ������ ����� ������ ���޵� �� �ִ�.
		//�����ϰ� �پ��� ���α׷��� �ۼ��� �� �ִ�.
		//���߻��Ȱ��
		test(myobj);
		test2(myobj);
		test3(myobj);
		test4(myobj);
	}
	public static void test(AA obj) {
		
	}
	public static void test2(A obj) {
			
	}
	public static void test3(B obj) {
		
	}
	public static void test4(C obj) {
		
	}

}












