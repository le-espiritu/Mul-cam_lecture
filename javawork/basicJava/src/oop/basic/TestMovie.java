package oop.basic;
//Movie클래스와 TestMovie, 실행화면캡쳐 후 메일로 전송
public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		myMovie.setTitle("어거스트 러쉬");
		myMovie.setGenre("Drama");
		myMovie.play();
		
		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("나는 전설이다");
		yourMovie.setGenre("SF");
		yourMovie.play();
	}

}