//Q2. Write a java program to calculate sum of array is size 5.

import java.util.Scanner;
public class Cal_sum_of_array_5
{
	public static void main(String x[])
	{
		int a[] = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of all elements: " + sum);
	}
}