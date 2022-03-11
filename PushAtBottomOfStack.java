package stacksProblem;
import java.util.*;
public class PushAtBottomOfStack {
	public static void pushAtBottom(int data,Stack<Integer>s ) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		pushAtBottom(data,s);
		s.push(top);
	}
	public static void printStack(Stack<Integer>s) {
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
	}
	public static void main(String args[]) {
		Stack<Integer> s= new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		pushAtBottom(4,s);
		printStack(s);
	}

}
