package hw_02_03_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Посчитать сумму элементов массива с нечетными индексами
 * 
 */
public class HW_02_03_05
{
	public static void main(String[] args)
	{
		int[] array = generateArray(10);

		System.out.println(Arrays.toString(array));
		System.out.println(getSum(array));
	}

	public static int getSum(int[] array)
	{
		int sum = 0;

		for (int i = 1; i < array.length; i += 2)
		{

			sum += array[i];
		}
		return sum;
	}

	private static int[] generateArray(int size)
	{

		Random random = new Random();
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
		{
			array[i] = random.nextInt(100);

		}

		return array;
	}
}