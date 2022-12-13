package com.nilesh;

public class Student_Master {

	public static void main(String[] args) {
		Student s=new Student(1,"nilesh",98787658);
		
		s.teacher="nikhil";
		System.out.println(s);
		
		Student s1[]=new Student[3];
		
		s1[0]=new Student(2,"nikhil",90876686); 
		s1[1]=new Student(3,"prakash",98908766); 
		s1[2]=new Student(4,"abhi",77876686); 
		
		System.out.println(s1[1].getName());
	}

}
