package com.tnsif.Day8.Polymorphism;

public class overloading {
	int num1;
	int num2;
	int result;
	
	void sum(int a, int b) {
		num1 = a;
		num2 = b;
		result = num1 + num2;
		System.out.println(result);
	}
	
	void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String []args) {
		overloading a = new overloading();
		a.sum(10, 20);
		a.sum(10.01, 20);
	}
}
