package oop.basic;
//MovieŬ������ TestMovie, ����ȭ��ĸ�� �� ���Ϸ� ����
public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		myMovie.setTitle("��Ž�Ʈ ����");
		myMovie.setGenre("Drama");
		myMovie.play();
		
		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("���� �����̴�");
		yourMovie.setGenre("SF");
		yourMovie.play();
	}

}