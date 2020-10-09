package problem1133;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] A = {9,9};
		System.out.println("Largest Unique Number: "+
		obj.largestUniqueNumber(A));

	}
	
  public int largestUniqueNumber(int[] A) {
	Arrays.sort(A);
	for(int i = A.length-1; i>=0; i--) {
		int count = 0;
		for(int j = i-1; j>=0; j--) {
			if(A[i]==A[j]) {
				count++;
			}
		}
		if(count==0)
		{
			return A[i];
			
		}
		else
			i = i-count;
			
	}
	 
	return -1;
        
    }

}
