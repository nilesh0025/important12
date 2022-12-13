package com.Predefined_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_Master {

	
	public static void main(String[] args) {
		Integer a[]= {1,2,5,8,3,4,9};
		
		List<Integer> i=Arrays.asList(a);
		
		System.out.println(i.stream().filter((e)->e%2!=0).map((e)->e*e).reduce(0, (a1,b)->a1+b));
		
		// System.out.println(myList.stream().filter((e)->e%2!=0).map((e)->e*e).reduce(0,(a,b)->a+b));
		
		i.stream().map((e)->e*e).forEach((e)->System.out.print(e+" "));
		System.out.println();
		i.stream().filter((e)->e%2==0).map((e)->e*e).forEach((e)->System.out.print(e+" "));
		
		
		List<String> s=new ArrayList<String>();
		
		s.add("jack");
		s.add("jill");
		s.add("nilesh");
		s.add("nikihil");
		
		List<String> s1=s.stream().filter((e)->e.startsWith("j")).sorted().map((e)->e.toUpperCase()).collect(Collectors.toList());
		
		s1.stream().forEach((e)->System.out.print(e+" "));
		
		
	}
}
