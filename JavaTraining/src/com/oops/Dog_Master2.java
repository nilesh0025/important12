package com.oops;

public class Dog_Master2 {

	public static void main(String[] args) {
		Dog d[]= {new Dog_Master(),new pug()};
		
		for(Dog d1:d) {
			
			d1.bark();
			d1.eat();
		}
		

	}

}
