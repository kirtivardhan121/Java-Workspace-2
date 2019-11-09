package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestF {

	public static void main(String[] args) {
		
		ArrayList<Marker> l = new ArrayList<Marker>();

		l.add(new Pen(20, "Red"));
		l.add(new Pen(20, "Blue"));
		l.add(new Pen(20, "Green"));
		l.add(new Pen(20, "Black"));
		
	
		System.out.println("Before Sorting ------------->");
		System.out.println(l);
		
		SortByPrice sb = new SortByPrice();
		Collections.sort(l, sb);
		System.out.println("After Sorting -------------->");
		System.out.println(l);
		
		
		

	}
	
	static void displayPendetails (LinkedList<Marker> m) {
		Iterator<Marker> it = m.iterator();
			while(it.hasNext()) {
			Marker lp = it.next();
			System.out.println("Price is " +lp.price);
			System.out.println("Brand is " +lp.color);
		}
}
}