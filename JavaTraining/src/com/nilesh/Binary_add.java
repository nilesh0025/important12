package com.nilesh;

import java.util.Scanner;

public class Binary_add {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first binary:");
		String s1=sc.next();
		System.out.println("enter second binary:");
		String s2=sc.next();
		
		
		int x=Integer.parseInt(s1,2);
		int y=Integer.parseInt(s2,2);
		
		int z=x+y;

		System.out.println(Integer.toBinaryString(z));

	}
	
	

}
