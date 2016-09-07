package com.example.inheritance;

public class CalleeImpl {
	public void foo(Object o){
		System.out.println("object parameter");
	}
	public void foo(String s){
		System.out.println("String parameters");
	}
	public void foo(Integer i){
		System.out.println( "integer parameter");
		System.out.println("in int");
	}
	

}
