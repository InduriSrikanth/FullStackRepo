package com.nit.service;

public class ArithmeticOperations {
	
    public int sum(int x,int y) {
    	return x+y;
    }
    public int sub(int x,int y) {
    	return x-y;
    }
    public int mul(int x,int y) {
    	return x*y;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperations ar=new ArithmeticOperations();
		int z= ar.sum(15, 35);//venkat
		int s=ar.sub(50, 40);
		int c=ar.mul(15, 5);
		System.out.println(c);
		System.out.println(z);
		System.out.println(s);
		
		
	}

}
