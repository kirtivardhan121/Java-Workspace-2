package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Pune", 451076);
		lh.put("Mumbai", 467844);

		System.out.println(lh);

		System.out.println("========================");

		Set<String> s = lh.keySet();
		for(String key : s) {
			System.out.println("Key " +key);
		}

		System.out.println("=========================");

		Collection<Integer> c = lh.values();
		for(Integer value : c) {
			System.out.println("Values " +value);
		}
	
		System.out.println("=========================");
		
		
	}
}