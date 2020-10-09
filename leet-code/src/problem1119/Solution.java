package problem1119;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("remove Vowels in a String: " + 
		obj.removeVowels("leetcodeisacommunityforcoders"));

	}
	 public String removeVowels(String S) {
		 
		 S = S.replaceAll("[aeiou]", "");
	     return S;
	        
	    }

}
