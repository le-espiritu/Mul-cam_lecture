package oop.poly;

public class Coffee extends Beverage {
	static int amount;	
	public Coffee() {
		
	}
	public Coffee(String name) { //��ü�� ������ ���� Ŀ�Ǹ� �ֹ��ϴ� �Ͱ� ����
		super(name);
		//amount = amount+1;
		amount++; //��������
		calcPrice();//���ݰ��
	}
	@ Override
	public void calcPrice() {
		if(getName().equals("Americano")) {
			price = 1500;
		}else if(getName().equals("CafeLatte")) {
			price = 2500;
		}else if(getName().equals("Cappuccino")) {
			price = 3000;
		}
	}

	
}
