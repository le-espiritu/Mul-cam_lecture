package array;
//2�����迭�� ����� ������ �ʱ�ȭ�� �� ���� �۾��ϱ�
public class Array2DTest02 {
	public static void main(String[] args) {

		int[][] data2 = new int[][] {   //data = new int[4][5];
				{97,88,77,66,88},
				{100,88,95,66,77},
				{95,99,77,66,56},
				{89,98,77,66,100}
			};
		int[][] data = {   //data = new int[4][5];
					{97,88,77,66,88},
					{100,88,95,66,77},
					{95,99,77,66,56},
					{89,98,77,66,100}
				};
		//1�����迭 hapdata�� �����ϰ� 2�����迭(data)�� �� ��ҿ� �����ϴ� �迭�� ��ü ���� �����ϰ� ����ϼ���
	    //0. hapdata 1�����迭 �����ϱ�
		int[] hapdata = new int[data.length];
		int sum = 0;
		for(int i=0;i<data.length;i++) {
			sum=0;
			for(int j=0;j<data[i].length;j++) {
				//1. 2��for�� �ȿ��� 2�����迭�� �� ����� ���� ���Ѵ�.
				sum = sum + data[i][j];
			}
			//2. hapdata�� 1������ ���� ����� ����
			hapdata[i] = sum;
		}
		//3. ���ο�for������ hapdata�� ����� �� ���� ����ϱ�	
		for(int i=0;i<hapdata.length;i++) {
			System.out.print(hapdata[i]+"\t");
		}
	}
}







