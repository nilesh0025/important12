package com.oops;

public class Box_Weight extends Box {

	
	 int weight;

	public Box_Weight() {
		
		System.out.println("arg o");
	}

	public Box_Weight(int weight,int length, int height, int width) {
		super(length,width,height);
		this.weight = weight;
		System.out.println("arg 4");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	 
	 public int Density() {
		return this.weight/(this.length*this.width*this.height);
		 
	 }
}
