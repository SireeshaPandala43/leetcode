package problem1431;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> candy = new ArrayList<Boolean>();
		candy = obj.kidsWithCandies(candies, extraCandies);
		System.out.println("Kids with Greatest Number of Candies: ");
		for(int i=0; i<candy.size(); i++) {
			System.out.println(candy.get(i));
		}
	}
	 
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max =0 , temp;
		List<Boolean> kids = new ArrayList<Boolean>();
		for(int i=0; i<candies.length; i++) {
			if (candies[i]>max) {
				max = candies[i];
			}
													
		}
		for(int i=0; i<candies.length; i++) {
			temp =  candies[i] + extraCandies;
			if(temp>=max) {
				kids.add(i, true);;
			}
			else
				kids.add(i, false);
		}
		
		
		return kids;
	        
	    }

}
