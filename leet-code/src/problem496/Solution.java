package problem496;

public class Solution {

	public static void main(String[] args) {
		
	int[] nums1 = {2,4};
	int[] nums2 = {1,2,3,4};
	
	Solution obj = new Solution();
	System.out.println("Next Greater element: ");
	int[] nums3 = obj.nextGreaterElement(nums1, nums2);
	for (int i = 0; i < nums3.length; i++) {
		System.out.println(nums3[i]);
	}
	}
	
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		 int nums3[] = new int[nums1.length];
		
		 for(int i=0; i<=nums1.length-1;i++) {
			
			 for(int j=0;j<=nums2.length-1; j++) {
				
				if(nums1[i]==nums2[j]) {
					nums3[i] = -1;
					for (int k = j; k < nums2.length-1; k++) {
						if(nums2[j]<nums2[k+1]) {
						nums3[i] = nums2[k+1];
						break;	
					}
					}
				}
			}
		 }
		 
		 return nums3;
	        
	    }

}
