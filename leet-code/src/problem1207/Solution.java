package problem1207;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] arr = {1,2,2,1,1,4,};
		System.out.println("Unique Occurances or not: " + 
		obj.uniqueOccurrences(arr));

	}
	 public boolean uniqueOccurrences(int[] arr) {
		 Set<Integer> set1 = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		 Set<Integer> set2 = new HashSet<>();
		 for(Integer i : set1) {
			 int count =0;
			 for(int j =0; j<arr.length; j++) {
				 if (i == arr[j]) {
					 count++;
				 }
			 }
			 set2.add(count);
		 }
		 if(set1.size()==set2.size()) {
			 return true;
		 }
		return false;
	        
			
		    }

}
