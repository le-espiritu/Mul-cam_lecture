package basic;
/*
ScoreExam.java �ۼ�
1. ������ �� �� ����
2. ����, ����, ���� ������ ���Ƿ� ����
3. ��°���� ������ ���� �ۼ�
   [��°��]
   ���� : ________
   ��� : ________

   ���Ϸ� ����

*/
public class ScoreExam{
	public static void main(String[] args){
		int kor = 90;
		int math = 100;
		int eng = 90;
		int totalVal = kor + math + eng;
		//int avg = total/3;
		float avg = totalVal/3;
		System.out.println("����:"+ totalVal);
		System.out.println("���:"+ avg);

	}
}