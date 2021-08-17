package com.java.principle.overiding;

public class Child extends A {
public static void main(String[] args) {
}


private void m1() {
	System.out.println("i am in m1");
}
// can increase the visibilty
	/*
	 * public void m2() { System.out.println("I am in M2 protected."); }
	 */

// can not reduce the visibilty 

// it can throw  unchecked exception not check one of supper method is not throwing excption 
public void m3() throws RuntimeException{
	System.out.println("I am in M3 of Child");
}
// compile error when override static method and make it non static
	
	  public static void m4() { System.out.println("I am in M4 of child"); }
	  //Rule#2 : If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception. 
	  //Throwing parent exception in Exception hierarchy will lead to compile time error.Also there is no issue if subclass overridden method is not throwing any exception.
	  public  void m5()  {
			System.out.println("I am in M5 of A");
		}
}
