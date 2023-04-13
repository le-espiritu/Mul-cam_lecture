package oop.inheritance;

public class CheckingAccount extends Account{
	private String cardNo;
	public CheckingAccount() {
		
	}
	public CheckingAccount(String accId	,String ownerName,	long balance,String cardNo) {
		super(accId,balance,ownerName);
		this.cardNo = cardNo;
	}
	public void pay(long amount, String cardNo) {
		//ī���ȣ�� ���ϰ� �����Ϸ��� �ϴ� �ݾ��� �ܾ׺��� ������ ������ �ǰ� ������ �������� ������ �����̵��� �ʵ��� ó��
		if(this.cardNo.equals(cardNo) & getBalance()>=amount) {
			withdraw(amount);
		}else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
