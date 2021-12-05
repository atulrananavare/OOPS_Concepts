package com.abstraction.app3;

public abstract class AbstractClass {

	public void m1() {
		System.out.println("m1 of abstract method");
	}
	
	abstract void m2();
	abstract void m3();
}

class A extends AbstractClass{

	@Override
	void m2() {
		System.out.println("A class m2 method");
		
	}

	@Override
	void m3() {
	
		
	}
	
}

class B extends A{
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m2();
	}
}


