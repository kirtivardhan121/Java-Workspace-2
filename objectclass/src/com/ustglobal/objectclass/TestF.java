package com.ustglobal.objectclass;

public class TestF {

	public static void main(String[] args) {
		
		Cow c1 = new Cow(10, "Gauri", 20000);
		Cow c2 = new Cow(20, "Ganga", 10000);
		Cow c3 = new Cow(10, "Gauri", 20000);
		Cow c4 = c3;
		
		boolean isEqual = c1.equals(c2);
		
		System.out.println(c1.equals(c3));
		System.out.println(c4.equals(c4));
		
		System.out.println(isEqual);
	}
}
