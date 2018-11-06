package com.iofiles;

import java.util.List;

public class Calc {
	
	private int sum = 0;
	private int numA = 0;
	private int numB = 0;
	
	public Calc performSum(List<Integer> nums) {
		for(int n:nums) sum+=n;
		return this;
	}
	public void displaySum() {
		System.out.println(sum);
	}
	public Calc numberToPerformOn(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
		return this;
	}
	
	public void operator(char op) {
		if(op == '+') System.out.println(numA+numB);
		else if(op == '-') System.out.println(numA-numB);
		else if(op == '*') System.out.println(numA*numB);
		else if(numB != 0) {
			if(op == '/') System.out.println(numA/numB);
			else if(op == '%') System.out.println(numA%numB);
		}
		else System.out.println();
	}
	
	public void resetCalc() {
		sum = 0;
		numA = 0;
		numB = 0;
	}
}
