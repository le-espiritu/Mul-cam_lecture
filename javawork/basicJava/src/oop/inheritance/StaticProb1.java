package oop.inheritance;

public class StaticProb1 {
	public static void main(String[] args){
		Drink coffee = new Drink("Ŀ��",1500,4);
		Drink tea = new Drink("����",1100,7);
		Alcohol wine = new Alcohol("����", 5000, 3, 15.1);
		
		System.out.println("***** �� �� �� ǥ ***** ");
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();
		
		Alcohol.printTitle();//static�޼ҵ带 ȣ���ϸ鼭 ��Ȯ�ϰ� 
		                     //� Ŭ������ �޼ҵ带 ȣ������ ���
		wine.printData();//�������̵��� �޼ҵ尡 ȣ��ȴ�.
		
		int sum = coffee.getTotalPrice()
				  + tea.getTotalPrice()
				  + wine.getTotalPrice();
		
		System.out.println();
		System.out.println("*** �ѱݾ� " + sum + "�� ***");
		
	}
}
