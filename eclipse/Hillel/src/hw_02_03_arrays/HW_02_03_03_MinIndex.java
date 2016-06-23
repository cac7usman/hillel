package hw_02_03_arrays;

/*
 * Найти индекс минимального элемента массива
 */
public class HW_02_03_03_MinIndex
{

	public static int getMinIndex(int[] array)
	{
		if (array == null || array.length == 0)
			throw new IllegalArgumentException();
		int index = 0;

		for (int i = 0; i < array.length; ++i)
		{
			if (array[i] < array[0])
			{
				array[0] = array[i];
				index = i;
			}

		}
		return index;

	}
}
