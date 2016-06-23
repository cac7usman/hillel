package hw_02_02_loops;
/*
 * Найти корень натурального числа с точностью до целого
 */

public class HW_02_02_03_Sqrt
{
	public static double getSqrt(int x)
	{
		if (x < 0)
			throw new IllegalArgumentException();
		double number = 1;
		double result = 0;

		while (x > 0)
		{
			x = (int) (x - number);
			number = number + 2;
			result = result + ((x < 0) ? 0 : 1);
		}
		return result;
	}

}
