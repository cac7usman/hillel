package hw_02_02_loops;
/*
 * Найти сумму четных чисел и их количество в диапазоне от 1 до 99
 */

public class HW_02_02_01
{
	public static void main(String[] args)
	{
		getSum();

	}

	public static void getSum()
	{
		int counter = 0;
		int sum = 0;
		for (int i = 1; i <= 99; i++)
		{
			if (i % 2 == 0)
			{
				sum += i;
				counter++;
			}
		}

		System.out.println("sum: " + sum + "; amount of even numbers between 1 and 99: " + counter);

	}
}
