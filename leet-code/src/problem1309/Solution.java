package problem1309;

import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		
		System.out.println("Decrypt String from Alphabet to Integer Mapping: "
		+ obj.freqAlphabets("132262#"));
	}
	
 public String freqAlphabets(String s) {
	 char[] firstAlpha = new char[] {'$','a','b','c','d','e','f','g','h','i'};
	 for(int i=0; i<s.length()-2; i++) {
		if(s.charAt(i+2)!= '#') {
			
			s.replaceFirst("[123456789]","" +firstAlpha[s.charAt(i)]);
		}
	 }
	return s;
        
    }

}
