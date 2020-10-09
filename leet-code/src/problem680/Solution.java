package problem680;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Valid Palindrome or not: " + obj.validPalindrome("deeee"));
	}
	
	 public boolean validPalindrome(String s) {
		 char[] ch = s.toCharArray();
		 int j = ch.length-1;
		 int count =0;
		 for(int i=0; i<ch.length/2; i++) {
			
			 if(i==0) {
				 if(ch[i]!=ch[j]) {
					 count++;
			 }
			
		}
			 else if(ch[i]==ch[j]) {
				 j--;
			 }
			 else
			 count++;
			}
		
			if(count<=1) {
				return true;
			}
		 
		
     
    return false;
		 
     }

}
