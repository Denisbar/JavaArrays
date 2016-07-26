/**
 * Task02
 */
package homework;

import java.lang.reflect.Array;
import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Denis Barabash
 *
 */
public class Task02
{
	public static void main(String[] args)
	{
		int[] arr = new int[20];
		Random random = new Random();
		boolean firstNegativeFound = false;
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = random.nextInt(40) - 10;
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (!firstNegativeFound && arr[i] < 0)
			{
				firstNegativeFound = true;
				continue;
			}
			if (firstNegativeFound)
			{
				sum += arr[i];
			}
			// System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println("Sum is: " + sum);
	}
}
