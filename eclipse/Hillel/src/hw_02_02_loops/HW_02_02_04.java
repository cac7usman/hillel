package hw_02_02_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * Вычислить факториал числа
 */

public class HW_02_02_04
{
	public static void main(String[] args) throws IOException
	{
		int n = getN();
		if (n >= 20)
		{
			System.out.println(factorial1(n));
		} else

			System.out.println(factorial(n));

	}

	public static Integer factorial(int n)
	{
		if (n < 0)
			throw new IllegalArgumentException("n should be >=0");
		int factorial = 1;
		for (int i = 2; i <= n; i++)
		{
			factorial *= i;

		}
		return factorial;
	}

	public static String factorial1(int n)
	{

		if (n < 0)
			return String.valueOf(0);
		if (n == 0)
			return String.valueOf(1);

		BigInteger ret = BigInteger.ONE;
		for (int i = 1; i <= n; ++i)
			ret = ret.multiply(BigInteger.valueOf(i));

		return String.valueOf(ret);
	}

	public static int getN() throws IOException
	{

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(bufferedReader.readLine());

		return x;

	}

}
