package hw_02_02_loops;
/*
 * Проверить простое ли число?
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_02_02_02
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("enter a number: ");
		int a = getN();

		if (isPrime(a))
		{

			System.out.println(a + " is a Prime number");

		} else
			System.out.println(a + " is a Composite number");
	}

	public static int getN() throws IOException
	{

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bufferedReader.readLine());

		return x;

	}

	public static boolean isPrime(int n)
	{
		for (int i = 2; i <= Math.sqrt((n)); i++)
		{
			if (n % i == 0)
				return false;

		}
		return true;

	}
}
