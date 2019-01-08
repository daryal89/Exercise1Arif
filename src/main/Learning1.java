package main;

public class Learning1 {
	// variables
	// 1. instance variable
	int a;
	double d;
	float f;
	boolean b;
	char c;
	String str; //class type

	// 2. static variable
	public static String name="arif hussain";

	// 3. local variable
	public void add() {
		int i = 10;
		int j = 20;
		int k = i + j;	
		System.out.println("add: "+k);
	}
	
	public static void main(String[] args) {
		System.out.println("I'm Arif"); //I'm arif
		System.out.println(name);
		
		Learning1 obj1 = new Learning1();
		System.out.println("Int: "+ obj1.a);
		System.out.println("boolean: "+obj1.b);
		System.out.println("char: "+obj1.c);
		System.out.println("doble: "+obj1.d);
		System.out.println("float: "+obj1.f);
		System.out.println("String: "+obj1.str);
		
		
	}

	

}
