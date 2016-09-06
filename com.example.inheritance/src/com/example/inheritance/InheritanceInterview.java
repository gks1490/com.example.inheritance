package com.example.inheritance;


class A{
	A(int a){
		System.out.println(" parameter constructor");
	}
//	A(){
//		
//	}
}
class B extends A{
B(){
	this(10);
	System.out.println(" B non parameter");
	}
	
	B(int a){
		super(10);
		System.out.println("B parameter");
		
	}
	
}

public class InheritanceInterview {
	public static void main(String[] args) {
		
	
	B b = new B();
	}

}
