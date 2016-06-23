package hw_02_03_arrays;

/*
 * Найти максимальный элемент массива
 */
public class HW_02_03_02_Max
{

	public static int getMax(int[] array)
	{
		if (array == null || array.length == 0)
			throw new IllegalArgumentException();
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > array[0])
				array[0] = array[i];
		}
		return array[0];
	}
}
