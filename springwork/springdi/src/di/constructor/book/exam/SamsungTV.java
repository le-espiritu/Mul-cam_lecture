package di.constructor.book.exam;

public class SamsungTV implements TV{
	//현재 클래스 내부에서 사용하는 객체 
	Speaker speaker;
	//- 스프링컨테이너를 통해 전달받을 수 있도록 생성자 준비
	public SamsungTV() {}
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void turnOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---소리 올린다.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("SamsungTV---소리 내린다.");
		speaker.soundDown();
	}
}
