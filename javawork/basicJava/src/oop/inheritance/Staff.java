package oop.inheritance;

public class Staff extends Person{
	private String dept;
	
	public Staff() {
		super();
	}
	public Staff(String name, int age, String dept) {
		super(name,age);//부모의 생성자 호출
		this.dept = dept;
	}
	public void print() {
		super.print();
		System.out.println(" 부   서 : "+this.dept);
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
