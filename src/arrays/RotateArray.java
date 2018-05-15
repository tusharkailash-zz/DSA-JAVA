package arrays;

public class RotateArray {

	public int[] rotate(int[] nums, int k) {

		int n = nums.length-1;
		int[] ans = reverse(nums,0,n);
		ans  = reverse(nums, 0, k -1);
		ans  = reverse(nums, k, n);
		
		return nums;
		
	}
	
	
	public  static void printArray(int[] nums){   //for debugging (helper)
		
		for(int i = 0 ; i< nums.length; i++){
			
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
	}
	public int[] reverse(int[] nums, int start, int end) {
		
		while(start<end) {
			
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		//printArray(nums);
		return nums;
		
		
	}

	public static void main(String[] args) {

		int[]  nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Given input:");
		printArray(nums);
		int k = 3;
		RotateArray r = new RotateArray();
		int [] ans = r.rotate(nums, k);
		System.out.println("Final answer is: ");
		printArray(ans);
		

	}

}
