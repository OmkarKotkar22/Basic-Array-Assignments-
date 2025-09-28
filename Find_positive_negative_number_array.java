//Q5. Write a java program to find positive and negative number in array.

import java.util.Scanner;
public class Find_positive_negative_number_array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the number in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
	
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > 0)
			{
				System.out.println("Number is Positive");
			}
			else
			{
                               System.out.println("Number is Negative");
			}
		}
	}
}