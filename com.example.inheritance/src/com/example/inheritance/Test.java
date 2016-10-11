package com.example.inheritance;

public class Test {
	public void methodOne(String args){
		System.out.println("string args");
	}
	public void methodOne(Object ob){
		System.out.println("Object args");
	}
	
	public void m1(){
		System.err.println("m1()");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.methodOne(new Object());
		t.methodOne("Bhaskar");
		t.methodOne(null);
	}
	

}
