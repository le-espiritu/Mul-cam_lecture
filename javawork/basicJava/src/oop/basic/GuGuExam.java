package oop.basic;

import java.util.Scanner;

public class GuGuExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("����� ��:");
		int dan = key.nextInt();
		
		MyMethodUtil obj = new MyMethodUtil();
		obj.printGuGu(dan);
	}
}
