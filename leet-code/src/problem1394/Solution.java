package problem1394;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] arr = {2,2,2,3,3};
		System.out.println("Lucky Integer: " + obj.findLucky(arr));
		
	}
	
	 public int findLucky(int[] arr) {
		 int[] lucky =new int[arr.length];
		 for(int i=0; i<arr.length; i++) {
			 int count = 1;
			 
			 for(int j=0; j<arr.length; j++) {
				 if((arr[i]==arr[j]) && (i!=j)) {
					 count++;
					 
				 }
			 }
			 
			 if(arr[i] == count) {
				 lucky[i] = arr[i];
			 }
			
			 
		 }
		 
		 Arrays.sort(lucky);
		if(lucky[0]!=0) {
			return lucky[lucky.length-1];
		}
		 else
		return -1;
	        
	    }

}
