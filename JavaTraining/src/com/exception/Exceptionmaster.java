package com.exception;

import java.util.Scanner;

class Master{
	int d;
}

public class Exceptionmaster {
   public static void main(String[] args) {
	
	   
	   Scanner s=new Scanner(System.in) ;
	   
		   System.out.println("first number");
	   int a=s.nextInt();
	   System.out.println("second number");
	   int b=s.nextInt();
	   int a1[]= {2,4};
	   try {
		   Master m=null;
	   System.out.println(a+"a divided"+b+" is :"+(a/b));
	   
	   System.out.println(a1[1]);
	   System.out.println(m.d);
	   
	   }
	   catch(ArithmeticException e){
		   System.out.println(e.getMessage());
		   
	   }catch(ArrayIndexOutOfBoundsException e){
		   System.out.println(e.getMessage());
		   
	   }catch(NullPointerException n) {
		   System.out.println(n.getMessage());
	   }
	   System.out.println("hello master devoloper");
	   
}
}
