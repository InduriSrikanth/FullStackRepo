package com.nit.payment;

public class PaymentOperations {
	
	public String addPayment() {
		return "Payment added";
	}
	public static void main(String args[])
	{
		PaymentOperations po=new PaymentOperations();
		System.out.println(po.addPayment());
	}

}
