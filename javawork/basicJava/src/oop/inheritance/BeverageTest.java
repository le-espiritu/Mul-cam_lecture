package oop.inheritance;

public class BeverageTest {
	public static void main(String[] args) {
      Coffee coffee1 = new Coffee("Ŀ��",2500,"�Ƹ޸�ī��");
      Coffee coffee2 = new Coffee("Ŀ��",2700,"ī���");
      Coffee coffee3 = new Coffee("Ŀ��",3000,"īǪġ��");
      
      Tea tea1 = new Tea("��",2500,"�𽺹���","�����");
      Tea tea2 = new Tea("��",2700,"�λ���","�ǰ�����");
      Tea tea3 = new Tea("��",3000,"��ȭ��","�ǰ�����");
      coffee1.print();
      coffee2.print();
      coffee3.print();
      
      tea1.print();
      tea2.print();
      tea3.print();
      
        
	}

}
