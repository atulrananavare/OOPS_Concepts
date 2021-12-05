package com.inheritance.app1;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		

	}
	
	

}

class A{
	int i;
	A(int i){
		System.out.println("Class A");
	}
}

class B extends A{
	B(int i) {
		super(i);
		
	}

	int j;
	
}