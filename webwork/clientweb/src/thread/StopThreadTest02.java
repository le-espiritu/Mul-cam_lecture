package thread;
/*
 * 2. 인터럽트를 발생시키고 현재 상태를 확인한 후에 작업하기
 *    => 인터럽트가 발생되면 Exception이 발생되므로 catch에서 처리
 */
class StopThread02 extends Thread{
	@Override
	public void run() {
		//현재 인터럽트 상태인지 판단
		try {
			while(!Thread.currentThread().isInterrupted()){
				System.out.println("현재 쓰래드 상태:실행중~~~~~");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}finally{
			System.out.println("현재 쓰레드 상태:종료~~~~~");
		}
	}
	
}
public class StopThreadTest02 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isInterrupted());
		
		StopThread02 t = new StopThread02();
		t.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//인터럽트를 발생
		t.interrupt();
		
	}

}
