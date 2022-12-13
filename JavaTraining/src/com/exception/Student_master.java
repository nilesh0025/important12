package com.exception;

public class Student_master {

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


