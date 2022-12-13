package Generics;

import java.util.HashSet;
import java.util.Set;

class Employee{
	String name;
	String work;
	public Employee(String name, String work) {
		super();
		this.name = name;
		this.work = work;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", work=" + work + "]";
	}
	
	
	
}













public class Set_Employee {
     public static void main(String[] args) {
    		Set<Employee> n=new HashSet<Employee>();
    		
    		n.add(new Employee("ram", "java"));
    		n.add(new Employee("shyam","java"));
    		n.add(new Employee("amitabh","java"));
    		n.add(new Employee("sachin","react"));
    		n.add(new Employee("shyam","react"));
    		n.add(new Employee("amitabh","react"));
    		n.add(new Employee("suresh","bench"));
    		n.add(new Employee("ramesh","bench"));
//    		n.add(new Employee("shyam","amitabh"));
//    		n.add(new Employee("shyam","amitabh"));
//    		
 
    		
    		System.out.println(n.size());
    		
    		System.out.println();
	}   

	
}
