package hw_02_01_operators;

/*
 * Посчитать выражение макс(а*б*с, а+б+с)+3

 */
public class HW_02_01_04_Max
{
	public static int getMax(int a, int b, int c)
	{
		return ((a + b + c) + 3) > ((a * b * c) + 3) ? ((a + b + c) + 3) : ((a * b * c) + 3);
	}
}
