package com.ustglobal.exception.first;

public class PayTM {

	void book() {

		System.out.println("payTM Started");
		
		IRCTC i = new IRCTC();
		i.confirm();

		System.out.println("payTM Ended");
	}
}