package com.ustglobal.objectclass;

public class TestH {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p = new Person(101, "Raj");
		System.out.println("person id is " +p.id);
		System.out.println("person name is " +p.name);
		
		Object o = p.clone();
		Person p2 = (Person) o;
		System.out.println("Person2 id is " +p2.id);
		System.out.println("Person2 name is "+p2.name);
		
		p2.id = 102;
		p2.name = "Surya";
		
		System.out.println("===========After Clonning===============");
		
		System.out.println("person id is " +p.id);
		System.out.println("person id is " +p.name);
		System.out.println("Person2 id is " +p2.id);
		System.out.println("Person2 name is " +p2.name);
	}
}