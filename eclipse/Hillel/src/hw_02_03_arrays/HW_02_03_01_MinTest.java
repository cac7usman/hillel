package hw_02_03_arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_03_01_MinTest
{
	@Test(expected = IllegalArgumentException.class)
	public void testGetMin_00()
	{
		int[] array = null;
		HW_02_03_01_Min.getMin(array);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetMin_00_0()
	{
		int[] array = {};
		HW_02_03_01_Min.getMin(array);
	}

	@Test
	public void testGetMin_01()
	{
		int[] array = { 10, 2, 30, 40, 50 };

		int test = HW_02_03_01_Min.getMin(array);

		assertEquals(2, test);
	}

	@Test
	public void testGetMin_01_01()
	{
		int[] array = { 10 };

		int test = HW_02_03_01_Min.getMin(array);

		assertEquals(10, test);
	}

	@Test
	public void testGetMin_02()
	{
		int[] array = { -10, -20, 30, 40, 50 };

		int test = HW_02_03_01_Min.getMin(array);

		assertEquals(-20, test);
	}

	@Test
	public void testGetMin_03()
	{
		int[] array = { -10, -20, -30, -40, -50 };

		int test = HW_02_03_01_Min.getMin(array);

		assertEquals(-50, test);
	}

	@Test
	public void testGetMin_04()
	{
		int[] array = { 0, 0, 0, 0, 0 };

		int test = HW_02_03_01_Min.getMin(array);

		assertEquals(0, test);
	}

	@Test
	public void testGetMin_05()
	{
		int[] array = { 0, -10, 0, 0, 0 };

		int test = HW_02_03_01_Min.getMin(array);

		assertEquals(-10, test);
	}

}