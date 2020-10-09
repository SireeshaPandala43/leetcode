package problem387;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Index of First Unique character in a string: " + 
		obj.firstUniqChar("leetcodel"));
		
	}
	
    public int firstUniqChar(String s) {
    	for(int i=0; i<s.length(); i++) {
    		String temp = "" + s.charAt(i);
    		if(s.indexOf(temp) == s.lastIndexOf(temp)) {
    			return i;
    		}
    	}
    	
    	
		return -1;
        
    }

}
