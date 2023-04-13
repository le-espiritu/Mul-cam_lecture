package oop.inheritance;

public class Alcohol extends Drink {
	double alcper;
	public Alcohol() {
		
	}
	public Alcohol(String name, int price, int count, 
			double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	public static void printTitle(){
		System.out.println("��ǰ��(����[%])\t�ܰ�\t����\t�ݾ�");
	}
	public void printData(){
		System.out.println(name+"("+alcper+")\t"+price+
				"\t"+count+"\t"+getTotalPrice());
	}
}
