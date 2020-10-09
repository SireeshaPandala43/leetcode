package problem1281;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		
		System.out.println("Subtract the Product and Sum of Digits of an Integer: "
				+ obj.subtractProductAndSum(234));
		
      }
	
	 public int subtractProductAndSum(int n) {
		 List<Integer> nums = new ArrayList<Integer>();
         int rem, diff, prod = 1, sum =0 ;
		 while(n>0) {
			 rem= n%10;
			 n = n/10;
			 nums.add(rem);
		 }
		 for(int i = 0; i<nums.size(); i++) {
			 prod = prod * nums.get(i);
			 sum = sum + nums.get(i);
		 }
		 diff = prod - sum;
		return diff;
	        
	    }

}
