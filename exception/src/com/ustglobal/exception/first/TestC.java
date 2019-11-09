package com.ustglobal.exception.first;

public class TestC {

	public static void main(String[] args) {

		System.out.println("Main Started");

		int[] a = {10,20,50,60};
		int b = 10;

		try {
			System.out.println(a[4]);
			System.out.println(b/0);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index is not Present");
		}catch (ArithmeticException ae) {
			System.out.println("Number is dividd by Zero");
		}

		System.out.println("Main Ended");
	}
}
