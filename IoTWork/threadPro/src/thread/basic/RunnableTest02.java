package thread.basic;

class AlphaThread2 implements Runnable{
	public void run() {
		for (char c='A';c<='Z';c++) {
			System.out.print(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class DigitThread2 implements Runnable{
	public void run() {
		for (int i=1;i<=100;i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}
public class RunnableTest02 {
	public static void main(String[] args) {
		System.out.println("시작");
		//AlphaThread2 t1= new AlphaThread2();
		//DigitThread2 t2= new DigitThread2();
		Thread t1 = new Thread(new AlphaThread2());
		Thread t2 = new Thread(new DigitThread2());
		t1.start();
		t2.start();
		System.out.println("종료");
	}

}










