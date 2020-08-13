package problem414;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		
		int[] nums = {0,0,2};
		
		System.out.println("Third Maximum Number: " + obj.thirdMax(nums));
		
	}
	
	 public int thirdMax(int[] nums) {
		 int temp = 0, count = 1;
		 Arrays.sort(nums);
		 for(int i =0; i<nums.length;i++) {
			 System.out.println(nums[i]);
		 }
		
		 
		 
		 for(int i =nums.length-1; i > 0; i--) {
			 if(nums[i]>nums[i-1]) {
				 count++;
			 }
			 if(count ==3) {
				 
				 temp = nums[i-1];
				 break;
			 }
			 
                 
			 }
		 if(count <3) {
				temp = nums[nums.length-1];
			 }
		 
		 
		 return temp;
	        
	    }

}
