package hw_02_02_loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_02_06Test
{

	@Test
	public void testGetReverse()
	{
		String test = HW_02_02_06.getReverse(12345);
		assertEquals(String.valueOf("54321"), test);
	}

}