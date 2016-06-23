package hw_02_01_operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_01_02_QuadrantTest
{

	@Test
	public void testGetQuadrant_01()
	{
		int c = HW_02_01_02_Quadrant.getQuadrant(1, 1);
		assertEquals(1, c);
	}

	@Test
	public void testGetQuadrant_02()
	{
		int c = HW_02_01_02_Quadrant.getQuadrant(-1, -1);
		assertEquals(3, c);
	}

	@Test
	public void testGetQuadrant_03()
	{
		int c = HW_02_01_02_Quadrant.getQuadrant(1, -1);
		assertEquals(4, c);
	}

	@Test
	public void testGetQuadrant_04()
	{
		int c = HW_02_01_02_Quadrant.getQuadrant(-1, 1);
		assertEquals(2, c);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetQuadrant_05()
	{
		HW_02_01_02_Quadrant.getQuadrant(0, 0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetQuadrant_06()
	{
		HW_02_01_02_Quadrant.getQuadrant(0, 1);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetQuadrant_07()
	{
		HW_02_01_02_Quadrant.getQuadrant(1, 0);

	}

}
