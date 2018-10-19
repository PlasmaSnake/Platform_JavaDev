package WeekOneBasics;

public class WordReverser {

	public static void main(String[] args) {
		
		String s = "Hello class, lets think string manipulation"; 
		System.out.println(s);
		
		System.out.println(reverseWords(s));
	}
	
	static String reverseWords(String s) {
		String[] words = s.split(" ");
		String reversedWords = "";
		for(String word: words) {
			for (int i = word.length()-1; i >= 0; i--) {
				reversedWords += word.charAt(i);
			}
			reversedWords += " ";
		}
		return reversedWords;
	}
}
