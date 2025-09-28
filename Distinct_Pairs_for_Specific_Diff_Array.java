/*Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/

import java.util.Scanner;
public class Distinct_Pairs_for_Specific_Diff_Array
{
	public static void main(String x[])
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length-1; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(Math.abs(a[i] - a[j]) == 5)
				{
					System.out.println("[" + a[i] + ", " + a[j] + "]" );
					count++;
				}
			}
		}
		System.out.println("Number of distinct pairs for difference 5 are: " + count);
	}
}