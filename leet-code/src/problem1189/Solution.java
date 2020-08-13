package problem1189;

import java.util.Collections;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
	
		Solution obj = new Solution();
		System.out.println("Maximum number of String  \"Balloon\": " + 
		 obj.maxNumberOfBalloons("nnoobbmllan") );
		}
	
    public int maxNumberOfBalloons(String text) {
    	HashMap<Character, Integer> mapobj = new HashMap<>(5); 
    	int ib=0, ia=0, il=0, io=0,in =0;
    	char[] charArray = text.toCharArray();
    	for(int i=0; i<charArray.length;i++) {
    	switch(charArray[i]) {
    	case 'b':
    		ib++;
    		break;
    	case 'a':
    		ia++;
    		break;
    	case 'l':
    		il++;
    		break;
    	case 'o':
    		io++;
    		break;
    	case 'n':
    		in++;
    		break;
    	}
  
   }
    mapobj.put('b', ib);
    mapobj.put('a', ia);
    mapobj.put('l', il/2);
    mapobj.put('o', io/2);
    mapobj.put('n', in);
    
    return Collections.min(mapobj.values());
        
    }  

}
