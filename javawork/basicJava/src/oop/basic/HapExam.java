package oop.basic;

import java.util.Scanner;

public class HapExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1���� ���� ���� ���ϰ� ���� ���ڸ� �Է��ϼ���:");
		int num = key.nextInt();
		int sum = 0;//����
		MyMethodUtil obj = new MyMethodUtil();
		sum = obj.getHap(num);
		System.out.println("����:"+sum);
	
		
	}
}
