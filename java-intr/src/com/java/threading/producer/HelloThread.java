package com.java.threading.producer;

public class HelloThread  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread job is done");
	}

}
