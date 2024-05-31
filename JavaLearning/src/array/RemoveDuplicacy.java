package array;

public class RemoveDuplicacy {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,3,4,5,5,6,6};
		
		int j=1;
		
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i]!=arr[i+1]) {
				arr[j]=arr[i+1];
				j++;
			}
		}
		System.out.println("Count: " +j);
		for(int i=0; i<j; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
