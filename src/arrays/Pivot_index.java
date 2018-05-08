package arrays;
import java.util.*;

public class Pivot_index {

	public int getPivot(int[] nums) {
		
		int Lsum = 0;
		int Rsum = Arrays.stream(nums).sum();
//		System.out.println(Rsum);
		
		for (int i=0; i< nums.length; i++) {
			
			Rsum -= nums[i];
			if(Lsum == Rsum) {
				
				return i;
			}
			else {
				
				Lsum += nums[i];
			}
			
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
	
		int [] nums = {1, 7, 3, 6, 5, 6};
		Pivot_index p = new Pivot_index();
		System.out.println(p.getPivot(nums));
	
	}

}
