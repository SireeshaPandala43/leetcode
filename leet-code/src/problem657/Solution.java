package problem657;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Robot Return to Origin: " + obj.judgeCircle("UDLR"));

	}
	
  public boolean judgeCircle(String moves) {
	  int upDown =0, leftRight = 0;
	  if(moves.length()%2==0) {
		  for(int i=0; i<moves.length(); i++) {
			 switch (moves.charAt(i)) {
			
			 case 'U': 
				upDown++;
				break;
			 case 'D': 
					upDown--;
					break;
			 case 'L': 
					leftRight++;
					break;
			 default:
				leftRight--;
				break;
			}
		  }
		  if(upDown ==0 && leftRight ==0) {
			  return true;
		  }
	  }
	return false;
        
    }

}
