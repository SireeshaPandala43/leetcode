package problem860;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] bills = {5,5,10,10,20};
		System.out.println("Lemonade Change: " + obj.lemonadeChange(bills));
		

	}
	
    public boolean lemonadeChange(int[] bills) {
    	boolean change = true;
    	int  i5 =0, i10= 0;
    	if(bills[0] ==5)
    		i5++;
    	else change = false;
    for(int i=1; i<bills.length; i++) {
    		if(bills[i] == 5) {
    			i5++;
    		}
    		else if (bills[i] == 10) {
    			if(i5>0) {
    				 
    				 i10++;
    				 i5--;
    			}
    			else change = false;
    		}
    			else if (bills[i] == 20) {
    				if(i5>0) {
    					if (i10>0) {
							i10--;
							i5--;
						} else if(i5>=3){
							i5 = i5-3;
						}
						else
						{
							change = false;
						}
    				}
    				
    				else {
    					change = false;
    				}
    			}
    		}
    	
	return change;
        
    }

}
