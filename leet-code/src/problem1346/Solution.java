package problem1346;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] arr = {10,3,1,7, 2};
		System.out.println("Check if a Number and its Double exist or not: " + 
		obj.checkIfExist(arr));
		
	}
	
   public boolean checkIfExist(int[] arr) {
	   for(int i = 0; i<arr.length; i++) {
		   for(int j = 0; j<arr.length; j++) {
			   if(arr[i] == 2 *arr[j] && i!=j) {
				   
				   return true;
				}
		   }
		   
		}
	
	   return false;
        
    }

}
