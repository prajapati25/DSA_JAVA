package exercises;

import java.util.Scanner;

public class FactorialUsingRecursion {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Enter a no.");
		scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int fact = factorial(num);
		System.out.format("factorial of  %d is %d" , num,fact);
		

	}

	private static int factorial(int num) {
		if(num==0 ||num ==1) return 1;
		return num*factorial(num-1) ;
	}

}
