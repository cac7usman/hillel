package hw_02_02_loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_02_03Test
{

	@Test
	public void testGetSqrt_01()
	{
		int test = (int) HW_02_02_03.getSqrt(0);
		assertEquals(0, test);
	}

	@Test
	public void testGetSqrt_02()
	{
		int test = (int) HW_02_02_03.getSqrt(1);
		assertEquals(1, test);
	}

	@Test
	public void testGetSqrt_03()
	{
		int test = (int) HW_02_02_03.getSqrt(2);
		assertEquals(1, test);
	}

	@Test
	public void testGetSqrt_04()
	{
		int test = (int) HW_02_02_03.getSqrt(4);
		assertEquals(2, test);
	}

	@Test
	public void testGetSqrt_05()
	{
		int test = (int) HW_02_02_03.getSqrt(10);
		assertEquals(3, test);
	}

}
