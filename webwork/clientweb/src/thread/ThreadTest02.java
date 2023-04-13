package thread;
class AlphaThread extends Thread{
	AlphaThread(String name){
		super(name);
	}
	public void run(){
		for (char i = 'A'; i<='Z'; i++) {
			System.out.print(i);
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
	public void run(){
		for (int i = 1; i<=100; i++) {
			System.out.print(i+"\t");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%10==0){
				System.out.println();
			}
		}
	}
}
public class ThreadTest02 {

	public static void main(String[] args) {
		System.out.println("**********main시작*********");
		DigitThread t1 = new DigitThread("digit");
		AlphaThread t2 = new AlphaThread("alpha");
		t1.start();
		t2.start();
		System.out.println("**********main종료*********");
	}

}
