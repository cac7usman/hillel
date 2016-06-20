package hw_02_02_loops;
/*
 * Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_02_02_06
{
	public static void main(String[] args) throws IOException
	{
		int number = getN();

		System.out.println(getReverse(number));

	}

	public static int getN() throws IOException
	{

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(bufferedReader.readLine());

		return x;

	}

	public static String getReverse(int n)
	{
		String s = String.valueOf(n);
		char[] reverser = s.toCharArray();
		String s1 = "";
		StringBuilder sb = new StringBuilder(s1);

		for (int i = reverser.length - 1; i >= 0; i--)
		{
			sb = sb.append(reverser[i]);
		}

		return sb.toString();

	}
}