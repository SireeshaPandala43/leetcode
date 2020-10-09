package problem1365;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] nums = {8,1,2,2,3};
		System.out.println("Numbers which are smaller than the current number in an array: ");
		int[] nums1 = obj.smallerNumbersThanCurrent(nums);
		for(int i=0; i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
	}
	
public int[] smallerNumbersThanCurrent(int[] nums) {
	int[] small = new int[nums.length];
	for(int i=0; i<nums.length;i++) {
		int count =0;
		for(int j=0; j<nums.length;j++) {
			if(nums[i]>nums[j]) {
				count++;
			}
		}
		small[i] = count;
	}
	return small;
        
    }

}
