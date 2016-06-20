package hw_02_01_operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_01_05Test
{

	@Test
	public void testGetMarks_01()
	{
		String test = HW_02_01_05.getMarks(101);
		assertEquals("A", test);
	}

	@Test
	public void testGetMarks_02()
	{
		String test = HW_02_01_05.getMarks(99);
		assertEquals("A", test);
	}

	@Test
	public void testGetMarks_03()
	{
		String test = HW_02_01_05.getMarks(85);
		assertEquals("B", test);
	}

	@Test
	public void testGetMarks_04()
	{
		String test = HW_02_01_05.getMarks(74);
		assertEquals("C", test);
	}

	@Test
	public void testGetMarks_06()
	{
		String test = HW_02_01_05.getMarks(55);
		assertEquals("D", test);
	}

	@Test
	public void testGetMarks_07()
	{
		String test = HW_02_01_05.getMarks(33);
		assertEquals("E", test);
	}

	@Test
	public void testGetMarks_08()
	{
		String test = HW_02_01_05.getMarks(14);
		assertEquals("F", test);
	}

	@Test
	public void testGetMarks_09()
	{
		String test = HW_02_01_05.getMarks(-15);
		assertEquals("F", test);
	}

}
