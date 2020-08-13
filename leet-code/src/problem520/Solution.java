package problem520;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Usage of Capitalsin the given string is right or not: "+
		 obj.detectCapitalUse("Google"));
		

	}
	
	 public boolean detectCapitalUse(String word) {
		 boolean capital = false;
		 String tempword = word.toLowerCase();
		 String capitalword = word.toUpperCase();
		 int n = word.length();
		 String firstletter = word.substring(0,1);
		 String remainingletters = word.substring(1, n);
		 String legalword = firstletter.toUpperCase().concat(remainingletters.toLowerCase());
		 if(word.equals(tempword)) {
			 capital = true;
		 }
		 else if (word.equals(capitalword)) {
			 capital = true;
		 }
		 else if (word.equals(legalword)) {
			 capital = true;
		 }
		 
		return capital;
	        
	    }

}
