package oop.inheritance;
//클래스변수
//-static변수에 대한 내용
public class StaticDemo {
	int num;
	static int staticNum;
	public StaticDemo() {
		num++;
		staticNum++;
	}
	public void display() {
		System.out.println("num="+num+",staticNum="+staticNum);
	}
}
