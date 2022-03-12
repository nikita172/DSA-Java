package stacksProblem;
import java.util.*;
public class CheckingBalancingOfSymbols {	
	public boolean toCheck(String data) {
		Stack <Character> st= new Stack<>();
		if(data==null|| data.length()==0) {
			return true;
		}
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)=='{') {
				st.push(data.charAt(i));
			}
			if(data.charAt(i)=='(') {
				st.push(data.charAt(i));
			}
			if(data.charAt(i)=='[') {
				st.push(data.charAt(i));
			}
			if(data.charAt(i)==')') {
				if(st.peek() == '(' && !st.isEmpty() ){
					st.pop();
				}
				else {
					return false;					
				}
			}else if(data.charAt(i)=='}') {
				if(st.peek() == '{' && !st.isEmpty() ){
					st.pop();
				}
				else {
					return false;					
				}
			}else if(data.charAt(i)==']') {
				if(!st.isEmpty() && st.peek() == '[' ){
					st.pop();
				}
				else {
					return false;					
				}
			}			
		}
		if(st.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		String data= "{([nik)}]";
		CheckingBalancingOfSymbols li= new CheckingBalancingOfSymbols();
		System.out.println(li.toCheck(data));
	}
}
