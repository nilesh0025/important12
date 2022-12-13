package com.oops;

import java.util.Scanner;

public class Array {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	  int arr[]= {1,2,3,4,5};
    	  
    	  for(int i=0;i<arr.length;i++) {
    		  System.out.println("   "+arr[i]);
    	  }
    	  for(int a:arr) {
    		  System.out.print("  "+a);
    	  }
    	  for(int i=0;i<5;i++) {
    		  System.out.println(arr[i]);
    	  }
    	  
    	  int a[][]=new int [3][3];
    	  System.out.println("Please Enter Element of 3*3 Array:-");
    	  for(int i=0;i<3;i++) {
    		 
    		  for(int j=0;j<3;j++) {
    			  a[i][j]=sc.nextInt();
    		  }
    	  }
//    	  a[0][0]=1;
//    	  a[0][1]=2;
//    	  a[0][2]=3;
//    	  a[1][0]=4;
//    	  a[1][1]=5;
//    	  a[1][2]=6;
//    	  a[2][0]=7;
//    	  a[2][1]=8;
//    	  a[2][2]=9;
//    	  a[0]=new int [1];
//    	  a[1]=new int [2];
//    	  a[2]=new int [3];
    	  System.out.println("3-Diemensional Arrray:- ");
    	  
    	  for(int i=0;i<3;i++) {
    		  System.out.println(" ");
    		  for(int j=0;j<3;j++) {
    		System.out.print(a[i][j]+"  ");
    		  }
    	  }
    	  
    	  
    	  
	}
	
}
