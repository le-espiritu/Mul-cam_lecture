package statement;

public class HapExam {
	public static void main(String[] args) {
		int sum = 0;//����
		int evenSum = 0 ; //¦����
		int oddSum = 0 ;//Ȧ����
		for(int i=1;i<=100;i++) {
			//������ �����ؾ� �ϴ� ������ 1���� 100���� ���� ���������� ó��
			sum = sum+i;
			//System.out.println("sum="+sum+",i="+i);
			//Ȧ������ ¦������ �˻��ؼ� ���� Ȧ���պ����� ¦���պ����� ���������� ó��
			if(i%2==0) {
				evenSum = evenSum+i;
			}else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("����:"+sum);
		System.out.println("¦����:"+evenSum);
		System.out.println("Ȧ����:"+oddSum);
		
	}
}
