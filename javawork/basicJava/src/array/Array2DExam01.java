package array;

public class Array2DExam01 {
	public static void main(String[] args) {
		int[][] mynumArr = new int[5][5];
		
		int num = 1;
		//2�����迭�� ���� ����
		for(int i=0;i<mynumArr.length;i++) {
			for(int j=0;j<mynumArr[i].length;j++) {
				mynumArr[i][j] = num;
				num++;
			}
		}
		
		//2�����迭�� ����� ���� ������ ����ϱ�
		for(int i=0;i<mynumArr.length;i++) {
			for(int j=0;j<mynumArr[i].length;j++) {
				System.out.print(mynumArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
