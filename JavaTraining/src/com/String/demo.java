package com.String;

import java.util.Scanner;

public class demo{
	public static void main(String[] args) {
		
	
	
//		String s="nilesh";
//		
//		s="pragati";
//		System.out.println(s);
//		
//		  String str = "Java Concept Of The Day";
//	         
//	        System.out.println(str.indexOf('a') + str.indexOf("Day"));
//	   
//		String s="Java Concept Of The Day";
//		System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1, s.length()).toLowerCase());
//		
//		System.out.println(s.charAt(s.length()-1)+s.substring(0, s.length()-1));
//		System.out.println(s.substring(0, s.length()-1));
//		System.out.println(s.length());
//		
//		String a[]= {"nilesh","prakash","neha","ankush","jayesh"};
//		
//		for(int i=0;i<a.length;i++) {
//			String e=a[i].substring(0, 1).toUpperCase()+a[i].substring(1, a[i].length());
//			
//			System.out.println(e);
//		}
	//String insert at perticular index of another string 	
//		String s="nilesh";
//		String s1="ankush";
//		String f="";
//		String d="";
//		int a=2;
//		char[] l= s.toCharArray();
//		
//		for(int i=0;i<l.length;i++) {
//			if (a==i) {
//				 f=f+s1+l[i];
//			}else {
//				f=f+l[i];
//			}
//		}
//		System.out.println(f);
		
		String  a[]= {"nilesh","nana","aba","prakash"};
		String rev="";
		    
		for(int i=0;i<a.length;i++) {
			//a[i].toCharArray();
			for(int j=a.length-1;j>=0;j--) {
				if(a[i]==a[j]) {
					rev=a[i];
				}
			
			}
			
				}
		for(int c=0;c<a.length;c++)
			if(a[c]==rev) {
				System.out.println(a[c]);
		}
}
	    }
	


