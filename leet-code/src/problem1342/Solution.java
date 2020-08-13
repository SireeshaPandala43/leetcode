package problem1342;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int num = 400;
	   System.out.println("Number of steps to reduce a Number to Zero: " + 
		obj.numberOfSteps(num));

	}
	
	 public int numberOfSteps (int num) {
		 int steps = 0;
		 int j;
		 while(num>0) {
			 
			 j = num % 2;
			 if(j == 0) {
				
				 num =num/2;
			 }
			 
			 else {
				 
				 num = num-1;
			 }
			 
			 steps++;	 
	   }
		 
		return steps;
	        
	    }

}
