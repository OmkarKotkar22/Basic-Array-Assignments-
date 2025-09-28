/*Find Smallest Element in an Array
Write a function findMin(int arr[]) that returns the smallest element in the array.
Call it from main().
*/

import java.util.Scanner;
public class Find_Smallest_Element_in_Array_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		//fill the array by using elements
		System.out.println("Enter the Element in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		findMin(a);
	}

	public static void findMin(int a[])
	{
		int min = a[0];
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Smallest Element in an Array: " + min);
	}
}