package oop.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
		obj.setId("jang");
		obj.setName("�嵿��");
		obj.setPass("1234");//��ȣȭ�� ���� ����
		obj.setTelNum("010");
		obj.setSsn("730111");
		obj.setAddr("����");
		obj.setNickname("¯");
		obj.print();
		
		MyConstructor obj2 = new MyConstructor("�̹�ȣ", "lee", "1234");
		obj2.setTelNum("010");
		obj2.setSsn("850111");
		obj2.setAddr("��õ");
		obj2.setNickname("F4");
		obj2.print();
		
		MyConstructor obj3 = new MyConstructor("����", "jang2", "1234","õ��","010");
		obj3.setSsn("900111");
		obj3.setNickname("�׽�Ʈ");
		obj3.print();
		System.out.println("==========================================================================");
		
		MyConstructor obj4 = new MyConstructor("�����", "kim", "1234","û��","010","600603","��");
		obj4.print();
	}
}
































