package thread;
class MyThread2 extends Thread{
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
public class StartCallTest {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();//쓰레드 실행
	}

}
