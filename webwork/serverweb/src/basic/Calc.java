package basic;

public class Calc {
	public int calc(String opr,int num1,int num2) {
		int result = 0;
		switch(opr) {
	    	case "+":
	    		result = num1+num2;
	    		break;
	    	case "*":
	    		result = num1*num2;
	    		break;
	    	case "-":
	    		result = num1-num2;
	    		break;
	    	case "/":
	    		result = num1/num2;
	    		break;
		}
		return result;
	}
}
