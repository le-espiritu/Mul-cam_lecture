package oop.basic;

public class Student {
	private String name;
	private int age;
	private int id;
	
	public void print() {
		System.out.println("�� �� : "+this.name+" �� �� : "+this.age+" ��   �� : "+this.id);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
}











