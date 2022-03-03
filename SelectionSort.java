package sortingproblems;
public class SelectionSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void selectionsort(int[] arr) {		
		int size=arr.length;
		for(int i=0;i<size-1;i++) {
			int smallest=i;
			for(int j=i+1;j<size;j++) {				
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;			
	    }
		printArray(arr);
	}
	public static void main(String args[]) {
		int arr[] = {5,2,6,1,3,7};
		selectionsort(arr);	

	}
}
