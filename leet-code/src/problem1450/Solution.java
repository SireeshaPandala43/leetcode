package problem1450;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] startTime = {1,2,3};
		int[] endTime = {3,2,7};
		int queryTime = 4;
		System.out.println("Number of Students doing HomwWork at a QueryTime: "
				+ obj.busyStudent(startTime, endTime, queryTime));
		}
	
	 public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		 int count = 0;
		 for(int i=0; i<startTime.length; i++) {
			 if(startTime[i]<=queryTime&&queryTime<=endTime[i]) {
				 count++;
			 }
		 }
		return count;
	        
	    }

}
