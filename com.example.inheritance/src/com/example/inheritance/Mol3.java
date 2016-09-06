package com.example.inheritance;

public class Mol3 {

	static void m1(int a){
		System.out.println("int-args");
	}
	static void m1(float a){
		System.out.println("float-args");
	}
	public static void main(String[] args) {
		m1(10);
		m1('a');
		m1(50L);
		//Long l = 50;
		
	} 
	
}
