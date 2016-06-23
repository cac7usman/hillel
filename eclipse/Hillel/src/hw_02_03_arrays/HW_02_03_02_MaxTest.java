package hw_02_03_arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_03_02_MaxTest
{
	@Test(expected = IllegalArgumentException.class)
	public void testGetMax_00()
	{
		int[] array = null;
		HW_02_03_02_Max.getMax(array);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetMax_00_0()
	{
		int[] array = {};
		HW_02_03_02_Max.getMax(array);
	}

	@Test
	public void testGetMax_01()
	{
		int[] array = { 10, 20, 30, 40, 50 };

		int test = HW_02_03_02_Max.getMax(array);

		assertEquals(50, test);
	}

	@Test
	public void testGetMax_01_01()
	{
		int[] array = { 10 };

		int test = HW_02_03_02_Max.getMax(array);

		assertEquals(10, test);
	}

	@Test
	public void testGetMax_02()
	{
		int[] array = { -10, -20, -30, -40, -50 };

		int test = HW_02_03_02_Max.getMax(array);

		assertEquals(-10, test);
	}

	@Test
	public void testGetMax_04()
	{
		int[] array = { 0, 0, 0, 0, 0 };

		int test = HW_02_03_02_Max.getMax(array);

		assertEquals(0, test);
	}

	@Test
	public void testGetMax_05()
	{
		int[] array = { -10, 0, 0, 0, 0 };

		int test = HW_02_03_02_Max.getMax(array);

		assertEquals(0, test);
	}

}
