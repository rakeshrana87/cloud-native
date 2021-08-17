package com.java.principle.overiding;

public class TestClass {
public static void main(String[] args) {
	A a =new A();
	//a.m3();
	A ab = new Child();
//	ab.m3();
	Child c = new Child();
	//c.m3();
	//both calling same method
	//c.m2();
	//ab.m2();
	
	// As per overriding rules this
    // should call to class Child static
    // overridden method. Since static
    // method can not be overridden, it
    // calls Parent's m4()
	ab.m4();
	
	//Overriding and synchronized/strictfp method : The presence of synchronized/strictfp modifier with method have no effect on the rules of overriding, i.e.
	//it’s possible that a synchronized/strictfp method can override a non synchronized/strictfp one and vice-versa.
}
}
