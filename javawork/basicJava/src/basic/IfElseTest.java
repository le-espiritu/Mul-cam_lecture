package basic;
/*
  IfElseTest.java

  ������ ������ �� �ִ� ������ �����ϰ� ������ ���� ������·� ��µǵ��� �ۼ��ϼ���
  if ~ else���� �̿��ؼ� �۾��ϱ�
   90�̻���  pass�� ���
   90�̸��� fail�� ���

  [���]
  ___������ ____

*/
public class IfElseTest{
	public static void main(String[] args){ //java application�� ����Ǵ� ������
		int jumsu = 80;
		jumsu = 100; //80���� �ʱ�ȭ�Ǿ� �ִ� jumsu������ 100�� ���Ҵ�, ���� �������� �Ҵ��� ������ �ν�
		             //, �����Ǹ� �ϱ� ���ؼ��� ������ Ÿ���� �������� �ʰ� ���� �Ҵ��Ѵ�.
					 //Ÿ���� �߰��ϴ� ���� ���ο� ������ �����ϰڴٴ� �ǹ�
		if(jumsu>=90){
			System.out.println(jumsu+"������ pass"); 
		}else{
			System.out.println(jumsu+"������ fail"); 
		}
	}
}


















