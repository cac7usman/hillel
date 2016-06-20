package hw_02_03_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Сделать реверс массива (массив в обратном направлении)
 * 
 */
public class HW_02_03_06
{
	public static void main(String[] args)
	{
		int[] array = generateArray(11);

		System.out.println(Arrays.toString(array));

		getReverse(array);

		System.out.println(Arrays.toString(array));

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

	public static void getReverse(int[] array)
	{
		for (int i = 0; i < array.length / 2; i++)
		{
			int tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = tmp;

		}
	}

}