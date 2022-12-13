package com.nilesh;

import java.util.Scanner;

public class Squre_root_number {

	public static void main(String[] args) {
	
		System.out.print("Enter a number: ");  
		
		Scanner sc = new Scanner(System.in);  
		
		int n = sc.nextInt();  
		
		System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
		
		}  
	
	
		 
	public static double squareRoot(int n)   
	{  

	double t;  
	double s=n/2;  
	do   
	{  
	t=s;  
	s=(t+(n/t))/2;  
	}   
	while((t-s)!= 0);  
	return s;  
	}  
		
		
	}


