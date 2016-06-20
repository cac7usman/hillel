package hw_02_03_arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_03_03Test
{

	@Test
	public void testGetMinIndex_01()
	{
		int[] array =
		{ 10, 20, 30, 40, -50 };

		int test = HW_02_03_03.getMinIndex(array);
		assertEquals(4, test);
	}

	@Test
	public void testGetMinIndex_02()
	{
		int[] array =
		{ -10, -20, -30, -400, -50 };

		int test = HW_02_03_03.getMinIndex(array);
		assertEquals(3, test);
	}

	@Test
	public void testGetMinIndex_03()
	{
		int[] array =
		{ 0, 0, 0, 0, 0 };

		int test = HW_02_03_03.getMinIndex(array);
		assertEquals(0, test);
	}

	@Test
	public void testGetMinIndex_04()
	{
		int[] array =
		{ 0, -20, 0, 0, 0 };

		int test = HW_02_03_03.getMinIndex(array);
		assertEquals(1, test);
	}

	@Test
	public void testGetMinIndex_05()
	{
		int[] array =
		{ 10, 20, 3, 40, 50 };

		int test = HW_02_03_03.getMinIndex(array);
		assertEquals(2, test);
	}

}
