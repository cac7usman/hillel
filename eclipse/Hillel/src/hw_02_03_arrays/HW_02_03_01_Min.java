package hw_02_03_arrays;

/*
 * Найти минимальный элемент массива
 */
public class HW_02_03_01_Min
{

	public static int getMin(int[] array)
	{
		if (array == null || array.length == 0)
			throw new IllegalArgumentException();

		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < array[0])

				array[0] = array[i];
		}

		return array[0];
	}
}
