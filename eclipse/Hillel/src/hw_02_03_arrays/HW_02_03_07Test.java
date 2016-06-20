package hw_02_03_arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_03_07Test
{

	@Test
	public void getQtest_01()
	{
		int[] array =
		{ 10, 20, 30, 40, 50 };
		int test = HW_02_03_07.getQ(array);
		assertEquals(0, test);
	}

	@Test
	public void getQtest_02()
	{
		int[] array =
		{ 1, 2, 3, 4, 5 };
		int test = HW_02_03_07.getQ(array);
		assertEquals(3, test);
	}

	@Test
	public void getQtest_03()
	{
		int[] array =
		{ 0, 0, 0, 0, 0 };
		int test = HW_02_03_07.getQ(array);
		assertEquals(0, test);
	}

	@Test
	public void getQtest_04()
	{
		int[] array =
		{ -11, -21, -33, -40, 50 };
		int test = HW_02_03_07.getQ(array);
		assertEquals(3, test);
	}

	@Test
	public void getQtest_05()
	{
		int[] array =
		{ -10, -20, 30, 40, 51 };
		int test = HW_02_03_07.getQ(array);
		assertEquals(1, test);
	}

	@Test
	public void getQtest_06()
	{
		int[] array =
		{ 1, 1, 1, 1, 1 };
		int test = HW_02_03_07.getQ(array);
		assertEquals(5, test);
	}

}
