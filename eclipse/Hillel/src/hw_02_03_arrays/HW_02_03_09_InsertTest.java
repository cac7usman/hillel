package hw_02_03_arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HW_02_03_09_InsertTest
{
	@Test(expected = IllegalArgumentException.class)
	public void testInsertSort_00()
	{
		int[] array = null;
		HW_02_03_09_Insert.InsertSort(array);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInsertSort_00_01()
	{
		int[] array = {};
		HW_02_03_09_Insert.InsertSort(array);
	}

	@Test
	public void testInsertSort_01_01()
	{
		int[] array = { 1 };
		HW_02_03_09_Insert.InsertSort(array);
		assertArrayEquals(new int[] { 1 }, array);
	}

	@Test
	public void testInsertSort_01_02()
	{
		int[] array = { 1, -1 };
		HW_02_03_09_Insert.InsertSort(array);
		assertArrayEquals(new int[] { -1, 1 }, array);
	}

	@Test
	public void testInsertSort_01_03()
	{
		int[] array = { 50, 1, -1 };
		HW_02_03_09_Insert.InsertSort(array);
		assertArrayEquals(new int[] { -1, 1, 50 }, array);
	}

	@Test
	public void testInsertSort_01()
	{
		int[] array = { -10, 50, 0, 20 };
		HW_02_03_09_Insert.InsertSort(array);
		assertArrayEquals(new int[] { -10, 0, 20, 50 }, array);
	}

	@Test
	public void testInsertSort_02()
	{
		int[] array = { 5, 4, 3, 2, 1 };
		HW_02_03_09_Insert.InsertSort(array);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, array);
	}

	@Test
	public void testInsertSort_03()
	{
		int[] array = { 1, 0, 0, 0, 0 };
		HW_02_03_09_Insert.InsertSort(array);
		assertArrayEquals(new int[] { 0, 0, 0, 0, 1 }, array);
	}

	@Test
	public void testInsertSort_04()
	{
		int[] array = { -1, -100, -2, -50 };
		HW_02_03_09_Insert.InsertSort(array);
		assertArrayEquals(new int[] { -100, -50, -2, -1 }, array);
	}

}