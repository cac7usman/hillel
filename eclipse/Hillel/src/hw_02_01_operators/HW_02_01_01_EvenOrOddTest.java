package hw_02_01_operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_01_01_EvenOrOddTest
{

	@Test
	public void testIsEven_01()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(0, 10);
		assertEquals(0, c);
	}

	@Test
	public void testIsEven_02()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(1, 10);
		assertEquals(11, c);
	}

	@Test
	public void testIsEven_03()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(10, 1);
		assertEquals(10, c);
	}

	@Test
	public void testIsEven_04()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(10, 0);
		assertEquals(0, c);
	}

	@Test
	public void testIsEven_05()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(2, 10);
		assertEquals(20, c);
	}

	@Test
	public void testIsEven_06()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(11, 2);
		assertEquals(13, c);
	}

	@Test
	public void testIsEven_07()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(-1, 1);
		assertEquals(0, c);
	}

	@Test
	public void testIsEven_08()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(-2, 1);
		assertEquals(-2, c);
	}

	@Test
	public void testIsEven_09()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(-1, -1);
		assertEquals(-2, c);
	}

	@Test
	public void testIsEven_10()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(-2, -2);
		assertEquals(4, c);
	}

	@Test
	public void testIsEven_11()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(-7, 0);
		assertEquals(-7, c);
	}

	@Test
	public void testIsEven_12()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(-8, 0);
		assertEquals(0, c);
	}

	@Test
	public void testIsEven_13()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(0, -10);
		assertEquals(0, c);
	}

	@Test
	public void testIsEven_14()
	{
		int c = HW_02_01_01_EvenOrOdd.isEven(0, 0);
		assertEquals(0, c);
	}

}
