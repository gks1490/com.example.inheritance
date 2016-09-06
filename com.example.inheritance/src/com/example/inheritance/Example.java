package com.example.inheritance;

public class Example {
	public static void main(String[] args) {
		
	
	Sample s = new Sample();
	}
}
	
	class Examp{
	 Examp() {
		// TODO Auto-generated constructor stub
		System.out.println("Example--non arg");
	}
	 Examp(int a){
		 System.out.println(20);
	 }
	}
class Sample extends Examp{
	public Sample() {
		//int a;
		// TODO Auto-generated constructor stub
		super(30);
		System.out.println("Sample-non argument");
	}
	Sample(int a){
		System.out.println("sample argument");
	}
	
}