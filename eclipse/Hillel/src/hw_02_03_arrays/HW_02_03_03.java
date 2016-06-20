package hw_02_03_arrays;

/*
 * Найти индекс минимального элемента массива
 */
public class HW_02_03_03
{
	public static void main(String[] args) throws Exception
	{
		int[] data = new int[]
		{ -1, -2, -3, -5, -2, -6, -1007, -1770, 0, -5 };

		System.out.println("Index of minimum element is " + getMinIndex(data));
	}

	public static int getMinIndex(int[] array)
	{
		int index = 0;
		int min = array[0];

		for (int i = 0; i < array.length; ++i)
		{
			if (array[i] < min)
			{
				min = array[i];
				index = i;
			}

		}
		return index;

	}
}
