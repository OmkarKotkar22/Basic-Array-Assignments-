//Q6. Write a java program to search element in array , its element found or not.

import java.util.Scanner;
public class Search_element_in_array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int [size];
		
		System.out.println("Enter the elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Search element in array: ");
		int search = sc.nextInt();
		
		Boolean flag = false;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == search)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element is Found");
		}
		else
		{
			System.out.println("Element is not Found");
		}
	}
}