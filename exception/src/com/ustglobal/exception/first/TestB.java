package com.ustglobal.exception.first;

public class TestB {

	public static void main(String[] args) {

		System.out.println("Main Ended");

		int a = 10;
		int b = 0;

		try {
			b = a/0;
			System.out.println(b);
			System.out.println("Hello");
		}catch (ArithmeticException ae) {
			System.out.println("Nuber is dividd by Zero");
		}
		System.out.println("Main Ended");
	}
}