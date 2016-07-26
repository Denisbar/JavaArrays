/**
 * Task04
 */
package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @author Denis Barabash
 *
 */
public class Task04
{
	public static void main(String[] args)
	{
		int[] arr = new int[100];
		int j = 0;
		int[] newArr = new int[100];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++)
		{
			int randNum = random.nextInt(555) - 300;
			arr[i] = randNum;
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > 0)
			{
				newArr[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == 0)
			{
				newArr[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < 0)
			{
				newArr[j] = arr[i];
				j++;
			}
		}
		System.out.println("Исходный массив:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Результируйщий массив:");
		System.out.println(Arrays.toString(newArr));
	}
}
