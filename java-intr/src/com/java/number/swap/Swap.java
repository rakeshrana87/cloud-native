package com.java.number.swap;

public class Swap {
	
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		new Swap().swapNumbers(a, b);
	}

public void swapNumbers(int a, int b) {
	System.out.println("print original numbers: " + a +", " + b);
b =a +b;
a= b-a;
b=b-a;
	System.out.println("print swap numbers: " + a +", " + b);
}
}
