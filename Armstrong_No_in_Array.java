//Q23. Write a java program to find the armstrong number of an array. 

import java.util.*;
public class Armstrong_No_in_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//enter the size of Array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int [size];
		
		//enter the element in array
		System.out.println("Enter the Element in  Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		for(int i = 0; i < a.length; i++)
		{
			int sum = 0, temp = a[i], temp1 = temp, count = 0;

			while(temp != 0)
			{
				count++;
				temp = temp / 10;
			} 
			
			temp = temp1;
			while(temp != 0)
			{
				int rem = temp % 10;
				int total = 0;
				total = (int)Math.pow(rem, count);
				sum = sum + total;
				temp = temp / 10;
			}
			if(sum == temp1)
			{
				System.out.println("Armstrong number: " + temp1);
			}
		}
	}
}