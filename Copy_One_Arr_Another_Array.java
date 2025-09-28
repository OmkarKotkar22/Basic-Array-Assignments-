//Q13. Write a java program to copy one array to another array.

import java.util.Scanner;
public class Copy_One_Arr_Another_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int [a.length];

		System.out.println("Enter the value in first array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length; i++)
		{
			b[i] = a[i];
		}
		
		for(int i = 0; i < b.length; i++)
		{
			System.out.println("Copy the array: " + b[i]);
		}
	}
}