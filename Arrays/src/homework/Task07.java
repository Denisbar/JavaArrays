/**
 * 
 */
package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Denis
 *
 */
public class Task07
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размеренность массива: ");
		int n = scanner.nextInt();
		scanner.close();
		int[][] arr = new int[n][n];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = random.nextInt(20);
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		int smallest = arr[0][0];
		int largest = arr[0][0];
		double startTime = System.nanoTime();
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[i][j] > largest)
				{
					largest = arr[i][j];
				}else if (arr[i][j] < smallest) {
					smallest = arr[i][j];
				}
			}
		}
		double estimatedTime = System.nanoTime() - startTime;
		System.out.println("Largest element " + largest);
		System.out.println("Smallest element " + smallest);
//		System.out.println(Arrays.deepToString(arr));
		System.out.println("Время поиска " + estimatedTime);
	}
}