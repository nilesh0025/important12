package com.nilesh;

public class myclass {
    
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	
	
	public static void main(String[] args) {
		int a =10;
		int b=20;
		int c=30;
		int d=40;
			
		
       System.out.println("hello");
       System.out.println(myclass.max(a, myclass.max(a, b)));
       
       System.out.println(myclass.max(a, myclass.max(b, myclass.max(c, d))));
     
       
	}

}
