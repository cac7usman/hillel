package hw_02_02_loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_02_01_SumRangeTest
{

	@Test
	public void testGetSum()
	{
		int test = HW_02_02_01_SumRange.getSum();
		assertEquals(2450, test);
	}

	@Test
	public void testGetQ()
	{
		int test = HW_02_02_01_SumRange.getQ();
		assertEquals(49, test);
	}

}
