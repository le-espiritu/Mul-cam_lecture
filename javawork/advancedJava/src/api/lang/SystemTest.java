package api.lang;
//SystemŬ����
public class SystemTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long start = System.currentTimeMillis(); //����ð��� ���� milli (1/1000)
		long start = System.nanoTime();//1/1000000000
		int sum=0;
		for(int i=0;i<=10000;i++) {
			System.out.println(i);
			sum =sum+i;
		}
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		System.out.println("���α׷� ����ð�:"+(end-start));

	}

}
