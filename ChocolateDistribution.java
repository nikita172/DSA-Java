package arraysProblem;
import java.util.Arrays;
public class ChocolateDistribution {
	public static int distriProb(int arr[],int size,int m) {
		Arrays.sort(arr);
		int diff=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i+m-1<size;i++) {
			diff=arr[i+m-1]-arr[i];
			if(diff<min) {
				min=diff;
			}
			
		}
		return min;
		
		
		
		
		
	}
	public static void main(String args[]) {
		int arr[]= {12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
               50};
		int n=17;
		int m=7;
		System.out.println(distriProb(arr,n,m));
	}

}
