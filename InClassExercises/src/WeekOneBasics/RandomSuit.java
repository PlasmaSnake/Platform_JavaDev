package WeekOneBasics;

public class RandomSuit {

	public static void main(String[] args) {
		int number = (int)(Math.random()*3);
		if (number == 0) System.out.printf("%d: The suit is Hearts.", number);
		if (number == 1) System.out.printf("%d: The suit is Clubs.", number);
		if (number == 2) System.out.printf("%d: The suit is Spades.", number);
		if (number == 3) System.out.printf("%d: The suit is Diamonds.", number);

	}
}
