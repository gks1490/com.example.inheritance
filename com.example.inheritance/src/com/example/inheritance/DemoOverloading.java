package com.example.inheritance;

public class DemoOverloading {
	public static void main(String[] args) {
		
	
	Child c = new Child();
	c.m1();
//	p.m1();
	}
}

class Parent{
private	void m1(){
		System.out.println("Hello Prent");
	}
	}
class Child extends Parent{
	 public void m1( ){
		System.out.println("Hello child");
		//return 10;
	}
}
