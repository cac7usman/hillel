package hw_02_04_methods;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_04_01Test
{

	@Test
	public void testGetDay_01()
	{
		String test = HW_02_04_01.getDay(1);
		assertEquals("Sunday", test);

	}

	@Test
	public void testGetDay_02()
	{
		String test = HW_02_04_01.getDay(2);
		assertEquals("Monday", test);

	}

	@Test
	public void testGetDay_03()
	{
		String test = HW_02_04_01.getDay(3);
		assertEquals("Tuesday", test);

	}

	@Test
	public void testGetDay_04()
	{
		String test = HW_02_04_01.getDay(4);
		assertEquals("Wednesday", test);

	}

	@Test
	public void testGetDay_05()
	{
		String test = HW_02_04_01.getDay(5);
		assertEquals("Thursday", test);

	}

	@Test
	public void testGetDay_06()
	{
		String test = HW_02_04_01.getDay(6);
		assertEquals("Friday", test);

	}

	@Test
	public void testGetDay_07()
	{
		String test = HW_02_04_01.getDay(7);
		assertEquals("Saturday", test);

	}

}
