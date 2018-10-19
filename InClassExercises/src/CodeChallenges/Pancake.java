package CodeChallenges;

import java.util.Arrays;

public class Pancake {

	public static void main(String[] args) {
		int[] arr = {1, 5, 4, 3, 2};
		// sorts into 1, 2, 3, 4, 5
		System.out.println(Arrays.toString(pancakeSort(arr)));
		
		int[] arr2 = {10, 5, 50, 34};
		// sorts into 5, 10, 34, 50
		System.out.println(Arrays.toString(pancakeSort(arr2)));
		
		int[] arr3 = {10, 0, 100, 1000, 10000};
		// sorts into 0, 10,
		System.out.println(Arrays.toString(pancakeSort(arr3)));
	}


	public static void flip(int [] arr, int k) {
		int lo = 0;
        int hi = k;
        while(lo < hi) {
            int temp = arr[lo];
            arr[lo++] = arr[hi];
            arr[hi--] = temp;
        }
	}
	
	static int[] pancakeSort(int[] arr) {
		// in case of all sorted by flip needs to happen once
		// max needs to be at the end
		
		for (int i = arr.length-1; i > 0 ; i--) {
			int currentMaxIndex = findMax(arr, i+1);
			if (currentMaxIndex != i) {
				flip(arr, currentMaxIndex);
				flip(arr, i);
			}
		}
		return arr;
	}
	
    static int findMax(int arr[], int n) 
    { 
        int mi, i; 
        for (mi = 0, i = 0; i < n; ++i) 
            if (arr[i] > arr[mi]) 
                mi = i; 
        return mi; 
    } 

}
