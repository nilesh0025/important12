package com.Array_practice;
public class Even_odd_count {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
      int count=0;
      int oddcount=0;
      for(int i=0;i<a.length;i++) {
    	  if(a[i]%2==0) {
    		count++;
    	System.out.println(a[i]);
      }else {
    	  oddcount++;
      }
	}
System.out.print("even :"+count);
System.out.print("odd :"+count);
	}}
