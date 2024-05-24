public class TrailingZeros2 {
	// Function to return trailing
	// 0s in factorial of n
	static int findTrailingZeros(int n)
	{
		if (n < 0) 
			return -1;

		int count = 0;

		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;

		return count;
	}
	public static void main(String[] args)
	{
		int n = 5;
		System.out.println(findTrailingZeros(n));
	}
}
