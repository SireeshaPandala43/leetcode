package problem1556;

public class Solution {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println("Thousand Seperator: "+ obj.thousandSeparator(1234));
	}
	
public String thousandSeparator(int n) {
	String temp = "" + n;
	String s= "";
	int length = temp.length();
	while(length>3) {
		s = "." + temp.substring(length-3, length) + s;
		length = length -3;
		
	}
	return temp.substring(0, length)+ s;
        
    }

}
