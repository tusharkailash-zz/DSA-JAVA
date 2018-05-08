package hashmap;

import java.util.HashMap;

public class JewelsAndStones {
	
		
	    public int numJewelsInStones(String J, String S) {
	        
	    	int count = 0;
	    	HashMap<Character, Integer> map_S = new HashMap<Character, Integer>();
	    	
	    	for(char c: S.toCharArray()){
	    		
	    		if(map_S.containsKey(c)) {
	    			
	    			int temp = map_S.get(c) + 1;
	    			map_S.put(c,temp);
	    			
	    		}
	    		else {
	    			map_S.put(c,1);
	    		}
	    	}
	    	
	    	for(char c: J.toCharArray()) {
	    		
               if(map_S.containsKey(c)) {
                    
	    		   count += map_S.get(c) ;                 // count += map_S.getOrDefault(c,0);
               }
	    	}
	    	
	    	return count;
	    }
         
    
	
	
	
	public static void main(String[] args) {
		
		
		String J = "aA";
		String S = "aAAbbbb";
		JewelsAndStones j = new JewelsAndStones();
		System.out.println(j.numJewelsInStones(J, S));
	
	}

}
