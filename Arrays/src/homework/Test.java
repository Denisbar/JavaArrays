package homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Test
{

	public static void main(String[] args)
	{
		int m = 2;
		int n = 4;
		int[][] arr = new int[m][n];
		Random random = new Random();
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = random.nextInt(10);
			}
		}
		int k = 1;
		do
		{
			for (int i = 0; i < k; i++, System.out.println(k))
			{
				for (int j = 0; j < n; j++)
				{
					sum += arr[i][j];
				}
				System.out.println(sum);
			}
			System.out.println(sum);
			++k;
		} while (k <= m);
		System.out.println(Arrays.deepToString(arr));
		System.out.println(sum);
		System.out.println(sum1);
	}

}
