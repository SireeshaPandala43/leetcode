package problem1047;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Removing all Adjacent Duplicates in a string: " + 
		obj.removeDuplicates("abbacca"));
	}
	
	 public String removeDuplicates(String S) {
		 
		 for(int i =0; i<S.length()-1; i++) {
			 if(S.charAt(i)==S.charAt(i+1)) {
				 String prefix = S.substring(0, i);
				 String postfix = S.substring(i+2, S.length());
				 S = prefix + postfix;
				 i = -1;
				 
				 }
			 
		 }
		return S;
	        
	    }

}
