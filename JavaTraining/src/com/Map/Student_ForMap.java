package com.Map;

public class Student_ForMap {
int id;
String name;

public Student_ForMap(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Student_ForMap() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Student_ForMap [id=" + id + ", name=" + name + "]";
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

}
