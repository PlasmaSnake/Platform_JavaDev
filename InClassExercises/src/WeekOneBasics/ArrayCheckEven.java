package WeekOneBasics;

import java.util.Arrays;

public class ArrayCheckEven {

	public static void main(String[] args) {
		int[] listA = {5, 10, 15, 20, 25, 30, 35};
		int[] listB = {4, 5, 1, 10, 22, 20, 30};
		int[] listC = new int[listA.length+listB.length];
		
		int i = 0;
		for (int a: listA) {
			if (a % 2 == 0) listC[i++] = a;
		}
		for (int b: listB) {
			if (b % 2 == 0) listC[i++] = b;
		}
		System.out.println(Arrays.toString(listC));
	}

}
