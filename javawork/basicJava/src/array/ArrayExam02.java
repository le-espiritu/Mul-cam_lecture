package array;

public class ArrayExam02 {
	public static void main(String[] args) {
		//int�� �迭������ �����ϰ� 
		//98,100,78,99,86���� �ʱ�ȭ
		//�迭�� ����� ������ �հ�� ����� ����ϱ�
		//[�������]
		//�迭����� ����:_____
		//�迭����� ���:_____
		int[] myarr = {98,100,78,99,86};
		double avg = 0.0;
		int total = 0;//������ ������ ����
		for(int i=0;i<myarr.length;i++) {
			total = total + myarr[i];
		}
		avg = (double)total/myarr.length;
		System.out.println("�迭����� ����:"+total);
		System.out.println("�迭����� ���:"+(total/myarr.length));
		System.out.println("�迭����� ���:"+avg);
	}
}
