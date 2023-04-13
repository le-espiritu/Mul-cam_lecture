package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

//throws�� �̿��ؼ� ����ó���� ȣ���ϴ� ������ �ѱ��
public class ThrowsTest01 {
	//1. ���ܰ� �߻��ϴ� ������ ���� ó���ϱ�
	public void test(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
		}catch(FileNotFoundException e) {
			System.out.println("����ó�� �Ϸ�......");
		}
	}
	//2. ���ܰ� �߻��� ������ ó������ �ʰ� ȣ���� ������ ó��
	//                              ---------------
	//                               throws FileNotFoundException
	
	public void test2(String fileName) throws FileNotFoundException{
		FileReader fr = new FileReader(fileName);
	}
	//==> ���ܰ� �߻��ϴ� ������ ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� ó���� �� �ֵ��� ����
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		//1. ���ܰ� �̸� ó���� �޼ҵ带 ȣ��
		// test�޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��ߴ��� �� �� ����.
		// ���ܿ� ���� ó���� ��� ����
		obj.test("test1.txt"); //A��ġ���� �޼ҵ带 ȣ���ߴٰ� ����
		obj.test("test2.txt"); //B��ġ���� �޼ҵ带 ȣ���ߴٰ� ����
		
		//2. ���ܰ� �߻��ϴ� �ڵ� ���ο��� ���ܸ� ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� ó���ϸ� �پ��ϰ� ���ϴ� ������ ���ܸ� ó���� �� �ִ�.
		//  => throws�� ����ϴ� ���� ���ܸ� ��� ������ ó���ؾ� �ϴ��� 
		//     �����ϴ� ���̹Ƿ� ���ܰ� �߻��ϴ� ��, Ȥ�� ���� �߻��ϴ� �޼ҵ带 ȣ���ϴ� �� �� �� �� �������� �ݵ�� try~catch�� ó���ؾ��Ѵ�. 
		try {
			obj.test2("test1.txt");
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.���ϼ��� ��ȭ���ڸ� �����ؼ� ������ ���� �����ϵ��� ó��--->A���");
		}
		
		try {
			obj.test2("test2.txt");
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.������ default�� ������ ������ ����ǵ��� ó��-->B���");
		}
		
	}

}
