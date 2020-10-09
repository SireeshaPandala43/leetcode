package problem682;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		System.out.println("Total points we get in all the rounds: " +
		obj.calPoints(ops));

	}
	
	 /**
	 * @param ops
	 * @return
	 */
	public int calPoints(String[] ops) {
		 int sum = 0;
		 for(int i=0; i<ops.length; i++) {
			 
			 System.out.println("String Element: " + ops[i]);
		  switch(ops[i]) {
		      
		  case "D": 
			  int k = i-1;
			  System.out.println(ops[k]);
			  int m = Integer.parseInt(ops[k]);
			  System.out.println("m value: " + m);
			  /*for(int k=i-1; k<=0; k--) {
				  int m = Integer.parseInt(ops[k]);
				  System.out.println("m value: " + m);
				  m = 2*m;
				  ops[i] = ""+ m;
				  sum = sum + m;
				  break;
			 }*/
		  
		  case "C":
			  
			  int prev = Integer.parseInt(ops[i-1]);
			  sum = sum -prev;
			  
		  case "+":
			  int count =0, points = 0;
			  for(int k1=i-1; k1<=0; k1--) {
				  int m1 = Integer.parseInt(ops[k1]);
				  while(m1>0) {
					  count++;
					  points = points + m1;
					  if(count ==2) {
						  break;
					  }
				 }
			  }
			  
			  ops[i] = "" + points;
			  
			  sum = sum + points;
			  
			  
		  default:
			  int z = Integer.parseInt(ops[i]);
			  sum = sum + z;
			}
		  System.out.println("Sum value: " + sum);
		 }
		return sum;
	        
	    }

}
