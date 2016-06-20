package hw_02_03_arrays;

/*
 * Поменять местами первую и вторую половину массива, например, для массива 1 2 3  4, результат 3 4 1 2
 */
import java.util.Arrays;

public class HW_02_03_08
{

	public static void main(String[] args)
	{
		int[] array =
		{ 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(getSwap(array)));

	}

	public static int[] getSwap(int[] array)
	{
		int m, k;
		m = array.length / 2;
		if (array.length % 2 != 0)
			k = m + 1;
		else
			k = m;
		for (int i = 0; i < m; i++)
		{
			int tmp = array[i];
			array[i] = array[k + i];
			array[k + i] = tmp;

		}
		return array;
	}

}
