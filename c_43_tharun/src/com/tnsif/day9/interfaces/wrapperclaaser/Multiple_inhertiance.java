package com.tnsif.day9.interfaces.wrapperclaaser;

public class Multiple_inhertiance {
	public static void main(String[] args) {
		ichigo a = new ichigo();
		a.attack();
	}
}

interface geranald{
	public void show();
}

interface lilly_baro{
	public void attack();
}

class hecomundo{
	public void attack() {
		System.out.println("x - axis");
	}
}

class ichigo extends hecomundo implements geranald, lilly_baro{
//	@Override
	public void show() {
		System.out.println("the miracle");
	}
//	@Override
	public void attack() {
		System.out.println("cero ----------------> ---------------->");
	}
	
	public void bankai() {
		System.out.println("getsuga tensho");
	}
}