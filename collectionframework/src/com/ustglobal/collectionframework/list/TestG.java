package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {

	public static void main(String[] args) {

		
		LinkedList li = new LinkedList<>();
		li.add(12);
		li.add(34.5);
		li.add("Nisha");
		li.add(true);
		li.add(null);
		
		for (int i = 0 ; i< li.size() ; i++) {

			System.out.println(li.get(i));
		}
		
		System.out.println("=========== Using for each ===========");
		
		for(Object object : li ) {
			System.out.println(object);
		}
		
		System.out.println("========== Using Iterator ==============");
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
		System.out.println("========== Using List Iterator ==========");
		
		ListIterator it1 = li.listIterator();
		while(it1.hasNext()) {
			Object o1 = it1.next();
			System.out.println(o1);
		}
	
		System.out.println("================ ListIterator backward ==========");
	}

}