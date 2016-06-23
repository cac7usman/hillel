package hw_02_01_operators;

/*
 * Если а – четное посчитать а*б, иначе а+б
 * */
public class HW_02_01_01_EvenOrOdd
{
	public static int isEven(int a, int b)
	{
		if (a % 2 == 0)
		{
			return (a * b);
		} else
		{
			return a + b;
		}
	}
}