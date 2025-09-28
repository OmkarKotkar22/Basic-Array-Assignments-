//Q20. Write a java program to find the perfect number of an array.

import java.util.*;
public class Perfect_No_of_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//enter the size of array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		//enter the element in array
		System.out.println("Enter the" + size + " Elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < a[i]; j++)
			{
				if(a[i] % j == 0)
				{
					sum = sum + j;
				}
			}
			if(sum == a[i])
			{
				count++;
				System.out.println("Perfect Number: " + a[i]);
			}
		}
		System.out.println("Count of Perfect Number in Array: "+ count);
	}
}