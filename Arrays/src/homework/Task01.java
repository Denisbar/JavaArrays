/**
 * Task01
 */
package homework;

import java.util.Random;

/**
 * @author Denis Barabash
 *
 */
public class Task01
{
	public static void main(String[] args)
	{
		int[] myArray = new int[20];
		Random random = new Random();
		for (int i = 0; i < myArray.length; i++)
		{
			int myren = random.nextInt(20);
			myArray[i] = myren;
		}

		for (int j = 0; j < myArray.length; j++)
		{
			if (j % 2 == 0)
			{
				System.out.println("Индекс: " + j + "\tЗначение: " + myArray[j]);
			}	
		}
		
		System.out.println("Все элементы массива: ");
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print(myArray[i] + " ");
		}
	}

}
