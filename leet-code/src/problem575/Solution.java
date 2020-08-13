package problem575;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] candies = {1,2,3,4,5,6,6,6};
		
		
		System.out.println("Maximum number of kinds of candies given to Sister: " + 
		obj.distributeCandies(candies));
		
		}
	
	public int distributeCandies(int[] candies) {
		
		 int range = (candies.length)/2;
		Set<Integer> candieSet = Arrays.stream(candies).boxed().collect(Collectors.toSet());
		int uniqueCandies = candieSet.size();
		if (uniqueCandies<=range) {
			return uniqueCandies;
		} else {
			return range;
		}	 
		 
	 }

}