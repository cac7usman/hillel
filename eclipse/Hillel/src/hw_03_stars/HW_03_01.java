package hw_03_stars;

public class HW_03_01
{
	public static void main(String[] args)
	{
		print();
	}

	public static void print()
	{
		for (int j = 0; j < 7; j++)
		{
			for (int i = 0; i < 7; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
