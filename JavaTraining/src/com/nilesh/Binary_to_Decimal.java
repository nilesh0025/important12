package com.nilesh;

import java.util.Scanner;
  
public class Binary_to_Decimal {
	 
	
	public static int Decimal(int b){  
	    int decimal = 0;  
	    int n = 0;  
	    while(true){  
	      if(b == 0){  
	        break;  
	      } else {  
	          int temp = b%10;  
	          decimal += temp*Math.pow(2, n);  
	          b = b/10;  
	          n++;  
	       }  
	    }  
	    return decimal;  
	}  

	public static void main(String[] args) {
	  
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your binary value:");
		int  b=sc.nextInt();
		
				
		System.out.println("Decimal value of  "+b+" is="+Binary_to_Decimal.Decimal(b));

	}

}
