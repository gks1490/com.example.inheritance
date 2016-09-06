package com.example.inheritance;

public class downcastingExample {
	public static void main(String[] args) {
		
		Test1 t = new ChildTest();
		//System.out.println(t.a);
		ChildTest ct = (ChildTest)t;
		System.out.println(ct.a);
	}

}
class Test1{
	int a=10;
	void m1(int a){
		this.a = a;
	}
}

class ChildTest extends Test1{
	int a = 20;
	void m1(int a){
		this.a = a;
	}
}

