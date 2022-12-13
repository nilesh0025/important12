package com.oops;

 class Shape {
    
	 void draw() {
		 System.out.println("shape");
	 }
}
class rectangle extends Shape{
	
	void draw() {
		System.out.println("rectangle");
	}
}
class triangle extends Shape{
	void draw() {
		System.out.println("triangle");
	}
}
public class Shapemaster{
	public static void main(String[] args) {
		
		Shape s1[]= {new Shape(),new rectangle(),new triangle()};
		for(Shape s:s1) {
			s.draw();
		}
	}
}