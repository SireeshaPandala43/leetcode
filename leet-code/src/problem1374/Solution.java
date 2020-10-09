package problem1374;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(" Generate a String With Characters That Have Odd Counts: "
				+ obj.generateTheString(6));

	}
     public String generateTheString(int n) { 
    	 String s = "";
    	 for(int i=0; i<n; i++) {
    		 s = s+"p";
    	 }
    	 if(n%2 ==0) {
    		 s = s.replaceFirst("p","z");
    	 }
    	 return s;
    	}

}
