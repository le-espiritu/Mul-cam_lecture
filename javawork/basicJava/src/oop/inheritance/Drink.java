package oop.inheritance;

public class Drink {
	String name;
	int price;
	int count;
	public Drink() {
		
	}
	public Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public int getTotalPrice(){
		int result = price * count;
		return result;
	}
	public static void printTitle(){
		System.out.println("��ǰ��\t�ܰ�\t����\t�ݾ�");
	}
	public void printData(){
		System.out.println(name+"\t"+price+"\t"+count
				+"\t"+getTotalPrice());
	}
}
