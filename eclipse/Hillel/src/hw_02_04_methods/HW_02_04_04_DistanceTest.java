package hw_02_04_methods;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_04_04_DistanceTest
{

	@Test
	public void testGetDistance_01()
	{
		double test = HW_02_04_04_Distance.getDistance(0, 0, 0, 0);
		assertEquals(0, test, 0);
	}

	@Test
	public void testGetDistance_03()
	{
		double test = HW_02_04_04_Distance.getDistance(0, 1, 0, 0);
		assertEquals(1.0, test, 0.01);
	}

	@Test
	public void testGetDistance_04()
	{
		double test = HW_02_04_04_Distance.getDistance(0, 0, 1, 1);
		assertEquals(1.414, test, 0.015);
	}

	@Test
	public void testGetDistance_05()
	{
		double test = HW_02_04_04_Distance.getDistance(1, 0, 0, 1);
		assertEquals(1.414, test, 0.015);
	}

	@Test
	public void testGetDistance_06()
	{
		double test = HW_02_04_04_Distance.getDistance(0, 1, 1, 1);
		assertEquals(1.0, test, 0.01);
	}

	@Test
	public void testGetDistance_07()
	{
		double test = HW_02_04_04_Distance.getDistance(1, 1, 1, 0);
		assertEquals(1.0, test, 0.01);
	}

	@Test
	public void testGetDistance_08()
	{
		double test = HW_02_04_04_Distance.getDistance(1, 1, 1, 1);
		assertEquals(0, test, 0);
	}

	@Test
	public void testGetDistance_09()
	{
		double test = HW_02_04_04_Distance.getDistance(-1, -1, -1, -1);
		assertEquals(0, test, 0);
	}

	@Test
	public void testGetDistance_10()
	{
		double test = HW_02_04_04_Distance.getDistance(1, 1, 1, -1);
		assertEquals(2.0, test, 0);
	}

	@Test
	public void testGetDistance_11()
	{
		double test = HW_02_04_04_Distance.getDistance(-1, 1, -1, 1);
		assertEquals(0, test, 0);
	}

	@Test
	public void testGetDistance_12()
	{
		double test = HW_02_04_04_Distance.getDistance(-1, 1, 0, 0);
		assertEquals(1.414, test, 0.015);
	}

	@Test
	public void testGetDistance_13()
	{
		double test = HW_02_04_04_Distance.getDistance(-1, 0, 1, 0);
		assertEquals(2.0, test, 0);
	}

	@Test
	public void testGetDistance_14()
	{
		double test = HW_02_04_04_Distance.getDistance(-2, -2, 2, 2);
		assertEquals(5.656, test, 0.6);
	}

	@Test
	public void testGetDistance_15()
	{
		double test = HW_02_04_04_Distance.getDistance(-2, 2, 2, 2);
		assertEquals(4.0, test, 0);
	}

	@Test
	public void testGetDistance_16()
	{
		double test = HW_02_04_04_Distance.getDistance(-2, 2, -2, 2);
		assertEquals(0, test, 0);
	}

	@Test
	public void testGetDistance_17()
	{
		double test = HW_02_04_04_Distance.getDistance(2, 4, 6, 8);
		assertEquals(5.656, test, 0.6);
	}

	@Test
	public void testGetDistance_18()
	{
		double test = HW_02_04_04_Distance.getDistance(8, 6, 4, 2);
		assertEquals(5.656, test, 0.6);
	}

	@Test
	public void testGetDistance_19()
	{
		double test = HW_02_04_04_Distance.getDistance(-2, -4, -6, -8);
		assertEquals(5.656, test, 0.6);
	}

	@Test
	public void testGetDistance_20()
	{
		double test = HW_02_04_04_Distance.getDistance(-8, -6, -4, -2);
		assertEquals(5.656, test, 0.6);
	}

	@Test
	public void testGetDistance_21()
	{
		double test = HW_02_04_04_Distance.getDistance(-8, -6, -4, 2);
		assertEquals(8.9, test, 0.5);
	}

	@Test
	public void testGetDistance_22()
	{
		double test = HW_02_04_04_Distance.getDistance(8, -6, 4, -2);
		assertEquals(5.656, test, 0.6);
	}
}