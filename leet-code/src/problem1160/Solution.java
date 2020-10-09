package problem1160;

public class Solution {

	public static void main(String[] args) {
		
		Solution obj = new Solution();
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		System.out.println("Length of Words That Can Be Formed by Characters: "
				+ obj.countCharacters(words, chars));
 
	}
	
	 public int countCharacters(String[] words, String chars) {
		 int count = 0;
		 char[] characters = chars.toCharArray();
		 for(int i=0; i<words.length; i++) {
			 String word = words[i];
			 int length = word.length();
			 for(int j =0; j<characters.length; j++) {
				 
				 word = word.replaceFirst(""+ characters[j], "");
				 word = word.trim();
		     }
			 if(word.length()==0) {
				 count = count + length;
			 }
			 
		 }
		 
		return count;
		 
	 }

}
