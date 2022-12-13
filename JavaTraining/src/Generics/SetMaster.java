package Generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetMaster {

	public static void main(String[] args) {
		
		Set <Integer> s=new HashSet<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		Set <Integer> s1=new HashSet<Integer>();
		  
		s1.add(30);
		s1.add(50);
		s1.add(10);
		s1.add(80);
		s1.add(90);
     
		Set<Integer> intersection=new HashSet<Integer>();
		intersection.addAll(s);
		intersection.retainAll(s1);
	}

}
