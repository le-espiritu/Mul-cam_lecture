package oop.inheritance;

public class Bike  extends Wheeler {
	public Bike(String carName,int velocity,int wheelNumber){
		super(velocity,carName,wheelNumber);
	}

	@Override
	public void speedUp(int speed) {
		velocity = velocity + speed;
		if(velocity>40) {
			velocity = 40;
		}else {
			System.out.println("자 전 거의 현재 속도는"+ velocity +"입니다 .");
		}
	}

	@Override
	public void speedDown(int speed) {
		velocity = velocity - speed;
		if(velocity<10) {
			velocity = 10;
			System.out.println("자 전 거의 최저속도위반으로 속도를 10 으로 올립니다");
		}
	}
	
}
