package oop.constructor;

public class Movie {
	private String title;
	private String genre;
	public Movie() {
		
	}
	public Movie(String title,String genre) {
		this.title = title;
		this.genre = genre;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre =genre;
	}
	public void play() {
		System.out.println(this.title+"("+this.genre+") �����Դϴ�.");
	}
	
}
