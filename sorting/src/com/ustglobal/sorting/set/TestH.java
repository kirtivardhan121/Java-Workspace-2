package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH {

	public static void main(String[] args) {
		
		TreeSet<Employee> hs = new TreeSet<Employee>();

		Employee e1 = new Employee(102, "Kirti", 457909);
		Employee e2 = new Employee(11, "Raj", 457769);
		Employee e3 = new Employee(101, "rohit", 457909);
		Employee e4 = new Employee(100, "Utsaw", 78009);
		Employee e5 = new Employee(100, "Utsaw", 78009);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);


		System.out.println("************** Using Iterator ****************");

		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is " +e.id);
			System.out.println("Name is " +e.name);
			System.out.println("Salary is " +e.salary);

			System.out.println("===========================================");


		}
	}
}
