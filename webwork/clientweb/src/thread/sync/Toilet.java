package thread.sync;
//��� �����尡 �����ؼ� ����ϴ� ��ü
public class Toilet {
	public synchronized void open(String name){
		System.out.println(name+"�� ������ ����");
		for (int i = 1; i <=100000000; i++) {
			if(i==10000){
				System.out.println(name+"�� ��~~~~~~~~��~~~~~~");
			}
		}
		System.out.println(name+"�� ������ ����~~~^^");
	}
}
