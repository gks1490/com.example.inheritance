package com.example.inheritance;

public class Mol2Overloading {
	public static void main(String[] args) {
		
		CalleeImpl cl = new CalleeImpl();
		Object obj1 = new Object();
		Object obj2  = "HariKrishna";
		Object obj3 = new Integer(7729);
		cl.foo(new Object());
		cl.foo("harikrishna");
		cl.foo(new Integer(7729));
		System.out.println();
		cl.foo(obj1);
		cl.foo(obj2);
		cl.foo(obj3);
		System.out.println();
		cl.foo((String)obj2);
		cl.foo((Integer)obj3);
		System.out.println();
		//cl.foo((String)obj1);
		//cl.foo((Integer)obj1);
		cl.foo((String)obj3);
	}

}
