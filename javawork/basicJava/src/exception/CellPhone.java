package exception;

public class CellPhone {
	String model;
	double	battery;
	public CellPhone(String model) {
		super();
		this.model = model;
	}
	public void call(int time) throws IllegalArgumentException{
		if(time <0) {
			throw new IllegalArgumentException("통화시간입력오류");
		}
		battery = battery - (time*0.5);
		if(battery<0) { //battery가 0보다 작아지면
			battery = 0; //battery를 0으로 만든다.
		}
		System.out.println("통화 시간 : "+time+"분");
	}
	public void charge(int time) throws IllegalArgumentException{
		if(time <0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}
		battery = battery + (time*3);
		if(battery>100) { //battery가 100보다 커지면
			battery = 100; //battery를 100으로 만든다.
		}
		System.out.println("충전 시간 : "+time+"분");
	}
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
//	public boolean equals(Object otherObject) {
//		// Object	타입의 객체를 입력받고 , 입력받은객체가 CellPhone 타입의 클래스이면서 모델	번호가 같은 경우에 true 를 리턴한다
//		if(otherObject instanceof CellPhone) {
//			//매개변수로 전달받은 객체가 Object이므로 CellPhone의 멤버를 사용하기 위해서 캐스팅
//			CellPhone obj = (CellPhone)otherObject;
//			if(this.model.equals(obj.model)) {
//				return true;
//			}
//		}
//		return false;
//	}
	public boolean equals(Object otherObject) {
		boolean state = false;
		// Object	타입의 객체를 입력받고 , 입력받은객체가 
		//CellPhone 타입의 클래스이면서 모델	번호가 같은 경우에 true 를 리턴한다
		if(otherObject instanceof CellPhone) {
			//매개변수로 전달받은 객체가 Object이므로 
			//CellPhone의 멤버를 사용하기 위해서 캐스팅
			CellPhone obj = (CellPhone)otherObject;
			if(this.model.equals(obj.model)) {
				state = true;
			}
		}
		return state;
	}
}













