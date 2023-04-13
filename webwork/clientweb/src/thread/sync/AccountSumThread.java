package thread.sync;

public class AccountSumThread extends Thread{
	Obj obj;

	public AccountSumThread(Obj obj) {
		super();
		this.obj = obj;
	}
	public void run(){
		//acc1의 잔액과 acc2의 잔액을 더해서 출력하는 기능
		for (int i = 1; i <=5; i++) {
			synchronized (obj) {
				long total = obj.acc1.getBalance()+obj.acc2.getBalance();
				System.out.println("전체 총액==>"+total);
			}
		}
	}
}
