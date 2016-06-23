package hw_02_02_loops;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HW_02_02_02_PrimeTest
{

	@Test
	public void testIsPrime_01()
	{
		assertTrue(HW_02_02_02_Prime.isPrime(0));
	}

	@Test
	public void testIsPrime_02()
	{
		assertTrue(HW_02_02_02_Prime.isPrime(1));
	}

	@Test
	public void testIsPrime_03()
	{
		assertTrue(HW_02_02_02_Prime.isPrime(2));
	}

	@Test
	public void testIsPrime_04()
	{
		assertTrue(HW_02_02_02_Prime.isPrime(3));
	}

	@Test
	public void testIsPrime_05()
	{
		assertTrue(HW_02_02_02_Prime.isPrime(71));
	}

	@Test
	public void testIsPrime_06()
	{
		assertFalse(HW_02_02_02_Prime.isPrime(6));
	}

	@Test
	public void testIsPrime_07()
	{
		assertFalse(HW_02_02_02_Prime.isPrime(72));
	}
}
