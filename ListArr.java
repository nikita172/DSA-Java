package javaprogs;
import java.util.*;
public class ListArr {
	static void list(List<ArrayList<Integer>> li) {
		for(int i=0;i<li.size();i++) {
			for(int j=0;j<li.size();j++) {
				System.out.print(li.get(i).get(j)+" ");
		}
			System.out.println();
		}
		
	}
	public static void main(String args[]) {
		List<ArrayList<Integer>> li= new ArrayList<ArrayList<Integer>>();
		li.add(new ArrayList<Integer>());
		li.get(0).add(0,1);
		li.get(0).add(1,2);
		li.get(0).add(2,3);
		li.add(new ArrayList<Integer>());
		li.get(1).add(0,4);
		li.get(1).add(1,5);
		li.get(1).add(2,6);
		li.add(new ArrayList<Integer>());
		li.get(2).add(0,7);
		li.get(2).add(1,8);
		li.get(2).add(2,9);
		list(li);
	}

}
