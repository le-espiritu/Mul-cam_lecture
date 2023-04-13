package api.lang;

public class FindNumbers {
	
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );		
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
	}
	
	/*  이곳에 countNumber 메소드를 작성하십시오. */
	public int countNumber(long number,int value) {
		int count = 0;
		String data = number+"";//매개변수로 전달받은 숫자를 문자로 변환
		int size = data.length();
		for (int i = 0; i <size; i++) {
			if((data.charAt(i)+"").equals(value+"")) {
				count++;
			}
		}
		return count;
	}
}
