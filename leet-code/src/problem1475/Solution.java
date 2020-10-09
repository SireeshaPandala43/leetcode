package problem1475;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		int[] prices = {8,4,6,2,3};
		int[] fprices = obj.finalPrices(prices);
		System.out.println("Final Prices With a Special Discount in a Shop: ");
		for(int i=0; i<fprices.length; i++) {
			System.out.println(fprices[i]);
		}
	}
	
     public int[] finalPrices(int[] prices) {
    	 int[] finalprice = new int[prices.length];
    	 for(int i=0; i<=prices.length; i++) {
    		 for(int j = i+1; j<prices.length; j++) {
    			
    			 if(prices[i] >= prices[j]) {
    				 finalprice[i] = prices[i]- prices[j];
    				 break;
    			 }
    			 else 
    				 finalprice[i] = prices[i];
    			
    	     }
    		 if(i == prices.length-1) {
				 finalprice[i] = prices[i];
			 }
    	 }
		return finalprice;
        
    }

}
