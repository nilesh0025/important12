
package com.exception;

import java.io.File;
import java.io.IOException;

public class FileMaster {
	
	public static int Divi(int a,int b) {
		return a/b;
		
	}

	public static void main(String[] args) {
//		File obj=new File("nilesh.taxt");
//		
//		try {
//			obj.createNewFile();
//		} catch (IOException e) {
//		
//			e.printStackTrace();
//		}
//
//	}
        try {
        	System.out.println(FileMaster.Divi(10, 0));
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
}
}