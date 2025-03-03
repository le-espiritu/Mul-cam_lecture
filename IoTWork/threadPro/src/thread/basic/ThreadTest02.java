package thread.basic;

class AlphaThread extends Thread{
	AlphaThread(String name){
		super(name);
	}
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
class DigitThread extends Thread{
	DigitThread(String name){
		super(name);
	}
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
public class ThreadTest02 {
	public static void main(String[] args) {
		System.out.println("����");
		AlphaThread t1= new AlphaThread("alpha");
		DigitThread t2= new DigitThread("digit");
		t1.start();
		t2.start();
		System.out.println("����");
	}

}
