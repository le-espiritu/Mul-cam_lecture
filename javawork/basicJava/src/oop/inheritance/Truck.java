package oop.inheritance;

public class Truck extends Wheeler {
	public Truck(String carName,int velocity,	int wheelNumber){
		super(velocity,carName,wheelNumber);
	}

	@Override //������̼� - �����Ϸ����� ���� �� �ȳ�
	public void speedUp(int speed) {
		velocity = velocity + (5*speed);
		if(velocity>100) {
			velocity = 100;
		}else {
			System.out.println("Ʈ���� ���� �ӵ��� "+velocity+"�Դϴ� .");
		}
	}

	@Override
	public void speedDown(int speed) {
		velocity = velocity - (5*speed);
		if(velocity<50) {
			velocity = 50;
			System.out.println("Ʈ���� �����ӵ��������� �ӵ��� 50 ���� �ø��ϴ� .");
		}
	}
	
}
