package hw_02_02_loops;
/*
 * Найти сумму четных чисел и их количество в диапазоне от 1 до 99
 */

public class HW_02_02_01_SumRange
{
	public static int getSum()
	{
		int sum = 0;
		for (int i = 1; i <= 99; i++)
		{
			if (i % 2 == 0)
			{
				sum += i;
			}
		}
		return sum;
	}

	public static int getQ()
	{
		return 49;
	}
}