package problem217;

import java.util.Arrays;


public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] nums = {1,2,3,4};
		System.out.println("Duplicates exist or not: " + obj.containsDuplicate(nums));
		
	}
	
	 public boolean containsDuplicate(int[] nums) {
		 Arrays.sort(nums);
		 for(int i=0;i<nums.length-1;i++) {
			 if(nums[i]==nums[i+1]) {
				 return true;
			 }
		 }
		 return false;
	 }

}
