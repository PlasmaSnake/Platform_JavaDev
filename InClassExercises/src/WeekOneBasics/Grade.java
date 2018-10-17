package WeekOneBasics;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number grade to find a letter grade: ");
		int grade = in.nextInt();
		if (grade < 0 || grade > 100) {
			System.out.println("Invalid number");
		} else {
			if (grade >= 90) System.out.println("A");
			else if (grade >= 80) System.out.println("B");
			else if (grade >= 70) System.out.println("C");
			else if (grade >= 60) System.out.println("D");
			else System.out.println("F");
		}
		
	}
}
