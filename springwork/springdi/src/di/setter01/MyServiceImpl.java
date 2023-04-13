package di.setter01;

public class MyServiceImpl implements MyService {
	String name;
	String msg;
	Logic logicObj;
	
	public MyServiceImpl() {
		System.out.println("MyServiceImpl의 기본생성자");
	}
	
	public MyServiceImpl(String name) {
		super();
		this.name = name;
		System.out.println("매개변수 1개 생성자");
	}

	public MyServiceImpl(String name, String msg, Logic logicObj) {
		super();
		this.name = name;
		this.msg = msg;
		this.logicObj = logicObj;
		System.out.println("매개변수 3개 생성자");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName()");
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("setMsg()");
	}

	public void setLogicObj(Logic logicObj) {
		this.logicObj = logicObj;
		System.out.println("setLogicObj()");
	}

	@Override
	public void testLogic() {
		System.out.println(msg+","+name);
		logicObj.testLogic();

	}

}
