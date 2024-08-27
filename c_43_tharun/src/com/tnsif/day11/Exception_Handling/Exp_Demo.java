package com.tnsif.day11.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp_Demo {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
//		try {
//			System.out.println("enter the number");
//			int value = sc.nextInt();
//			String name = value%2 == 0 ? "is even": "is odd";
//			System.out.println(name);
//		}
//		
//		catch (InputMismatchException e) {
//			System.out.println("Invalid input!!!!!!!!!!");
//		}
//		
//		finally {
//			System.out.println("code execution is complete..");
//			sc.close();
//		}
		
		exp();
		
	}
	public static void exp() {
		Scanner  scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number");
			int value = scanner.nextInt();
		}
		
		catch (Exception e) {
			System.out.println("invalid input");
		}
	}
}
