package hw_02_02_loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HW_02_02_04Test
{

	@Test
	public void testFactorial_01()
	{
		int test = HW_02_02_04.factorial(0);
		assertEquals(1, test);
	}

	@Test
	public void testFactorial_02()
	{
		int test = HW_02_02_04.factorial(1);
		assertEquals(1, test);
	}

	@Test
	public void testFactorial_03()
	{
		int test = HW_02_02_04.factorial(2);
		assertEquals(2, test);
	}

	@Test
	public void testFactorial_04()
	{
		int test = HW_02_02_04.factorial(3);
		assertEquals(6, test);
	}

	@Test
	public void testFactorial_05()
	{
		int test = HW_02_02_04.factorial(19);
		assertEquals(109641728, test);
	}

	@Test
	public void testFactorial1()
	{
		String test = HW_02_02_04.factorial1(20);
		assertEquals(String.valueOf("2432902008176640000"), test);
	}

}
