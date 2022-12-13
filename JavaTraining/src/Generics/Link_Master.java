package Generics;

import Generics.Node.LinkedList;

class Node{
	int date;
	Node next;
	
	public Node(int date) {
		this.date=date;
		next=null;
	}
	class LinkedList
	{	
		Node head=null;
		
		
		public void InsertAtBegning(int a) {
		
	
		Node n1=new Node(a);
		if(head==null)
			head=n1;
		else
			n1.next=head;
		head=n1;
		
		
	}
	
	void DisplayList() {
		Node start=head;
		while(start !=null) {
			System.out.println(start.date);
			start=start.next;
		}
	}	
	}}


public class Link_Master {
  public static void main(String[] args) {
	LinkedList<Integer> l1=new LinkedList<Integer>();
	l1.InsertAtBegning(10);
	l1.InsertAtBegning(20);
	l1.InsertAtBegning(40);
	l1.DisplayList();
	
}
  }

