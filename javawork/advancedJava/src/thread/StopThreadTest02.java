package thread;
/*
 * 2. ���ͷ�Ʈ�� �߻���Ű�� ���� ���¸� Ȯ���� �Ŀ� �۾��ϱ�
 *    => ���ͷ�Ʈ�� �߻��Ǹ� Exception�� �߻��ǹǷ� catch���� ó��
 */
class StopThread02 extends Thread{
	@Override
	public void run() {
		//���� ���ͷ�Ʈ �������� �Ǵ�
		try {
			while(!Thread.currentThread().isInterrupted()){
				System.out.println("���� ������ ����:������~~~~~");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}finally{
			System.out.println("���� ������ ����:����~~~~~");
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
		//���ͷ�Ʈ�� �߻�
		t.interrupt();
		
	}

}
