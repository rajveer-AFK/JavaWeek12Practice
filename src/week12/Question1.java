package week12;

public class Question1 {

	public static void main(String[] args) {
		System.out.println(recursiveMultiplication(6,12));
		
	}
	
	public static int recursiveMultiplication(int x, int y) {
		if(x == 0 || y == 0) {
			return 0;
		}
		else {
			return y + recursiveMultiplication(x-1, y);
		}
	}

}
