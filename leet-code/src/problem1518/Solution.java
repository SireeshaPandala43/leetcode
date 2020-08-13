package problem1518;

public class Solution {

	public static void main(String[] args) {
	
		Solution obj = new Solution();
		System.out.println("Maximum number of water bottles that are drunk: " +
		obj.numWaterBottles(27, 3));
	}
	
public int numWaterBottles(int numBottles, int numExchange) {
	
	int quotient, remainder, total = numBottles, qradd = 0;
	int dividend = numBottles;
	while(dividend>=numExchange) {
		quotient = dividend/numExchange;
		remainder = dividend%numExchange;
		qradd = quotient + remainder;
		total = total + quotient;
		dividend = qradd;
		}
	 
	return total;
	
  }
}
