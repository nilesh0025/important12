package com.Assignment;

public class Box {
    
	int width;
	int height;
	int depth;
	public Box() {
		super();
	}
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int calvolumn() {
		return this.width*this.height*this.depth;
		
	}
	
	
}
