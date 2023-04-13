package thread;
/*
 * 이미 다른 클래스를 상속하고 있어서 Thread클래스를 상속할 수 없는 경우
 * 1. Runnable인터페이스를 상속한다.(implements로 구현한다.)
 * 2. run을 오버라이딩해서 쓰레드 프로그래밍을 하고 싶은 내용을 구현한다.
 * 3. Runnable객체(Runnable의 하위객체)를 이용해서 Thread객체를 생성
 *    => 작성한 Runnable을 상속하는 객체를 new연산자로 생성한 후에 Thread클래스의
 *       생성자 중에서 Runnable을 매개변수로 받는 생성자를 호출하며 생성한 Runnable
 *       객체를 매개변수로 전달한다.
 * 4. Thread객체의 start를 호출한다.
 *    => 매개변수로 전달되어 셋팅된 Runnable객체의 run이 적절한 시점에 호출된다.
 */
class RunnableDemo01 implements Runnable{
	String str;
	RunnableDemo01(String str){
		this.str = str;
	}
	public void run(){
		for (int i = 1; i<=20; i++) {
			System.out.print(str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%5==0){
				System.out.println();
			}
		}
	}
}
public class RunnableTest01 {
	public static void main(String[] args) {
		System.out.println("*********main쓰레드 시작**********");
		RunnableDemo01 obj1 = new RunnableDemo01("★");
		//RunnableDemo01 obj2 = new RunnableDemo01("☆");
		
		Thread t1 = new Thread(obj1);//Thread클래스 내부에서 
		                             //매개변수로 전달한 Runnable객체
		                             //의 run을 찾을 수 있다.
		Thread t2 = new Thread(new RunnableDemo01("☆"));
		t1.start();
		t2.start();
		for (int i = 1; i <=10; i++) {
			System.out.println("main");
		}
		System.out.println("*********main쓰레드 종료**********");
		
	}
}









