package thread;
/*
 * 1. ������ ���α׷����� �����ϰ� ���� ��� Thread��� Ŭ������ ���
 * 2. ������� ���ÿ� �����ϰ� ���� ������ run���� ȣ���ϰų� ����
 *    => ThreadŬ�����ȿ� ���ǵ� run�޼ҵ带 �������̵��ؾ� �Ѵ�.
 * 3. run�޼ҵ带 ���� ȣ������ �ʰ� ThreadŬ������ ���ǵ� start�޼ҵ带 ȣ���Ѵ�.
 *    => start�� ȣ���ϸ� JVM������ �����췯�� ���ؼ� run�� ������ ������ ȣ��ȴ�.
 */
class ThreadDemo01 extends Thread{
	String str;
	ThreadDemo01(String str,String name){
		super(name);
		this.str = str;
	}
	public void run(){
		for (int i = 1; i<=20; i++) {
			System.out.print(str+"("+getName()+")");
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
public class ThreadTest01 {
	public static void main(String[] args) {
		System.out.println("*********main������ ����**********");
		ThreadDemo01 t1 = new ThreadDemo01("��", "t1");
		ThreadDemo01 t2 = new ThreadDemo01("��", "t2");
		//t1.run(); �ܼ� �޼ҵ� call
		//t2.run();�ܼ� �޼ҵ� call
		t1.start();
		t2.start();
		for (int i = 1; i <=10; i++) {
			System.out.println("main");
		}
		System.out.println("*********main������ ����**********");
		
	}
}









