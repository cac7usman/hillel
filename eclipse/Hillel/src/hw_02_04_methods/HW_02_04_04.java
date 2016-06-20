package hw_02_04_methods;

/*Расстояние между двумя точками на плоскости расчитывается по следующей формуле:
*	 d = sqrt((x2-x1)^2 + (y2-y1)^2)
*/
public class HW_02_04_04
{
	public static void main(String[] args)
	{
		double distance = getDistance(50, 30, 10, 4);
		System.out.println(distance);

	}

	public static double getDistance(int x1, int y1, int x2, int y2)
	{

		double dx = x2 - x1;
		double dy = y2 - y1;

		double dist = Math.sqrt(dx * dx + dy * dy);

		return dist;

	}
}
