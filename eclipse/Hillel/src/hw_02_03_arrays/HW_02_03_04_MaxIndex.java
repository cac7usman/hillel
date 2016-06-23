package hw_02_03_arrays;

/*
 * Найти индекс максимального элемента массива
 */
public class HW_02_03_04_MaxIndex
{

	public static int getMaxIndex(int[] array)
	{
		if (array == null || array.length == 0)
			throw new IllegalArgumentException();
		int index = 0;

		for (int i = 0; i < array.length; ++i)
		{
			if (array[0] < array[i])
			{
				array[0] = array[i];
				index = i;
			}
		}
		return index;
	}
}
