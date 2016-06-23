package hw_02_03_arrays;

/*
 * Отсортировать массив выбором
 */
public class HW_02_03_09_Select
{

	public static void SelectSort(int[] array)
	{
		if (array == null || array.length == 0)
			throw new IllegalArgumentException();
		for (int i = 0; i < array.length; i++)
		{

			int min = array[i];
			int min_index = i;

			for (int j = i + 1; j < array.length; j++)
			{

				if (array[j] < min)
				{
					min = array[j];
					min_index = j;
				}
			}

			if (i != min_index)
			{
				int tmp = array[i];
				array[i] = array[min_index];
				array[min_index] = tmp;
			}
		}
	}
}
