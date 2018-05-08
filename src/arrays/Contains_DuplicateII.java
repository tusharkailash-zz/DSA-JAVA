package arrays;
import java.util.HashMap;

public class Contains_DuplicateII {

	
	public boolean isDuplicate(int[] nums, int k){
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i=0; i< nums.length; i++) {
			
			if(hmap.containsKey(nums[i])) {
				
				int j = hmap.get(nums[i]);
				if(Math.abs(i-j) <= k) 
					return true;
	
			}
			hmap.put(nums[i],i);
		}
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1};
		int k = 3;
		Contains_DuplicateII c = new Contains_DuplicateII();
		System.out.println(c.isDuplicate(nums, k));
		
	}
}
