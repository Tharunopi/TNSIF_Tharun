package com.tnsif.day9.interfaces.wrapperclaaser;

interface one{
	int age = 10;    //this is default defined as final & static
	void show();
}

class two implements one{
//	@Override
	public void show(){
		System.out.println("yhwach can destroy universe by presence");
	}
	
}

public class Interface_demo {
	public static void main (String[] args) {
		jogan a = new jogan();
		a.show();
	}
}

interface goku{
	void show();
}

class jogan implements goku{
	@Override
	public void show() {
		System.out.println("goku is defeated by yhwach");
	}
}
