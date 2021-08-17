package com.java.threading.method;

public class HelloThread  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread job is done");
	}

}
