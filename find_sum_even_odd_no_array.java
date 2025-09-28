//Q8. Write a java program to calculate the sum of even or odd numbers.

import java.util.Scanner;
public class find_sum_even_odd_no_array
{
	public static void main(String x[])
	{
		int a[] = new int[5];
		int sumEven = 0;
		int sumOdd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Display the even and odd number: ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				sumEven = sumEven + a[i];
				System.out.println("sum Even Numbers: " + sumEven);
			}
			else
			{
				sumOdd = sumOdd + a[i];
				System.out.println("sum Odd Number: " + sumOdd);
			}
		}
	}
}