package exception;

class BankCustomer{
	// ������ �� �а� �����ϼ���.
	String name;
	int currentMoney;
	public BankCustomer(String name, int currentMoney) {
		super();
		this.name = name;
		this.currentMoney = currentMoney;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	//���ܸ� ȣ���ϴ� ������ ó���� �� �ֵ��� ���� - ȣ���ϴ� ������ ���ܸ� ������, ȣ���ϴ� ������ ���ܸ� �����ϱ�,
	//                                     ȣ���ϴ� ������ ���ܸ� ó���� �� �ֵ��� �˷��ֱ�......
	public void withdraw(int money) throws IllegalArgumentException{
		/*
		 * currentMoney�� money���� ������ IllegalArgumentException�� �߻���Ű�� 
		 * ���ܸ� ȣ���ϴ� ������ ó���� �� �ֵ��� ����
		 * 
		 */
		if(currentMoney<money) {
			//IllegalArgumentException���ܸ� �߻���Ű��
			//���ܻ�Ȳ�� �ƴѵ� ���ܸ� �߻���Ų��.
			throw new IllegalArgumentException("�ܾ��� �����Ͽ� ���� �� �� �����ϴ�.");
		}
		currentMoney = currentMoney - money;
	}
}
public class ExceptionExam {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("ȫ�浿", 100);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(50);//-20
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

