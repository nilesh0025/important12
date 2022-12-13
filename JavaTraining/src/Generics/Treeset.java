package Generics;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		Set<Integer> a=new TreeSet<Integer>();
		
		a.add(20);
		a.add(50);
		a.add(10);
		a.add(8);
		for(Integer s:a)
			System.out.println(s);
		

	}

}
