package problem1413;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] nums = {1, -2,-3};
		System.out.println("Minimum positive start value to get step by step sum positive: "
				+ obj.minStartValue(nums));
		

	}
	
	 public int minStartValue(int[] nums) {
		 int startValue = 1;
		 int sum = 1;
		  for(int i=0; i<nums.length; i++) {
			sum = sum + nums[i];
			  if(sum<1) {
					int difference = 1 - sum;
					startValue = startValue+difference;
					sum = startValue;
					i=-1;
			 }
			
		}
	
		return startValue;
		
   }

}
