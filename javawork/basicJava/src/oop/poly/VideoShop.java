package oop.poly;


public class VideoShop {
	public static void main(String[] args) {
		Content[] content = new Content[5];
		content[0] = new Video("��ȣ��","new");
		content[1] = new Video("Ž��","comic");
		content[2] = new Video("���ī��","child");
		content[3] = new DDR5("����DDR5","LG");
		content[4] = new DDR5("�� ���� DDR5","SAMSUNG");
		//������ �� ����ǰ� �ִ� �ڵ带 ��¡
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
