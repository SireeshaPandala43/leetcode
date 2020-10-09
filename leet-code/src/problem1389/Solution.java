package problem1389;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		int[] target = obj.createTargetArray(nums, index);
		System.out.println("Creating Target Array: ");
		for(int i=0; i<target.length; i++) {
			System.out.println(target[i]);
		}

	}
	
  public int[] createTargetArray(int[] nums, int[] index) {
	  List<Integer> integers = new ArrayList<Integer>();
	  for(int i=0; i<nums.length; i++) {
		  integers.add(index[i], nums[i]);
	  }	  
	  int[] result = new int[integers.size()];
	  for (int i = 0; i < result.length; i++) {
		result[i] = integers.get(i);
	}
	  return result;
        
    }

}
