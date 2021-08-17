package com.java.equals.overrid;

public class Complex  {
	private double re,im;
	public Complex(double re , double in) {
		this.re=re;
	    this.im=in;
	}
	
	
public static void main(String[] args) {
	 Complex c1 = new Complex(10, 15);
     Complex c2 = new Complex(10, 15);
     if (c1 == c2) {
         System.out.println("Equal ");
     } else {
         System.out.println("Not Equal ");
     }
     
     if(c1.equals(c2)) {
    	 System.out.println("Equal overiide true ");
     }else {
    	 System.out.println("not equal to equals");
     }
     
}

@Override
public boolean equals(Object obj) {

	// If the object is compared with itself then return true
	if(obj==this) {
		return true;
	}
		
		if(!(obj instanceof Complex)) {
			return false;
		}
	
	Complex c = (Complex) obj;
	return (Double.compare(re,c.re ) ==0 & Double.compare(im,c.im )==0);
	
}
}
