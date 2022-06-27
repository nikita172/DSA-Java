package arraysProblem;

public class MaximumSubarr {
	
	public static int maxSum(int arr[],int n) {
		int res=arr[0];
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;j<n;j++) {
				curr=curr+arr[j];			
				res=Math.max(res,curr);
			}
		}
		return res;
		
		}
		
	
	public static void main(String args[]) {
	int arr[]= {1,-2,3,-1,2};
	int n=5;
	System.out.println(maxSum(arr,n));
	
}
}

	
