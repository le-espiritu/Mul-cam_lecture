package thread.basic;

class ThreadDemo01 extends Thread{
	ThreadDemo01(String name){
		super(name);
	}
	@Override
	public void run() {
		//1부터 20까지 출력하는 코드
		for (int i = 1; i <=20; i++) {
			System.out.print(i+"("+getName()+")");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%5==0) {
				System.out.println();
			}
		}
	}
	
}
//ThreadDemo01객체를 활용해서 멀티쓰레드 프로그래밍을 구현
public class ThreadTest01 {
	public static void main(String[] args) {
		System.out.println("**************프로그램시작**************");
		ThreadDemo01 t1 = new ThreadDemo01("t1");
		ThreadDemo01 t2 = new ThreadDemo01("t2");
		//t1.run(); -> 단순한 메소드 호출(쓰레드프로그래밍 XX)
		t1.start();
		t2.start();
		for (int i = 1; i <=10; i++) {
			System.out.println("main:"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("**************프로그램종료**************");
	}

}







