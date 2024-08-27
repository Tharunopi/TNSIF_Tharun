package com.tnsif.day11.Exception_Handling;

public class Throw_Demo {
	public static void demo() {
		int a = 5/0;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		try {
//			demo();
			throw new StringIndexOutOfBoundsException("watch your head!");
		}
		
		catch (Exception e) {
			System.out.println("exception----> " + e);
		}
		
		finally {
			System.out.println("code executed successfully...");
		}
	}
}
