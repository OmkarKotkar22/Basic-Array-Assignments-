//Q1. Write a java program to take input from array of size 5 and display it.

import java.util.Scanner;
public class Size_5_display_array
{
	public static void main(String x[])
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Display element from array: ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Index" + i + "--->" + a[i]);
		}
	}
}