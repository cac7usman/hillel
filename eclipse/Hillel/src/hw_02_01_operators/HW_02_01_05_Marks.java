package hw_02_01_operators;

/*
 * Написать программу определения оценки студента по его рейтингу
 */

public class HW_02_01_05_Marks
{
	public static String getMarks(int mark)
	{
		if (mark < 0 || mark > 100)
			throw new IllegalArgumentException();

		if (mark >= 90 && mark <= 100)
			return "A";
		else if (mark >= 75 && mark <= 89)
			return "B";
		else if (mark >= 60 && mark <= 74)
			return "C";
		else if (mark >= 40 && mark <= 59)
			return "D";
		else if (mark >= 20 && mark <= 39)
			return "E";
		else
			return "F";
	}
}