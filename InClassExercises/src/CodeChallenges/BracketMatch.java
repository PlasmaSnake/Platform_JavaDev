package CodeChallenges;

import java.util.Stack;

public class BracketMatch {

	public static void main(String[] args) {
		System.out.println(bracketMatch("(()")); // Should be one
		System.out.println(bracketMatch("(())")); // 0
		System.out.println(bracketMatch("())(")); // 2
		System.out.println(bracketMatch("())())()))")); // 4
		System.out.println(bracketMatch(""));
		
		System.out.println();
		System.out.println(bracketMatchWOStack("(()")); // 1
		System.out.println(bracketMatchWOStack("(())")); // 0 
		System.out.println(bracketMatchWOStack("())(")); // 2
		System.out.println(bracketMatchWOStack("())())()))")); // 4
	}
	
	static int bracketMatch(String s) {
		Stack<Character>  bracketList = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(!bracketList.isEmpty() && 
					bracketList.contains('(') &&
					s.charAt(i) == ')') bracketList.remove(bracketList.lastIndexOf('('));
			else bracketList.push((s.charAt(i)));
		}
		
		return bracketList.size();
	}
	
	static int bracketMatchWOStack(String s) {
		int brackets = 0;
		int left = 0;
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				left++;
				brackets++;
			}
			
			else {
				//pop if there is a left bracket
				if(left > 0) {
					left--;
					brackets--;
				}
				else brackets++;
			}
		}
		
		return brackets;
	}
}
