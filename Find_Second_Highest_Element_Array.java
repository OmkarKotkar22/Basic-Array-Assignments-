/*Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40
*/

import java.util.Scanner;
public class Find_Second_Highest_Element_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];		

		System.out.println("Enter the values in array: ");
		for(int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}

		int max = a[0];
		int max2 = Integer.MIN_VALUE;

		for(int i = 0; i < size; i++)
		{
			if(a[i] > max)
			{
				max2 = max;
				max = a[i];
			}

			else if(a[i] > max2 && a[i] != max)
			{
				max2 = a[i];
			}
		}

		if(max2 != -2147483648)
		{
			System.out.println("second highest value of array: " + max2);
		}

		else
		{
			System.out.println("NO second highest value of array: ");
		}
	}
}