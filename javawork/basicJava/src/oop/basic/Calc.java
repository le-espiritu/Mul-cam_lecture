package oop.basic;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
        System.out.println("******�̴ϰ���******");
        System.out.println("1.���ϱ�");
        System.out.println("2.���ϱ�");
        System.out.println("3.����");
        System.out.println("4.������");
        System.out.println("5.����");
        System.out.print("�����ڸ� �����ϼ���.");
        int opr = key.nextInt();
        if(opr<=0 | opr>4) {
        	System.out.println("�߸��Է�");
        	//System.exit(0);//����ý����� ��������
        }else {
	        System.out.print("���ڸ� �Է��ϼ���:");
	        int num1 = key.nextInt();
	        int num2 = key.nextInt();
	        int result = 0; //������ ����� ������ ����
	                        //�� �ȿ� ����Ǵ� ������ ���ú����̸� ���ú����� �ݵ�� �ʱⰪ�� �־�� �Ѵ�.
	        //MyMethodUtil�� ���ǵ� calc�� ȣ��
	        MyMethodUtil obj = new MyMethodUtil();
	        result = obj.calc(opr,num1,num2);
	        System.out.println("�����=>"+result);
        }
        
	}
}









