package problem605;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] flowerbed = {0,1,0};
		int n = 1;
		System.out.println("Flowers can be  placed or not: " + obj.canPlaceFlowers(flowerbed, n) );
	}
	
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
		 boolean flowers = true;
		 int j = 0;
		 if(flowerbed.length == 1 && flowerbed[0] == 0) {
			 j++;
		 }
		 else {
		 for(int i=0; i<flowerbed.length; i++) {
		 if (i==0) {
			 if(flowerbed[0] ==0 && flowerbed[1]==0){
				 j++;
				 flowerbed[0] = 1;
			 }
			 }
		else if (i==flowerbed.length-1) {
					if (flowerbed[i]==0&&flowerbed[i-1]==0) {
						j++;
						flowerbed[i] = 1;
					}
				}
				else {
					if (flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0) {
						j++;
						flowerbed[i] = 1;
					}
				}
		    }
		 }
		 if(j>=n) {
			 return flowers;
		 }
		 else {
			 flowers = false;
		 }
		return flowers;
	        
	    }
	

}
