//Write a java program to find a strong number of an array.


import java.util.*;
public class Strong_No_in_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//enter the size of Array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[ ] = new int [size];
		
		//enter the element in array
		System.out.println("Enter the Element in  Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		//logic
		for(int i = 0; i < a.length; i++)
		{
			int sum = 0;
			int temp = a[i];
			int temp1= temp;
			while(temp != 0)
			{
				int rem = temp % 10;
				int f = 1;
				for(int j = 1; j <= rem; j++)
				{
					f = f * j;
				}
				sum = sum + f;
				temp = temp / 10;
			} 
			if(sum == temp1)
			{
				System.out.println("Strong Number: " + temp1);
			}
		}
	}
}
