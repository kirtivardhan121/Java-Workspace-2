package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestK {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "Vardhan" , 54.7);
		Student s2 = new Student(102, "Kirti" , 74.7);
		Student s3 = new Student(103, "harsh" , 54.7);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
	
		for(int i = 0 ; i< al.size() ; i++) {
			Student s = al.get(i);
			System.out.println("Id is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Percentage is " +s.percentage);
		}
		
		System.out.println("========= for each ==================");
		
		for(Student st : al ) {
			System.out.println(st);
		}
		
	}
}