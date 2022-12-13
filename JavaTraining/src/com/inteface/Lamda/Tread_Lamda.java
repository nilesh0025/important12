package com.inteface.Lamda;

class demo implements Runnable{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(i);
			Thread.sleep(1000);}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


public class Tread_Lamda {
	public static void main(String[] args) {
		 Thread t=new Thread(new demo());
	      
	      t.start();
	}
     
}
