package hw_03_stars;

public class HW_03_15
{
	public static void main(String[] args)
	{
		print();
	}

	private static void print()
	{
		int n = 7;
		for (int j = 0; j < 7; j++)
		{
			for (int i = 0; i < 7; i++)
			{
				System.out.print(n);
				n--;
			}
			System.out.println("");
			n = 7;
		}

	}
}