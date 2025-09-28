/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,  -1,  2,  1,  -5,  4]  
Output: 6.  (from subarray [4,-1,2,1])
*/

import java.util.Scanner;
public class Maximum_Subarray_Sum_array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		int k = 4;
		
		System.out.println("Enter the elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= (a.length-k); i++)
		{
			int sum = 0;
			System.out.printf("window ---> [ ");

			for(int j = i; j < (i + k); j++)
			{
				sum = sum + a[j];
				System.out.printf("%d ,", a[j]);
			}

			System.out.printf("]= %d\n", sum);
			if(sum > max)
			{
				max = sum;
			}
		}
		System.out.println("Max: " + max);
	}
}