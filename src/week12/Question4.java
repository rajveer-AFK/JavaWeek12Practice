package week12;

public class Question4 {

	public static void main(String[] args) {
		
		int[] numbersArray = {2,7,4,14,24,69,12,84};
		
		System.out.println(recursiveArraySearch(numbersArray, 2, 0));

	}
	
	public static boolean recursiveArraySearch(int[] array, int searchValue, int start) {
		if(start == array.length) {
			return false;
		}
		else if(array[start] == searchValue) {
			return true;
		}
		else {
			return recursiveArraySearch(array, searchValue, start+1);
		}
	}
	
}
