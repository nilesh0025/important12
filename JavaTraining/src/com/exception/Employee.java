package com.exception;

public class Employee {
       int id ;
       int age;
       String name;
       
       
       
      
	public Employee() {
		super();
	}
	public Employee(int id, int age, String name){
		
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id)  {
		
		
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age ) throws CustomException{
		if(age < 18) {throw new CustomException("the employee age should be greater than 18");
		}
			
			else 
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws CustomException {
		
		// if(name == ) {
		this.name = name;
	//	else
			throw new CustomException("invalid name");
	}
       
       
       public static void main(String[] args) {
		
		try {
		Employee e=new Employee();
			e.setId(1);
			e.setAge(17);
			e.setName("234");
			System.out.println(e);
	} catch (CustomException e1) {
		System.out.println(e1.getMassage());		}
		System.out.println("Hii Prakash ..How are you?");
		
//		System.out.println(e);
	}
}
