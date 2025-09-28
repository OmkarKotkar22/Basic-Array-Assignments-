//Q19. Write a java program to find the prime number of an array.

import java.util.*;
public class Prime_No_of_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//enter the size of array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		int a[] = new int[size];

		//enter the elements in array
		System.out.println("Enter the " + size + " numbers: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		for(int i = 0; i < a.length; i++)
		{
			boolean flag = true;
			if(a[i] <= 1)
			{
				flag = false;
			}
			else
			{
				for(int j = 2; j < a[i]; j++)
				{
					if(a[i] % j == 0)
					{
						flag = false;
						break;
					}
				}
			}
			if(flag)
			{
				System.out.println("Prime Numbers in Array: "+ a[i]);
			}
		}
		
	}
}
