//Q18. Write a java program to remove duplicates values of array.

import java.util.Scanner;
public class Remove_Duplicates_Values_of_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		int k = 0;
		int b[] = new int[a.length];
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		//remove duplicates values of array
		for(int i = 0; i < a.length; i++)
		{
			boolean flag = true;
			for(int j = 0; j<k; j++)
			{
				if(a[i] == b[j])
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				b[k] = a[i];
				k++;
			}
		}
		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < k; i++) 
		{
    			System.out.print(b[i] + " ");
		}
	}
}