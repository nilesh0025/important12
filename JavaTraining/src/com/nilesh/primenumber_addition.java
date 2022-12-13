package com.nilesh;

import java.util.Scanner;

public class primenumber_addition {

		

	public static void main(String[] args) {
		
//    Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int sum=0,r=0;
		int num = 20, count;
      int sum=0;
		  for (int i = 1; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   
		   
		   }

		  }
		  }	 }

 	
 	
 	
 		
 	

	


