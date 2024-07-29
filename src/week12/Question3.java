package week12;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer to return the sum of all integers from 1 up to the entered number: ");
		int number = input.nextInt();
		
		while(number < 1) {
			System.out.println("Invalid input, must be greater than 0. Enter again: ");
			number = input.nextInt();
		}
		input.close();
		
		System.out.println(recursiveSum(number));
	}
	
	public static int recursiveSum(int number) {
		if(number == 1) {
			return 1;
		}
		else {
			return number + recursiveSum(number-1);
		}
	}
}