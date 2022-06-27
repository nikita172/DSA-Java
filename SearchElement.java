package arraysProblem;

public class SearchElement {
	public static void searchPivot(int arr[], int key) {
		int size=arr.length;
		int mid=size/2;
		if(key>=arr[0]) {
			for(int i=0;i<size/2;i++) {
				if(arr[i]==key) {
					System.out.println(i);
				}
				
			}
		}
		else {
			for(int i=size/2;i<size;i++) {
				if(arr[i]==key) {
					System.out.println(i);
				}
				
			}
		}
		
	}

	public static void main(String args[]) {
		int arr[]= {30, 40, 50, 10, 20};
		int key=30;
		
		searchPivot(arr,key);

}
}
