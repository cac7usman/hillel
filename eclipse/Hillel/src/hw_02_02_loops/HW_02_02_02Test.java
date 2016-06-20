package hw_02_02_loops;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HW_02_02_02Test
{

	@Test
	public void testIsPrime_01()
	{

		assertTrue(HW_02_02_02.isPrime(0));
		assertTrue(HW_02_02_02.isPrime(1));
		assertTrue(HW_02_02_02.isPrime(2));
		assertTrue(HW_02_02_02.isPrime(3));
		assertTrue(HW_02_02_02.isPrime(71));

	}

	@Test
	public void testIsPrime_02()
	{

		assertFalse(HW_02_02_02.isPrime(6));
		assertFalse(HW_02_02_02.isPrime(72));

	}
}