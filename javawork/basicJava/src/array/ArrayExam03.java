package array;
public class ArrayExam03 {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int evenSum = 0 ; //Â¦¼öÇÕ
		int oddSum = 0 ;//È¦¼öÇÕ
		for(int i=0;i<ia.length;i++) {
			
			if(ia[i]%2==0) {
				evenSum = evenSum+ia[i];
			}else {
				oddSum = oddSum + ia[i];
			}
		}
		System.out.println("(¹è¿­ ia)");
		System.out.println("È¦¼öÀÇÇÕ : "+oddSum);
		System.out.println("Â¦¼öÀÇÇÕ : "+evenSum);
		
		
		
		evenSum = 0 ; //Â¦¼öÇÕ
		oddSum = 0 ;//È¦¼öÇÕ
		for(int i=0;i<ib.length;i++) {
			
			if(ib[i]%2==0) {
				evenSum = evenSum+ib[i];
			}else {
				oddSum = oddSum + ib[i];
			}
		}
		System.out.println("(¹è¿­ ib)");
		System.out.println("È¦¼öÀÇÇÕ : "+oddSum);
		System.out.println("Â¦¼öÀÇÇÕ : "+evenSum);
	}
	
	
}
