/*
Q11. Print array elements at even indices.
Input: arr = [4, 9, 7, 11, 6]
Output: 4 7 6
Explanation: Even indices → 0, 2, 4 → elements 4, 7, 6.
*/

import java.util.Scanner;
public class Print_Even_Indices_in_array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the elements in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(" Even Indices: " + i + "\tIts Values: " + a[i]);
			}
		}
	}
}