package com.ustglobal.objectclass;

public class TestD {

	public static void main(String[] args) {

		Student s1 = new Student(10, "vardhan" , 87.6);
		int h = s1.hashCode();
		System.out.println(h);
		System.out.println(s1);
//		s1.printDetails();
	}
}