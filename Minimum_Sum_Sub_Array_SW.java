/*Minimum Sum Subarray of Size K
Find the minimum sum of a subarray with size k.*/


import java.util.*;
public class Minimum_Sum_Sub_Array_SW
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		//enter the size of array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		//enter the size of sub array
		System.out.println("Enter the Size of Sub Array: ");
		int k = sc.nextInt();

		//enter the values in array
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		//logic

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < (a.length-k); i++)
		{
			int sum = 0;
			for(int j = i; j < (i+k); j++)
			{
				sum = sum + a[j];
			}
			if(min > sum)
			{
				min = sum;
			}
		}
		System.out.println("Minimum Sum Subarray of Size K: " + min);
	}
}
