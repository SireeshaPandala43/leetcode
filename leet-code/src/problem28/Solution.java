package problem28;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		System.out.println("Implement strStr(): " + obj.strStr("hello", "ll"));
		

	}
	
 public int strStr(String haystack, String needle) {
	return haystack.indexOf(needle);
        
    }

}
