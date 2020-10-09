package problem1304;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
	    int[] z = obj.sumZero(6);
	    System.out.println("Unique Array of which their sum is zero: " );
	    for(int i=0;i<z.length; i++) {
	    	System.out.println(z[i]);
	    }

	}
	
	 public int[] sumZero(int n) {
		 int[] uniq = new int [n];
		 int i = -(n/2);
		 int j=0;
		 if(n%2 == 0) {
			 while(i<= n/2) {
				uniq[j] = i;
				i++;
				j++;
				if (i == 0){
					i++;
				}
				
			 }
		 }
		 else {
		 while(i<= n/2) {
				uniq[j] = i;
				i++;
				j++;
		}
	}
		 
		return uniq;
	        
	    }

}
