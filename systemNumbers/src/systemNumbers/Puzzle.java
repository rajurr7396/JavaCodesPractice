package systemNumbers;

import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = scanner.nextInt();
		puzzle1(marks);
		

	}
	
	public static void puzzle1(int marks) {
		if (marks < 30) {
			System.out.println("Fail");
		}
		else if (marks <= 30 && marks < 60) {
			System.out.println("Average");
		}
		else {
			System.out.println("Passed");
		}
				
		
	}

}
