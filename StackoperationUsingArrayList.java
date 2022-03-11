package stacksProlem;
import java.util.*;
public class StackoperationUsingArrayList {
	static class Stacks{
		static ArrayList<Integer> li=new ArrayList<Integer>();
		public static boolean isEmpty() {
			return li.size()==0;
			
		}
		public static void push(int data) {
			li.add(data);
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = li.get(li.size()-1);
			li.remove(li.size()-1);
			return top;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return li.get(li.size()-1);
		}
		public static void print() {
			for(int i=0;i<li.size();i++) {
				System.out.print(li.get(i));
		}
	}	
	public static void main(String args[]) {
		Stacks s = new Stacks();		
		s.push(2);
		s.push(3);
		s.push(4);		
		System.out.println(s.peek());
		s.pop();
		s.print();		
	}
	}
}

