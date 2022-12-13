package com.ObjectClass;




class Student{
	
	
	int id;
	String name;
	int age;
	

 public  Student(){}


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
public boolean equals(Object o) {
	Student s3=(Student)o;
	if(s3.id==this.id && s3.name==this.name && s3.age==this.age) 
		return true;
		
		else
			return false;
	}

	  
  public int hashCode() {
	  return this.id*this.age;
  }
}
public class ojectmaster {
	
	public static void main(String[] args) {
		Student s=new Student(1,"nilesh",25);
		Student s1=new Student(1,"nilesh",25);
		Student s2 =new Student(2,"nikita",28);
		Student s3=new Student(3,"prakash",30);
		Student s4=new Student(3,"prakash",30);
		
		Student a[]= {s,s1,s2,s3,s4};
		
		
		
		if(s.equals(s1)) {
			System.out.println("equal");
		}else {
			System.out.println("unequal");
		}
		
	}
	
}

