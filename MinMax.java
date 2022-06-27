package arraysProblem;
import java.util.Scanner;
public class MinMax {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the total no. of elements in arr");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter elements of arrays");
	for(int i=0;i<size;i++) {		
	arr[i]=sc.nextInt();
	}	
	int min=arr[0]; 
	int max=arr[0];
	if(size==1) {
		System.out.println("the minimum element is:"+ min);
		System.out.println("the maximum element is:"+ max);
		return;
	}
		for(int i=1;i<size;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}			
		}
		System.out.println("the minimum element is:"+ min);
		System.out.println("the minimum element is:"+ max);
	}
	
}
