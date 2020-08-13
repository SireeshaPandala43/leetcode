package problem172;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		System.out.println("Factorial Trailing Zeroes: " + obj.trailingZeroes(13));
		

	}
	
	 public int trailingZeroes(int n) {
		 long multiply = 1; 
		 int count = 0;
		 while(n>0) {
			 multiply = multiply * n;
			 n = n-1;
		 }
		 System.out.println(multiply);
		 
		 while(multiply%10 ==0) {
			 count++;
			 multiply = multiply/10;
		   }
	        
	   return count;
	   
	 }

}
