package problem1544;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Make The String Great: " + obj.makeGood("leEeetcode"));

	}
 public String makeGood(String s) {
	 for(int i=0; i<s.length(); i++) {
		 String good = s.substring(i, i+2).toLowerCase();
		 if(good != s.substring(i, i+2)) {
			 
		 }
	 }
	return s;
        
    }

}
