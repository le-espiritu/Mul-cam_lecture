package oop.inheritance;


public class TestSchool {
	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",20,200201);
		Teacher t = new Teacher ("�̼���",30,"JAVA");
		Staff  e = new Staff("������",40,"������");
		
		s.print();
		t.print();
		e.print();
	}

}
