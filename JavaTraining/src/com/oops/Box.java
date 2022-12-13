package com.oops;

public class Box {
	
	protected int length;
	protected int height;
	protected int width;
	
	
	public Box() {
	this(0);
	System.out.println("0 arg");
	}
	
	Box(int length){
		
		this(0,0,0);
		System.out.println("1 arg");
		
	}

	public Box(int length, int height, int width) {
		super();
		this.length = length;
		this.height = height;
		this.width = width;
		System.out.println("3 arg");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	 public int cal() {
		return this.height*this.length*this.width;
		 
	 }

	@Override
	public String toString() {
		return "Box [length=" + length + ", height=" + height + ", width=" + width + "]";
	}
	 

}
