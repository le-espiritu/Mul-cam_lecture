package oop.basic;
//main�޼ҵ忡 �����ߴ� ������� �޼ҵ�� �ۼ��ؼ� ȣ���غ��� ����
//�޼ҵ常 ��Ƴ��� Ŭ����
public class MyMethodUtil {
	//1. �Ű������� ���޹��� num�� ���ؼ� �հ����� ���հ��� ����ϴ� �޼ҵ� - �Ű������� �ְ� ���ϰ��� ���� �޼ҵ�
	public void scoreCheck(int num) {
		if(num>=90) {
			System.out.println("����:"+num+"(�հ�)");
		}else {
			System.out.println("����:"+num+"(�����)");
		}
	}
	public int calc(int opr,int num1,int num2) {
		int result = 0;
		switch(opr) {
	    	case 1:
	    		result = num1+num2;
	    		break;
	    	case 2:
	    		result = num1*num2;
	    		break;
	    	case 3:
	    		result = num1-num2;
	    		break;
	    	case 4:
	    		result = num1/num2;
	    		break;
		}
		return result;
	}
	
	//1���� 100���� ¦���� ����ϴ� �޼ҵ带 ����
	public void printNumber() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("¦�� : "+i);
			}
		}
	}
	//�Է¹޴� ���� ����ϴ� �޼ҵ带 ����
	//�޼ҵ�� :  printGuGu
	public void printGuGu(int dan) {
		for(int i=1;i<=9;i=i+1) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
	//1���� ���޹��� ���ڱ����� ���� ���� �����ϴ� �޼ҵ带 ����
	//�޼ҵ�� : getHap
	public int getHap(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum+i;
		}
		return sum;
	}
	//�迭�� ��� ����� Ȧ���հ� ¦������ ���ؼ� ����ϴ� �޼ҵ�
	//�Ű������� �⺻�� , ������ ��� ���޹��� �� �ִ�.
	//����Ÿ������ �⺻��, ������ ��� ������ �� �ִ�.
	public void printArray(int[] myarr,String arrName) {
		int evenSum = 0 ; //¦����
		int oddSum = 0 ;//Ȧ����
		for(int i=0;i<myarr.length;i++) {
			
			if(myarr[i]%2==0) {
				evenSum = evenSum+myarr[i];
			}else {
				oddSum = oddSum + myarr[i];
			}
		}
		System.out.println("(�迭 "+arrName+")");
		System.out.println("Ȧ������ : "+oddSum);
		System.out.println("¦������ : "+evenSum);
	}
}


























