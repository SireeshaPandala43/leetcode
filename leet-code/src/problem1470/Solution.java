package problem1470;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		int[] nums1 = obj.shuffle(nums, n);
		System.out.println("Shuffle the Array: ");
		for(int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}
	
    public int[] shuffle(int[] nums, int n) {
    	int size = nums.length;
    	int[] shuffledArray = new int[nums.length];
    	for (int i = 0,j = 0; (i < size)&&(j < size); i++,j=j+2) {
			shuffledArray[j] = nums[i];
			shuffledArray[j+1] = nums[i+n];
		}
        return shuffledArray;
    
        
    }

}
