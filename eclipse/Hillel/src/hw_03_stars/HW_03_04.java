package hw_03_stars;

public class HW_03_04
{
	public static void main(String args[])
	{
		print();
	}

	public static void print()
	{
		int column = 6;
		int row = 6;
		System.out.println("*");
		label: for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				if (i == 0 || i == row - 1)
				{

					System.out.print('*');

				} else
				{
					if (j == 0 || j == column - 1)
					{
						System.out.print('*');
					} else
					{
						System.out.print(' ');
					}
				}

				if (j >= i)
				{
					if (j != 0 || j != column - 1)
					{
						System.out.print("*");
					}

					System.out.println();

					continue label;
				}
			}
		}
	}
}
