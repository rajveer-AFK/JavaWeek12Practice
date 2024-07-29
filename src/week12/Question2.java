package week12;

public class Question2 {

	public static void main(String[] args) {
		System.out.println(recursiveExponent(8,4));
		
	}
	
	public static int recursiveExponent(int number, int exponent) {
		if(exponent == 0) {
			return 1;
		}
		else {
			return number * recursiveExponent(number, exponent-1);
		}
	}
	
}
