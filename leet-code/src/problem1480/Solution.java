package problem1480;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] nums = {1,2,3,4};
		int[] nums1 = obj.runningSum(nums);
		System.out.println("Running Sum of 1d Array: ");
		for(int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}

	}
	
	 public int[] runningSum(int[] nums) {
		 int[] sum = new int[nums.length];
		 int j=1; 
	    sum[0] = nums[0];
		 for(int i=1; i<nums.length;i++) {
			 sum[i] = sum[i-1]+nums[i];
		 }
		return sum;
	        
	    }

}
