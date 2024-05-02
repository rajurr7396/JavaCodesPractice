package systemNumbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		for(int i = 2; i< number; i++) {
			if (number % i==0) {
				System.out.println(number);
				
			}
			
		}

	}

}
