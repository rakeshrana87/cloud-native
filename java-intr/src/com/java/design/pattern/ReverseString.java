package com.java.design.pattern;

public class ReverseString {
public static void main(String[] args) {
	 String input ="1234512345";
	 int j=input.length()-1;
	 System.out.println("input length: " + input.length() + "value of j: " + j);
	StringBuffer stf = new StringBuffer();
	 while(j>=0) {
		 
		 stf=stf.append(input.charAt(j)); 
		 j--;
	 }
	 System.out.println("print: " + stf.toString());
	 String s= "hello ";
}
}
