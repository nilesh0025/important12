package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id ;
	String name;
	int age;
	
 public	Employee(){
		
	}

public Employee(int id, String name, int age) {
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
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
}

@Override
public int compareTo(Employee o) {
	if(this.age==o.age)
	
	return this.name.compareTo(o.name);
	else if(this.age>o.getAge())
		return 1;
	else
		return -1;
}
}


public class Employee_Compare_Master {
   public static void main(String[] args) {
	List <Employee> e=new ArrayList<Employee>();
	e.add(new Employee(1,"nikhil",52));
	e.add(new Employee(2,"nilesh",48));
	e.add(new Employee(3,"anurag",48));
	e.add(new Employee(3,"pragati",38));
	
	
	Collections.sort(e);
	for(Employee d:e) {
		System.out.println(d);
		System.out.println();
	}
	   
}
}
