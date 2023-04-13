package oop.basic;
//�޼ҵ� ���
public class Person_Method {
	//������� or �ʵ�
	private String name;
	private int age;
	private String addr;
	
	//name������ private���� �ܺο��� ���ٺҰ��� �����Ǿ��� ������ public�޼ҵ带 ���� ���� �����ϰ� ���� ������ �� �ֵ��� �����Ѵ�.
	//name������ ���� �����ϴ� �޼ҵ� - setter�޼ҵ�
	//setter�� getter�޼ҵ���� �ۼ��ϴ� ���
	//set(get) + ���������(��������� ù ���ڸ� �빮�ڷ� ����)
	//ex) name������ setter/getter�޼ҵ�
	//    setName, getName
	//    => �⺻ �ڹٿ����� setter/getter�޼ҵ��� �̸��� ����Ҷ� ����� ��Ű�� �ʾƵ� ������ ���� �ʴ´�.
	//       �׷��� �������̳� ���� ����Ҷ� �� ��Ģ�� ��Ű�� ������ ������ �߻��� �� �ִ�.
	//setter�޼ҵ��� �Ű������� ���� ������ ��������� Ÿ���� �����ؾ� �Ѵ�.
	public void setName(String name) {
		this.name = name; //���� ����� ������ ���� �νĵȴ�.
		             //��������� �Ű��������� ������ ��� �Ű����� = �Ű������� �νĵǹǷ� 
		             //= ������ ������ ��ü�� �������� ��Ÿ���� �Ѵ�. �̶� ����ϴ� Ű���尡 this 
		             //this�� ���� �۾� ���� ��ü�� �ǹ�
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//name������ ����� ���� ���� �� �ִ� �޼ҵ�(�о ȣ���ϴ� ������ ������ �� �ִ� �޼ҵ�) - getter�޼ҵ�
	//=> ��������� ���� ȣ���ϴ� ������ ������.
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddr() {
		return this.addr;
	}
}







