//Q4. Write a java program to find even and odd number in array.

import java.util.Scanner;
public class find_even_odd_no_array
{
	public static void main(String x[])
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Display the even and odd number: ");
		for(int i = 0; i <a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println("Number is Even ");
			}
			else
			{
				System.out.println("Number is Odd ");
			}
		}
	}
}