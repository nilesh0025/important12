package com.nilesh;



public class Student {
	
	
	
   private	int id;

  private	String name;

  private	long moileno;
  protected static String teacher;

public Student() {
	super();
}

public Student(int id, String name, long moileno) {
	super();
	this.id = id;
	this.name = name;
	this.moileno = moileno;
	
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

public long getMoileno() {
	return moileno;
}

public void setMoileno(long moileno) {
	this.moileno = moileno;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", moileno=" + moileno +", teacher ="+teacher+ "]";
}



	

}
