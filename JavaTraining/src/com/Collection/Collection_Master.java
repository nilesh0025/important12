package com.Collection;

import java.util.ArrayList;
import java.util.List;

class Student{
	
private	int id;
private	String name;
private	int age;
	public Student() {
		super();
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(s.id==this.id && s.getName().equals(this.name) && s.age==this.age)
		return true;
		
		else
			
			return false;
	}
	
	}

class Student_Master{
	List<Student> l=new ArrayList<Student>();
	
	Student_Master(){
		l.add(new Student(1,"nilesh",22));
		l.add(new Student(2,"neha",28));
	}
	public boolean Doesexists(Student s) {
		boolean exist=false;
		for(Student st:this.l) {
			exist=true;
			break;
		}
		
		return exist;
		
	}
	public void DeleteStudent(Student s) {
		for(int i=0;i<this.l.size();i++) {
			if(l.get(i).equals(s)) {
				l.remove(1);
			}}
		}
		 public void updateStudent(Student s) {
		        for(int i=0;i<this.l.size();i++) {
		            if(l.get(i).getId()==s.getId())
		                l.set(i , s);
		        }
	}
	public void DisplayStudent() {
		for(Student s:l)
			System.out.println(s);
	}
	
	public void Highest_age() {
		for(Student s:l) {
			
		}
			
			
	}
	
}


public class Collection_Master {
	
	

	public static void main(String[] args) {
		
		List<Student> l1=new ArrayList<Student>();
		l1.add(new Student(1,"amit",22));
		l1.add(new Student(2,"nilesh",22));
		l1.add(new Student(3,"nitin",26));
		l1.add(new Student(4,"praksh",25));
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(17);
		l.add(11);
		l.add(1, 40);

		
		
	
		for(Student n:l1) {
			System.out.println(n);
		
		}
		
		Student s=new Student();
		System.out.println(s.equals(new Student(1,"nilesh",22)));
	
//		
		// Student_Master master = new Student_Master();
	    //  master.updateStudent(new Student(1 , "amitabh" , 22));
		//master.DeleteStudent(new Student(1,"amitabh",22));
//		 master.Doesexists(new Student(1,"nilesh",22));
//	      master.DisplayStudent();
	}

}
