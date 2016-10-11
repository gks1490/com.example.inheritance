package com.example.inheritance;

public class Test {
	public void methodOne(String args){
		//added comment here
		System.out.println("string args");
	}
	public void methodOne(Object ob){
		System.out.println("Object args");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.methodOne(new Object());
		t.methodOne("Bhaskar");
		t.methodOne(null);
	}
	

}
