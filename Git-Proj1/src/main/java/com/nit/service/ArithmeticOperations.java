package com.nit.service;

public class ArithmeticOperations {
	
    public int sum(int x,int y) {
    	return x+y;
    }
    public int sub(int x,int y) {
    	return x-y;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperations ar=new ArithmeticOperations();
		int z= ar.sum(15, 35);
		int s=ar.sub(50, 40);
		System.out.println(z);
		System.out.println(s);
		
		
		

	}

}
