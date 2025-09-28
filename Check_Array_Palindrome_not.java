//Q10.Write a java program to check array is palindrome or not.

import java.util.Scanner;

public class Check_Array_Palindrome_not
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		int i = 0;
		int j = a.length - 1;
		Boolean flag = true;

		while(i <= j)
		{
			if(a[i] != a[j])
			{
				flag = false;
				break;
			}
		i++;
		j--;
		}

		
		if(flag)
		{
			System.out.println("Array is Palindrome");
		}
		else
		{
			System.out.println("Array is not Palindrome");
		}
	}
}