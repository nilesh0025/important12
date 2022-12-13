package com.nilesh;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		double a=sc.nextDouble();
		System.out.println("Enter Second number:");
		double b=sc.nextDouble();
		
		 System.out.println("Select operation");
	      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
	      char ch = sc.next().charAt(0);
	      switch(ch) {
	         case 'a' :
	         System.out.println("Sum of the given two numbers: "+(a+b));
	         break;
	         case 's' :
	         System.out.println("Difference between the two numbers: "+(a-b));
	         break;
	         case 'm' :
	         System.out.println("Product of the two numbers: "+(a*b));
	         case 'd' :
	         System.out.println("Result of the division: "+(a/b));
	         break;
	         default :
	         System.out.println("Invalid grade");
	      }
	   }
	
		

	}


