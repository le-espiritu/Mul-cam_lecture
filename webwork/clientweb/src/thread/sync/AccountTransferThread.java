package thread.sync;

public class AccountTransferThread extends Thread{
	Obj obj;
	public AccountTransferThread(Obj obj){
		this.obj = obj;
	}
	public void run(){
		for (int i = 0; i <=30; i++) {
			synchronized (obj) {
				obj.acc1.withdraw(1000000);
				System.out.println("100만원을 출금했습니다.");
				obj.acc2.deposit(1000000);
				System.out.println("100만원을 입금했습니다.");
			}
				
		}
	}
}
