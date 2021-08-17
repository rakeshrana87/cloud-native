package com.java.threading.method;

public class Threads {

	public static void main(String[] args) {
		Runnable runnable = new HelloThread();
		Thread thread = new Thread(runnable);
		Thread threadLambda = new Thread(() ->System.out.println( "Hello World from Runnable!"));
		thread.start();
		threadLambda.start();
	}
}
