package WeekOneBasics;

import java.util.Arrays;

public class ArrayCheck {

	public static void main(String[] args) {
		int[] listA = {5, 10, 15, 20, 25, 30, 35};
		int[] listB = {4, 5, 1, 10, 22, 20, 30};
		int[] listC = new int[listA.length];
		
		int i = 0;
		for (int a: listA) {
			for (int b: listB) if (a == b) listC[i++] = a;
		}
		System.out.println(Arrays.toString(listC));
	}

}
