package com.inteface.Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person{
    int id;
    String name;
    int age;
    
    public Person(int id , String name , int age) {this.id=id;this.name=name;this.age=age;}



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
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    
    
    
    
}
public class Collection_Master {

	public static void main(String[] args) {
		Person p=new Person(1, "nilesh", 22);
		Person p1=new Person(2, "prakash", 26);
		Person p2=new Person(3, "neha", 28);
		Person p3=new Person(4, "bhushan", 29);
		
		List<Person> a=Arrays.asList(p,p1,p2,p3);
		
		Collections.sort(a, (a1,a2)->a1.getAge()-a2.getAge());
		System.out.println(a);
		
		
	}

}
