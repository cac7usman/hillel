package hw_02_01_operators;
/*
 * Определить какой четверти принадлежит точка с координатами (х,у)
 * */

public class HW_02_01_02_Quadrant
{
	public static int getQuadrant(int x, int y)
	{
		if (x == 0 || y == 0)
			throw new IllegalArgumentException();
		if (x > 0 && y > 0)
			return 1;
		else if (x < 0 && y > 0)
			return 2;
		else if (x < 0 && y < 0)
			return 3;
		else if (x > 0 && y < 0)
			return 4;
		else
			return 0;

	}

}
