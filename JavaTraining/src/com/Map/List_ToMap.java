package com.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class List_ToMap {
public static void main(String[] args) {
	List<Student_ForMap> l1=new ArrayList<Student_ForMap>();
	l1.add(new Student_ForMap(1,"Nilesh"));
	l1.add(new Student_ForMap(2,"Abhishek"));
	l1.add(new Student_ForMap(3,"Namdev"));
	l1.add(new Student_ForMap(4,"Prakash"));
	
	Map<Integer,String> m1=l1.stream().collect(Collectors.toMap(e ->e.id, e1->e1.name));
	System.out.println(m1);
	for(Map.Entry m:m1.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
}}