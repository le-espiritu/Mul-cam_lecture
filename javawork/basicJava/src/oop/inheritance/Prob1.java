package oop.inheritance;


public class Prob1{
public static void main(String[] args) {
	Truck truck = new Truck("Ʈ��", 50, 4);
	Bike bike = new Bike("������", 10, 2);
	System.out.println(truck.carName + 
		" : ���� " + truck.wheelNumber + "���Դϴ�");
	System.out.println(bike.carName +
		" : ���� " + bike.wheelNumber + "���Դϴ�");	
//	wheelers[1] = bike;	
	for(int i = 0; i < 2; i++){
		truck.speedUp(10);
		bike.speedUp(15);
		truck.speedDown(20);
		bike.speedDown(25);	
		truck.stop();
		bike.stop();		
	}
}
}

