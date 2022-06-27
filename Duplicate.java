package arraysProblem;

import java.util.Arrays;

public class Duplicate {
	public static boolean findDup(int arr[]) {
		Arrays.sort(arr);
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				temp=1;
			}
			
		}
		if(temp==1) {
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		int arr[]= {1,3,4,2};
		System.out.println(findDup(arr));
	}

}
