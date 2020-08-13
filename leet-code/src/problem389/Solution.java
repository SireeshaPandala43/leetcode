package problem389;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("To find the difference of a letter added: " + 
		obj.findTheDifference("abcd", "abcde"));
		
		
	}
	
    public char findTheDifference(String s, String t) {
    	
    	char[] schar = s.toCharArray();
    	
    			
    		
    	  for (int i=0; i<schar.length; i++) {
    		  t = t.replaceFirst("" + schar[i], "");
    	  }
    		
    	
    	
    	t.trim();
    	
		
    	return t.charAt(0);
        
    }

}
