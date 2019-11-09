package com.ustglobal.exception.first;

public class TicketTest {

	public static void main(String[] args) {

		PayTM p = new PayTM();

		try {
			p.book();
		
		}catch(ArithmeticException ae) {
			System.out.println("Exception Caught");
		
		}finally {
			System.out.println("Try Again");
		}
	}

}
