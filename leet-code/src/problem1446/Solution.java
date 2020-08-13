package problem1446;

public class Solution {

	public static void main(String[] args) {
		
     Solution obj = new Solution();
     System.out.println("Power of String: " + obj.maxPower("leeeetcodddddd"));
     
	}
	
	 public int maxPower(String s) {
		 
		 int power = 1;
		 int maxPower = 1;
		 char[] ca = s.toCharArray();
		 System.out.println(ca);
		 
		 for(char output: ca) {
			 System.out.println(output);
		 }
		 
		 for(int i=1; i<ca.length; i++) {
			 if(ca[i]==ca[i-1]) {
		     power++;
			 }
			 else {
				 power = 1;
			 }	
			 if (power>maxPower)
			 {
				 maxPower = power;
			 }
		 }
		 
		return maxPower;
	    }
}
