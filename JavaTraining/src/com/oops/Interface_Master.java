package com.oops;

public class Interface_Master {

	public static void main(String[] args) {
		
	Runnable r=	new Runnable() {
			public void run() {
				try {
			for(int i=1;i<=10;i++) {
				
			Thread.sleep(1000);
					System.out.println(i);}
					}catch(InterruptedException ex) {}
				
				
					
			}
		};
	
new Thread (r).start();
};
}