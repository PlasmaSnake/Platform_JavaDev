package WeekOneBasics;

public class SecondLargestNumber {
	
	// not sorted with length n. find 2nd largest number
	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 10, 22, 20, 30};
		int max = 0, second = 0;
		
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) continue;
			second = Math.max(second, arr[i]);
		}	
		System.out.printf("The 2nd largest item in the array is %d", second);
	}
}