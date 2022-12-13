package com.exception;

public class Student {
   int id;
   String name;
   String address;
   Student_marks smobj;
   
   
public Student() {
	super();
}


public Student(int id, String name, String address,Student_marks smobj) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.smobj = smobj;
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


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public Student_marks getSmobj() {
	return smobj;
}


public void setSmobj(Student_marks smobj) throws Result_Exception {
	
	this.smobj = smobj;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", smobj=" + smobj + "]";
}

public static void main(String[] args)  {
	
	try {	
		Student s=new Student();
		s.setId(1);
		s.setName("nilesh");
		s.setAddress("road13");
		
	//	s.setSmobj(33, 61, 63);
		Student_marks s1=new Student_marks(34,45,65);
		s.setSmobj(s1);
		
		//System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress()+" "+s.getSmobj());
		
		System.out.println(s);
		}
	catch(Result_Exception e) {
			System.out.println(e.getMassage());
		}
		
	
	}
 }
	


	
	

   
   

