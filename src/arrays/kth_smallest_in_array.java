package arrays;
import java.util.*;
public class kth_smallest_in_array {

	
	public static int smallestKth(int arr[] , int k) {
		 Arrays.sort(arr);
		 return arr[k-1];   //To print kth smallest
		 
//		 int len = arr.length; //To print kth largest
//		 return arr[len-k];
	}
	
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {12, 3, 5, 7, 19};
		int k = 2;
		System.out.println("The kth smallest element is " + smallestKth(arr,k) );
		
	}
}
