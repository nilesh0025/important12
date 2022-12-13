package com.oops;

 class A{
   
	int i=10;
	
	void f1() {
		System.out.println("class A");
	}
}
 class B extends A {
	
	 int i=20;
	 
	 void f1() {
		 System.out.println("class B");
	 }}
	public  class C{
	 public static void main(String[] args) {
		
		 A a=new B();
		 
		 System.out.println(a.i);
		 a.f1();
	}
}