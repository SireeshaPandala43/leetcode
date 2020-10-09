package problem507;

public class Solution {
	
	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Perfect Number or not: " + obj.checkPerfectNumber(28));
   }
	
	 public boolean checkPerfectNumber(int num) {
		 int divisible = 0;
	        if (num == 0){
	            return false;
	        }
	        else{
			 for(int i =1; i<=num/2; i++ ) {
				 	if(num%i==0) {
				 		divisible = divisible + i;
				 	}
			 }
	    }
			 if(divisible == num) {
				 return true;
			 }
			 
			 else
			 return false;
		        
	        
	        
	    }

}
