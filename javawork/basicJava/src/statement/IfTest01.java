package statement;

import java.util.Random;

//if~else를 연습
public class IfTest01 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		if(num>=90) {
			System.out.println("점수:"+num+"(합격)");
		}else {
			System.out.println("점수:"+num+"(재시험)");
		}
	}
}
