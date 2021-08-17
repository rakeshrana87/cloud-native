package com.java.file.report;

import java.util.Scanner;

public class ScannerDemo {

public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
	   String name = sc.nextLine();
	System.out.println("name: " + name);
	}
}
}
