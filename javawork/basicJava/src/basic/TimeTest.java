package basic;
/*
  TimeTest.java작성하기
  아래의 변수를 선언하고 다음과 같은 조건을 만족하도록 작업하세요
  time은 초 데이터임
  필요한 임의 변수를 선언하고 작업하기

  int time = 8000;
 
  [출력형태]
  _____시간 ____분  _____초
*/
public class TimeTest{
	public static void main(String[] args){
		int time = 8000;
		int h = time/60/60;
		int modVal = time % 3600;
		int m = modVal / 60;
		int s = modVal % 60;
		System.out.println(h+"시간 "+ m +"분 " + s +"초");
	}
}