package hw_02_03_arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HW_02_03_06Test
{

	@Test
	public void testGetReverse_01()
	{
		int[] array =
		{ 1, 2, 3, 4, 5 };
		HW_02_03_06.getReverse(array);
		assertArrayEquals(new int[]
		{ 5, 4, 3, 2, 1 }, array);
	}

	@Test
	public void testGetReverse_02()
	{
		int[] array =
		{ -1, -2, -3, -4, -5 };
		HW_02_03_06.getReverse(array);
		assertArrayEquals(new int[]
		{ -5, -4, -3, -2, -1 }, array);
	}

	@Test
	public void testGetReverse_03()
	{
		int[] array =
		{ 0, 0, 1, 0, 0 };
		HW_02_03_06.getReverse(array);
		assertArrayEquals(new int[]
		{ 0, 0, 1, 0, 0 }, array);
	}

}
