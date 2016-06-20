package hw_02_03_arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HW_02_03_08Test
{

	@Test
	public void testGetSwap_01()
	{
		int[] array =
		{ 1, 2, 3, 4, 5 };
		HW_02_03_08.getSwap(array);
		assertArrayEquals(new int[]
		{ 4, 5, 3, 1, 2 }, array);
	}

	@Test
	public void testGetSwap_02()
	{
		int[] array =
		{ 1, 2, 3, 4, };
		HW_02_03_08.getSwap(array);
		assertArrayEquals(new int[]
		{ 3, 4, 1, 2 }, array);
	}

}
