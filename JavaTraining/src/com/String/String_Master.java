package com.String;

public class String_Master {
	
	
	public static String initcap( String a) {
		return (a.substring(0, 1).toUpperCase()+a.substring(2, a.length()).toLowerCase());
		
	}
	
	public static String R(String a) {
		return a.substring(0, 1).toUpperCase()+" ."+a.substring(a.indexOf(' ')+1,a.length());
	}
	public static String Rotati(String s) {
		
           
            return s.charAt(s.length()-1)+s.substring(0, s.length()-1);
    }
 ;
	

 public static void A(String s)
 {
	 for(int i=0;i<s.length()-1;i++) {
		 s=String_Master.initcap(s);
		 System.out.println(s);
	 }
	
 }
            
    
 
		
	

	public static void main(String[] args) {
		String s1="amit";
		
		s1=s1+" nigam";
		
		String s3="jatin";
		
		//System.out.println(s1);
		
	String  max="";
		
		String []a= {"nilesh","bhushan","neha","paratiksha"};
	//	for(String n:a) {
			
			
			
//			if(a[i].length()< max ) {
//				max=a[i].length();
//			
//				
//			}
//			String s=Integer.toString(max);
//			System.out.println(s);
			
			//System.out.println(String_Master.initcap("nilesh"));
			//System.out.println(String_Master.Rotati("mxz"));
			String_Master.A("nilesh");
		}
		
	}


