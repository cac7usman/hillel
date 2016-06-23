package hw_02_03_arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_03_07_Q_OddIndexTest
{

	@Test(expected = IllegalArgumentException.class)
	public void getQtest_00()
	{
		int[] array = null;
		HW_02_03_07_Q_OddIndex.getQ(array);

	}

	@Test(expected = IllegalArgumentException.class)
	public void getQtest_00_1()
	{
		int[] array = {};
		HW_02_03_07_Q_OddIndex.getQ(array);

	}

	@Test
	public void getQtest_01_1()
	{
		int[] array = { 10 };
		int test = HW_02_03_07_Q_OddIndex.getQ(array);
		assertEquals(0, test);
	}

	@Test
	public void getQtest_01_2()
	{
		int[] array = { 11 };
		int test = HW_02_03_07_Q_OddIndex.getQ(array);
		assertEquals(1, test);
	}

	@Test
	public void getQtest_01()
	{
		int[] array = { 10, 20, 30, 40, 50 };
		int test = HW_02_03_07_Q_OddIndex.getQ(array);
		assertEquals(0, test);
	}

	@Test
	public void getQtest_02()
	{
		int[] array = { 1, 2, 3, 4, 5 };
		int test = HW_02_03_07_Q_OddIndex.getQ(array);
		assertEquals(3, test);
	}

	@Test
	public void getQtest_03()
	{
		int[] array = { 0, 0, 0, 0, 0 };
		int test = HW_02_03_07_Q_OddIndex.getQ(array);
		assertEquals(0, test);
	}

	@Test
	public void getQtest_04()
	{
		int[] array = { -11, -21, -33, -40, 50 };
		int test = HW_02_03_07_Q_OddIndex.getQ(array);
		assertEquals(3, test);
	}

	@Test
	public void getQtest_05()
	{
		int[] array = { -10, -20, 30, 40, 51 };
		int test = HW_02_03_07_Q_OddIndex.getQ(array);
		assertEquals(1, test);
	}

	@Test
	public void getQtest_06()
	{
		int[] array = { 1, 1, 1, 1, 1 };
		int test = HW_02_03_07_Q_OddIndex.getQ(array);
		assertEquals(5, test);
	}

}