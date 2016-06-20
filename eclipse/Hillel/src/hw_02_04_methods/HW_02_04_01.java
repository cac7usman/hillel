package hw_02_04_methods;

import java.util.Random;

/*
 * Получить строковое название дня недели по номеру дня. 
 */
public class HW_02_04_01
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int i = random.nextInt(6) + 1;
		System.out.println(getDay(i));
	}

	public static String getDay(int n)
	{
		switch (n)
		{
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";

		default:
			return null;
		}
	}
}
