package homework;

import java.awt.geom.Area;
import java.util.Arrays;

public class Duplecatus
{

	public static void main(String[] args)
	{
		int arr[] =
		{ 1, 2, 3, 4, 4, 6, 7, 7, 9, 9 };
		int dup = 0;
		int countIndex = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == (arr[j]))
				{
					System.out.println(arr[i]);
				}
			}
		}
		// System.out.println(dup);

		// int[] numbers = { 1, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3 };
		// Arrays.sort(numbers);
		//
		// for(int i = 1; i < numbers.length; i++) {
		// if(numbers[i] == numbers[i - 1]) {
		// System.out.println("Duplicate: " + numbers[i]);
		// }
		// }

		int array[][] =
		{
				{ 1, 7, 2 },
				{ 6, 7, 7 } };

		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				System.out.printf("%2d", array[i][j]);
			}
			System.out.println();
		}

		for (int row = 0; row < array.length; row++)
		{
			for (int col = row + 1; col < array.length; col++)
			{
				int num = array[row][col];
				for (int otherRow = row + 1; otherRow < array.length; otherRow++)
				{
					if (num == array[otherRow][col+1])
					{
						System.out.println(num);
					}
				}
			}
		}

	}

}
