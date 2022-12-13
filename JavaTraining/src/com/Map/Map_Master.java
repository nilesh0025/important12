package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map_Master {
	
//	  public static <String> Map<String, Integer>  frequencyMap(Stream<String> elements) {
//	        return elements.collect(
//	            Collector.groupingBy(
//	            Function.identity(),
//	            HashMap::new, // can be skipped
//	            Collectors.counting(),
//	            )
	   //     );
	public static void frequencycount(String s) {
		Map<Character,Integer>m=new HashMap<Character ,Integer>();
		for(int i=0;i<s.length();i++) {
			if(m.keySet().contains(s.charAt(i))) {
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}
			else {
				m.put(s.charAt(i), 1);
			}
		}
		System.out.println(m);
	}
	
	
	public static void main(String[] args) {
		Map<String ,Integer>m=new HashMap<String ,Integer>();
		m.put("nilesh", 29);
		m.put("bhushan", 26);
		m.put("jatin", 32);
		m.put("jatin", 34);
		System.out.println("ger age of jatin :"+m.get("jatin"));
		System.out.println("Size of map  :"+m.size());
		System.out.println(m.entrySet());
		
		for(String s:m.keySet()) {
			System.out.println(s+"age is :"+m.get(s));
		}
		
		Map_Master.frequencycount("amitabh bacchan");
	}

}
