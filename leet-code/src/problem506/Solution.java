package problem506;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] nums = {10,3,8,9,4};
		String[] medals1 = obj.findRelativeRanks(nums);
		for(int i=0; i<medals1.length; i++) {
			System.out.println(medals1[i]);
		}
		

	}
	
	 public String[] findRelativeRanks(int[] nums) {
		 String[] medals = new String[nums.length];
		 int count =0;
		 int[] ranks = new int[nums.length];
		 for(int i=0; i<nums.length; i++) {
			 ranks[i] = nums[i];
		 }
		 
		 Arrays.sort(nums);
		
		 for(int i=nums.length-1; i>=0; i--) {
			 System.out.println("nums after sort : "+nums[i]);
			 for(int j=0 ; j<ranks.length; j++) {
				 if(nums[i] == ranks[j]) {
					 count++;
					 if(count ==1) {
						 medals[j] = "Gold Medal"; 
					 }
					 else if (count ==2) {
							medals[j] = "Silver Medal";
						}
						else if (count ==3) {
							medals[j] = "Bronze Medal";
						}
						else
							medals[j] = ""+ count;
					 
					 
				 }
			 }
		 }
		 
		
			return medals;
		 
	    }
	
	

}
