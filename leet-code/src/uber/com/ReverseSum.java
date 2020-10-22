package uber.com;

public class ReverseSum {

	public static void main(String[] args) {
		ReverseSum obj = new ReverseSum();
		int[] arr = {0, 100, 2040};
		System.out.println("Sum of Reversed in array: " + obj.sumOfReversed(arr));

	}

	private int sumOfReversed(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int rev;
			if (arr[i]%10==0&&arr[i]!=0) {
				int count = 0;
				int n = arr[i];
				while(n%10==0)
				{
					count++;
					n = n/10;
				}
				String str = ""+arr[i];
				String revStr = new StringBuffer(str.substring(0, str.length()-count))
						.reverse().append(str.substring(str.length()-count)).toString();
				rev = Integer.parseInt(revStr);
			} else {
				rev = Integer.parseInt(new StringBuffer(""+arr[i]).reverse().toString());
			}
			sum = sum + rev;
		}
		return sum;
	}
}


