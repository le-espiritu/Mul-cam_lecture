package array;
//�������迭
//�������迭�� ����ϸ鼭 �迭�� ����� �ٸ��� �����ϰ� ����� �� �ִ�.
//�迭�� ����� ó������ �������� �ʰ� �����Ҷ� �����ؼ� �Ҵ��� �� �ֵ��� ���� ����
public class Array2DTest03 {
	public static void main(String[] args) {
		//������ �迭�� ����� ��� 2�����迭�� ����� ������ ����� ����� ������� �ʴ´�.
		char[][] myarr = new char[5][];
		myarr[0] = new char[1];
		myarr[1] = new char[2];
		myarr[2] = new char[3];
		myarr[3] = new char[4];
		myarr[4] = new char[5];
		
		//2���� �����迭�� ���� �Ҵ�
		for(int i=0;i<myarr.length;i++) {
			for(int j=0;j<myarr[i].length;j++) {
				myarr[i][j] = '*';
			}
		}
		
		//2���� �����迭���� ���� ������ ����ϱ�
		for(int i=0;i<myarr.length;i++) {
			for(int j=0;j<myarr[i].length;j++) {
				System.out.print(myarr[i][j]);
			}
			System.out.println();
		}
	}
}
