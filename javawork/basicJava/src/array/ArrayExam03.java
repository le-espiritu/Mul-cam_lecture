package array;
public class ArrayExam03 {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int evenSum = 0 ; //¦����
		int oddSum = 0 ;//Ȧ����
		for(int i=0;i<ia.length;i++) {
			
			if(ia[i]%2==0) {
				evenSum = evenSum+ia[i];
			}else {
				oddSum = oddSum + ia[i];
			}
		}
		System.out.println("(�迭 ia)");
		System.out.println("Ȧ������ : "+oddSum);
		System.out.println("¦������ : "+evenSum);
		
		
		
		evenSum = 0 ; //¦����
		oddSum = 0 ;//Ȧ����
		for(int i=0;i<ib.length;i++) {
			
			if(ib[i]%2==0) {
				evenSum = evenSum+ib[i];
			}else {
				oddSum = oddSum + ib[i];
			}
		}
		System.out.println("(�迭 ib)");
		System.out.println("Ȧ������ : "+oddSum);
		System.out.println("¦������ : "+evenSum);
	}
	
	
}
