package oop.inheritance;

public class Staff extends Person{
	private String dept;
	
	public Staff() {
		super();
	}
	public Staff(String name, int age, String dept) {
		super(name,age);//�θ��� ������ ȣ��
		this.dept = dept;
	}
	public void print() {
		super.print();
		System.out.println(" ��   �� : "+this.dept);
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
