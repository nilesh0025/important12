package com.Predefined_lamda;

import java.util.function.Function;

public class predefined_lamda {
     public static void main(String[] args) {
		
    	 Function<Integer,Integer> sq=(a)->a*a;
    	 
    	 int a[]= {1,2,3,4,5};
    	 for(int b:a)
    		 System.out.println(sq.apply(b));
	}
}
