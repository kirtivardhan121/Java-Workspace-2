package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(01, "Veer");
		Employee e2 = new Employee(02, "Yuvi");
		Employee e3 = new Employee(03 , "Dhoni");
		Employee e4 = new Employee(05, "Kohli");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		Comparator<Employee> cmp = (e5 , e6) -> {
			return e5.name.compareTo(e6.name);
		};

		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());

		Iterator<Employee> it = l.iterator();
		
		System.out.println("Sorted ------------->");
		
		while(it.hasNext()) {
			Employee i = it.next();
			System.out.println("Id is " +i.id);
			System.out.println("Name is " +i.name);
			System.out.println("============================");
		}
	}
}
