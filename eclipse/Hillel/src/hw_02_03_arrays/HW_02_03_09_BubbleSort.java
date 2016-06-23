package hw_02_03_arrays;

public class HW_02_03_09_BubbleSort
{

	public static void BubbleSort(int[] array)
	{
		if (array == null || array.length == 0)
			throw new IllegalArgumentException();
		for (int i = array.length - 1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (array[j] > array[j + 1])
				{
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}

}
