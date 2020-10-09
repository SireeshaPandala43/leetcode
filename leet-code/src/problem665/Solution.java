package problem665;

public class Solution {

	public static void main(String[] args) {
	Solution obj = new Solution();
	int[]nums = {4,2,1};
	System.out.println("Non Decreasing Array or not: " + obj.checkPossibility(nums));
	 }
	
public boolean checkPossibility(int[] nums) {
	int count = 0;
	for(int i=0; i<nums.length-1; i++) {
		
		
			if(nums[i]>nums[i+1]) {
				count ++;
			}
			
			if(count >1) {
				return false;
			}
	}
	return true;
        
    }

}
