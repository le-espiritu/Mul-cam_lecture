package array;

public class ArgsExam1 {
	public static void main(String[] args) {
		//���ڸ� 5�� �Է� �޾� �հ� ����� ���ؼ� ����ϼ���.
		// - �����ϱ�
		// - for������ �۾�
		double avg = 0.0;
		int total = 0;//������ ������ ����
		for(int i=0;i<args.length;i++) {
			total = total + Integer.parseInt(args[i]);
		}
		avg = (double)total/args.length;
		System.out.println("�迭����� ����:"+total);
		System.out.println("�迭����� ���:"+(total/args.length));
		System.out.println("�迭����� ���:"+avg);

	}
}
