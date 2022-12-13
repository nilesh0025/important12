package com.nilesh;

public class Digitsum {
		
	
 public static boolean Isprime(int n) {
		 
		 boolean flag =true;
		  
		 for(int i=2;i<=n-1;i++) {
			 if(n%i==0) {
				 flag= false;
				 
				 break;
				 
		 }
		 }
		 return flag;
	 }
	

	public static void main(String[] args) {
		
		System.out.println(Digitsum.Isprime(7));
		
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a+" "+b);
		
	 for(int i=0;i<=10;i++) {
		 
		 c=a+b;
		 
		 a=b;
		 b=c;
		 
		 System.out.println(c);
		 
		
		 
		 
	 }
	 
	
	 }
	 
} 
	 
	 
		 
	 
		
		
		

	


