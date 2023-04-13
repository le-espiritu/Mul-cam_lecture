package thread;
class AlphaThread02 implements Runnable{

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
class DigitThread02 implements Runnable{
	
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
public class RunnableTest02 {

	public static void main(String[] args) {
		System.out.println("**********main시작*********");
		Thread t1 = new Thread(new DigitThread02());
		Thread t2 = new Thread(new AlphaThread02());
		t1.start();
		t2.start();
		System.out.println("**********main종료*********");
	}

}
