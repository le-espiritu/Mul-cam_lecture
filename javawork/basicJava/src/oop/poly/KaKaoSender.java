package oop.poly;
//������� �䱸�� ���ؼ� ������� ���ο� ����� ������ Ŭ����
public class KaKaoSender extends Sender {
	int length;
	public KaKaoSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void send() {
		System.out.println("īī�������� ����");

	}

}
