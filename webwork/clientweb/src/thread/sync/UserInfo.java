package thread.sync;

public class UserInfo extends Thread{
	String name;
	Toilet toilet;
	public UserInfo(String name, Toilet toilet) {
		super();
		this.name = name;
		this.toilet = toilet;
	}
	public void run(){
		toilet.open(name);
	}
}
