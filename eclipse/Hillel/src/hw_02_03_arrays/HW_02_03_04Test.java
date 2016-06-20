package hw_02_03_arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_03_04Test
{

	@Test
	public void testGetMaxIndex_01()
	{
		int[] array =
		{ 10, 20, 30, 40, -50 };

		int test = HW_02_03_04.getMaxIndex(array);
		assertEquals(3, test);
	}

	@Test
	public void testGetMaxIndex_02()
	{
		int[] array =
		{ -10, -20, -30, -400, -50 };

		int test = HW_02_03_04.getMaxIndex(array);
		assertEquals(0, test);
	}

	@Test
	public void testGetMaxIndex_03()
	{
		int[] array =
		{ 0, 0, 0, 0, 0 };

		int test = HW_02_03_04.getMaxIndex(array);
		assertEquals(0, test);
	}

	@Test
	public void testGetMaxIndex_04()
	{
		int[] array =
		{ 0, 20, 0, 0, 0 };

		int test = HW_02_03_04.getMaxIndex(array);
		assertEquals(1, test);
	}

	@Test
	public void testGetMaxIndex_05()
	{
		int[] array =
		{ 10, 20, 300, 40, 50 };

		int test = HW_02_03_04.getMaxIndex(array);
		assertEquals(2, test);
	}
}
