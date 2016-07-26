/**
 * 
 */
package homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Denis
 *
 */
public class Task09
{

	public static void main(String[] args)
	{
		int m = 3;
		int n = 5;
		int[][] mas = new int[m][n];
		Random random = new Random();
		for (int i = 0; i < mas.length; i++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				mas[i][j] = random.nextInt(55);
			}
		}
		System.out.println(Arrays.deepToString(mas));

		for (int i = 0; i < mas.length; i++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		int[] a = new int[15];
		int count = 0;
		for (int i = 0; i < mas.length; i++)
		{
			for (int j = 0; j < mas[i].length; j++)
			{
				a[count++] = mas[i][j];
			}
		}
		System.out.println(Arrays.toString(a));
		//средне арифметическое всего массива
		int sum = 0;
		int c = 0;
		for (int i = 0; i < a.length; i++)
		{
			c++;
			sum += a[i];
		}
		System.out.println(sum);
		int average = sum / c;
		System.out.println("Средне арифметическое значение всего массива: " + average);
		// средне арифметическое каждой строки
		int sum1 = 0;
			for (int i = 0; i < 1; i++)
			{
				for (int j = 0; j < 5; j++)
				{
					sum1 += mas[i][j];
				}
			}
		
		System.out.println("Сумма первой строчки " + sum1);
		int averageRow = sum1/5;
		System.out.println(averageRow);
	}
}