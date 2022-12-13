package com.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
	
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
class Teacher{
	int id;
	String name;
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}

public class Map_One_To_Many {
   public static void main(String[] args) {
	
	   Map<Teacher,List<Student>> m=new HashMap<Teacher, List<Student>>();
	   
	   m.put(new Teacher(1 , "nikhil"), Arrays.asList(new Student(1 , "amit" , 21), new Student(2 , "neha" , 20)));
	      m.put(new Teacher(2 , "jainam"), Arrays.asList(new Student(3 , "vishal" , 19)));
	      m.put(new Teacher(3 , "vimal"), Arrays.asList(new Student(4 , "amita" , 23), new Student(5 , "abhishek" , 21) , new Student(6 , "namit" , 22)));
	      
	      for(Teacher t:m.keySet()) {
	    	  if(t.name.equals("nikhil")){
	    		  for(Student s:m.get(t))
	    		  System.out.println(s);
	    	  }
	      }
	      
	      
	}
	
}

