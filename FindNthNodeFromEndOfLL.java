package linkedListProblems;

public class FindNthNodeFromEndOfLL {
	private int size;
	FindNthNodeFromEndOfLL(){
		this.size=0;
	}
	Node head;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
			}
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public int size() {
		return size;
	}
	public void print() {
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("null");
	}
	public void findNthNodeFromEnd(int pos) {
		Node currNode=head;
		if(head.next==null) {
			System.out.println(currNode.data);				
			return;
		}
		if(pos>size) {
			System.out.println("incorrect postion to find element");
			return;
		}
		int toFind =size-pos+1;			
		int i=0;
		while(i<(toFind-1)) {
			currNode=currNode.next;
			i++;								
		}
		System.out.println(currNode.data);	
	}
	public void findNthNodeFromEndAndDelete(int pos) {
		
		if(pos>size) {
			System.out.println("Invalid postion to find element");
			return;
		}
		Node currNode=head;			
		if(head.next==null) {
			head=null;
			size--;
			return;
		}			
		if(pos==size) {
			head=head.next;
			size--;
			return;
		}			
		int toDelete =size-pos;			
		int i=0;
		while(i<(toDelete-1)) {
			currNode=currNode.next;
			i++;								
		}
		currNode.next=currNode.next.next;	
		size--;
	}	
	
	public static void main(String args[]) {
		FindNthNodeFromEndOfLL list= new FindNthNodeFromEndOfLL();
		list.addFirst(60);
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.print();
		System.out.println(list.size());
		list.findNthNodeFromEnd(3);
		list.findNthNodeFromEndAndDelete(3);
		list.print();
		
	}
}
