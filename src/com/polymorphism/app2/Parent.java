package com.polymorphism.app2;

public class Parent {

	public static void m1() {
		System.out.println("Parent static m1 method...");
	}

}

class child extends Parent{
	public static void m1() {
		System.out.println("child static m1 method...");
	}
}

class main{
	public static void main(String[] args) {
		
		Parent p= new child();
		p.m1();
	}
}
