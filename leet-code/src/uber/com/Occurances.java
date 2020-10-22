package uber.com;

public class Occurances {

	public static void main(String[] args) {
		Occurances obj = new Occurances();
		int n = 100;
		System.out.println("No. of Occurances: "+ obj.getOccurances(n));

	}

	private  int getOccurances(int n) {
		int count = 1;
		for(int i=1; i<=n; i++) {
			int num = i;
			while(num > 0) {
				int r = num%10;
				if( r == 0 || r == 2 || r == 4) {
					count++;
				}
				
				num = num/10;
				
			}
		}
		return count;
	}

}
