package thread;
/* 쓰레드 종료하기
 * 1. 임의의 변수를 선언해서 종료하는 방법
 *    - 변수값에 따라서 작업을 처리할 수 있도록 구현하기
 *    - 변수타입 :boolean
 */
class StopThread01 extends Thread{
	private boolean state =false;
	public void run(){
		while(!state){
			System.out.println("현재 쓰레드 상태: 실행중~~~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("현재 쓰레드 상태:종료~~~~~");
	}
	public void stopThread(){
		state = true;
	}
}
public class StopThreadTest01 {
	public static void main(String[] args) {
		StopThread01 t = new StopThread01();
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.stopThread();
	}

}
