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
		//카드번호를 비교하고 지불하려고 하는 금액이 잔액보다 작으면 지불이 되고 조건을 만족하지 않으면 지불이되지 않도록 처리
		if(this.cardNo.equals(cardNo) & getBalance()>=amount) {
			withdraw(amount);
		}else {
			System.out.println("지불이 불가능합니다.");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
