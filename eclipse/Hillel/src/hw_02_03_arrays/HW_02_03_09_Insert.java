package hw_02_03_arrays;

public class HW_02_03_09_Insert
{
	public static void InsertSort(int[] array)
	{
		if (array == null || array.length == 0)
			throw new IllegalArgumentException();
		for (int i = 0; i < array.length; i++)
		{
			int temp = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > temp)

			{
				array[j + 1] = array[j];

				j--;
			}
			array[j + 1] = temp;

		}

	}

}
