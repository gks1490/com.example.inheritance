package com.example.inheritance;

public class MoL1 {

	void m1(int a){
		System.out.println("int--args");
	}
	void m1(char ch){
		System.out.println("char--args");
	}
	public static void main(String[] args) {
		
		MoL1 a1 = new MoL1();
//		a1.m1(99); // int- args
//		a1.m1('c');// char -args
//		a1.m1((char)100);//char-args
//		a1.m1((int)'d');// int -args
		System.out.println();
		System.out.println();
		int i = 97;
		int i2 = 'a';
		char ch = 98;
		char ch2= 'b';
//		a1.m1(i);// int -args
//		a1.m1(i2); // int -arg
//		a1.m1(ch);//char-args
//		a1.m1(ch2);
		System.out.println();
		a1.m1((char)i);
		a1.m1((int)ch);
		System.out.println();
		a1.m1(i+i2);
		a1.m1(ch+ch2);
		System.out.println();
		a1.m1(10+'a');
		a1.m1('a'+'b');
		a1.m1((char)('a'+'b'));
		a1.m1((char)'a'+'b');
		System.out.println();
		a1.m1(m2());
		a1.m1(m3());
	}
	
	static int m2(){
		return 'a';
	}
	static char m3(){
		return 97;
	}
}
