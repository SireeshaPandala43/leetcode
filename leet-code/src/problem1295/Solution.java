package problem1295;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] nums = {12,345,2,6,7896};
		System.out.println("Numbers with Even Number of Digits: "
				+ obj.findNumbers(nums));
		

	}
	
	 public int findNumbers(int[] nums) {
		 int  sum = 0, n;
		 for(int i=0; i<nums.length; i++) {
			   n = nums[i];
			   int count = 0, quo=1;
			   while(quo>0) {
				   quo = n/10;
				   n=n/10;
				   count++;
				  }
			   if(count%2==0) {
				   sum++ ;
			   }
			 
		 }
		return sum;
	        
	    }

}
