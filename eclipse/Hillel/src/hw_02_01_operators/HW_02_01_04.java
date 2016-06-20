package hw_02_01_operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Посчитать выражение макс(а*б*с, а+б+с)+3

 */
public class HW_02_01_04
{
	public static void main(String[] args) throws IOException
	{
		int a, b, c;
		System.out.println("enter a: ");
		a = getN();
		System.out.println("enter b: ");
		b = getN();
		System.out.println("enter c: ");
		c = getN();

		System.out.println(getMax(a, b, c));
	}

	public static int getMax(int a, int b, int c)
	{
		return ((a + b + c) + 3) > ((a * b * c) + 3) ? ((a + b + c) + 3) : ((a * b * c) + 3);
	}

	public static int getN() throws IOException
	{

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bufferedReader.readLine());

		return x;

	}

}
