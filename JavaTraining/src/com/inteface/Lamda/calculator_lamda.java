package com.inteface.Lamda;

interface lam{
	int calcula(int a,int b);
}

public class calculator_lamda {
	
public static void main(String[] args) {
	

      
lam l=(a,b)->{return a*b;};
lam l1=(a,b)->a+b;
System.out.println(l.calcula(2, 4));
System.out.println(l1.calcula(5, 9));
}
}