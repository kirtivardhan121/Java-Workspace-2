package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {


		
		ArrayList<Student> al = new ArrayList<>();

		al.add(new Student(5, "Vikram", 69.69));
		al.add(new Student(3, "Vijay", 31.9));
		al.add(new Student(2 , "Akshay", 20.9));
		al.add(new Student(1, "Aishu", 55.55));
		al.add(new Student(7 , "Yash", 15.44));


		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudent(al);
//		h.displayPassedStudent(al);
		h.topperOfClass(al);

	}
}