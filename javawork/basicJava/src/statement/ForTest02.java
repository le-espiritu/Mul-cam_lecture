package statement;
//for���� ��ø�ؼ� ����ϱ�
public class ForTest02 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				if(i==3 & row==3) {
					System.out.print("��\t");
				}else {
					System.out.print("2\t");
				}
			}
			System.out.println();
		}
		System.out.println("================================");
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=5;i++) {
				//System.out.println("row="+row+",i="+i);
				if(i==row) {
					System.out.print("��\t");
				}else {
					System.out.print("2\t");
				}
			}
			System.out.println();
		}
	}
}
