package thread;
class MyThread extends Thread{
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
public class RunCallTest {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.run();//�ܼ� �޼ҵ� ȣ��
	}

}
