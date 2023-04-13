package thread;
class MyThread extends Thread{
	public void run(){
		test();
	}
	public void test(){
		try {
			throw new Exception();//예외발생
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class RunCallTest {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.run();//단순 메소드 호출
	}

}
