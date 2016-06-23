package hw_02_02_loops;
/*
 * Проверить простое ли число?
 */

public class HW_02_02_02_Prime
{
	public static boolean isPrime(int n)
	{
		for (int i = 2; i <= Math.sqrt((n)); i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
