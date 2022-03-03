package sortingproblems;
public class BubbleSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void bubblesort(int[] arr) {
		int size = arr.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}					
			}
			printArray(arr);
		}				
	}			
	public static void main(String args[]) {
		int arr[] = {5,2,6,1,3,7};
		bubblesort(arr);	
	}
}
