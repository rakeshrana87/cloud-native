package com.java.principle.overiding;

public class A {
public static void main(String[] args) {
}

private void m1() {
	System.out.println("i am in m1");
}

protected void m2() {
	System.out.println("I am in M2 protected.");
}


public void m3() {
	System.out.println("I am in M3 of A");
}

public static void m4() {
	System.out.println("I am in M4 of A");
}

public  void m5() throws Exception {
	System.out.println("I am in M5 of A");
}
}
