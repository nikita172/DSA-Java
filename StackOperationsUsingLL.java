package stacksProlem;

public class StackOperationsUsingLL {	
	static class  Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	static class Stack{		
		public static Node head;
		public static boolean isEmpty() {			
			return head==null;
		}					
		public static void push(int data) {
			Node newNode  = new Node(data);
			if(isEmpty()) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;		
		}
		public static void pop() {
			if(isEmpty()) {
				System.out.println("nothing to pop");
				return;
		}
			int top=head.data;
			System.out.println("the element which is going to be deleted is "+ top);
			head=head.next;
		}
		public static void print() {
			if(head==null) {
				System.out.println("nothing in stack");
				return;
			}
			Node currNode=head;
			while(currNode!=null) {
				System.out.print(currNode.data +"->");
				currNode= currNode.next;
			}
			System.out.println("null");
		}
		public static void peek() {
			if(isEmpty()) {
				System.out.println("stack is empty");
				return;
			}
			System.out.println(head.data);
		}
	}
	public static void main(String args[]) {
		Stack li = new Stack();
		li.pop();
		li.push(2);
		li.push(3);
		li.push(4);
		li.peek();
		li.print();
	}
}
