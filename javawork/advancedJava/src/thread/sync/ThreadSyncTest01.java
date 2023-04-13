package thread.sync;

public class ThreadSyncTest01 {
	public static void main(String[] args) {
		//쓰레드에서 공유해서 사용할 객체를 생성
		Toilet toilet = new Toilet();
		
		//공유객체를 사용할 쓰레드 객체를 생성
		UserInfo p1 = new UserInfo("장동건", toilet); 
		UserInfo p2 = new UserInfo("이민호", toilet); 
		UserInfo p3 = new UserInfo("현빈", toilet); 
		UserInfo p4 = new UserInfo("조성배", toilet); 
		UserInfo p5 = new UserInfo("한준희", toilet); 
		UserInfo p6 = new UserInfo("정진호", toilet); 
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		new UserInfo("김건우", toilet).start();
		
	}

}
