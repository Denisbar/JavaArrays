/**
 * Task05
 */
package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @author Denis Barabash
 *
 */
public class Task05
{

	public static void main(String[] args)
	{
		Random random = new Random();
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++)
		{
			int nextRnd = random.nextInt(30) - 10;
			arr[i] = nextRnd;
		}
		int[] resultArr = new int[20];
		int max = Integer.MIN_VALUE;
		int firstNum = 0;
		int lastNum = 0;
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int k = i; k < arr.length; k++)
			{
				if (arr[k] > 0)
				{
					startIndex = k;
					// System.out.println(startIndex);
					break;
				}
			}
			for (int y = startIndex; y < arr.length; y++)
			{
				if (arr[y] < 0 || arr[y] == 0)
				{
					endIndex = y;
					// System.out.println(endIndex);
					break;
				}
			}
			int length = endIndex - startIndex;
			if (max < length)
			{
				max = length;
				firstNum = startIndex;
				lastNum = endIndex;
			}
		}
		System.arraycopy(arr, firstNum, resultArr, 0, max);
		int count = 0;
		for (int i = 0; i < resultArr.length; i++)
		{
			if (resultArr[i] != 0)
			{
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		// System.out.println(count);
		int[] a = Arrays.copyOf(resultArr, count);
		System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(resultArr));
		// System.out.println(firstNum + " " + lastNum);
		// System.out.println(max);
	}
}