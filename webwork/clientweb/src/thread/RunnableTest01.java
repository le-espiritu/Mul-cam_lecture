package thread;
/*
 * �̹� �ٸ� Ŭ������ ����ϰ� �־ ThreadŬ������ ����� �� ���� ���
 * 1. Runnable�������̽��� ����Ѵ�.(implements�� �����Ѵ�.)
 * 2. run�� �������̵��ؼ� ������ ���α׷����� �ϰ� ���� ������ �����Ѵ�.
 * 3. Runnable��ü(Runnable�� ������ü)�� �̿��ؼ� Thread��ü�� ����
 *    => �ۼ��� Runnable�� ����ϴ� ��ü�� new�����ڷ� ������ �Ŀ� ThreadŬ������
 *       ������ �߿��� Runnable�� �Ű������� �޴� �����ڸ� ȣ���ϸ� ������ Runnable
 *       ��ü�� �Ű������� �����Ѵ�.
 * 4. Thread��ü�� start�� ȣ���Ѵ�.
 *    => �Ű������� ���޵Ǿ� ���õ� Runnable��ü�� run�� ������ ������ ȣ��ȴ�.
 */
class RunnableDemo01 implements Runnable{
	String str;
	RunnableDemo01(String str){
		this.str = str;
	}
	public void run(){
		for (int i = 1; i<=20; i++) {
			System.out.print(str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%5==0){
				System.out.println();
			}
		}
	}
}
public class RunnableTest01 {
	public static void main(String[] args) {
		System.out.println("*********main������ ����**********");
		RunnableDemo01 obj1 = new RunnableDemo01("��");
		//RunnableDemo01 obj2 = new RunnableDemo01("��");
		
		Thread t1 = new Thread(obj1);//ThreadŬ���� ���ο��� 
		                             //�Ű������� ������ Runnable��ü
		                             //�� run�� ã�� �� �ִ�.
		Thread t2 = new Thread(new RunnableDemo01("��"));
		t1.start();
		t2.start();
		for (int i = 1; i <=10; i++) {
			System.out.println("main");
		}
		System.out.println("*********main������ ����**********");
		
	}
}









