package hw_02_03_arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_03_02Test
{

	@Test
	public void testGetMin_01()
	{
		int[] array =
		{ 10, 20, 30, 40, 50 };

		int test = HW_02_03_02.getMax(array);

		assertEquals(50, test);
	}

	@Test
	public void testGetMin_02()
	{
		int[] array =
		{ -10, -20, -30, -40, -50 };

		int test = HW_02_03_02.getMax(array);

		assertEquals(-10, test);
	}

	@Test
	public void testGetMin_04()
	{
		int[] array =
		{ 0, 0, 0, 0, 0 };

		int test = HW_02_03_02.getMax(array);

		assertEquals(0, test);
	}

	@Test
	public void testGetMin_05()
	{
		int[] array =
		{ -10, 0, 0, 0, 0 };

		int test = HW_02_03_02.getMax(array);

		assertEquals(0, test);
	}

}
