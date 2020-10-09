package problem1323;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Maximum 69 Number: " + obj.maximum69Number(9669));

	}
	
	 public int maximum69Number (int num) {
		 
		 String nums1 = "" + num;
		 nums1 = nums1.replaceFirst("6", "9");
		 int nums2 = Integer.parseInt(nums1);
		 
		return nums2;
	        
	    }

}
