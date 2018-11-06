package com.iofiles;

import java.util.Arrays;
import java.util.List;

public class mainCalc {

	public static void main(String[] args) {
		// Initializing of calc class object
		Calc myCalc = new Calc();
		
		// Instatiation of list of integers
		List<Integer> nums = Arrays.asList(1,2,3,4);
		// Chain method
		myCalc.performSum(nums).displaySum(); // Expected Sum = 10
		
		// Chain method 2
		String operators = "+*/-%";
		for(int i = 0; i < operators.length(); i++) {
			System.out.printf("%c: ", operators.charAt(i)); 
			myCalc.numberToPerformOn(5, 0).operator(operators.charAt(i));
		}
	}

}
