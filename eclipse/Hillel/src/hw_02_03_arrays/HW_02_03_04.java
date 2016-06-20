package hw_02_03_arrays;

/*
 * Найти индекс максимального элемента массива
 */
public class HW_02_03_04
{

	public static void main(String[] args)
	{
		int[] data = new int[]
		{ -1, -2, -3, -5, -2, -6, -1007, -1770, 0, -5 };

		System.out.println("Index of maximum element is " + getMaxIndex(data));

	}

	public static int getMaxIndex(int[] array)
	{
		int index = 0;
		int max = array[0];

		for (int i = 0; i < array.length; ++i)
		{
			if (max < array[i])
			{
				max = array[i];
				index = i;
			}

		}
		return index;
	}

}
