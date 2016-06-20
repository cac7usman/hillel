package hw_02_03_arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HW_02_03_09_BubbleSortTest
{

	@Test
	public void testBubbleSort_01()
	{
		int[] array =
		{ 5, 4, 3, 2, 1 };
		HW_02_03_09_BubbleSort.BubbleSort(array);
		assertArrayEquals(new int[]
		{ 1, 2, 3, 4, 5 }, array);
	}

	@Test
	public void testBubbleSort_02()
	{
		int[] array =
		{ -10, 50, 0, 20 };
		HW_02_03_09_BubbleSort.BubbleSort(array);
		assertArrayEquals(new int[]
		{ -10, 0, 20, 50 }, array);
	}

	@Test
	public void testBubbleSort_03()
	{
		int[] array =
		{ 1, 0, 0, 0, 0 };
		HW_02_03_09_BubbleSort.BubbleSort(array);
		assertArrayEquals(new int[]
		{ 0, 0, 0, 0, 1 }, array);
	}

	@Test
	public void testBubbleSort_04()
	{
		int[] array =
		{ -1, -100, -2, -50 };
		HW_02_03_09_BubbleSort.BubbleSort(array);
		assertArrayEquals(new int[]
		{ -100, -50, -2, -1 }, array);
	}

}
