package hw_02_01_operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_01_04_MaxTest
{

	@Test
	public void testGetMax_01()
	{
		int c = HW_02_01_04_Max.getMax(1, 1, 1);
		assertEquals(6, c);
	}

	@Test
	public void testGetMax_02()
	{
		int c = HW_02_01_04_Max.getMax(0, 0, 0);
		assertEquals(3, c);
	}

	@Test
	public void testGetMax_03()
	{
		int c = HW_02_01_04_Max.getMax(-1, -1, -1);
		assertEquals(2, c);
	}

	@Test
	public void testGetMax_04()
	{
		int c = HW_02_01_04_Max.getMax(0, 0, 1);
		assertEquals(4, c);
	}

	@Test
	public void testGetMax_05()
	{
		int c = HW_02_01_04_Max.getMax(0, 1, 1);
		assertEquals(5, c);
	}

	@Test
	public void testGetMax_06()
	{
		int c = HW_02_01_04_Max.getMax(0, -1, -1);
		assertEquals(3, c);
	}

	@Test
	public void testGetMax_07()
	{
		int c = HW_02_01_04_Max.getMax(0, -1, 0);
		assertEquals(3, c);
	}

	@Test
	public void testGetMax_08()
	{
		int c = HW_02_01_04_Max.getMax(-1, -1, 4);
		assertEquals(7, c);
	}

	@Test
	public void testGetMax_9()
	{
		int c = HW_02_01_04_Max.getMax(-1, 1, -2);
		assertEquals(5, c);
	}

	@Test
	public void testGetMax_10()
	{
		int c = HW_02_01_04_Max.getMax(-2, 2, 2);
		assertEquals(5, c);
	}

}