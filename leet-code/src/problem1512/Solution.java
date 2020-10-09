package problem1512;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] nums = {1,1,1,1};
		System.out.println("Number of Good Pairs: " + obj.numIdenticalPairs(nums));
	}
	
	 public int numIdenticalPairs(int[] nums) {
		 int count =0;
		 for(int i=0; i<nums.length-1; i++) {
			 for(int j =i+1; j<nums.length; j++) {
				 if(nums[i]==nums[j] && i<j) {
					 count++;
				 }
			 }
		 }
		return count;
	        
	    }

}
