package com.ustglobal.arrays;

public class TestC {

	public static void main(String[] args) {

		int[] num = {10,20,30,40};
		System.out.println(num[2]);
		//		System.out.println(num[10]);  ArrayOutOfBoundsException

		String[] name = {"Kirti" , "Raj" , "Nishu"};
		System.out.println(name[2]);

		receive(num);

		receive(name);

		int[] values = getAray();
		for(int val : values) {
			System.out.println(val);
		}

		String[] jobs = getArray();
		for(String job : jobs) {
			System.out.println(job);
		}
	}

	static void receive(int[] numbers) {

		for(int nums : numbers) {
			System.out.println(nums);
		}
	}

	static void receive(String[] names) {
		for(String str1 : names) {
			System.out.println(str1);
		}
	}

	static int[] getAray() {
		int[] values = {20,30,40,50};
		return values;
	}

	static String[] getArray() {
		String[] job = {"Developer", "Tester"};
		return job;

	}

}