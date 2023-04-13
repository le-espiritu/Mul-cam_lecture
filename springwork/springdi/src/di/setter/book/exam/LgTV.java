package di.setter.book.exam;

public class LgTV implements TV{
	Speaker speaker;
	public LgTV() {
		
	}
	public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("스피커객체 매핑");
		this.speaker = speaker;
	}
	public void turnOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("LgTV---소리 올린다.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("LgTV---소리 내린다.");
		speaker.soundDown();
	}
}
