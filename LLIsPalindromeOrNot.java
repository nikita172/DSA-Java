package linkedListProblems;

public class LLIsPalindromeOrNot {
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
	
	public Node reverse(Node head) {
		Node prev=null;
		Node curr =head;
		while(curr!=null) {
			Node nextNode = curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		return prev;
	}
	
	public Node findMiddle() {
		Node turtle =head;
		Node hare =head;
		while(hare.next!=null && hare.next.next!=null) {
			hare=hare.next.next;
			turtle= turtle.next;
		}
		return turtle;
		
	}
	public boolean isPalindrome() {
		if(head==null || head.next==null) {
			return true;
		}
		Node middle = findMiddle();
		Node secondHalfStart= reverse(middle.next);
		
		Node firstHalfStart =head;
		while(secondHalfStart!=null) {
			if(firstHalfStart.data != secondHalfStart.data) {
				return false;
			}
			firstHalfStart =firstHalfStart.next;
			secondHalfStart =secondHalfStart.next;
		}
		return true;
	}
	public static void main(String args[]) {
		LLIsPalindromeOrNot list= new LLIsPalindromeOrNot();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(10);
		list.print();
		System.out.println(list.isPalindrome());
	}
}
