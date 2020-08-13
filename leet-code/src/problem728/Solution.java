package problem728;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		List<Integer> intobj = new ArrayList<Integer>(obj.selfDividingNumbers(1, 22));
		System.out.print("Self Dividing numbers: ");
		for(int i=0; i<intobj.size();i++) {
			
			System.out.print(" "+ intobj.get(i));
		}
		
	}
	 public List<Integer> selfDividingNumbers(int left, int right) {
		 List<Integer> sList = new ArrayList<>();
		 for(int i=left; i<=right; i++) {
			 
			 boolean divisible = true;
			 int k =i;
			 
			 while(k > 0) {
			 int l = k%10; 
			 if(l==0) {
			    divisible = false;
				break; 
			 }
			 else if(i%l==0) {
				 k = k/10;
			 }
			 else {
				 divisible = false;
				 break;
			 }
				 
		 }
			 
			if(divisible) {
				sList.add(i);
			}
		 }
		
		 
		 return sList;
	        
	    }

}
