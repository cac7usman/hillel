package hw_02_03_arrays;

/**
 * Посчитать сумму элементов массива с нечетными индексами
 * 
 */
public class HW_02_03_05_OddSum
{
	public static int getSum(int[] array)
	{
		if (array == null || array.length == 0)
			throw new IllegalArgumentException();
		int sum = 0;

		for (int i = 1; i < array.length; i += 2)
		{

			sum += array[i];
		}
		return sum;
	}
}
