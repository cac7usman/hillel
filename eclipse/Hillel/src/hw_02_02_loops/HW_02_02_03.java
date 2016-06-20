package hw_02_02_loops;
/*
 * Найти корень натурального числа с точностью до целого
 */

public class HW_02_02_03
{
	public static void main(String[] args)
	{
		int c = (int) Math.round(getSqrt(2));
		System.out.println(c);

	}

	public static double getSqrt(int x)
	{
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