package problem412;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		System.out.println("List Representation of numbers with Strings Fizz, Buzz, FizzBuzz: "
				+ obj.fizzBuzz(15));
		}
	
	 public List<String> fizzBuzz(int n) {
		 
		 List<String> sList = new ArrayList<>(n);
		 for(int i=0; i<=n; i++) {
			 
			 if ((i%3==0) && (i%5==0)){
				 sList.add("FizzBuzz");
			 }
		    else if(i%3==0) {
				 sList.add("Fizz");
			 }
			 else if(i%5==0) {
				 sList.add("Buzz");
			 }
			 
			 
			 else {
				 sList.add(""+i);
			 }
		 }
		 
		  return sList;
	        
	 }

}
