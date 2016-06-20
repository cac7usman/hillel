package hw_02_01_operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_01_03Test
{

	@Test
	public void testGetSum_01()
	{
		int c = HW_02_01_03.getSum(0, 0, 0);
		assertEquals(0, c);
	}

	@Test
	public void testGetSum_02()
	{
		int c = HW_02_01_03.getSum(-1, -1, -1);
		assertEquals(0, c);
	}

	@Test
	public void testGetSum_03()
	{
		int c = HW_02_01_03.getSum(0, 1, 1);
		assertEquals(2, c);
	}

	@Test
	public void testGetSum_04()
	{
		int c = HW_02_01_03.getSum(0, 0, 1);
		assertEquals(1, c);
	}

	@Test
	public void testGetSum_05()
	{
		int c = HW_02_01_03.getSum(0, 1, 0);
		assertEquals(1, c);
	}

	@Test
	public void testGetSum_06()
	{
		int c = HW_02_01_03.getSum(1, 0, 1);
		assertEquals(2, c);
	}

	@Test
	public void testGetSum_07()
	{
		int c = HW_02_01_03.getSum(0, -1, 0);
		assertEquals(0, c);
	}

	@Test
	public void testGetSum_08()
	{
		int c = HW_02_01_03.getSum(0, 0, -1);
		assertEquals(0, c);
	}

	@Test
	public void testGetSum_10()
	{
		int c = HW_02_01_03.getSum(-1, 0, 0);
		assertEquals(0, c);
	}

	@Test
	public void testGetSum_11()
	{
		int c = HW_02_01_03.getSum(-1, -1, 4);
		assertEquals(4, c);
	}

	@Test
	public void testGetSum_12()
	{
		int c = HW_02_01_03.getSum(-1, 1, -2);
		assertEquals(1, c);
	}

	@Test
	public void testGetSum_13()
	{
		int c = HW_02_01_03.getSum(-2, 2, 2);
		assertEquals(4, c);
	}

	@Test
	public void testGetSum_14()
	{
		int c = HW_02_01_03.getSum(2, -2, -3);
		assertEquals(2, c);
	}

	@Test
	public void testGetSum_15()
	{
		int c = HW_02_01_03.getSum(5, 2, -7);
		assertEquals(7, c);
	}

	@Test
	public void testGetSum_16()
	{
		int c = HW_02_01_03.getSum(1, 0, 0);
		assertEquals(1, c);
	}
}