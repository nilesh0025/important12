package com.nilesh;

public class Demo2 {
	
	public static void Printmaster(int n) {
		
		if(n<10)	
			return;
		Printmaster(n+1);
    System.out.println(n+" ");	
   
	}
	
	

	public static void main(String[] args) {
		Demo2.Printmaster(10);
		
    int sum=0;
	
	for(int i=1;i<=10;i++) 
		
		sum+=i;
		System.out.println(sum);
		}
	}


