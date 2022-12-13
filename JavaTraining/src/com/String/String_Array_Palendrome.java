package com.String;

public class String_Array_Palendrome {
	public static void main(String[] args) {
		
		String  a[]= {"nilesh","nana","aba","prakash","Nitin"};
		System.out.println("Reverse String of Arrays :- ");
		    
		for(int i=0;i<a.length;i++) {
			String rev="";
			char c[]=a[i].toLowerCase().toCharArray();
			
		for(int j=c.length-1;j>=0;j--) {
			
		rev=rev+c[j];
		}
		if (rev.equals(a[i].toLowerCase())) {
			System.out.println(a[i]);
		}
		
			}}}

