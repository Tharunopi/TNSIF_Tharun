package com.tnsif.day9.interfaces.wrapperclaaser;

public class Wrapperclass_demo {
	public static void main (String[] args) {
		Integer i = new Integer(8);
		System.out.println(i);
		int b = i.intValue();
		System.out.println(b);
		
		int a = 100;
		Integer kl = a;
		System.out.println(kl);
		System.out.println(a);
		String f="selvas";
		for(int l=f.length()-1;l>=0;l--) {
			System.out.println(f.charAt(l));
			
		}
	}
}
