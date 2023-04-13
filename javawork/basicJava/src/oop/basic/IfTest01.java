package oop.basic;

import java.util.Random;

//if~else를 연습
public class IfTest01 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		//MyMethodUtil로 분리한 메소드를 호출해서 결과를 동일하게 확인
		MyMethodUtil util = new MyMethodUtil();
		util.scoreCheck(num);
	}
}
