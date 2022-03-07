package linkedListProblems;

public class ReverseSinglyLinkedList {
	Node head;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			this.next=null;
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
	public void print() {
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("null");
	}
	public void reverse() {
		Node prevNode =head;
		Node currNode=head.next;
		while(currNode!=null) {
			Node nextNode =currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		head.next=null;
		head=prevNode;
		
	}
	public static void main(String args[]) {
		ReverseSinglyLinkedList list= new ReverseSinglyLinkedList();
		list.addFirst(60);
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.print();
		list.reverse();
		list.print();
		
	}
}
