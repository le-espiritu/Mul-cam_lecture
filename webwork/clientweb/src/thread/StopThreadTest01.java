package thread;
/* ������ �����ϱ�
 * 1. ������ ������ �����ؼ� �����ϴ� ���
 *    - �������� ���� �۾��� ó���� �� �ֵ��� �����ϱ�
 *    - ����Ÿ�� :boolean
 */
class StopThread01 extends Thread{
	private boolean state =false;
	public void run(){
		while(!state){
			System.out.println("���� ������ ����: ������~~~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���� ������ ����:����~~~~~");
	}
	public void stopThread(){
		state = true;
	}
}
public class StopThreadTest01 {
	public static void main(String[] args) {
		StopThread01 t = new StopThread01();
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.stopThread();
	}

}
