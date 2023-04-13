package oop.constructor;

public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String addr;
	private String telNum;
	private String ssn;
	private String nickname;
	
	public  MyConstructor() {
		System.out.println("�⺻������ - �Ű��������� ������");
	}
	public MyConstructor(String name,String id, String pass) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		System.out.println("�Ű�����3��������");
	}
	public MyConstructor(String name,String id, String pass,String addr,String telNum) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.addr = addr;
		this.telNum = telNum;
		System.out.println("�Ű�����5��������");
	}
	public MyConstructor(String name,String id, String pass,String addr,String telNum,
														String ssn, String nickname) {
		//��������� �ʱ�ȭ�ϱ� ���� �ڵ带 �ݺ��ؼ� ������� �ʰ� ������ �ۼ��� �����ڸ� ȣ���ؼ� ����� �� �ִ�.
		//this(name,id,pass); //name�� String, id�� String,pass�� String�̹Ƿ� MyConstructorŬ�������� StringŸ������ �Ű����� �� ���� ���ǵ� �����ڸ�
		                  //ã�Ƽ� ȣ���Ѵ�.
		this(name,id,pass,addr,telNum);
		this.ssn = ssn;
		this.nickname = nickname;
		System.out.println("�Ű�����7��������");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void print() {
		System.out.println("name="+name+",id="+id+",addr="+addr+",nickname="+nickname);
	}



	
}
