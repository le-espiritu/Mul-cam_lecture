package oop.basic;

public class Staff {
	private String name;
	private int age;
	private String dept;
	public void print() {
		System.out.println("이 름 : "+this.name+
				" 나 이 : "+this.age+" 부   서 : "+this.dept);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
