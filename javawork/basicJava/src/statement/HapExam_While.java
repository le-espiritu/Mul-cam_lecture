package statement;
//HapExam�� while������ �����ϱ�
public class HapExam_While {
	public static void main(String[] args) {
		int sum = 0;//����
		int evenSum = 0 ; //¦����
		int oddSum = 0 ;//Ȧ����
		int i=1;
		while(i<=100) { //1���� 100���� �ݺ��ؼ� �����ϸ� �۾�
			sum = sum+i;
			if(i%2==0) {
				evenSum = evenSum+i;
			}else {
				oddSum = oddSum + i;
			}
			i++;
		}
		System.out.println("����:"+sum);
		System.out.println("¦����:"+evenSum);
		System.out.println("Ȧ����:"+oddSum);
	}
}
