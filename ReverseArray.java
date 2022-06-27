package arraysProblem;
import java.util.*;
public class ReverseArray {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of elements:");
		int size= sc.nextInt();
		int arr[]= new int[size];
		System.out.println("enter no. of elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the elements before reversing are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		int n=size/2;
		int x=0;
		for(int i=0;i<n;i++) {
			int a=arr[i];
			arr[i]=arr[size-x-1];
			arr[size-x-1]=a;
			x++;
		}
		System.out.println("the elements after reversing are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
