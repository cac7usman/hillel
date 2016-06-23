package hw_02_01_operators;

public class HW_02_01_03_Sum
{
	public static int getSum(int a, int b, int c)
	{
		int sum = 0;

		if (a >= 0)
			sum += a;
		if (b >= 0)
			sum += b;
		if (c >= 0)
			sum += c;

		return sum;
	}
}
