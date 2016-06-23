package hw_02_02_loops;
/*
 * Посчитать сумму цифр заданного числа
 */

public class HW_02_02_05_Sum
{
	public static int getSum(int x)
	{
		int sum = 0;

		while (x != 0)
		{
			sum += (x % 10);
			x /= 10;
		}

		return sum;
	}
}
