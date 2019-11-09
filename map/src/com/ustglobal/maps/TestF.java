package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		
		Student s1 = new Student(2, "Divya", 67.8);
		Student s2 = new Student(5, "Nisha", 76);
		Student s3 = new Student(3 , "Diksha", 92.0);
		Student s4 = new Student(6 , "Varsha", 66.8);
		Student s5 = new Student(4 , "Jaya", 89.0);
		Student s6 = new Student(8 , "Raveena", 56.9);
		Student s7 = new Student(9 , "Fio", 67.0);
		Student s8 = new Student(7 , "Vanshika", 45.0);
		Student s9 = new Student(1 , "Anshika", 93.0);
		
		ArrayList<Student> al =new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("First", al);
		hm.put("Second", al1);
		hm.put("Third", al2);
		
		ArrayList<Student> second = hm.get("Second");
		
		Iterator<Student> it = second.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Percentage is " +s.percentage);
			System.out.println("--------------------------------");
		}
		
		
	}
}
