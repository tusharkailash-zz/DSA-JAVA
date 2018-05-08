package arrays;
import java.util.*;
public class Contains_duplicate {

	/**
	 * @param nums
	 */
	public boolean isDuplicate(int [] nums) {
		
		HashSet<Integer> set = new HashSet<>();
		
//		System.out.println(set);
		
		for(int i: nums) {
			
			if(set.contains(i)) {
				return true;
			}
			set.add(i);
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
	
		int[] nums = {1,3,5,5,6,8};
		
		Contains_duplicate c = new Contains_duplicate();
		System.out.println(c.isDuplicate(nums));


	}

}
