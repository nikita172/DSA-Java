package linkedListProblems;
public class SortintOnLinkedList {
	private int size;
	SortintOnLinkedList(){
		this.size=0;
	}
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
		}		
	}
	public void addLast(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			return;			
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	public void print() {
		Node currNode=head;
		if(head==null) {
			System.out.println("linked list is empty");
			return;			
		}
		while(currNode!=null) {
			System.out.print(currNode.data+ "->");
			currNode= currNode.next;
		}
		System.out.println("NULL");		
	}
	public void size() {
		System.out.println("size of the linked list is :" + size);
	}	
	public void sorting() {		
		for(int i=0;i<size;i++) {
			Node currNode=head;
			while(currNode.next!=null) {
				Node nextNode=currNode.next;
				if(currNode.data >nextNode.data) {
					int temp = currNode.data;
					currNode.data=nextNode.data;
					nextNode.data=temp;										
				}
				currNode=currNode.next;
			}
		}
	}	
	public void insertInSortedLinkedList(int data) {		
		sorting();		
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		if(currNode.next==null) {
			if(newNode.data>currNode.data) {
				currNode.next=newNode;
			}
			else {
				head=newNode;
				newNode.next=currNode;
			}	
			return;
		}				
		while(currNode!=null) {
			Node nextNode=currNode.next;
			if(nextNode==null) {
				currNode.next=newNode;
				return;
			}
			if(currNode.data >newNode.data && nextNode.data>newNode.data) {
				head=newNode;
				newNode.next=currNode;
				return;
			}
			if(nextNode.data>newNode.data) {
				currNode.next=newNode;
				newNode.next=nextNode;
				return;
			}
			currNode=currNode.next;
		}
	}
	public void findMiddle() {
		Node hare=head;
		Node turtle =head;
		while(hare.next!=null && hare.next.next!=null) {
			hare=hare.next.next;
			turtle=turtle.next;
		}
		System.out.println(turtle.data);
	}
	public void checkEvenOdd() {
		if(size%2==0) {
			System.out.println("length of linked list is even");
		}else {
			System.out.println("length of linked list is odd");			
		}
	}	
	public static void main(String args[]) {
		SortintOnLinkedList list = new SortintOnLinkedList();
		list.addLast(2);
		list.addLast(8);
		list.addLast(9);
		list.addLast(4);
		list.addLast(1);				
		list.insertInSortedLinkedList(5);
		list.print();		
	}
}
