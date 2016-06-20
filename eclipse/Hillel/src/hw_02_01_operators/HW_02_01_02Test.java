package hw_02_01_operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_01_02Test
{

	@Test
	public void testGetQuadrant_01()
	{
		int c = HW_02_01_02.getQuadrant(1, 1);
		assertEquals(1, c);
	}

	@Test
	public void testGetQuadrant_02()
	{
		int c = HW_02_01_02.getQuadrant(-1, -1);
		assertEquals(3, c);
	}

	@Test
	public void testGetQuadrant_03()
	{
		int c = HW_02_01_02.getQuadrant(1, -1);
		assertEquals(4, c);
	}

	@Test
	public void testGetQuadrant_04()
	{
		int c = HW_02_01_02.getQuadrant(-1, 1);
		assertEquals(2, c);
	}

	@Test
	public void testGetQuadrant_05()
	{
		int c = HW_02_01_02.getQuadrant(0, 0);
		assertEquals(0, c);
	}

	@Test
	public void testGetQuadrant_06()
	{
		int c = HW_02_01_02.getQuadrant(0, 1);
		assertEquals(0, c);
	}

	@Test
	public void testGetQuadrant_07()
	{
		int c = HW_02_01_02.getQuadrant(1, 0);
		assertEquals(0, c);
	}

}
