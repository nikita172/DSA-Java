package linkedListProblems;

public class OperationsOnLinkedList {
	Node head;
	private int size;
	OperationsOnLinkedList(){
		this.size=0;
	}
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next=null;
			size++;
		}
	}		
		public void addFirst(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;			
		}		
		public void addLast(int data) {
			Node newNode= new Node(data); 
			if(head==null) {
				head=newNode;
				return;
			}
			Node currNode=head;
			while(currNode.next!=null) {
				currNode= currNode.next;
			}
			currNode.next=newNode;
		}		
		public void deleteFirst() {
			if(head==null) {
				System.out.println("list is empty, nothing to delete");
				return;
			}
			size--;			
			head =head.next;
		}
		public void deletelast() {
			if(head==null) {
				System.out.println("nothing to delete, list is empty");
				return;
			}
			size--;
			if(head.next==null) {
				head=head.next;
				return;
			}
			Node currNode =head;
			Node deleteNode =head.next;
			while(deleteNode.next!=null) {
				deleteNode=deleteNode.next;
				currNode =currNode.next;
			}
			currNode.next=null;
		}
		/*public void size() {
			int count=0;
			Node countSize = head;
			while(countSize!=null) {
				count++;
				countSize=countSize.next;
			}
			System.out.println("the size of the linked list is " + count);
		}
		*/
		public int size() {
			return size;
		}
		public void print() {
			if(head==null) {
				System.out.println("list is empty");
				return;
			}
			Node currNode = head;
			while(currNode!=null) {
				System.out.print(currNode.data + "->");
				currNode=currNode.next;							
			}
			System.out.println("NULL");
		}
		public void reverseList() {
			Node prevNode = head;
			Node currNode=head.next;
			while(currNode!=null) {
				Node nextNode=currNode.next;
				currNode.next=prevNode;
				prevNode=currNode;
				currNode=nextNode;
			}
			head.next=null;
			head=prevNode;			
		}		
		public void addAtIndex(int data, int index) {
			int size = size();			
			Node newNode= new Node(data);			
			if(head==null||index==0) {
				newNode.next=head;
				head=newNode;
				return;
			}
			Node currNode=head;
			for(int i=1;i<size;i++) {
				if(i==index) {
					Node nextNode= currNode.next;
					currNode.next=newNode;
					newNode.next=nextNode;
					break;
				}
				currNode=currNode.next;
			}
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
	public static void main(String argr[]) {
	OperationsOnLinkedList list = new OperationsOnLinkedList();
	list.addLast(1);
	list.addLast(2);
	list.addFirst(0);
	list.addLast(4);
	list.addAtIndex(3, 3);
	list.print();
	list.print();	
	}
}
