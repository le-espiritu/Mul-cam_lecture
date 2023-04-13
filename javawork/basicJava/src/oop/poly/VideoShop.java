package oop.poly;


public class VideoShop {
	public static void main(String[] args) {
		Content[] content = new Content[5];
		content[0] = new Video("변호인","new");
		content[1] = new Video("탐정","comic");
		content[2] = new Video("헬로카봇","child");
		content[3] = new DDR5("좋은DDR5","LG");
		content[4] = new DDR5("더 좋은 DDR5","SAMSUNG");
		//기존의 잘 실행되고 있는 코드를 상징
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
