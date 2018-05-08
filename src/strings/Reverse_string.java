package strings;

public class Reverse_string {

	public String toReverse(String s) {
		
		
		int l = 0;
		int r = s.length()-1;
		
		char[] arrChar = s.toCharArray();
//		System.out.println(s);
		
		while (l<r) {
			
			char temp = arrChar[l];
			arrChar[l] = arrChar[r];
			arrChar[r] = temp;
			l++;
			r--;
		}
				
		return new String(arrChar);
		
	}
	
	
	public static void main(String[] args) {
	
		String s = "hello";
		Reverse_string r = new Reverse_string();
	    System.out.println(r.toReverse(s));
		
	}

}
