package problem1464;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] nums = {3,4,5,2};
		System.out.println("Maximum Product of Two Elements in an Array: " +
		obj.maxProduct(nums));

	}
	
public int maxProduct(int[] nums) {
	int temp =0;
	for(int i=0; i<nums.length-1; i++) {
		for(int j=i+1; j<nums.length; j++) {
			if(nums[i]<=nums[j]) {
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		
	   }
	int product = (nums[0]-1) * (nums[1]-1);
	
	return product;
        
    }

}
