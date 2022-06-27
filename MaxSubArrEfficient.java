package arraysProblem;

public class MaxSubArrEfficient {
	public static int maxSum(int arr[],int n) {
		int res = arr[0];
		int maxEnd=arr[0];
		for(int i=1;i<n;i++) {
			maxEnd=maxEnd+arr[i];
			maxEnd=Math.max(maxEnd, arr[i]);
			res=Math.max(res, maxEnd);
			
		}
		return res; 
	}
	
	
	public static void main(String args[]) {
		int arr[]= {10,1,-2,3,-1,2,-2};
		int n=7;
		System.out.println(maxSum(arr,n));
}
}
