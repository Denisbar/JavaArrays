/**
 * Task06
 */
package homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Denis Barabash
 *
 */
public class Task06
{
	public static void main(String[] args)
	{
		int n = 5;
		int[][] arr = new int[n][n];
		int[] resByColumn = new int[25];
		int[] resByRow = new int[25];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				int randNum = random.nextInt(20);
				arr[i][j] = randNum;
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				resByColumn[j * n + i] = arr[i][j];
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				resByRow[count++] = arr[i][j];
			}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.toString(resByColumn));
		System.out.println(Arrays.toString(resByRow));
	}
}
