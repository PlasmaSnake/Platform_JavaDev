package WeekOneBasics;

import java.util.Scanner;

public class RandomSuitNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a suit: Hearts, Clubs, Diamonds or Spades: ");
		String suit = in.nextLine();
		if (suit.toLowerCase().equals("hearts")) System.out.printf("%s: The number is 0.", suit);
		if (suit.toLowerCase().equals("clubs")) System.out.printf("%s: The number is 1.", suit);
		if (suit.toLowerCase().equals("spades")) System.out.printf("%s: The number is 2.", suit);
		if (suit.toLowerCase().equals("diamonds")) System.out.printf("%s: The number is 3.", suit);
	}

}
