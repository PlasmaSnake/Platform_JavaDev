package CodeChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class PrampCodeChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] query = new int[in.nextInt()];
		for (int i = 0; i < query.length; i++) query[i] = in.nextInt();
		System.out.println(Arrays.toString(query));
		
		System.out.println(Arrays.toString(arrayOfArrayProduct(query)));
		
		System.out.println(Arrays.toString(arrayOfArrayProductWithDivision(query)));
		in.close();
		
	}
	  static int[] arrayOfArrayProduct(int[] arr) {
		    if (arr.length<=1) {
		      return new int[0];
		    }
		    int product = 1;
		    int[] result = new int[arr.length];

		    for (int i=0;i<arr.length;i++) {
		      result[i] = product;
		      product*=arr[i];
		    }
		    
		    product = 1;
		    for (int i=arr.length-2;i>=0;i--) {
		      product*=arr[i+1];
		      result[i]*=product;
		    }
		    return result;
		  }
	
	
	
	static int[] arrayOfArrayProductWithDivision(int[] arr) {
		int[] answers = new int[arr.length];
		int productOfAll = 1;
		int indexOfZero = -1;
		boolean moreZeroes = false;
		if (arr.length <= 1) return new int[1];
		
		
		// find answer of product of all arrays.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				//2 zeroes found will make product = 0 and exits loop
				if (indexOfZero >= 0) {
						productOfAll = 0;			
						moreZeroes = true;
						break;
				}
				// otherwise it will just have indexOfZero equal to the product
				indexOfZero = i;
				continue;
			}
			productOfAll*=arr[i];
		}
		// only the index with zero will have a number (if there are no more than 1 zero)
		if (indexOfZero >= 0) {
			if (!moreZeroes) answers[indexOfZero] = productOfAll;
			return answers;
		}
		// if no zero(s), proceed with division and filling of array.
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) answers[i] = productOfAll/arr[i];
			
		}
		return answers;
	}
}
