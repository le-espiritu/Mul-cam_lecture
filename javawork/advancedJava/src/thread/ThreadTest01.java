package thread;
/*
 * 1. 쓰레드 프로그래밍을 구현하고 싶은 경우 Thread라는 클래스를 상속
 * 2. 쓰레드로 동시에 실행하고 싶은 내용을 run에서 호출하거나 구현
 *    => Thread클래스안에 정의된 run메소드를 오버라이딩해야 한다.
 * 3. run메소드를 직접 호출하지 않고 Thread클래스에 정의된 start메소드를 호출한다.
 *    => start를 호출하면 JVM내부의 스케쥴러에 의해서 run이 적절한 시점에 호출된다.
 */
class ThreadDemo01 extends Thread{
	String str;
	ThreadDemo01(String str,String name){
		super(name);
		this.str = str;
	}
	public void run(){
		for (int i = 1; i<=20; i++) {
			System.out.print(str+"("+getName()+")");
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
public class ThreadTest01 {
	public static void main(String[] args) {
		System.out.println("*********main쓰레드 시작**********");
		ThreadDemo01 t1 = new ThreadDemo01("★", "t1");
		ThreadDemo01 t2 = new ThreadDemo01("☆", "t2");
		//t1.run(); 단순 메소드 call
		//t2.run();단순 메소드 call
		t1.start();
		t2.start();
		for (int i = 1; i <=10; i++) {
			System.out.println("main");
		}
		System.out.println("*********main쓰레드 종료**********");
		
	}
}









