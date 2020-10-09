package problem1005;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] A = {4,2,3};
		int K = 1;
		System.out.println("Maximum sum of Array after K Negations: " +
		obj.largestSumAfterKNegations(A, K));
	}
	
  public int largestSumAfterKNegations(int[] A, int K) {
	int sum = 0;
	 Arrays.sort(A);
 	for (int i = 0; i < K; i++) {
			A[0] = -A[0];
			Arrays.sort(A);
		}
 	
 	for (int i = 0; i < A.length; i++) {
			sum = sum+A[i];
		}
 	return sum;
   
  }

}
