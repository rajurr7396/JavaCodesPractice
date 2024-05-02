package systemNumbers;

import java.util.Scanner;

public class OperationsPuzzle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number1");
		int number1 = scanner.nextInt();
		System.out.println("Enter a number2");
		int number2 = scanner.nextInt();
		
		
		puzzle1(number1, number2);
			
	}

	public static void puzzle1(int number1, int number2) {
		System.out.println("Numbers are " +number1);
		System.out.println("Numbers are "+number2);
		
		Scanner scanner = new Scanner(System.in);
		
		int choice1 = scanner.nextInt();
		
		System.out.println("Addition" +choice1);
		
		int choice2 = scanner.nextInt();
		System.out.println("Subtraction" +choice2);
		int choice3 = scanner.nextInt();
		System.out.println("multiplication" +choice3);
		int choice4 = scanner.nextInt();
		System.out.println("division" +choice4);
		
		System.out.println("Enter a choice");
		int choice = scanner.nextInt();
		
		
		if (choice == choice1) {
			System.out.println(number1 + number2);
		}
		else if (choice == choice2) {
			System.out.println(number1 - number2);
		}
		else if (choice == choice3) {
			System.out.println(number1 * number2);
		}
		else if (choice == choice4) {
			System.out.println(number1 / number2);
		}
				
		
	}

}

