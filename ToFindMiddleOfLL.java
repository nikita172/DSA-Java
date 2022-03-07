package linkedListProblems;

public class ToFindMiddleOfLL {
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
	//hare-turtle approach to find first middle of the linked list
	public void findMiddle() {
		Node turtle =head;
		Node hare =head;
		while(hare.next!=null && hare.next.next!=null) {
			hare=hare.next.next;
			turtle= turtle.next;
		}
		System.out.println(turtle.data);
	}
	public static void main(String args[]) {
		ToFindMiddleOfLL list= new ToFindMiddleOfLL();
		list.addFirst(60);
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.print();
		list.findMiddle();
	}

}
