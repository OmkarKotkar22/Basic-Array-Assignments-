//Write a java program to find the duck number of an array.

import java.util.*;
public class Duck_No_an_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Values in Array (sorted): ");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length; i++)
		{
			Boolean flag = true;
			int temp = a[i];
			while(temp != 0)
			{
				int rem = temp % 10;
				if(rem == 0)
				{
					flag = false;
				}
				temp = temp / 10;
			}
			if(flag == false)
			{
				System.out.println("duck number of an array: " + a[i]);
			}
			
		}
	}
}