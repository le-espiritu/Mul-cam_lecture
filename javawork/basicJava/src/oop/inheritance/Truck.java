package oop.inheritance;

public class Truck extends Wheeler {
	public Truck(String carName,int velocity,	int wheelNumber){
		super(velocity,carName,wheelNumber);
	}

	@Override //어노테이션 - 컴파일러에게 설명 및 안내
	public void speedUp(int speed) {
		velocity = velocity + (5*speed);
		if(velocity>100) {
			velocity = 100;
		}else {
			System.out.println("트럭의 현재 속도는 "+velocity+"입니다 .");
		}
	}

	@Override
	public void speedDown(int speed) {
		velocity = velocity - (5*speed);
		if(velocity<50) {
			velocity = 50;
			System.out.println("트럭의 최저속도위반으로 속도를 50 으로 올립니다 .");
		}
	}
	
}
