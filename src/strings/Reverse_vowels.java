package strings;


public class Reverse_vowels {

	 public boolean isVowel(char c) {
		        
		        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		    		c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
		    }
		    
		    
	public String changetoReverse(String s) {
		        
		int i = 0;
		int j = s.length() - 1;
		char [] c = s.toCharArray();
		while(i < j) {
			
			while((i<j) && !isVowel(c[i])){
				i++;
			}
			while((i<j) && !isVowel(c[j])){
				j--;
			}
			
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
			}
		
		return new String(c);
		
	}
	public static void main(String[] args) {
		
		
	String s = "leetcode";
	Reverse_vowels r = new Reverse_vowels();
	System.out.println(r.changetoReverse(s));
	}

}
