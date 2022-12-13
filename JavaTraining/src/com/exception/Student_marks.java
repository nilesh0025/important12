package com.exception;

public class Student_marks {
   int math;
   int  marathi;
   int english;
   
   
public Student_marks() {
	super();
}
public Student_marks(int math, int marathi, int english)  {
	super();
	this.math = math;
	this.marathi = marathi;
	this.english = english;
}
public int getMath() {
	return math;
}
public void setMath(int math) throws Result_Exception{
	if(math<40) {
		throw new Result_Exception("you are failed in math");
		
	}else
	this.math = math;
}
public int getMarathi() {
	return marathi;
}
public void setMarathi(int marathi) {
	this.marathi = marathi;
}
public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
@Override
public String toString() {
	return "Student_marks [math=" + math + ", marathi=" + marathi + ", english=" + english + "]";
}
   
   
   
}
