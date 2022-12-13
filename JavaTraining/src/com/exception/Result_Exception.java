package com.exception;

public class Result_Exception extends Exception{
    String massage;

	public Result_Exception(String massage) {
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
