package problem551;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		System.out.println("Student Attendance Record whether he can be rewarded or not: "
				+ obj.checkRecord("ALL"));
		

	}
   public boolean checkRecord(String s) {
	   if (s.contains("LLL")||(s.indexOf('A')!=s.lastIndexOf('A'))) {
			return false;
		} else {
			return true;
		}
	 
    }

}
