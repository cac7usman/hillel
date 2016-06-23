package hw_02_01_operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_01_05_MarksTest
{

	@Test(expected = IllegalArgumentException.class)
	public void testGetMarks_01()
	{
		HW_02_01_05_Marks.getMarks(101);
	}

	@Test
	public void testGetMarks_02()
	{
		String test = HW_02_01_05_Marks.getMarks(99);
		assertEquals("A", test);
	}

	@Test
	public void testGetMarks_02_01()
	{
		String test = HW_02_01_05_Marks.getMarks(95);
		assertEquals("A", test);
	}

	@Test
	public void testGetMarks_02_02()
	{
		String test = HW_02_01_05_Marks.getMarks(91);
		assertEquals("A", test);
	}

	@Test
	public void testGetMarks_03()
	{
		String test = HW_02_01_05_Marks.getMarks(89);
		assertEquals("B", test);
	}

	@Test
	public void testGetMarks_03_01()
	{
		String test = HW_02_01_05_Marks.getMarks(82);
		assertEquals("B", test);
	}

	@Test
	public void testGetMarks_03_02()
	{
		String test = HW_02_01_05_Marks.getMarks(76);
		assertEquals("B", test);
	}

	@Test
	public void testGetMarks_04()
	{
		String test = HW_02_01_05_Marks.getMarks(74);
		assertEquals("C", test);
	}

	@Test
	public void testGetMarks_04_01()
	{
		String test = HW_02_01_05_Marks.getMarks(67);
		assertEquals("C", test);
	}

	@Test
	public void testGetMarks_04_02()
	{
		String test = HW_02_01_05_Marks.getMarks(61);
		assertEquals("C", test);
	}

	@Test
	public void testGetMarks_06()
	{
		String test = HW_02_01_05_Marks.getMarks(59);
		assertEquals("D", test);
	}

	@Test
	public void testGetMarks_06_01()
	{
		String test = HW_02_01_05_Marks.getMarks(50);
		assertEquals("D", test);
	}

	@Test
	public void testGetMarks_06_02()
	{
		String test = HW_02_01_05_Marks.getMarks(41);
		assertEquals("D", test);
	}

	@Test
	public void testGetMarks_07()
	{
		String test = HW_02_01_05_Marks.getMarks(39);
		assertEquals("E", test);
	}

	@Test
	public void testGetMarks_07_01()
	{
		String test = HW_02_01_05_Marks.getMarks(31);
		assertEquals("E", test);
	}

	@Test
	public void testGetMarks_07_02()
	{
		String test = HW_02_01_05_Marks.getMarks(21);
		assertEquals("E", test);
	}

	@Test
	public void testGetMarks_08()
	{
		String test = HW_02_01_05_Marks.getMarks(18);
		assertEquals("F", test);
	}

	@Test
	public void testGetMarks_08_01()
	{
		String test = HW_02_01_05_Marks.getMarks(10);
		assertEquals("F", test);
	}

	@Test
	public void testGetMarks_08_02()
	{
		String test = HW_02_01_05_Marks.getMarks(1);
		assertEquals("F", test);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetMarks_09()
	{
		HW_02_01_05_Marks.getMarks(-15);

	}

}