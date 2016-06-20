package hw_02_03_arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * Посчитать количество нечетных элементов массива

 */
public class HW_02_03_07
{

	public static void main(String[] args)
	{
		int[] array = generateArray(10);

		System.out.println(Arrays.toString(array));
		System.out.println(getQ(array));
	}

	public static int getQ(int[] array)
	{
		int q = 0;

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % 2 != 0)
				q++;
		}
		return q;
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
