package com.inteface.Lamda;

interface Lamda {

	
	void dog();
}
interface Clculator{
	int calc(int a,int b);
}
interface checker{
	boolean check(int a3);
}
	class LamdaMaster{
	public static void main(String[] args) {
		
	//	int a3[]= {2,4,5,6,90,89,78,5,4};
		
		//checker ce=()->
		
		
		
		
		
		//Lamda d=()->{System.out.println("hello");};
		
		Clculator c=(a,b)->{return a+b;};
		Clculator c1=(a,b)->{return a-b;};
		Clculator c2=(a,b)-> a*b;
		System.out.println(c.calc(2, 3));
		System.out.println(c1.calc(5, 2));
		System.out.println(c2.calc(5, 7));
	}
}
