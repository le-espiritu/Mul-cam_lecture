package thread;
class MyThread2 extends Thread{
	public void run(){
		test();
	}
	public void test(){
		try {
			throw new Exception();//���ܹ߻�
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class StartCallTest {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();//������ ����
	}

}
