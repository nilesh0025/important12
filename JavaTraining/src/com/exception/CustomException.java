package com.exception;

public class CustomException extends Exception{
   private  String massage;
   

	public CustomException(String massage) {
		super();
		this.massage = massage;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}
     
     
}
