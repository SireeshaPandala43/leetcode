package problem215;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] nums = {1,5,4,8,6,5,7,8,};
		int k = 4;
		System.out.println("Kth Largest element in an Array: " + obj.findKthLargest(nums, k) );

	}
	
    public int findKthLargest(int[] nums, int k) {
    	int temp;
    	for(int i=0; i<nums.length -1; i++) {
    		for(int j= i+1; j<nums.length; j++) {
    			if(nums[i]<nums[j]) {
    				temp = nums[i];
    				nums[i] = nums[j];
    				nums[j] = temp;
    			}
    		}
    	}
    	
		return nums[k-1];
    	
        
    }

}


