package strings;
import java.util.Arrays;

public class UniqueChar {

	public boolean isUnique(String inp) {
		
		char[] input = inp.toCharArray();
//		System.out.println(input);
		Arrays.sort(input);
		for(int i=0; i< (input.length)-1; i++) {
				if(input[i] != input[i+1]) {
					continue;
				}
				else {
					return false;
				}
	}
	return true;
	
	}
	
	
	
	public static void main(String[] args) {
		
			String inp = "12lkhg";
			UniqueChar uq = new UniqueChar();
			//uq.isUnique(inp);
			if(uq.isUnique(inp)) {
				System.out.println("Characters are unique");
			}
			else {
				System.out.println("Characters are not unique");
			}
	}

}
