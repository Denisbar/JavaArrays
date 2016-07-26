/**
 * Task03
 */
package homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Denis Barabash
 *
 */
public class Task03
{
	public static void main(String[] args)
	{
		int[] arr = new int[200];
		Random random = new Random();
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		int length = arr.length;
		final int PERSENT = 100;
		int resultOne, resultTwo, resultThree;
		for (int i = 0; i < arr.length; i++)
		{
			int ranNumber = random.nextInt(200);
			arr[i] = ranNumber;
		}
		System.out.println(Arrays.toString(arr));
		// находим одноразрядные числа
		for (int j = 0; j < arr.length; j++)
		{
			if (arr[j] <= 9 && arr[j] >= 0)
			{
				countOne += 1;
			}
		}
		// двухразрядные
		for (int n = 0; n < arr.length; n++)
		{
			if (arr[n] <= 99 && arr[n] >= 10)
			{
				countTwo += 1;
			}
		}
		// трехразрядные
		for (int k = 0; k < arr.length; k++)
		{
			if (arr[k] <= 200 && arr[k] >= 100)
			{
				countThree += 1;
			}
		}
		resultOne = (PERSENT * countOne) / length;
		resultTwo = (PERSENT * countTwo) / length;
		resultThree = (PERSENT * countThree) / length;
		System.out.println("digit 1 = " + resultOne);
		System.out.println("digit 2 = " + resultTwo);
		System.out.println("digit 3 = " + resultThree);
	}
}
