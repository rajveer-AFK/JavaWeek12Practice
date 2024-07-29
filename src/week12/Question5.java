package week12;

public class Question5 {

	public static void main(String[] args) {
		int[] numbersArray = {7,3,9,24,21,18,15,84};
		
		System.out.println("The largest number is: " + maxElement(numbersArray, 0, numbersArray[0])); 

	}
	
	public static int maxElement(int[] array, int start, int largestNumber) {
		if(start == array.length) {
			return largestNumber;
		}
		else {
			if(array[start] > largestNumber) {
				largestNumber = array[start];
			}
			return maxElement(array, start+1, largestNumber);
		}
	}
}
