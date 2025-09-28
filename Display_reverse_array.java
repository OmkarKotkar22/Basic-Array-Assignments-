//Q7. Write a java program to display the reverse array.

import java.util.Scanner;
public class Display_reverse_array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the values in array: ");
		for(int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int j = size-1; j >= 0; j--)
		{
			System.out.println("Display the reverse array: " + j +" " + a[j]);	
		}
	}
}